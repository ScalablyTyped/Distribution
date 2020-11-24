package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic autoscaling configurations for YARN.
  */
@js.native
trait SchemaBasicYarnAutoscalingConfig extends js.Object {
  
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
  implicit class SchemaBasicYarnAutoscalingConfigOps[Self <: SchemaBasicYarnAutoscalingConfig] (val x: Self) extends AnyVal {
    
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
    def setGracefulDecommissionTimeout(value: String): Self = this.set("gracefulDecommissionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGracefulDecommissionTimeout: Self = this.set("gracefulDecommissionTimeout", js.undefined)
    
    @scala.inline
    def setScaleDownFactor(value: Double): Self = this.set("scaleDownFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleDownFactor: Self = this.set("scaleDownFactor", js.undefined)
    
    @scala.inline
    def setScaleDownMinWorkerFraction(value: Double): Self = this.set("scaleDownMinWorkerFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleDownMinWorkerFraction: Self = this.set("scaleDownMinWorkerFraction", js.undefined)
    
    @scala.inline
    def setScaleUpFactor(value: Double): Self = this.set("scaleUpFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleUpFactor: Self = this.set("scaleUpFactor", js.undefined)
    
    @scala.inline
    def setScaleUpMinWorkerFraction(value: Double): Self = this.set("scaleUpMinWorkerFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleUpMinWorkerFraction: Self = this.set("scaleUpMinWorkerFraction", js.undefined)
  }
}
