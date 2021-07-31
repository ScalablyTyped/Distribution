package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingPolicyLoadBalancingUtilization extends StObject {
  
  /**
    * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that autoscaler should maintain. Must be a positive float value. If not defined, the default
    * is 0.8.
    */
  var utilizationTarget: js.UndefOr[Double] = js.undefined
}
object AutoscalingPolicyLoadBalancingUtilization {
  
  @scala.inline
  def apply(): AutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingPolicyLoadBalancingUtilization]
  }
  
  @scala.inline
  implicit class AutoscalingPolicyLoadBalancingUtilizationMutableBuilder[Self <: AutoscalingPolicyLoadBalancingUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUtilizationTarget(value: Double): Self = StObject.set(x, "utilizationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationTargetUndefined: Self = StObject.set(x, "utilizationTarget", js.undefined)
  }
}
