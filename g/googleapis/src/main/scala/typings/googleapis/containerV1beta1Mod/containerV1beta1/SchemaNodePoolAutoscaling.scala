package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodePoolAutoscaling contains information required by cluster autoscaler to
  * adjust the size of the node pool to the current cluster usage.
  */
@js.native
trait SchemaNodePoolAutoscaling extends js.Object {
  /**
    * Can this node pool be deleted automatically.
    */
  var autoprovisioned: js.UndefOr[Boolean] = js.native
  /**
    * Is autoscaling enabled for this node pool.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count.
    * There has to enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double] = js.native
  /**
    * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
    * max_node_count.
    */
  var minNodeCount: js.UndefOr[Double] = js.native
}

object SchemaNodePoolAutoscaling {
  @scala.inline
  def apply(
    autoprovisioned: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxNodeCount: js.UndefOr[Double] = js.undefined,
    minNodeCount: js.UndefOr[Double] = js.undefined
  ): SchemaNodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoprovisioned)) __obj.updateDynamic("autoprovisioned")(autoprovisioned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNodeCount)) __obj.updateDynamic("maxNodeCount")(maxNodeCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minNodeCount)) __obj.updateDynamic("minNodeCount")(minNodeCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodePoolAutoscaling]
  }
}

