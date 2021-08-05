package typings.konva

import typings.konva.anon.DragStatus
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropMod {
  
  object DD {
    
    @JSImport("konva/types/DragAndDrop", "DD")
    @js.native
    val ^ : js.Any = js.native
    
    inline def drag(evt: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drag")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/types/DragAndDrop", "DD._dragElements")
    @js.native
    def dragElements: Map[Double, DragStatus] = js.native
    
    inline def dragElements_=(x: Map[Double, DragStatus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_dragElements")(x.asInstanceOf[js.Any])
    
    inline def endDragAfter(evt: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragAfter")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def endDragBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragBefore")().asInstanceOf[Unit]
    inline def endDragBefore(evt: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragBefore")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/types/DragAndDrop", "DD.isDragging")
    @js.native
    val isDragging: Boolean = js.native
    
    @JSImport("konva/types/DragAndDrop", "DD.justDragged")
    @js.native
    def justDragged: Boolean = js.native
    inline def justDragged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justDragged")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/DragAndDrop", "DD.node")
    @js.native
    val node: Node[NodeConfig] = js.native
  }
}
