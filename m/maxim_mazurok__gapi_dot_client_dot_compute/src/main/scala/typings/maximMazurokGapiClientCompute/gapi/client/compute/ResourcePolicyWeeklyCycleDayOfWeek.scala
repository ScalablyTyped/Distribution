package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyWeeklyCycleDayOfWeek extends StObject {
  
  /**
    * Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,
    * SUNDAY.
    */
  var day: js.UndefOr[String] = js.undefined
  
  /** [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT. */
  var startTime: js.UndefOr[String] = js.undefined
}
object ResourcePolicyWeeklyCycleDayOfWeek {
  
  inline def apply(): ResourcePolicyWeeklyCycleDayOfWeek = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyWeeklyCycleDayOfWeek]
  }
  
  extension [Self <: ResourcePolicyWeeklyCycleDayOfWeek](x: Self) {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
