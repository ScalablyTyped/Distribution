package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic autoscaling configurations for YARN.
  */
@js.native
trait SchemaBasicYarnAutoscalingConfig extends StObject {
  
  /**
    * Required. Timeout for YARN graceful decommissioning of Node Managers.
    * Specifies the duration to wait for jobs to complete before forcefully
    * removing workers (and potentially interrupting jobs). Only applicable to
    * downscaling operations.Bounds: 0s, 1d.
    */
  var gracefulDecommissionTimeout: js.UndefOr[String] = js.native
  
  /**
    * Required. Fraction of average pending memory in the last cooldown period
    * for which to remove workers. A scale-down factor of 1 will result in
    * scaling down so that there is no available memory remaining after the
    * update (more aggressive scaling). A scale-down factor of 0 disables
    * removing workers, which can be beneficial for autoscaling a single
    * job.Bounds: 0.0, 1.0.
    */
  var scaleDownFactor: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Minimum scale-down threshold as a fraction of total cluster
    * size before scaling occurs. For example, in a 20-worker cluster, a
    * threshold of 0.1 means the autoscaler must recommend at least a 2 worker
    * scale-down for the cluster to scale. A threshold of 0 means the
    * autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0.
    * Default: 0.0.
    */
  var scaleDownMinWorkerFraction: js.UndefOr[Double] = js.native
  
  /**
    * Required. Fraction of average pending memory in the last cooldown period
    * for which to add workers. A scale-up factor of 1.0 will result in scaling
    * up so that there is no pending memory remaining after the update (more
    * aggressive scaling). A scale-up factor closer to 0 will result in a
    * smaller magnitude of scaling up (less aggressive scaling).Bounds:
    * 0.0, 1.0.
    */
  var scaleUpFactor: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Minimum scale-up threshold as a fraction of total cluster size
    * before scaling occurs. For example, in a 20-worker cluster, a threshold
    * of 0.1 means the autoscaler must recommend at least a 2-worker scale-up
    * for the cluster to scale. A threshold of 0 means the autoscaler will
    * scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
    */
  var scaleUpMinWorkerFraction: js.UndefOr[Double] = js.native
}
object SchemaBasicYarnAutoscalingConfig {
  
  @scala.inline
  def apply(): SchemaBasicYarnAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicYarnAutoscalingConfig]
  }
  
  @scala.inline
  implicit class SchemaBasicYarnAutoscalingConfigMutableBuilder[Self <: SchemaBasicYarnAutoscalingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGracefulDecommissionTimeout(value: String): Self = StObject.set(x, "gracefulDecommissionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGracefulDecommissionTimeoutUndefined: Self = StObject.set(x, "gracefulDecommissionTimeout", js.undefined)
    
    @scala.inline
    def setScaleDownFactor(value: Double): Self = StObject.set(x, "scaleDownFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDownFactorUndefined: Self = StObject.set(x, "scaleDownFactor", js.undefined)
    
    @scala.inline
    def setScaleDownMinWorkerFraction(value: Double): Self = StObject.set(x, "scaleDownMinWorkerFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDownMinWorkerFractionUndefined: Self = StObject.set(x, "scaleDownMinWorkerFraction", js.undefined)
    
    @scala.inline
    def setScaleUpFactor(value: Double): Self = StObject.set(x, "scaleUpFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUpFactorUndefined: Self = StObject.set(x, "scaleUpFactor", js.undefined)
    
    @scala.inline
    def setScaleUpMinWorkerFraction(value: Double): Self = StObject.set(x, "scaleUpMinWorkerFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUpMinWorkerFractionUndefined: Self = StObject.set(x, "scaleUpMinWorkerFraction", js.undefined)
  }
}
