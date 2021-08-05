package typings.i18next.mod

import typings.i18next.i18nextStrings.logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerModule
  extends StObject
     with Module {
  
  def error(args: js.Any*): Unit
  
  def log(args: js.Any*): Unit
  
  @JSName("type")
  var type_LoggerModule: logger
  
  def warn(args: js.Any*): Unit
}
object LoggerModule {
  
  inline def apply(
    error: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): LoggerModule = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.updateDynamic("type")("logger")
    __obj.asInstanceOf[LoggerModule]
  }
  
  extension [Self <: LoggerModule](x: Self) {
    
    inline def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setType(value: logger): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
