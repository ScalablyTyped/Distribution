package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicyWeeklyCycle extends StObject {
  
  /** Up to 7 intervals/windows, one for each day of the week. */
  var dayOfWeeks: js.UndefOr[js.Array[ResourcePolicyWeeklyCycleDayOfWeek]] = js.native
}
object ResourcePolicyWeeklyCycle {
  
  @scala.inline
  def apply(): ResourcePolicyWeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyWeeklyCycle]
  }
  
  @scala.inline
  implicit class ResourcePolicyWeeklyCycleMutableBuilder[Self <: ResourcePolicyWeeklyCycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfWeeks(value: js.Array[ResourcePolicyWeeklyCycleDayOfWeek]): Self = StObject.set(x, "dayOfWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeeksUndefined: Self = StObject.set(x, "dayOfWeeks", js.undefined)
    
    @scala.inline
    def setDayOfWeeksVarargs(value: ResourcePolicyWeeklyCycleDayOfWeek*): Self = StObject.set(x, "dayOfWeeks", js.Array(value :_*))
  }
}
