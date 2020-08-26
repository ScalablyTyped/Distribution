package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCheckstateChangedEventUIParam extends js.Object {
  /**
    * Gets the collection of all checked nodes.
    */
  var newCheckedNodes: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets the collection of all partially checked nodes.
    */
  var newPartiallyCheckedNodes: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets the new state that is already applied to the checkbox.
    */
  var newState: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the node object the checkbox of which is being interacted with.
    */
  var node: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object NodeCheckstateChangedEventUIParam {
  @scala.inline
  def apply(): NodeCheckstateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCheckstateChangedEventUIParam]
  }
  @scala.inline
  implicit class NodeCheckstateChangedEventUIParamOps[Self <: NodeCheckstateChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setNewCheckedNodesVarargs(value: js.Any*): Self = this.set("newCheckedNodes", js.Array(value :_*))
    @scala.inline
    def setNewCheckedNodes(value: js.Array[_]): Self = this.set("newCheckedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewCheckedNodes: Self = this.set("newCheckedNodes", js.undefined)
    @scala.inline
    def setNewPartiallyCheckedNodesVarargs(value: js.Any*): Self = this.set("newPartiallyCheckedNodes", js.Array(value :_*))
    @scala.inline
    def setNewPartiallyCheckedNodes(value: js.Array[_]): Self = this.set("newPartiallyCheckedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPartiallyCheckedNodes: Self = this.set("newPartiallyCheckedNodes", js.undefined)
    @scala.inline
    def setNewState(value: String): Self = this.set("newState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewState: Self = this.set("newState", js.undefined)
    @scala.inline
    def setNode(value: js.Any): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

