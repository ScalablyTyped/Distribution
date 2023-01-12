package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyInstanceSchedulePolicy extends StObject {
  
  /** The expiration time of the schedule. The timestamp is an RFC3339 string. */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /** The start time of the schedule. The timestamp is an RFC3339 string. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database:
    * http://en.wikipedia.org/wiki/Tz_database.
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /** Specifies the schedule for starting instances. */
  var vmStartSchedule: js.UndefOr[ResourcePolicyInstanceSchedulePolicySchedule] = js.undefined
  
  /** Specifies the schedule for stopping instances. */
  var vmStopSchedule: js.UndefOr[ResourcePolicyInstanceSchedulePolicySchedule] = js.undefined
}
object ResourcePolicyInstanceSchedulePolicy {
  
  inline def apply(): ResourcePolicyInstanceSchedulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyInstanceSchedulePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePolicyInstanceSchedulePolicy] (val x: Self) extends AnyVal {
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setVmStartSchedule(value: ResourcePolicyInstanceSchedulePolicySchedule): Self = StObject.set(x, "vmStartSchedule", value.asInstanceOf[js.Any])
    
    inline def setVmStartScheduleUndefined: Self = StObject.set(x, "vmStartSchedule", js.undefined)
    
    inline def setVmStopSchedule(value: ResourcePolicyInstanceSchedulePolicySchedule): Self = StObject.set(x, "vmStopSchedule", value.asInstanceOf[js.Any])
    
    inline def setVmStopScheduleUndefined: Self = StObject.set(x, "vmStopSchedule", js.undefined)
  }
}
