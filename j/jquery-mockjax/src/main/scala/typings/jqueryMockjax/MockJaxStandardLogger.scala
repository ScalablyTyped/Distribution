package typings.jqueryMockjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MockJaxStandardLogger extends StObject {
  
  var debug: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  
  var error: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  
  var info: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  
  var log: js.UndefOr[MockJaxLoggingFunction] = js.undefined
  
  var warn: js.UndefOr[MockJaxLoggingFunction] = js.undefined
}
object MockJaxStandardLogger {
  
  inline def apply(): MockJaxStandardLogger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockJaxStandardLogger]
  }
  
  extension [Self <: MockJaxStandardLogger](x: Self) {
    
    inline def setDebug(value: MockJaxLoggingFunction): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: MockJaxLoggingFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: MockJaxLoggingFunction): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLog(value: MockJaxLoggingFunction): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setWarn(value: MockJaxLoggingFunction): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
