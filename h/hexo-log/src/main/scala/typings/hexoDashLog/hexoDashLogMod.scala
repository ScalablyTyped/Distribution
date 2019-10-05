package typings.hexoDashLog

import typings.hexoDashBunyan.hexoDashBunyanMod.^
import typings.hexoDashLog.hexoDashLogMod.HexoLogger
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-log", JSImport.Namespace)
@js.native
object hexoDashLogMod extends js.Object {
  @js.native
  trait HexoLogger extends ^ {
    /**
      * Returns a boolean: is the `debug` level enabled?
      *
      * This is equivalent to `log.isDebugEnabled()` or `log.isEnabledFor(DEBUG)` in log4j.
      */
    def d(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def d(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def d(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def d(obj: js.Object, params: js.Any*): Unit = js.native
    /**
      * Returns a boolean: is the `error` level enabled?
      *
      * This is equivalent to `log.isErrorEnabled()` or `log.isEnabledFor(ERROR)` in log4j.
      */
    def e(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def e(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def e(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def e(obj: js.Object, params: js.Any*): Unit = js.native
    /**
      * Returns a boolean: is the `info` level enabled?
      *
      * This is equivalent to `log.isInfoEnabled()` or `log.isEnabledFor(INFO)` in log4j.
      */
    def i(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def i(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def i(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def i(obj: js.Object, params: js.Any*): Unit = js.native
    /**
      * Returns a boolean: is the `info` level enabled?
      *
      * This is equivalent to `log.isInfoEnabled()` or `log.isEnabledFor(INFO)` in log4j.
      */
    def log(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def log(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def log(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def log(obj: js.Object, params: js.Any*): Unit = js.native
    /**
      * Returns a boolean: is the `warn` level enabled?
      *
      * This is equivalent to `log.isWarnEnabled()` or `log.isEnabledFor(WARN)` in log4j.
      */
    def w(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def w(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def w(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def w(obj: js.Object, params: js.Any*): Unit = js.native
  }
  
  def apply(): HexoLogger = js.native
  def apply(options: Anon_Debug): HexoLogger = js.native
}

