package typings.log4javascript

import typings.log4javascript.anon.AppendResult
import typings.log4javascript.anon.Name
import typings.std.HTMLElement
import typings.std.Window
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("log4javascript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("log4javascript", "AjaxAppender")
  @js.native
  open class AjaxAppender protected () extends Appender {
    /**
    	 * Constructor
    	 * @param url The URL to which log messages should be sent. Note that this is subject to the usual Ajax restrictions:
    	 * the URL should be in the same domain as that of the page making the request.
    	 * @param withCredentials Specifies whether cookies should be sent with each request.
    	 */
    def this(url: String) = this()
    def this(url: String, withCredentials: Boolean) = this()
    
    /**
    	 * Adds an HTTP header that is sent with each request.
    	 */
    def addHeader(name: String, value: String): Unit = js.native
    
    /**
    	 * Returns the number of log messages sent in each request. See above for more details.
    	 */
    def getBatchSize(): Double = js.native
    
    /**
    	 * Returns an array of the additional headers that are sent with each HTTP request. Each array item is an object with
    	 * properties name and value.
    	 */
    def getHeaders(): js.Array[Name] = js.native
    
    /**
    	 * Returns the post variable name whose value will the formatted log message(s) for each request.
    	 */
    def getPostVarName(): String = js.native
    
    /**
    	 * Returns the session id sent to the server each time a request is made.
    	 */
    def getSessionId(): String = js.native
    
    /**
    	 * Returns the length of time in milliseconds between each sending of queued log messages. See above for more details.
    	 */
    def getTimerInterval(): Double = js.native
    
    /**
    	 * Returns whether all remaining unsent log messages are sent to the server when the page unloads.
    	 */
    def isSendAllOnUnload(): Boolean = js.native
    
    /**
    	 * Returns whether log messages are sent to the server at regular, timed intervals.
    	 */
    def isTimed(): Boolean = js.native
    
    /**
    	 * Returns whether the appender waits for a response from a previous HTTP request from this appender before sending the next
    	 * log message / batch of messages.
    	 */
    def isWaitForResponse(): Boolean = js.native
    
    /**
    	 * Sends all log messages in the queue. If log messages are batched then only completed batches are sent.
    	 */
    def sendAll(): Unit = js.native
    
    /**
    	 * Sets the number of log messages to send in each request. If not specified, defaults to 1.
    	 */
    def setBatchSize(batchSize: Double): Unit = js.native
    
    /**
    	 * Sets the function that is called whenever any kind of failure occurs in the appender, including browser deficiencies or
    	 * configuration errors (e.g. supplying a non-existent URL to the appender). This feature can be used to handle
    	 * AjaxAppender-specific errors.
    	 * A single parameter, message, is passed to the callback function. This is the error-specific message that caused the failure.
    	 */
    def setFailCallback(failCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
    
    /**
    	 * Sets the post variable name whose value will the formatted log message(s) for each request.
    	 * Default value is data.
    	 */
    def setPostVarName(postVarName: String): Unit = js.native
    
    /**
    	 * Sets the function that is called whenever a successful request is made, called at the point at which the response is
    	 * received. This feature can be used to confirm whether a request has been successful and act accordingly.
    	 * A single parameter, xmlHttp, is passed to the callback function. This is the XMLHttpRequest object that performed the
    	 * request.
    	 */
    def setRequestSuccessCallback(requestSuccessCallback: js.Function1[/* xmlHttp */ XMLHttpRequest, Unit]): Unit = js.native
    
    /**
    	 * Whether to send all remaining unsent log messages to the server when the page unloads.
    	 * Since version 1.4.3, the default value is false. Previously the default was true.
    	 */
    def setSendAllOnUnload(sendAllOnUnload: Boolean): Unit = js.native
    
    /**
    	 * Sets the session id sent to the server each time a request is made.
    	 */
    def setSessionId(sessionId: String): Unit = js.native
    
    /**
    	 * Whether to send log messages to the server at regular, timed intervals.
    	 * Default value is false.
    	 */
    def setTimed(timed: Boolean): Unit = js.native
    
    /**
    	 * Sets the length of time in milliseconds between each sending of queued log messages.
    	 */
    def setTimerInterval(timerInterval: Double): Unit = js.native
    
    /**
    	 * Sets whether to wait for a response from a previous HTTP request from this appender before sending the next log
    	 * message / batch of messages.
    	 * Default value is false.
    	 */
    def setWaitForResponse(waitForResponse: Boolean): Unit = js.native
  }
  
  @JSImport("log4javascript", "AlertAppender")
  @js.native
  /**
  	 * Constructor
  	 */
  open class AlertAppender () extends Appender
  
  @JSImport("log4javascript", "Appender")
  @js.native
  open class Appender () extends StObject {
    
    /**
    	 * Appender-specific method to append a log message. Every appender object should implement this method.
    	 */
    def append(loggingEvent: LoggingEvent): Unit = js.native
    
    /**
    	 * Checks the logging event's level is at least as severe as the appender's threshold and calls the appender's append method if so.
    	 * This method should not in general be used directly or overridden.
    	 */
    def doAppend(loggingEvent: LoggingEvent): Unit = js.native
    
    /**
    	 * Returns the appender's layout.
    	 */
    def getLayout(): Layout = js.native
    
    /**
    	 * Returns the appender's threshold.
    	 */
    def getThreshold(): Level = js.native
    
    /**
    	 * Sets the appender's layout.
    	 */
    def setLayout(layout: Layout): Unit = js.native
    
    /**
    	 * Sets the appender's threshold. Log messages of level less severe than this threshold will not be logged.
    	 */
    def setThreshold(level: Level): Unit = js.native
  }
  
  @JSImport("log4javascript", "BrowserConsoleAppender")
  @js.native
  /**
  	 * Constructor
  	 */
  open class BrowserConsoleAppender () extends Appender
  
  @JSImport("log4javascript", "HttpPostDataLayout")
  @js.native
  /**
  	 * Constructor
  	 */
  open class HttpPostDataLayout () extends Layout
  
  @JSImport("log4javascript", "InPageAppender")
  @js.native
  open class InPageAppender protected () extends Appender {
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
    def this(container: HTMLElement, lazyInit: Unit, initiallyMinimized: Boolean) = this()
    def this(container: HTMLElement, lazyInit: Boolean, initiallyMinimized: Boolean, useDocumentWrite: Boolean) = this()
    def this(container: HTMLElement, lazyInit: Boolean, initiallyMinimized: Unit, useDocumentWrite: Boolean) = this()
    def this(container: HTMLElement, lazyInit: Unit, initiallyMinimized: Boolean, useDocumentWrite: Boolean) = this()
    def this(container: HTMLElement, lazyInit: Unit, initiallyMinimized: Unit, useDocumentWrite: Boolean) = this()
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
      useDocumentWrite: Unit,
      width: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Unit,
      useDocumentWrite: Boolean,
      width: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Unit,
      useDocumentWrite: Unit,
      width: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Boolean,
      useDocumentWrite: Boolean,
      width: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Boolean,
      useDocumentWrite: Unit,
      width: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Unit,
      useDocumentWrite: Boolean,
      width: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Unit,
      useDocumentWrite: Unit,
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
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Boolean,
      useDocumentWrite: Boolean,
      width: Unit,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Boolean,
      useDocumentWrite: Unit,
      width: Double,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Boolean,
      useDocumentWrite: Unit,
      width: Unit,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Unit,
      useDocumentWrite: Boolean,
      width: Double,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Unit,
      useDocumentWrite: Boolean,
      width: Unit,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Unit,
      useDocumentWrite: Unit,
      width: Double,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Boolean,
      initiallyMinimized: Unit,
      useDocumentWrite: Unit,
      width: Unit,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Boolean,
      useDocumentWrite: Boolean,
      width: Double,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Boolean,
      useDocumentWrite: Boolean,
      width: Unit,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Boolean,
      useDocumentWrite: Unit,
      width: Double,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Boolean,
      useDocumentWrite: Unit,
      width: Unit,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Unit,
      useDocumentWrite: Boolean,
      width: Double,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Unit,
      useDocumentWrite: Boolean,
      width: Unit,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Unit,
      useDocumentWrite: Unit,
      width: Double,
      height: Double
    ) = this()
    def this(
      container: HTMLElement,
      lazyInit: Unit,
      initiallyMinimized: Unit,
      useDocumentWrite: Unit,
      width: Unit,
      height: Double
    ) = this()
    
    /**
    	 * Adds a function with the name specified to the list of functions available on the command line. This feature may be used
    	 * to add custom functions to the command line.
    	 */
    def addCommandLineFunction(
      functionName: String,
      commandLineFunction: js.Function3[/* appender */ Appender, /* args */ Any, /* returnValue */ AppendResult, Any]
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
  
  @JSImport("log4javascript", "JsonLayout")
  @js.native
  /**
  	 * Constructor
  	 * @param readable Whether or not to format each log message with line breaks and tabs. If not specified, defaults to false.
  	 * @param combineMessages Whether or not to format multiple log messages as a combined single message property composed of
  	 * each individual message separated by line breaks or to format multiple messages as an array. If not specified, defaults to true.
  	 */
  open class JsonLayout () extends Layout {
    def this(readable: Boolean) = this()
    def this(readable: Boolean, combineMessages: Boolean) = this()
    def this(readable: Unit, combineMessages: Boolean) = this()
    
    /**
    	 * Returns whether or not to format multiple log messages as a combined single message property composed of each individual
    	 * message separated by line breaks or to format multiple messages as an array. If not specified, defaults to true.
    	 */
    def isCombinedMessages(): Boolean = js.native
    
    /**
    	 * Returns whether or not to each log message is formatted with line breaks and tabs.
    	 */
    def isReadable(): Boolean = js.native
  }
  
  @JSImport("log4javascript", "Layout")
  @js.native
  open class Layout () extends StObject {
    
    /**
    	 * Returns whether the layout's output is suitable for batching. JsonLayout and XmlLayout are the only built-in layouts that
    	 * return true for this method.
    	 */
    def allowBatching(): Boolean = js.native
    
    /**
    	 * Formats the log message. You should override this method in your own layouts.
    	 */
    def format(loggingEvent: LoggingEvent): String = js.native
    
    def formatWithException(loggingEvent: LoggingEvent): String = js.native
    
    /**
    	 * Returns the content type of the output of the layout.
    	 */
    def getContentType(): String = js.native
    
    /**
    	 * Used internally by log4javascript in constructing formatted output for some layouts.
    	 */
    def getDataValues(loggingEvent: LoggingEvent): js.Array[Any] = js.native
    
    /**
    	 * Returns whether the layout has any custom fields.
    	 */
    def hasCustomFields(): Boolean = js.native
    
    /**
    	 * Returns whether the layout ignores an error object in a logging event passed to its format method.
    	 */
    def ignoresThrowable(): Boolean = js.native
    
    /**
    	 * Some layouts (JsonLayout, HttpPostDataLayout, PatternLayout and XmlLayout) allow you to set custom fields (e.g. a session
    	 * id to send to the server) to the formatted output. Use this method to set a custom field. If there is already a custom
    	 * field with the specified name, its value will be updated with value.
    	 * @param name Name of the custom property you wish to be included in the formmtted output.
    	 * @param value Value of the custom property you wish to be included in the formatted output.
    	 */
    def setCustomField(name: String, value: String): String = js.native
    
    /**
    	 * This method is used to change the default keys used to create formatted name-value pairs for the properties of a log
    	 * message, for layouts that do this. These layouts are JsonLayout and HttpPostDataLayout.
    	 * @param loggerKey Parameter to use for the log message's logger name. Default is logger.
    	 * @param timeStampKey Parameter to use for the log message's timestamp. Default is timestamp.
    	 * @param levelKey Parameter to use for the log message's level. Default is level.
    	 * @param messageKey Parameter to use for the message itself. Default is message.
    	 * @param exceptionKey Parameter to use for the log message's error (exception). Default is exception.
    	 * @param urlKey Parameter to use for the current page URL. Default is url.
    	 */
    def setKeys(
      loggerKey: String,
      timeStampKey: String,
      levelKey: String,
      messageKey: String,
      exceptionKey: String,
      urlKey: String
    ): Unit = js.native
  }
  
  @js.native
  sealed trait Level extends StObject
  @JSImport("log4javascript", "Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Level & Double] = js.native
    
    @js.native
    sealed trait ALL
      extends StObject
         with Level
    /* 0 */ val ALL: typings.log4javascript.mod.Level.ALL & Double = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with Level
    /* 2 */ val DEBUG: typings.log4javascript.mod.Level.DEBUG & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Level
    /* 5 */ val ERROR: typings.log4javascript.mod.Level.ERROR & Double = js.native
    
    @js.native
    sealed trait FATAL
      extends StObject
         with Level
    /* 6 */ val FATAL: typings.log4javascript.mod.Level.FATAL & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with Level
    /* 3 */ val INFO: typings.log4javascript.mod.Level.INFO & Double = js.native
    
    @js.native
    sealed trait OFF
      extends StObject
         with Level
    /* 7 */ val OFF: typings.log4javascript.mod.Level.OFF & Double = js.native
    
    @js.native
    sealed trait TRACE
      extends StObject
         with Level
    /* 1 */ val TRACE: typings.log4javascript.mod.Level.TRACE & Double = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with Level
    /* 4 */ val WARN: typings.log4javascript.mod.Level.WARN & Double = js.native
  }
  
  @JSImport("log4javascript", "Logger")
  @js.native
  open class Logger () extends StObject {
    
    /**
    	 * Adds the given appender.
    	 */
    def addAppender(appender: Appender): Unit = js.native
    
    /**
    	 * Asserts the given expression is true or evaluates to true. If so, nothing is logged. If not, an error is logged at the ERROR level.
    	 */
    def assert(expr: Any): Unit = js.native
    
    /**
    	 * Logs one or more messages and optionally an error at level DEBUG.
    	 */
    def debug(messages: Any*): Unit = js.native
    
    /**
    	 * Logs one or more messages and optionally an error at level ERROR.
    	 */
    def error(messages: Any*): Unit = js.native
    
    /**
    	 * Logs one or more messages and optionally an error at level FATAL.
    	 */
    def fatal(messages: Any*): Unit = js.native
    
    /**
    	 * Returns whether additivity is enabled for this logger.
    	 */
    def getAdditivity(): Boolean = js.native
    
    /**
    	 * Returns all appenders which will log a message.
    	 */
    def getEffectiveAppenders(): js.Array[Appender] = js.native
    
    /**
    	 * Returns the level at which the logger is operating. This is either the level explicitly set on the logger or, if no level
    	 * has been set, the effective level of the logger's parent.
    	 */
    def getEffectiveLevel(): Level = js.native
    
    /**
    	 * Returns the level explicitly set for this logger or null if none has been set.
    	 */
    def getLevel(): Level = js.native
    
    /**
    	 * Starts a new group of log messages. In appenders that support grouping (currently PopUpAppender and InPageAppender),
    	 * a group appears as an expandable section in the console, labelled with the name specified. Specifying initiallyExpanded
    	 * determines whether the group starts off expanded (the default is true). Groups may be nested.
    	 */
    def group(name: String): Unit = js.native
    def group(name: String, initiallyExpanded: Boolean): Unit = js.native
    
    /**
    	 * Ends the current group. If there is no group then this function has no effect.
    	 */
    def groupEnd(): Unit = js.native
    
    /**
    	 * Logs one or more messages and optionally an error at level INFO.
    	 */
    def info(messages: Any*): Unit = js.native
    
    /**
    	 * Returns whether the logger is enabled for DEBUG messages.
    	 */
    def isDebugEnabled(): Boolean = js.native
    
    /**
    	 * Returns whether the logger is enabled for the specified level.
    	 */
    def isEnabledFor(level: Level, exception: js.Error): Boolean = js.native
    
    /**
    	 * Returns whether the logger is enabled for ERROR messages.
    	 */
    def isErrorEnabled(): Boolean = js.native
    
    /**
    	 * Returns whether the logger is enabled for FATAL messages.
    	 */
    def isFatalEnabled(): Boolean = js.native
    
    /**
    	 * Returns whether the logger is enabled for INFO messages.
    	 */
    def isInfoEnabled(): Boolean = js.native
    
    /**
    	 * Returns whether the logger is enabled for TRACE messages.
    	 */
    def isTraceEnabled(): Boolean = js.native
    
    /**
    	 * Returns whether the logger is enabled for WARN messages.
    	 */
    def isWarnEnabled(): Boolean = js.native
    
    /**
    	 * Generic logging method used by wrapper methods such as debug, error etc.
    	 */
    def log(level: Level, params: js.Array[Any]): Unit = js.native
    
    var name: String = js.native
    
    /**
    	 * Clears all appenders for the current logger.
    	 */
    def removeAllAppenders(): Unit = js.native
    
    /**
    	 * Removes the given appender.
    	 */
    def removeAppender(appender: Appender): Unit = js.native
    
    /**
    	 * Sets whether appender additivity is enabled (the default) or disabled. If set to false, this particular logger will not
    	 * inherit any appenders form its ancestors. Any descendant of this logger, however, will inherit from its ancestors as
    	 * normal, unless its own additivity is explicitly set to false.
    	 * Default value is true.
    	 */
    def setAdditivity(additivity: Boolean): Unit = js.native
    
    /**
    	 * Sets the level. Log messages of a lower level than level will not be logged. Default value is DEBUG.
    	 */
    def setLevel(level: Level): Unit = js.native
    
    /**
    	 * Starts a timer with name name. When the timer is ended with a call to timeEnd using the same name, the amount of time
    	 * that has elapsed in milliseconds since the timer was started is logged at level level. If not level is supplied, the level
    	 * defaults to INFO.
    	 */
    def time(name: String): Unit = js.native
    def time(name: String, level: Level): Unit = js.native
    
    /**
    	 * Ends the timer with name name and logs the time elapsed.
    	 */
    def timeEnd(name: String): Unit = js.native
    
    /**
    	 * Logs one or more messages and optionally an error at level TRACE.
    	 */
    def trace(messages: Any*): Unit = js.native
    
    /**
    	 * Logs one or more messages and optionally an error at level WARN.
    	 */
    def warn(messages: Any*): Unit = js.native
  }
  
  @JSImport("log4javascript", "LoggingEvent")
  @js.native
  open class LoggingEvent protected () extends StObject {
    def this(logger: Logger, timeStamp: js.Date, level: Level, messages: js.Array[String]) = this()
    def this(logger: Logger, timeStamp: js.Date, level: Level, messages: js.Array[String], exception: js.Error) = this()
    
    var exception: js.Error = js.native
    
    def getCombinedMessages(): String = js.native
    
    def getThrowableStrRep(): String = js.native
    
    var level: Level = js.native
    
    var logger: Logger = js.native
    
    var messages: js.Array[Any] = js.native
    
    var milliseconds: Double = js.native
    
    var timeStamp: js.Date = js.native
    
    var timeStampInMilliseconds: Double = js.native
    
    var timeStampInSeconds: Double = js.native
  }
  
  @JSImport("log4javascript", "NullLayout")
  @js.native
  /**
  	 * Constructor
  	 */
  open class NullLayout () extends Layout
  
  @JSImport("log4javascript", "PatternLayout")
  @js.native
  open class PatternLayout protected () extends Layout {
    /**
    	 * Constructor
    	 * @param pattern The conversion pattern string to use.
    	 */
    def this(pattern: String) = this()
  }
  /* static members */
  object PatternLayout {
    
    @JSImport("log4javascript", "PatternLayout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	 * Built-in date format, equivalent to HH:mm:ss,SSS.
    	 */
    @JSImport("log4javascript", "PatternLayout.ABSOLUTETIME_DATEFORMAT")
    @js.native
    def ABSOLUTETIME_DATEFORMAT: String = js.native
    inline def ABSOLUTETIME_DATEFORMAT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTETIME_DATEFORMAT")(x.asInstanceOf[js.Any])
    
    /**
    	 * Built-in date format, equivalent to dd MMM YYYY HH:mm:ss,SSS.
    	 */
    @JSImport("log4javascript", "PatternLayout.DATETIME_DATEFORMAT")
    @js.native
    def DATETIME_DATEFORMAT: String = js.native
    inline def DATETIME_DATEFORMAT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_DATEFORMAT")(x.asInstanceOf[js.Any])
    
    /**
    	 * Built-in conversion pattern, equivalent to %m%n.
    	 */
    @JSImport("log4javascript", "PatternLayout.DEFAULT_CONVERSION_PATTERN")
    @js.native
    def DEFAULT_CONVERSION_PATTERN: String = js.native
    inline def DEFAULT_CONVERSION_PATTERN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CONVERSION_PATTERN")(x.asInstanceOf[js.Any])
    
    /**
    	 * Built-in date format (and also the default), equivalent to yyyy-MM-dd HH:mm:ss,SSS.
    	 */
    @JSImport("log4javascript", "PatternLayout.ISO8601_DATEFORMAT")
    @js.native
    def ISO8601_DATEFORMAT: String = js.native
    inline def ISO8601_DATEFORMAT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO8601_DATEFORMAT")(x.asInstanceOf[js.Any])
    
    /**
    	 * Built-in conversion pattern, equivalent to %r %p %c - %m%n.
    	 */
    @JSImport("log4javascript", "PatternLayout.TTCC_CONVERSION_PATTERN")
    @js.native
    def TTCC_CONVERSION_PATTERN: String = js.native
    inline def TTCC_CONVERSION_PATTERN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TTCC_CONVERSION_PATTERN")(x.asInstanceOf[js.Any])
  }
  
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
  open class PopUpAppender () extends Appender {
    def this(lazyInit: Boolean) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Boolean) = this()
    def this(lazyInit: Unit, initiallyMinimized: Boolean) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Boolean, useDocumentWrite: Boolean) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Unit, useDocumentWrite: Boolean) = this()
    def this(lazyInit: Unit, initiallyMinimized: Boolean, useDocumentWrite: Boolean) = this()
    def this(lazyInit: Unit, initiallyMinimized: Unit, useDocumentWrite: Boolean) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Boolean, useDocumentWrite: Boolean, width: Double) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Boolean, useDocumentWrite: Unit, width: Double) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Unit, useDocumentWrite: Boolean, width: Double) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Unit, useDocumentWrite: Unit, width: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Boolean, useDocumentWrite: Boolean, width: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Boolean, useDocumentWrite: Unit, width: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Unit, useDocumentWrite: Boolean, width: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Unit, useDocumentWrite: Unit, width: Double) = this()
    def this(
      lazyInit: Boolean,
      initiallyMinimized: Boolean,
      useDocumentWrite: Boolean,
      width: Double,
      height: Double
    ) = this()
    def this(
      lazyInit: Boolean,
      initiallyMinimized: Boolean,
      useDocumentWrite: Boolean,
      width: Unit,
      height: Double
    ) = this()
    def this(
      lazyInit: Boolean,
      initiallyMinimized: Boolean,
      useDocumentWrite: Unit,
      width: Double,
      height: Double
    ) = this()
    def this(
      lazyInit: Boolean,
      initiallyMinimized: Boolean,
      useDocumentWrite: Unit,
      width: Unit,
      height: Double
    ) = this()
    def this(
      lazyInit: Boolean,
      initiallyMinimized: Unit,
      useDocumentWrite: Boolean,
      width: Double,
      height: Double
    ) = this()
    def this(
      lazyInit: Boolean,
      initiallyMinimized: Unit,
      useDocumentWrite: Boolean,
      width: Unit,
      height: Double
    ) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Unit, useDocumentWrite: Unit, width: Double, height: Double) = this()
    def this(lazyInit: Boolean, initiallyMinimized: Unit, useDocumentWrite: Unit, width: Unit, height: Double) = this()
    def this(
      lazyInit: Unit,
      initiallyMinimized: Boolean,
      useDocumentWrite: Boolean,
      width: Double,
      height: Double
    ) = this()
    def this(
      lazyInit: Unit,
      initiallyMinimized: Boolean,
      useDocumentWrite: Boolean,
      width: Unit,
      height: Double
    ) = this()
    def this(lazyInit: Unit, initiallyMinimized: Boolean, useDocumentWrite: Unit, width: Double, height: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Boolean, useDocumentWrite: Unit, width: Unit, height: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Unit, useDocumentWrite: Boolean, width: Double, height: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Unit, useDocumentWrite: Boolean, width: Unit, height: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Unit, useDocumentWrite: Unit, width: Double, height: Double) = this()
    def this(lazyInit: Unit, initiallyMinimized: Unit, useDocumentWrite: Unit, width: Unit, height: Double) = this()
    
    /**
    	 * Adds a function with the name specified to the list of functions available on the command line. This feature may be used
    	 * to add custom functions to the command line.
    	 */
    def addCommandLineFunction(
      functionName: String,
      commandLineFunction: js.Function3[/* appender */ Appender, /* args */ Any, /* returnValue */ AppendResult, Any]
    ): Unit = js.native
    
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
  
  @JSImport("log4javascript", "SimpleLayout")
  @js.native
  /**
  	 * Constructor
  	 */
  open class SimpleLayout () extends Layout
  
  @JSImport("log4javascript", "XmlLayout")
  @js.native
  /**
  	 * Constructor
  	 * @param combineMessages Whether or not to format multiple log messages as a combined single <log4javascript:message>
  	 * element composed of each individual message separated by line breaks or to include a <log4javascript:message> element for
  	 * each message inside one <log4javascript:messages> element. If not specified, defaults to true.
  	 */
  open class XmlLayout () extends Layout {
    def this(combineMessages: Boolean) = this()
  }
  
  inline def addEventListener(
    eventType: String,
    listener: js.Function3[/* sender */ Any, /* eventType */ String, /* eventArgs */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dispatchEvent(eventType: String, eventArgs: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventType.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def evalInScope(expr: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("evalInScope")(expr.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getDefaultLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLogger")().asInstanceOf[Logger]
  
  inline def getLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[Logger]
  inline def getLogger(loggerName: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(loggerName.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  inline def getNullLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getNullLogger")().asInstanceOf[Logger]
  
  inline def getRootLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootLogger")().asInstanceOf[Logger]
  
  inline def isEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[Boolean]
  
  object logLog {
    
    @JSImport("log4javascript", "logLog")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def debug(message: String, exception: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def displayDebug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("displayDebug")().asInstanceOf[Unit]
    
    inline def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def error(message: String, exception: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setAlertAllErrors(alertAllErrors: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAlertAllErrors")(alertAllErrors.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setQuietMode(quietMode: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setQuietMode")(quietMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def warn(message: String, exception: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def removeEventListener(
    eventType: String,
    listener: js.Function3[/* sender */ Any, /* eventType */ String, /* eventArgs */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetConfiguration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfiguration")().asInstanceOf[Unit]
  
  inline def setEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setEventTypes(eventTypes: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEventTypes")(eventTypes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setShowStackTraces(show: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShowStackTraces")(show.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
