package typings
package log4javascriptLib.log4javascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", "PopUpAppender")
@js.native
class PopUpAppender () extends Appender {
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
  def this(lazyInit: scala.Boolean) = this()
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
  def this(lazyInit: scala.Boolean, initiallyMinimized: scala.Boolean) = this()
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
  def this(lazyInit: scala.Boolean, initiallyMinimized: scala.Boolean, useDocumentWrite: scala.Boolean) = this()
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
  def this(lazyInit: scala.Boolean, initiallyMinimized: scala.Boolean, useDocumentWrite: scala.Boolean, width: scala.Double) = this()
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
  def this(lazyInit: scala.Boolean, initiallyMinimized: scala.Boolean, useDocumentWrite: scala.Boolean, width: scala.Double, height: scala.Double) = this()
  /**
  	 * Adds a function with the name specified to the list of functions available on the command line. This feature may be used
  	 * to add custom functions to the command line.
  	 */
  def addCommandLineFunction(functionName: java.lang.String, commandLineFunction: log4javascriptLib.Anon_Appender): scala.Unit = js.native
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
  	 * Returns the outer height in pixels of the pop-up window.
  	 */
  def getHeight(): scala.Double = js.native
  /**
  	 * Returns the largest number of log messages that are displayed and stored by the the console. Once reached, a new log
  	 * message wil cause the oldest message to be discarded. Default value is null, which means no limit is applied.
  	 */
  def getMaxMessages(): scala.Double = js.native
  /**
  	 * Returns the outer width in pixels of the pop-up window.
  	 */
  def getWidth(): scala.Double = js.native
  /**
  	 * Closes the pop-up window.
  	 */
  def hide(): scala.Unit = js.native
  /**
  	 * Returns whether an alert is shown to the user when the pop-up window cannot be created as a result of a pop-up blocker.
  	 * Default value is true.
  	 */
  def isComplainAboutPopUpBlocking(): scala.Boolean = js.native
  /**
  	 * Returns whether the pop-up window is focussed (i.e. brought it to the front) when a new log message is added. Default value is false.
  	 */
  def isFocusPopUp(): scala.Boolean = js.native
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
  	 * Returns whether the pop-up window reopens automatically after being closed when a new log message is logged. Default value is false.
  	 */
  def isReopenWhenClosed(): scala.Boolean = js.native
  /**
  	 * Returns whether the pop-up window scrolls to display the latest log message when a new message is logged. Default value is true.
  	 */
  def isScrollToLatestMessage(): scala.Boolean = js.native
  /**
  	 * Returns whether the console includes a command line. Default value is true.
  	 */
  def isShowCommandLine(): scala.Boolean = js.native
  /**
  	 * Returns whether the same pop-up window is used if the main page is reloaded. If set to true, when the page is reloaded a
  	 * line is drawn in the pop-up and subsequent log messages are added to the same pop-up. Otherwise, a new pop-up window is
  	 * created that replaces the original pop-up. If not specified, defaults to true.
  	 */
  def isUseOldPopUp(): scala.Boolean = js.native
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
  	 * Sets whether to announce to show an alert to the user when the pop-up window cannot be created as a result of a pop-up blocker.
  	 */
  def setComplainAboutPopUpBlocking(complainAboutPopUpBlocking: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets whether to focus the pop-up window (i.e. bring it to the front) when a new log message is added.
  	 */
  def setFocusPopUp(focusPopUp: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets the outer height in pixels of the pop-up window.
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
  	 * Sets whether to reopen the pop-up window automatically after being closed when a new log message is logged.
  	 */
  def setReopenWhenClosed(reopenWhenClosed: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets whether to scroll the pop-up window to display the latest log message when a new message is logged.
  	 */
  def setScrollToLatestMessage(scrollToLatestMessage: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets whether the console includes a command line.
  	 */
  def setShowCommandLine(showCommandLine: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets whether to use the same pop-up window if the main page is reloaded. See isUseOldPopUp above for details.
  	 */
  def setUseOldPopUp(useOldPopUp: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets the outer width in pixels of the pop-up window.
  	 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  	 * Opens the pop-up window, if not already open.
  	 */
  def show(): scala.Unit = js.native
}

