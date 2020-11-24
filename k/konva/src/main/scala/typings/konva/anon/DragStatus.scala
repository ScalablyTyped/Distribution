package typings.konva.anon

import typings.konva.konvaStrings.dragging
import typings.konva.konvaStrings.ready
import typings.konva.konvaStrings.stopped
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.typesMod.Vector2d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragStatus extends js.Object {
  
  var dragStatus: stopped | ready | dragging = js.native
  
  var node: Node[NodeConfig] = js.native
  
  var offset: Vector2d = js.native
  
  var pointerId: js.UndefOr[Double] = js.native
  
  var startPointerPos: Vector2d = js.native
}
object DragStatus {
  
  @scala.inline
  def apply(
    dragStatus: stopped | ready | dragging,
    node: Node[NodeConfig],
    offset: Vector2d,
    startPointerPos: Vector2d
  ): DragStatus = {
    val __obj = js.Dynamic.literal(dragStatus = dragStatus.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], startPointerPos = startPointerPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStatus]
  }
  
  @scala.inline
  implicit class DragStatusOps[Self <: DragStatus] (val x: Self) extends AnyVal {
    
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
    def setDragStatus(value: stopped | ready | dragging): Self = this.set("dragStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node[NodeConfig]): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Vector2d): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPointerPos(value: Vector2d): Self = this.set("startPointerPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerId: Self = this.set("pointerId", js.undefined)
  }
}
