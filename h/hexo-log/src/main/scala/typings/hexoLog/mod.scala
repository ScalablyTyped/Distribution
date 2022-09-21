package typings.hexoLog

import typings.hexoLog.anon.Debug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): HexoLogger = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[HexoLogger]
  inline def apply(options: Debug): HexoLogger = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[HexoLogger]
  
  @JSImport("hexo-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait HexoLogger
    extends typings.hexoBunyan.mod.^ {
    
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
    def d(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def d(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def d(obj: js.Object, params: Any*): Unit = js.native
    
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
    def e(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def e(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def e(obj: js.Object, params: Any*): Unit = js.native
    
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
    def i(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def i(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def i(obj: js.Object, params: Any*): Unit = js.native
    
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
    def log(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def log(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def log(obj: js.Object, params: Any*): Unit = js.native
    
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
    def w(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def w(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def w(obj: js.Object, params: Any*): Unit = js.native
  }
}
