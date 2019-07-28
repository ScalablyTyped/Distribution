package typings.log4javascript.log4javascriptMod

import typings.log4javascript.Fn_Appender
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", "PopUpAppender")
@js.native
/**
	 * Constructor
	 * @param lazyInit Set this to true to open the pop-up only when the first log message reaches the appender. Otherwise, the
	 * pop-up window opens as soon as the appender is created. If not specified, defaults to false.
	 * @param initiallyMinimized Whether the console window should start off hidden / minimized. If not specified, defaults to false.
	 * @param useDocumentWrite Specifies how the console window is created. By default, the console window is created dynamically
	 * using document's write method. This has the advantage of keeping all the code in one single JavaScript file. However,
	 * if your page sets document.domain then the browser prevents script access to a window unless it too has the same value
	 * set for document.domain. To get round this issue, you can set useDocumentWrite to false and log4javascript will instead
	 * use the external HTML file console.html (or console_uncompressed.html if you're using an uncompressed version of
	 * log4javascript.js), which must be placed in the same directory as your log4javascript.js file.
	 * Note that if useDocumentWrite is set to true, the old pop-up window will always be closed and a new one created whenever
	 * the page is refreshed, even if setUseOldPopUp(true) has been called.
	 * In general it's simpler to use the document.write method, so unless your page needs to set document.domain,
	 * useDocumentWrite should be set to true.
	 * If not specified, defaults to true.
	 * @param width The outer width in pixels of the pop-up window. If not specified, defaults to 600.
	 * @param height The outer height in pixels of the pop-up window. If not specified, defaults to 400.
	 */
class PopUpAppender () extends Appender {
  def this(lazyInit: Boolean) = this()
  def this(lazyInit: Boolean, initiallyMinimized: Boolean) = this()
  def this(lazyInit: Boolean, initiallyMinimized: Boolean, useDocumentWrite: Boolean) = this()
  def this(lazyInit: Boolean, initiallyMinimized: Boolean, useDocumentWrite: Boolean, width: Double) = this()
  def this(
    lazyInit: Boolean,
    initiallyMinimized: Boolean,
    useDocumentWrite: Boolean,
    width: Double,
    height: Double
  ) = this()
  /**
  	 * Adds a function with the name specified to the list of functions available on the command line. This feature may be used
  	 * to add custom functions to the command line.
  	 */
  def addCommandLineFunction(functionName: String, commandLineFunction: Fn_Appender): Unit = js.native
  /**
  	 * Clears all messages from the console window.
  	 */
  def clear(): Unit = js.native
  /**
  	 * Closes the pop-up window.
  	 */
  def close(): Unit = js.native
  /**
  	 * Evaluates the expression and appends the result to the console.
  	 */
  def evalCommandAndAppend(expr: String): Unit = js.native
  /**
  	 * Brings the console window to the top and gives it the focus.
  	 */
  def focus(): Unit = js.native
  /**
  	 * Brings the console window to the top and gives the focus to the command line.
  	 */
  def focusCommandLine(): Unit = js.native
  /**
  	 * Brings the console window to the top and gives the focus to the search box.
  	 */
  def focusSearch(): Unit = js.native
  /**
  	 * Returns the layout used to format the output for commands typed into the command line. The default value is a
  	 * PatternLayout with pattern string %m
  	 */
  def getCommandLayout(): Layout = js.native
  /**
  	 * Returns the number of levels to expand when an object value is logged to the console. Each property of an object above
  	 * this threshold will be expanded if it is itself an object or array, otherwise its string representation will be displayed.
  	 * Default value is 1 (i.e. the properties of the object logged will be displayed in their string representation but not expanded).
  	 */
  def getCommandLineObjectExpansionDepth(): Double = js.native
  /**
  	 * Returns a reference to the window in which commands typed into the command line are currently being executed.
  	 */
  def getCommandWindow(): Window = js.native
  /**
  	 * Returns the outer height in pixels of the pop-up window.
  	 */
  def getHeight(): Double = js.native
  /**
  	 * Returns the largest number of log messages that are displayed and stored by the the console. Once reached, a new log
  	 * message wil cause the oldest message to be discarded. Default value is null, which means no limit is applied.
  	 */
  def getMaxMessages(): Double = js.native
  /**
  	 * Returns the outer width in pixels of the pop-up window.
  	 */
  def getWidth(): Double = js.native
  /**
  	 * Closes the pop-up window.
  	 */
  def hide(): Unit = js.native
  /**
  	 * Returns whether an alert is shown to the user when the pop-up window cannot be created as a result of a pop-up blocker.
  	 * Default value is true.
  	 */
  def isComplainAboutPopUpBlocking(): Boolean = js.native
  /**
  	 * Returns whether the pop-up window is focussed (i.e. brought it to the front) when a new log message is added. Default value is false.
  	 */
  def isFocusPopUp(): Boolean = js.native
  /**
  	 * Returns whether the console window starts off hidden / minimized.
  	 */
  def isInitiallyMinimized(): Boolean = js.native
  /**
  	 * Returns whether new log messages are displayed at the top of the pop-up window. Default value is false (i.e. log messages
  	 * are appended to the bottom of the window).
  	 */
  def isNewestMessageAtTop(): Boolean = js.native
  /**
  	 * Returns whether the pop-up window reopens automatically after being closed when a new log message is logged. Default value is false.
  	 */
  def isReopenWhenClosed(): Boolean = js.native
  /**
  	 * Returns whether the pop-up window scrolls to display the latest log message when a new message is logged. Default value is true.
  	 */
  def isScrollToLatestMessage(): Boolean = js.native
  /**
  	 * Returns whether the console includes a command line. Default value is true.
  	 */
  def isShowCommandLine(): Boolean = js.native
  /**
  	 * Returns whether the same pop-up window is used if the main page is reloaded. If set to true, when the page is reloaded a
  	 * line is drawn in the pop-up and subsequent log messages are added to the same pop-up. Otherwise, a new pop-up window is
  	 * created that replaces the original pop-up. If not specified, defaults to true.
  	 */
  def isUseOldPopUp(): Boolean = js.native
  /**
  	 * Sets the layout used to format the output for commands typed into the command line.
  	 */
  def setCommandLayout(commandLayout: Layout): Unit = js.native
  /**
  	 * Sets the number of levels to expand when an object value is logged to the console.
  	 */
  def setCommandLineObjectExpansionDepth(expansionDepth: Double): Unit = js.native
  /**
  	 * Sets the window in which commands typed into the command line are executed.
  	 */
  def setCommandWindow(commandWindow: Window): Unit = js.native
  /**
  	 * Sets whether to announce to show an alert to the user when the pop-up window cannot be created as a result of a pop-up blocker.
  	 */
  def setComplainAboutPopUpBlocking(complainAboutPopUpBlocking: Boolean): Unit = js.native
  /**
  	 * Sets whether to focus the pop-up window (i.e. bring it to the front) when a new log message is added.
  	 */
  def setFocusPopUp(focusPopUp: Boolean): Unit = js.native
  /**
  	 * Sets the outer height in pixels of the pop-up window.
  	 */
  def setHeight(height: Double): Unit = js.native
  /**
  	 * Sets whether the console window should start off hidden / minimized.
  	 */
  def setInitiallyMinimized(initiallyMinimized: Boolean): Unit = js.native
  /**
  	 * Sets the largest number of messages displayed and stored by the console window. Set this to null to make this number unlimited.
  	 */
  def setMaxMessages(maxMessages: Double): Unit = js.native
  /**
  	 * Sets whether to display new log messages at the top inside the pop-up window.
  	 */
  def setNewestMessageAtTop(newestMessageAtTop: Boolean): Unit = js.native
  /**
  	 * Sets whether to reopen the pop-up window automatically after being closed when a new log message is logged.
  	 */
  def setReopenWhenClosed(reopenWhenClosed: Boolean): Unit = js.native
  /**
  	 * Sets whether to scroll the pop-up window to display the latest log message when a new message is logged.
  	 */
  def setScrollToLatestMessage(scrollToLatestMessage: Boolean): Unit = js.native
  /**
  	 * Sets whether the console includes a command line.
  	 */
  def setShowCommandLine(showCommandLine: Boolean): Unit = js.native
  /**
  	 * Sets whether to use the same pop-up window if the main page is reloaded. See isUseOldPopUp above for details.
  	 */
  def setUseOldPopUp(useOldPopUp: Boolean): Unit = js.native
  /**
  	 * Sets the outer width in pixels of the pop-up window.
  	 */
  def setWidth(width: Double): Unit = js.native
  /**
  	 * Opens the pop-up window, if not already open.
  	 */
  def show(): Unit = js.native
}

