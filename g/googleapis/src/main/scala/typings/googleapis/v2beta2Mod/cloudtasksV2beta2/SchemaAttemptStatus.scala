package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttemptStatus extends StObject {
  
  /**
    * Output only. The time that this attempt was dispatched. `dispatch_time` will be truncated to the nearest microsecond.
    */
  var dispatchTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The response from the target for this attempt. If the task has not been attempted or the task is currently running then the response status is unset.
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
object SchemaAttemptStatus {
  
  inline def apply(): SchemaAttemptStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttemptStatus]
  }
  
  extension [Self <: SchemaAttemptStatus](x: Self) {
    
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
