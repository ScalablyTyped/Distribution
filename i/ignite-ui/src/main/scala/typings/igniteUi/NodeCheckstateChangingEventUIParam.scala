package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCheckstateChangingEventUIParam extends js.Object {
  /**
    * Gets the collection of all checked nodes before the new state is applied.
    */
  var currentCheckedNodes: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets the current state of the checkbox.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * Gets the new state that is going to be applied to the checkbox.
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

object NodeCheckstateChangingEventUIParam {
  @scala.inline
  def apply(): NodeCheckstateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCheckstateChangingEventUIParam]
  }
  @scala.inline
  implicit class NodeCheckstateChangingEventUIParamOps[Self <: NodeCheckstateChangingEventUIParam] (val x: Self) extends AnyVal {
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
    def setCurrentCheckedNodesVarargs(value: js.Any*): Self = this.set("currentCheckedNodes", js.Array(value :_*))
    @scala.inline
    def setCurrentCheckedNodes(value: js.Array[_]): Self = this.set("currentCheckedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentCheckedNodes: Self = this.set("currentCheckedNodes", js.undefined)
    @scala.inline
    def setCurrentState(value: String): Self = this.set("currentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentState: Self = this.set("currentState", js.undefined)
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

