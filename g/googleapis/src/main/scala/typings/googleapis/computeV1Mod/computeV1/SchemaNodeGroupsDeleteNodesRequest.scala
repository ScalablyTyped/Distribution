package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsDeleteNodesRequest extends js.Object {
  var nodes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaNodeGroupsDeleteNodesRequest {
  @scala.inline
  def apply(nodes: js.Array[String] = null): SchemaNodeGroupsDeleteNodesRequest = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupsDeleteNodesRequest]
  }
}

