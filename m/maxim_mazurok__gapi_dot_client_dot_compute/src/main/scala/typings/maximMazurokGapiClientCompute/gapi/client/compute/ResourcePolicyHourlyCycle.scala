package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyHourlyCycle extends StObject {
  
  /** [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle. */
  var hoursInCycle: js.UndefOr[Double] = js.undefined
  
  /** Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT. */
  var startTime: js.UndefOr[String] = js.undefined
}
object ResourcePolicyHourlyCycle {
  
  inline def apply(): ResourcePolicyHourlyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyHourlyCycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePolicyHourlyCycle] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setHoursInCycle(value: Double): Self = StObject.set(x, "hoursInCycle", value.asInstanceOf[js.Any])
    
    inline def setHoursInCycleUndefined: Self = StObject.set(x, "hoursInCycle", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
