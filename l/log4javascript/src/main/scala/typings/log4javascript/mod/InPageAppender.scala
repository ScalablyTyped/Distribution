package typings.log4javascript.mod

import typings.log4javascript.anon.AppendResult
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", "InPageAppender")
@js.native
class InPageAppender protected () extends Appender {
  /**
  	 * Constructor
  	 * @param container The container element for the console window. This should be an HTML element.
  	 * @param lazyInit Set this to true to create the console only when the first log message reaches the appender. Otherwise,
  	 * the console is initialized as soon as the appender is created. If not specified, defaults to true.
  	 * @param initiallyMinimized Whether the console window should start off hidden / minimized. If not specified, defaults to false
  	 * @param useDocumentWrite Specifies how the console window is created. By default, the console window is created dynamically
  	 * using document's write method. This has the advantage of keeping all the code in one single JavaScript file. However,
  	 * if your page sets document.domain then the browser prevents script access to a window unless it too has the same value
  	 * set for document.domain. To get round this issue, you can set useDocumentWrite to false and log4javascript will instead
  	 * use the external HTML file console.html (or console_uncompressed.html if you're using an uncompressed version of
  	 * log4javascript.js), which must be placed in the same directory as your log4javascript.js file.
  	 * In general it's simpler to use the document.write method, so unless your page needs to set document.domain,
  	 * useDocumentWrite should be set to true.
  	 * If not specified, defaults to true.
  	 * @param width The width of the console window. Any valid CSS length may be used. If not specified, defaults to 100%.
  	 * @param height The height of the console window. Any valid CSS length may be used. If not specified, defaults to 250px.
  	 */
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, lazyInit: Boolean) = this()
  def this(container: HTMLElement, lazyInit: Boolean, initiallyMinimized: Boolean) = this()
  def this(container: HTMLElement, lazyInit: Boolean, initiallyMinimized: Boolean, useDocumentWrite: Boolean) = this()
  def this(
    container: HTMLElement,
    lazyInit: Boolean,
    initiallyMinimized: Boolean,
    useDocumentWrite: Boolean,
    width: Double
  ) = this()
  def this(
    container: HTMLElement,
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
  def addCommandLineFunction(
    functionName: String,
    commandLineFunction: js.Function3[/* appender */ Appender, /* args */ js.Any, /* returnValue */ AppendResult, _]
  ): Unit = js.native
  /**
  	 * Sets a CSS style property on the HTML element containing the console iframe.
  	 */
  def addCssProperty(name: String, value: String): Unit = js.native
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
  	 * Returns the outer height of the console window.
  	 */
  def getHeight(): Double = js.native
  /**
  	 * Returns the largest number of messages displayed and stored by the console window.
  	 */
  def getMaxMessages(): Double = js.native
  /**
  	 * Returns the outer width of the console window.
  	 */
  def getWidth(): Double = js.native
  /**
  	 * Hides / minimizes the console window.
  	 */
  def hide(): Unit = js.native
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
  	 * Returns whether the pop-up window scrolls to display the latest log message when a new message is logged. Default value is true.
  	 */
  def isScrollToLatestMessage(): Boolean = js.native
  /**
  	 * Returns whether the console includes a command line. Default value is true.
  	 */
  def isShowCommandLine(): Boolean = js.native
  /**
  	 * Returns whether the console window is currently visible.
  	 */
  def isVisible(): Boolean = js.native
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
  	 * Sets the outer height of the console window. Any valid CSS length may be used.
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
  	 * Sets whether to scroll the pop-up window to display the latest log message when a new message is logged.
  	 */
  def setScrollToLatestMessage(scrollToLatestMessage: Boolean): Unit = js.native
  /**
  	 * Sets whether the console includes a command line.
  	 */
  def setShowCommandLine(showCommandLine: Boolean): Unit = js.native
  /**
  	 * Sets the outer width of the console window. Any valid CSS length may be used.
  	 */
  def setWidth(width: Double): Unit = js.native
  /**
  	 * Shows / unhides the console window.
  	 */
  def show(): Unit = js.native
}

