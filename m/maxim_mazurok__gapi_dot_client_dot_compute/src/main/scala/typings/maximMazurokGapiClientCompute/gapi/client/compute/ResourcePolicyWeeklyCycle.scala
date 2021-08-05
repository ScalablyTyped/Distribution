package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyWeeklyCycle extends StObject {
  
  /** Up to 7 intervals/windows, one for each day of the week. */
  var dayOfWeeks: js.UndefOr[js.Array[ResourcePolicyWeeklyCycleDayOfWeek]] = js.undefined
}
object ResourcePolicyWeeklyCycle {
  
  inline def apply(): ResourcePolicyWeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyWeeklyCycle]
  }
  
  extension [Self <: ResourcePolicyWeeklyCycle](x: Self) {
    
    inline def setDayOfWeeks(value: js.Array[ResourcePolicyWeeklyCycleDayOfWeek]): Self = StObject.set(x, "dayOfWeeks", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeeksUndefined: Self = StObject.set(x, "dayOfWeeks", js.undefined)
    
    inline def setDayOfWeeksVarargs(value: ResourcePolicyWeeklyCycleDayOfWeek*): Self = StObject.set(x, "dayOfWeeks", js.Array(value :_*))
  }
}
