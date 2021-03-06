package pl.edu.agh.to1.dice.logic.commands;

public enum GameCommand implements Command {
    TERMINATE("x"), REROLL("r"), HELP("h");

    private String commandString = null;
    private GameCommand(String commandString) {
        this.commandString = commandString;
    }
    @Override
    public String toString() {
        return commandString;
    }

    @Override
    public String getCommandString() {
        return commandString;
    }
}
