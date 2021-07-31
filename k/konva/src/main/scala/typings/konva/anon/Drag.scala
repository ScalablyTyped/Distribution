package typings.konva.anon

import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drag extends StObject {
  
  def _drag(evt: js.Any): Unit = js.native
  
  var _dragElements: Map[Double, DragStatus] = js.native
  
  def _endDragAfter(evt: js.Any): Unit = js.native
  
  def _endDragBefore(): Unit = js.native
  def _endDragBefore(evt: js.Any): Unit = js.native
  
  val isDragging: Boolean = js.native
  
  var justDragged: Boolean = js.native
  
  val node: Node[NodeConfig] = js.native
}
