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
  
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): LoggerModule = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.updateDynamic("type")("logger")
    __obj.asInstanceOf[LoggerModule]
  }
  
  @scala.inline
  implicit class LoggerModuleMutableBuilder[Self <: LoggerModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: logger): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
