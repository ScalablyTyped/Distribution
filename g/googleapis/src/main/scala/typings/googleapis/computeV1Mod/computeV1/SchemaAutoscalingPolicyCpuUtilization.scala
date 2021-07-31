package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CPU utilization policy.
  */
trait SchemaAutoscalingPolicyCpuUtilization extends StObject {
  
  /**
    * The target CPU utilization that the autoscaler should maintain. Must be a
    * float value in the range (0, 1]. If not specified, the default is 0.6. If
    * the CPU level is below the target utilization, the autoscaler scales down
    * the number of instances until it reaches the minimum number of instances
    * you specified or until the average CPU of your instances reaches the
    * target utilization.  If the average CPU is above the target utilization,
    * the autoscaler scales up until it reaches the maximum number of instances
    * you specified or until the average utilization reaches the target
    * utilization.
    */
  var utilizationTarget: js.UndefOr[Double] = js.undefined
}
object SchemaAutoscalingPolicyCpuUtilization {
  
  @scala.inline
  def apply(): SchemaAutoscalingPolicyCpuUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyCpuUtilization]
  }
  
  @scala.inline
  implicit class SchemaAutoscalingPolicyCpuUtilizationMutableBuilder[Self <: SchemaAutoscalingPolicyCpuUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUtilizationTarget(value: Double): Self = StObject.set(x, "utilizationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationTargetUndefined: Self = StObject.set(x, "utilizationTarget", js.undefined)
  }
}
