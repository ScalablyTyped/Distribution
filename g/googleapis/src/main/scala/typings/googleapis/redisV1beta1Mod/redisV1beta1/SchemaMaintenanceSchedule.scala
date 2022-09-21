package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaintenanceSchedule extends StObject {
  
  /**
    * If the scheduled maintenance can be rescheduled, default is true.
    */
  var canReschedule: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The end time of any upcoming scheduled maintenance for this instance.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The deadline that the maintenance schedule start time can not go beyond, including reschedule.
    */
  var scheduleDeadlineTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The start time of any upcoming scheduled maintenance for this instance.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMaintenanceSchedule {
  
  inline def apply(): SchemaMaintenanceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceSchedule]
  }
  
  extension [Self <: SchemaMaintenanceSchedule](x: Self) {
    
    inline def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    inline def setCanRescheduleNull: Self = StObject.set(x, "canReschedule", null)
    
    inline def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setScheduleDeadlineTime(value: String): Self = StObject.set(x, "scheduleDeadlineTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleDeadlineTimeNull: Self = StObject.set(x, "scheduleDeadlineTime", null)
    
    inline def setScheduleDeadlineTimeUndefined: Self = StObject.set(x, "scheduleDeadlineTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
