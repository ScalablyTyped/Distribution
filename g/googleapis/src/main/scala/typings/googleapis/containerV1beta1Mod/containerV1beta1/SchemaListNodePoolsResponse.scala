package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListNodePoolsResponse is the result of ListNodePoolsRequest.
  */
@js.native
trait SchemaListNodePoolsResponse extends js.Object {
  /**
    * A list of node pools for a cluster.
    */
  var nodePools: js.UndefOr[js.Array[SchemaNodePool]] = js.native
}

object SchemaListNodePoolsResponse {
  @scala.inline
  def apply(nodePools: js.Array[SchemaNodePool] = null): SchemaListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (nodePools != null) __obj.updateDynamic("nodePools")(nodePools.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListNodePoolsResponse]
  }
}

