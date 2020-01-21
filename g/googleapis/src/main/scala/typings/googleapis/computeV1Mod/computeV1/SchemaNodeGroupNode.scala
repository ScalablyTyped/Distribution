package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupNode extends js.Object {
  /**
    * Instances scheduled on this node.
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the node.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of this node.
    */
  var nodeType: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object SchemaNodeGroupNode {
  @scala.inline
  def apply(
    instances: js.Array[String] = null,
    name: String = null,
    nodeType: String = null,
    status: String = null
  ): SchemaNodeGroupNode = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupNode]
  }
}

