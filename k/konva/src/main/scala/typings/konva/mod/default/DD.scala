package typings.konva.mod.default

import typings.konva.anon.DragStatus
import typings.konva.nodeMod.NodeConfig
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva", "DD")
@js.native
object DD extends js.Object {
  
  def _drag(evt: js.Any): Unit = js.native
  
  var _dragElements: Map[Double, DragStatus] = js.native
  
  def _endDragAfter(evt: js.Any): Unit = js.native
  
  def _endDragBefore(): Unit = js.native
  def _endDragBefore(evt: js.Any): Unit = js.native
  
  val isDragging: Boolean = js.native
  
  var justDragged: Boolean = js.native
  
  val node: typings.konva.nodeMod.Node[NodeConfig] = js.native
}
