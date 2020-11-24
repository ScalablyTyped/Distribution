package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalingPolicyScaleInControl extends js.Object {
  
  /**
    * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs
    * can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
    */
  var maxScaledInReplicas: js.UndefOr[FixedOrPercent] = js.native
  
  /** How long back autoscaling should look when computing recommendations to include directives regarding slower scale in, as described above. */
  var timeWindowSec: js.UndefOr[Double] = js.native
}
object AutoscalingPolicyScaleInControl {
  
  @scala.inline
  def apply(): AutoscalingPolicyScaleInControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicyScaleInControl]
  }
  
  @scala.inline
  implicit class AutoscalingPolicyScaleInControlOps[Self <: AutoscalingPolicyScaleInControl] (val x: Self) extends AnyVal {
    
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
    def setMaxScaledInReplicas(value: FixedOrPercent): Self = this.set("maxScaledInReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScaledInReplicas: Self = this.set("maxScaledInReplicas", js.undefined)
    
    @scala.inline
    def setTimeWindowSec(value: Double): Self = this.set("timeWindowSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeWindowSec: Self = this.set("timeWindowSec", js.undefined)
  }
}
