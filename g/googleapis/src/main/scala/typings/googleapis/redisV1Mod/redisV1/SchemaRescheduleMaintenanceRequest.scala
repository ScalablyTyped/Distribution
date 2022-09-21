package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRescheduleMaintenanceRequest extends StObject {
  
  /**
    * Required. If reschedule type is SPECIFIC_TIME, must set up schedule_time as well.
    */
  var rescheduleType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Timestamp when the maintenance shall be rescheduled to if reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for example `2012-11-15T16:19:00.094Z`.
    */
  var scheduleTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaRescheduleMaintenanceRequest {
  
  inline def apply(): SchemaRescheduleMaintenanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRescheduleMaintenanceRequest]
  }
  
  extension [Self <: SchemaRescheduleMaintenanceRequest](x: Self) {
    
    inline def setRescheduleType(value: String): Self = StObject.set(x, "rescheduleType", value.asInstanceOf[js.Any])
    
    inline def setRescheduleTypeNull: Self = StObject.set(x, "rescheduleType", null)
    
    inline def setRescheduleTypeUndefined: Self = StObject.set(x, "rescheduleType", js.undefined)
    
    inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleTimeNull: Self = StObject.set(x, "scheduleTime", null)
    
    inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
  }
}
