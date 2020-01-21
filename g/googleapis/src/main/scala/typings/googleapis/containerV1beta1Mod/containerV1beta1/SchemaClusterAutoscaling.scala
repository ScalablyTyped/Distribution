package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterAutoscaling contains global, per-cluster information required by
  * Cluster Autoscaler to automatically adjust the size of the cluster and
  * create/delete node pools based on the current needs.
  */
@js.native
trait SchemaClusterAutoscaling extends js.Object {
  /**
    * Enables automatic node pool creation and deletion.
    */
  var enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.native
  /**
    * Contains global constraints regarding minimum and maximum amount of
    * resources in the cluster.
    */
  var resourceLimits: js.UndefOr[js.Array[SchemaResourceLimit]] = js.native
}

object SchemaClusterAutoscaling {
  @scala.inline
  def apply(
    enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.undefined,
    resourceLimits: js.Array[SchemaResourceLimit] = null
  ): SchemaClusterAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableNodeAutoprovisioning)) __obj.updateDynamic("enableNodeAutoprovisioning")(enableNodeAutoprovisioning.asInstanceOf[js.Any])
    if (resourceLimits != null) __obj.updateDynamic("resourceLimits")(resourceLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClusterAutoscaling]
  }
}

