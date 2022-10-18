package typings.konva.anon

import typings.konva.libNodeMod.NodeConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drag extends StObject {
  
  def _drag(evt: Any): Unit = js.native
  
  var _dragElements: Map[Double, DragStatus] = js.native
  
  def _endDragAfter(evt: Any): Unit = js.native
  
  def _endDragBefore(): Unit = js.native
  def _endDragBefore(evt: Any): Unit = js.native
  
  val isDragging: Boolean = js.native
  
  var justDragged: Boolean = js.native
  
  val node: typings.konva.libNodeMod.Node[NodeConfig] = js.native
}
