package typings.jui.anon

import typings.jui.mod.UITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragChild extends js.Object {
  /**
    * @cfg {Boolean} [drag=false]
    * It is possible to drag the movement of a node.
    */
  var drag: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [dragChild=true]
    * It is possible to drag the node movement but the node is not changed to a child node of the target node.
    */
  var dragChild: js.UndefOr[Boolean] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {NodeObject} [root=null]
    * Adds a root node (required).
    */
  var root: js.UndefOr[UITreeNode] = js.native
  /**
    * @cfg {Boolean} [rootFold=false]
    * Folds up a root node.
    */
  var rootFold: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [rootHide=false]
    * Hides a root node.
    */
  var rootHide: js.UndefOr[Boolean] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
}

object DragChild {
  @scala.inline
  def apply(): DragChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragChild]
  }
  @scala.inline
  implicit class DragChildOps[Self <: DragChild] (val x: Self) extends AnyVal {
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
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragChild(value: Boolean): Self = this.set("dragChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragChild: Self = this.set("dragChild", js.undefined)
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setRoot(value: UITreeNode): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootFold(value: Boolean): Self = this.set("rootFold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootFold: Self = this.set("rootFold", js.undefined)
    @scala.inline
    def setRootHide(value: Boolean): Self = this.set("rootHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootHide: Self = this.set("rootHide", js.undefined)
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
  }
  
}

