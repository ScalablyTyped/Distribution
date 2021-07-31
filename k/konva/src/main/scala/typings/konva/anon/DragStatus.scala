package typings.konva.anon

import typings.konva.konvaStrings.dragging
import typings.konva.konvaStrings.ready
import typings.konva.konvaStrings.stopped
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.typesMod.Vector2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragStatus extends StObject {
  
  var dragStatus: stopped | ready | dragging
  
  var node: Node[NodeConfig]
  
  var offset: Vector2d
  
  var pointerId: js.UndefOr[Double] = js.undefined
  
  var startPointerPos: Vector2d
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
  implicit class DragStatusMutableBuilder[Self <: DragStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragStatus(value: stopped | ready | dragging): Self = StObject.set(x, "dragStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node[NodeConfig]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Vector2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerIdUndefined: Self = StObject.set(x, "pointerId", js.undefined)
    
    @scala.inline
    def setStartPointerPos(value: Vector2d): Self = StObject.set(x, "startPointerPos", value.asInstanceOf[js.Any])
  }
}
