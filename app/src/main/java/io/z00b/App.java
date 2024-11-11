package io.z00b;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
	Other other = new Other();
	System.out.println(other.getOtherGreeting());
    }
}
