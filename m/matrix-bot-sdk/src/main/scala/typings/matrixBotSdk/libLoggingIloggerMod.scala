package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoggingIloggerMod {
  
  trait ILogger extends StObject {
    
    /**
      * Logs to the DEBUG channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    def debug(module: String, messageOrObject: Any*): Any
    
    /**
      * Logs to the ERROR channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    def error(module: String, messageOrObject: Any*): Any
    
    /**
      * Logs to the INFO channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    def info(module: String, messageOrObject: Any*): Any
    
    /**
      * Logs to the TRACE channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    def trace(module: String, messageOrObject: Any*): Any
    
    /**
      * Logs to the WARN channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    def warn(module: String, messageOrObject: Any*): Any
  }
  object ILogger {
    
    inline def apply(
      debug: (String, /* repeated */ Any) => Any,
      error: (String, /* repeated */ Any) => Any,
      info: (String, /* repeated */ Any) => Any,
      trace: (String, /* repeated */ Any) => Any,
      warn: (String, /* repeated */ Any) => Any
    ): ILogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), trace = js.Any.fromFunction2(trace), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[ILogger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILogger] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setError(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setInfo(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      inline def setTrace(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "trace", js.Any.fromFunction2(value))
      
      inline def setWarn(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
}
