package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeSelectionChangedEventUIParam extends js.Object {
  /**
    * Gets a reference to the newly added nodes to the selection.
    */
  var newNodes: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to currently selected nodes.
    */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.native
}

object IgTreeSelectionChangedEventUIParam {
  @scala.inline
  def apply(): IgTreeSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeSelectionChangedEventUIParam]
  }
  @scala.inline
  implicit class IgTreeSelectionChangedEventUIParamOps[Self <: IgTreeSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setNewNodesVarargs(value: js.Any*): Self = this.set("newNodes", js.Array(value :_*))
    @scala.inline
    def setNewNodes(value: js.Array[_]): Self = this.set("newNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewNodes: Self = this.set("newNodes", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setSelectedNodesVarargs(value: js.Any*): Self = this.set("selectedNodes", js.Array(value :_*))
    @scala.inline
    def setSelectedNodes(value: js.Array[_]): Self = this.set("selectedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedNodes: Self = this.set("selectedNodes", js.undefined)
  }
  
}

