package typings.konva

import typings.konva.anon.Node
import typings.konva.nodeMod.NodeConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropMod {
  
  object DD {
    
    @JSImport("konva/lib/DragAndDrop", "DD")
    @js.native
    val ^ : js.Any = js.native
    
    inline def drag(evt: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drag")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/lib/DragAndDrop", "DD._dragElements")
    @js.native
    def dragElements: Map[Double, Node] = js.native
    
    inline def dragElements_=(x: Map[Double, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_dragElements")(x.asInstanceOf[js.Any])
    
    inline def endDragAfter(evt: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragAfter")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def endDragBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragBefore")().asInstanceOf[Unit]
    inline def endDragBefore(evt: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragBefore")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/lib/DragAndDrop", "DD.isDragging")
    @js.native
    val isDragging: Boolean = js.native
    
    @JSImport("konva/lib/DragAndDrop", "DD.justDragged")
    @js.native
    def justDragged: Boolean = js.native
    inline def justDragged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justDragged")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/DragAndDrop", "DD.node")
    @js.native
    val node: typings.konva.nodeMod.Node[NodeConfig] = js.native
  }
}
