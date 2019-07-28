package typings.jsnlog.jsnlogMod

import typings.jsnlog.jsnlogMod.JLNs.JSNLogAjaxAppender
import typings.jsnlog.jsnlogMod.JLNs.JSNLogAjaxAppenderOptions
import typings.jsnlog.jsnlogMod.JLNs.JSNLogAppender
import typings.jsnlog.jsnlogMod.JLNs.JSNLogAppenderOptions
import typings.jsnlog.jsnlogMod.JLNs.JSNLogConsoleAppender
import typings.jsnlog.jsnlogMod.JLNs.JSNLogFilterOptions
import typings.jsnlog.jsnlogMod.JLNs.JSNLogLogger
import typings.jsnlog.jsnlogMod.JLNs.JSNLogLoggerOptions
import typings.jsnlog.jsnlogMod.JLNs.JSNLogOptions
import typings.std.XMLHttpRequest
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
    def apply(loggerName: String): JSNLogLogger = js.native
    def createAjaxAppender(appenderName: String): JSNLogAjaxAppender = js.native
    def createConsoleAppender(appenderName: String): JSNLogConsoleAppender = js.native
    def getAllLevel(): Double = js.native
    def getDebugLevel(): Double = js.native
    def getErrorLevel(): Double = js.native
    def getFatalLevel(): Double = js.native
    def getInfoLevel(): Double = js.native
    def getOffLevel(): Double = js.native
    def getTraceLevel(): Double = js.native
    def getWarnLevel(): Double = js.native
    def setOptions(options: JSNLogOptions): Unit = js.native
  }
  
  trait JSNLogAjaxAppender extends JSNLogAppender {
    @JSName("setOptions")
    var setOptions_JSNLogAjaxAppender: js.UndefOr[js.Function1[/* options */ JSNLogAjaxAppenderOptions, JSNLogAjaxAppender]] = js.undefined
  }
  
  trait JSNLogAjaxAppenderOptions extends JSNLogAppenderOptions {
    var beforeSend: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* json */ js.Any, Unit]] = js.undefined
    var url: js.UndefOr[String] = js.undefined
  }
  
  // setOptions and sendBatch have to be optional, so you can use a Winston transport as
  // as a JSNLogAppender
  trait JSNLogAppender extends js.Object {
    var sendBatch: js.UndefOr[js.Function0[Unit]] = js.undefined
    var setOptions: js.UndefOr[js.Function1[/* options */ JSNLogAppenderOptions, JSNLogAppender]] = js.undefined
  }
  
  // Base for all appender options types
  trait JSNLogAppenderOptions extends JSNLogFilterOptions {
    var batchSize: js.UndefOr[Double] = js.undefined
    var batchTimeout: js.UndefOr[Double] = js.undefined
    var bufferSize: js.UndefOr[Double] = js.undefined
    var maxBatchSize: js.UndefOr[Double] = js.undefined
    var sendTimeout: js.UndefOr[Double] = js.undefined
    var sendWithBufferLevel: js.UndefOr[Double] = js.undefined
    var storeInBufferLevel: js.UndefOr[Double] = js.undefined
  }
  
  trait JSNLogFilterOptions extends js.Object {
    var disallow: js.UndefOr[String] = js.undefined
    var ipRegex: js.UndefOr[String] = js.undefined
    var level: js.UndefOr[Double] = js.undefined
    var userAgentRegex: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait JSNLogLogger extends js.Object {
    def debug(logObject: js.Any): JSNLogLogger = js.native
    def error(logObject: js.Any): JSNLogLogger = js.native
    def fatal(logObject: js.Any): JSNLogLogger = js.native
    def fatalException(logObject: js.Any, e: js.Any): JSNLogLogger = js.native
    def info(logObject: js.Any): JSNLogLogger = js.native
    def log(level: Double, logObject: js.Any): JSNLogLogger = js.native
    def log(level: Double, logObject: js.Any, e: js.Any): JSNLogLogger = js.native
    def setOptions(options: JSNLogLoggerOptions): JSNLogLogger = js.native
    def trace(logObject: js.Any): JSNLogLogger = js.native
    def warn(logObject: js.Any): JSNLogLogger = js.native
  }
  
  trait JSNLogLoggerOptions extends JSNLogFilterOptions {
    var appenders: js.UndefOr[js.Array[JSNLogAppender]] = js.undefined
    var onceOnly: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  trait JSNLogOptions extends js.Object {
    var clientIP: js.UndefOr[String] = js.undefined
    var defaultAjaxUrl: js.UndefOr[String] = js.undefined
    var defaultBeforeSend: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.undefined
    var enabled: js.UndefOr[Boolean] = js.undefined
    var maxMessages: js.UndefOr[Double] = js.undefined
    var requestId: js.UndefOr[String] = js.undefined
    var serialize: js.UndefOr[js.Function1[/* object */ js.Any, String]] = js.undefined
  }
  
  def createAjaxAppender(appenderName: String): JSNLogAjaxAppender = js.native
  def createConsoleAppender(appenderName: String): JSNLogConsoleAppender = js.native
  def getAllLevel(): Double = js.native
  def getDebugLevel(): Double = js.native
  def getErrorLevel(): Double = js.native
  def getFatalLevel(): Double = js.native
  def getInfoLevel(): Double = js.native
  def getOffLevel(): Double = js.native
  def getTraceLevel(): Double = js.native
  def getWarnLevel(): Double = js.native
  def setOptions(options: JSNLogOptions): Unit = js.native
  type JSNLogConsoleAppender = JSNLogAppender
}

