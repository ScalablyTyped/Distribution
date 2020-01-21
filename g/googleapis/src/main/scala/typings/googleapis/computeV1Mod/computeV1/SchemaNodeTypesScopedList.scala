package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of node types contained in this scope.
    */
  var nodeTypes: js.UndefOr[js.Array[SchemaNodeType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the node types
    * list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaNodeTypesScopedList {
  @scala.inline
  def apply(nodeTypes: js.Array[SchemaNodeType] = null, warning: AnonCode = null): SchemaNodeTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (nodeTypes != null) __obj.updateDynamic("nodeTypes")(nodeTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeTypesScopedList]
  }
}

