package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleModule extends StObject {
  
  var error: logFn
  
  var info: logFn
  
  var log: logFn
  
  var warn: logFn
}
object ConsoleModule {
  
  inline def apply(error: logFn, info: logFn, log: logFn, warn: logFn): ConsoleModule = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsoleModule] (val x: Self) extends AnyVal {
    
    inline def setError(value: logFn): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: logFn): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setLog(value: logFn): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: logFn): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
  }
}
