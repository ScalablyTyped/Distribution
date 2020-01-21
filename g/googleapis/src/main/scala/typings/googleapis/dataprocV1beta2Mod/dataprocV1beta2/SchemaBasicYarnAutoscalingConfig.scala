package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    gracefulDecommissionTimeout: String = null,
    scaleDownFactor: Int | Double = null,
    scaleDownMinWorkerFraction: Int | Double = null,
    scaleUpFactor: Int | Double = null,
    scaleUpMinWorkerFraction: Int | Double = null
  ): SchemaBasicYarnAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    if (gracefulDecommissionTimeout != null) __obj.updateDynamic("gracefulDecommissionTimeout")(gracefulDecommissionTimeout.asInstanceOf[js.Any])
    if (scaleDownFactor != null) __obj.updateDynamic("scaleDownFactor")(scaleDownFactor.asInstanceOf[js.Any])
    if (scaleDownMinWorkerFraction != null) __obj.updateDynamic("scaleDownMinWorkerFraction")(scaleDownMinWorkerFraction.asInstanceOf[js.Any])
    if (scaleUpFactor != null) __obj.updateDynamic("scaleUpFactor")(scaleUpFactor.asInstanceOf[js.Any])
    if (scaleUpMinWorkerFraction != null) __obj.updateDynamic("scaleUpMinWorkerFraction")(scaleUpMinWorkerFraction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicYarnAutoscalingConfig]
  }
}

