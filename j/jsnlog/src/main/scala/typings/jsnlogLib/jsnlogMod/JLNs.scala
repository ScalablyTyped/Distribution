package typings
package jsnlogLib.jsnlogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsnlog", "JL")
@js.native
object JLNs extends js.Object {
  @js.native
  class Exception protected () extends js.Object {
    def this(data: js.Any) = this()
    def this(data: js.Any, inner: js.Any) = this()
  }
  
  // Interface to be used when dependency injecting JSNLog into a class
  @js.native
  trait JSNLog extends js.Object {
    def apply(): JSNLogLogger = js.native
    def apply(loggerName: java.lang.String): JSNLogLogger = js.native
    def createAjaxAppender(appenderName: java.lang.String): JSNLogAjaxAppender = js.native
    def createConsoleAppender(appenderName: java.lang.String): JSNLogConsoleAppender = js.native
    def getAllLevel(): scala.Double = js.native
    def getDebugLevel(): scala.Double = js.native
    def getErrorLevel(): scala.Double = js.native
    def getFatalLevel(): scala.Double = js.native
    def getInfoLevel(): scala.Double = js.native
    def getOffLevel(): scala.Double = js.native
    def getTraceLevel(): scala.Double = js.native
    def getWarnLevel(): scala.Double = js.native
    def setOptions(options: JSNLogOptions): scala.Unit = js.native
  }
  
  trait JSNLogAjaxAppender extends JSNLogAppender {
    @JSName("setOptions")
    var setOptions_JSNLogAjaxAppender: js.UndefOr[js.Function1[/* options */ JSNLogAjaxAppenderOptions, JSNLogAjaxAppender]] = js.undefined
  }
  
  trait JSNLogAjaxAppenderOptions extends JSNLogAppenderOptions {
    var beforeSend: js.UndefOr[js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* json */ js.Any, scala.Unit]] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
  }
  
  // setOptions and sendBatch have to be optional, so you can use a Winston transport as
  // as a JSNLogAppender
  trait JSNLogAppender extends js.Object {
    var sendBatch: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    var setOptions: js.UndefOr[js.Function1[/* options */ JSNLogAppenderOptions, JSNLogAppender]] = js.undefined
  }
  
  // Base for all appender options types
  trait JSNLogAppenderOptions extends JSNLogFilterOptions {
    var batchSize: js.UndefOr[scala.Double] = js.undefined
    var batchTimeout: js.UndefOr[scala.Double] = js.undefined
    var bufferSize: js.UndefOr[scala.Double] = js.undefined
    var maxBatchSize: js.UndefOr[scala.Double] = js.undefined
    var sendTimeout: js.UndefOr[scala.Double] = js.undefined
    var sendWithBufferLevel: js.UndefOr[scala.Double] = js.undefined
    var storeInBufferLevel: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait JSNLogFilterOptions extends js.Object {
    var disallow: js.UndefOr[java.lang.String] = js.undefined
    var ipRegex: js.UndefOr[java.lang.String] = js.undefined
    var level: js.UndefOr[scala.Double] = js.undefined
    var userAgentRegex: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  trait JSNLogLogger extends js.Object {
    def debug(logObject: js.Any): JSNLogLogger = js.native
    def error(logObject: js.Any): JSNLogLogger = js.native
    def fatal(logObject: js.Any): JSNLogLogger = js.native
    def fatalException(logObject: js.Any, e: js.Any): JSNLogLogger = js.native
    def info(logObject: js.Any): JSNLogLogger = js.native
    def log(level: scala.Double, logObject: js.Any): JSNLogLogger = js.native
    def log(level: scala.Double, logObject: js.Any, e: js.Any): JSNLogLogger = js.native
    def setOptions(options: JSNLogLoggerOptions): JSNLogLogger = js.native
    def trace(logObject: js.Any): JSNLogLogger = js.native
    def warn(logObject: js.Any): JSNLogLogger = js.native
  }
  
  trait JSNLogLoggerOptions extends JSNLogFilterOptions {
    var appenders: js.UndefOr[js.Array[JSNLogAppender]] = js.undefined
    var onceOnly: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  
  trait JSNLogOptions extends js.Object {
    var clientIP: js.UndefOr[java.lang.String] = js.undefined
    var defaultAjaxUrl: js.UndefOr[java.lang.String] = js.undefined
    var defaultBeforeSend: js.UndefOr[js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
    var enabled: js.UndefOr[scala.Boolean] = js.undefined
    var maxMessages: js.UndefOr[scala.Double] = js.undefined
    var requestId: js.UndefOr[java.lang.String] = js.undefined
    var serialize: js.UndefOr[js.Function1[/* object */ js.Any, java.lang.String]] = js.undefined
  }
  
  def createAjaxAppender(appenderName: java.lang.String): JSNLogAjaxAppender = js.native
  def createConsoleAppender(appenderName: java.lang.String): JSNLogConsoleAppender = js.native
  def getAllLevel(): scala.Double = js.native
  def getDebugLevel(): scala.Double = js.native
  def getErrorLevel(): scala.Double = js.native
  def getFatalLevel(): scala.Double = js.native
  def getInfoLevel(): scala.Double = js.native
  def getOffLevel(): scala.Double = js.native
  def getTraceLevel(): scala.Double = js.native
  def getWarnLevel(): scala.Double = js.native
  def setOptions(options: JSNLogOptions): scala.Unit = js.native
  type JSNLogConsoleAppender = JSNLogAppender
}

