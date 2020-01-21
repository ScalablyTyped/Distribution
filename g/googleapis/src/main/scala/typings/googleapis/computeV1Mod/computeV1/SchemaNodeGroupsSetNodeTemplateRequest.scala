package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsSetNodeTemplateRequest extends js.Object {
  /**
    * Full or partial URL of the node template resource to be updated for this
    * node group.
    */
  var nodeTemplate: js.UndefOr[String] = js.native
}

object SchemaNodeGroupsSetNodeTemplateRequest {
  @scala.inline
  def apply(nodeTemplate: String = null): SchemaNodeGroupsSetNodeTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(nodeTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupsSetNodeTemplateRequest]
  }
}

