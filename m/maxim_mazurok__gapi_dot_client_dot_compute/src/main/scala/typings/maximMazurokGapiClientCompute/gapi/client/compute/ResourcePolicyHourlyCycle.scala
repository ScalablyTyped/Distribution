package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicyHourlyCycle extends js.Object {
  
  /** [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario. */
  var duration: js.UndefOr[String] = js.native
  
  /** Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle. */
  var hoursInCycle: js.UndefOr[Double] = js.native
  
  /** Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT. */
  var startTime: js.UndefOr[String] = js.native
}
object ResourcePolicyHourlyCycle {
  
  @scala.inline
  def apply(): ResourcePolicyHourlyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyHourlyCycle]
  }
  
  @scala.inline
  implicit class ResourcePolicyHourlyCycleOps[Self <: ResourcePolicyHourlyCycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setHoursInCycle(value: Double): Self = this.set("hoursInCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoursInCycle: Self = this.set("hoursInCycle", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
