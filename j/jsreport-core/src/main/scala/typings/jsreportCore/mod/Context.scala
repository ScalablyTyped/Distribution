package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var isChildRequest: js.UndefOr[Boolean] = js.undefined
  
  var logs: Any
  
  var originalInputDataIsEmpty: js.UndefOr[Boolean] = js.undefined
  
  var shared: js.UndefOr[Any] = js.undefined
  
  var timeoutLimit: Double
}
object Context {
  
  inline def apply(logs: Any, timeoutLimit: Double): Context = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], timeoutLimit = timeoutLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setIsChildRequest(value: Boolean): Self = StObject.set(x, "isChildRequest", value.asInstanceOf[js.Any])
    
    inline def setIsChildRequestUndefined: Self = StObject.set(x, "isChildRequest", js.undefined)
    
    inline def setLogs(value: Any): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setOriginalInputDataIsEmpty(value: Boolean): Self = StObject.set(x, "originalInputDataIsEmpty", value.asInstanceOf[js.Any])
    
    inline def setOriginalInputDataIsEmptyUndefined: Self = StObject.set(x, "originalInputDataIsEmpty", js.undefined)
    
    inline def setShared(value: Any): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setTimeoutLimit(value: Double): Self = StObject.set(x, "timeoutLimit", value.asInstanceOf[js.Any])
  }
}
