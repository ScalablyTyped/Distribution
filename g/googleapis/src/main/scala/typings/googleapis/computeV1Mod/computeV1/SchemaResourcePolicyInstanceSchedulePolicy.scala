package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyInstanceSchedulePolicy extends StObject {
  
  /**
    * The expiration time of the schedule. The timestamp is an RFC3339 string.
    */
  var expirationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time of the schedule. The timestamp is an RFC3339 string.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the schedule for starting instances.
    */
  var vmStartSchedule: js.UndefOr[SchemaResourcePolicyInstanceSchedulePolicySchedule] = js.undefined
  
  /**
    * Specifies the schedule for stopping instances.
    */
  var vmStopSchedule: js.UndefOr[SchemaResourcePolicyInstanceSchedulePolicySchedule] = js.undefined
}
object SchemaResourcePolicyInstanceSchedulePolicy {
  
  inline def apply(): SchemaResourcePolicyInstanceSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyInstanceSchedulePolicy]
  }
  
  extension [Self <: SchemaResourcePolicyInstanceSchedulePolicy](x: Self) {
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setVmStartSchedule(value: SchemaResourcePolicyInstanceSchedulePolicySchedule): Self = StObject.set(x, "vmStartSchedule", value.asInstanceOf[js.Any])
    
    inline def setVmStartScheduleUndefined: Self = StObject.set(x, "vmStartSchedule", js.undefined)
    
    inline def setVmStopSchedule(value: SchemaResourcePolicyInstanceSchedulePolicySchedule): Self = StObject.set(x, "vmStopSchedule", value.asInstanceOf[js.Any])
    
    inline def setVmStopScheduleUndefined: Self = StObject.set(x, "vmStopSchedule", js.undefined)
  }
}
