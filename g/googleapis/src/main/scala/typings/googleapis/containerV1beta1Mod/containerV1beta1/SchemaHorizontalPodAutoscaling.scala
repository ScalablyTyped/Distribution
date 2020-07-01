package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the horizontal pod autoscaling feature, which
  * increases or decreases the number of replica pods a replication controller
  * has based on the resource usage of the existing pods.
  */
@js.native
trait SchemaHorizontalPodAutoscaling extends js.Object {
  /**
    * Whether the Horizontal Pod Autoscaling feature is enabled in the cluster.
    * When enabled, it ensures that a Heapster pod is running in the cluster,
    * which is also used by the Cloud Monitoring service.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object SchemaHorizontalPodAutoscaling {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): SchemaHorizontalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHorizontalPodAutoscaling]
  }
}

