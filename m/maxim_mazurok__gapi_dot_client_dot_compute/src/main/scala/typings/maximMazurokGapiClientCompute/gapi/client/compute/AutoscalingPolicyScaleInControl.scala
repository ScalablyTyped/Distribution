package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalingPolicyScaleInControl extends StObject {
  
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
  implicit class AutoscalingPolicyScaleInControlMutableBuilder[Self <: AutoscalingPolicyScaleInControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxScaledInReplicas(value: FixedOrPercent): Self = StObject.set(x, "maxScaledInReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaledInReplicasUndefined: Self = StObject.set(x, "maxScaledInReplicas", js.undefined)
    
    @scala.inline
    def setTimeWindowSec(value: Double): Self = StObject.set(x, "timeWindowSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeWindowSecUndefined: Self = StObject.set(x, "timeWindowSec", js.undefined)
  }
}
