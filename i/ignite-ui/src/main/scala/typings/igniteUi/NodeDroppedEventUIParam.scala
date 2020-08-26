package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDroppedEventUIParam extends js.Object {
  /**
    * Gets a reference to the binding object for the level at which the target node is located.
    */
  var binding: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the target node data.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the draggable element (the node).
    */
  var draggable: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the jQuery element of the node.
    */
  var element: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the target node data-path attribute.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the dropped source node object.
    */
  var sourceNode: js.UndefOr[js.Any] = js.native
}

object NodeDroppedEventUIParam {
  @scala.inline
  def apply(): NodeDroppedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDroppedEventUIParam]
  }
  @scala.inline
  implicit class NodeDroppedEventUIParamOps[Self <: NodeDroppedEventUIParam] (val x: Self) extends AnyVal {
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
    def setBinding(value: js.Any): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDraggable(value: String): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setHelper(value: String): Self = this.set("helper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSourceNode(value: js.Any): Self = this.set("sourceNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceNode: Self = this.set("sourceNode", js.undefined)
  }
  
}

