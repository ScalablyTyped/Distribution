package typings.googleapis.cloudtasksV2Mod.cloudtasksV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttempt extends StObject {
  
  /**
    * Output only. The time that this attempt was dispatched. `dispatch_time` will be truncated to the nearest microsecond.
    */
  var dispatchTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The response from the worker for this attempt. If `response_time` is unset, then the task has not been attempted or is currently running and the `response_status` field is meaningless.
    */
  var responseStatus: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Output only. The time that this attempt response was received. `response_time` will be truncated to the nearest microsecond.
    */
  var responseTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time that this attempt was scheduled. `schedule_time` will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaAttempt {
  
  inline def apply(): SchemaAttempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttempt]
  }
  
  extension [Self <: SchemaAttempt](x: Self) {
    
    inline def setDispatchTime(value: String): Self = StObject.set(x, "dispatchTime", value.asInstanceOf[js.Any])
    
    inline def setDispatchTimeNull: Self = StObject.set(x, "dispatchTime", null)
    
    inline def setDispatchTimeUndefined: Self = StObject.set(x, "dispatchTime", js.undefined)
    
    inline def setResponseStatus(value: SchemaStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    
    inline def setResponseTime(value: String): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeNull: Self = StObject.set(x, "responseTime", null)
    
    inline def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
    
    inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleTimeNull: Self = StObject.set(x, "scheduleTime", null)
    
    inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
  }
}
