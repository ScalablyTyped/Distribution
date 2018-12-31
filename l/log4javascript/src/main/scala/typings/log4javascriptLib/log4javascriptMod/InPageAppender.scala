package typings
package log4javascriptLib.log4javascriptMod

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
  def this(container: stdLib.HTMLElement) = this()
  def this(container: stdLib.HTMLElement, lazyInit: scala.Boolean) = this()
  def this(container: stdLib.HTMLElement, lazyInit: scala.Boolean, initiallyMinimized: scala.Boolean) = this()
  def this(container: stdLib.HTMLElement, lazyInit: scala.Boolean, initiallyMinimized: scala.Boolean, useDocumentWrite: scala.Boolean) = this()
  def this(container: stdLib.HTMLElement, lazyInit: scala.Boolean, initiallyMinimized: scala.Boolean, useDocumentWrite: scala.Boolean, width: scala.Double) = this()
  def this(container: stdLib.HTMLElement, lazyInit: scala.Boolean, initiallyMinimized: scala.Boolean, useDocumentWrite: scala.Boolean, width: scala.Double, height: scala.Double) = this()
  /**
  	 * Adds a function with the name specified to the list of functions available on the command line. This feature may be used
  	 * to add custom functions to the command line.
  	 */
  def addCommandLineFunction(functionName: java.lang.String, commandLineFunction: log4javascriptLib.Anon_Appender): scala.Unit = js.native
  /**
  	 * Sets a CSS style property on the HTML element containing the console iframe.
  	 */
  def addCssProperty(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
  	 * Clears all messages from the console window.
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * Closes the pop-up window.
  	 */
  def close(): scala.Unit = js.native
  /**
  	 * Evaluates the expression and appends the result to the console.
  	 */
  def evalCommandAndAppend(expr: java.lang.String): scala.Unit = js.native
  /**
  	 * Brings the console window to the top and gives it the focus.
  	 */
  def focus(): scala.Unit = js.native
  /**
  	 * Brings the console window to the top and gives the focus to the command line.
  	 */
  def focusCommandLine(): scala.Unit = js.native
  /**
  	 * Brings the console window to the top and gives the focus to the search box.
  	 */
  def focusSearch(): scala.Unit = js.native
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
  def getCommandLineObjectExpansionDepth(): scala.Double = js.native
  /**
  	 * Returns a reference to the window in which commands typed into the command line are currently being executed.
  	 */
  def getCommandWindow(): stdLib.Window = js.native
  /**
  	 * Returns the outer height of the console window.
  	 */
  def getHeight(): scala.Double = js.native
  /**
  	 * Returns the largest number of messages displayed and stored by the console window.
  	 */
  def getMaxMessages(): scala.Double = js.native
  /**
  	 * Returns the outer width of the console window.
  	 */
  def getWidth(): scala.Double = js.native
  /**
  	 * Hides / minimizes the console window.
  	 */
  def hide(): scala.Unit = js.native
  /**
  	 * Returns whether the console window starts off hidden / minimized.
  	 */
  def isInitiallyMinimized(): scala.Boolean = js.native
  /**
  	 * Returns whether new log messages are displayed at the top of the pop-up window. Default value is false (i.e. log messages
  	 * are appended to the bottom of the window).
  	 */
  def isNewestMessageAtTop(): scala.Boolean = js.native
  /**
  	 * Returns whether the pop-up window scrolls to display the latest log message when a new message is logged. Default value is true.
  	 */
  def isScrollToLatestMessage(): scala.Boolean = js.native
  /**
  	 * Returns whether the console includes a command line. Default value is true.
  	 */
  def isShowCommandLine(): scala.Boolean = js.native
  /**
  	 * Returns whether the console window is currently visible.
  	 */
  def isVisible(): scala.Boolean = js.native
  /**
  	 * Sets the layout used to format the output for commands typed into the command line.
  	 */
  def setCommandLayout(commandLayout: Layout): scala.Unit = js.native
  /**
  	 * Sets the number of levels to expand when an object value is logged to the console.
  	 */
  def setCommandLineObjectExpansionDepth(expansionDepth: scala.Double): scala.Unit = js.native
  /**
  	 * Sets the window in which commands typed into the command line are executed.
  	 */
  def setCommandWindow(commandWindow: stdLib.Window): scala.Unit = js.native
  /**
  	 * Sets the outer height of the console window. Any valid CSS length may be used.
  	 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  	 * Sets whether the console window should start off hidden / minimized.
  	 */
  def setInitiallyMinimized(initiallyMinimized: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets the largest number of messages displayed and stored by the console window. Set this to null to make this number unlimited.
  	 */
  def setMaxMessages(maxMessages: scala.Double): scala.Unit = js.native
  /**
  	 * Sets whether to display new log messages at the top inside the pop-up window.
  	 */
  def setNewestMessageAtTop(newestMessageAtTop: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets whether to scroll the pop-up window to display the latest log message when a new message is logged.
  	 */
  def setScrollToLatestMessage(scrollToLatestMessage: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets whether the console includes a command line.
  	 */
  def setShowCommandLine(showCommandLine: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets the outer width of the console window. Any valid CSS length may be used.
  	 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  	 * Shows / unhides the console window.
  	 */
  def show(): scala.Unit = js.native
}

