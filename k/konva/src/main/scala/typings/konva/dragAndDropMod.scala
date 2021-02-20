package typings.konva

import typings.konva.anon.DragStatus
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropMod {
  
  object DD {
    
    @JSImport("konva/types/DragAndDrop", "DD")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("konva/types/DragAndDrop", "DD._drag")
    @js.native
    def drag(evt: js.Any): Unit = js.native
    
    @JSImport("konva/types/DragAndDrop", "DD._dragElements")
    @js.native
    def dragElements: Map[Double, DragStatus] = js.native
    
    @scala.inline
    def dragElements_=(x: Map[Double, DragStatus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_dragElements")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/DragAndDrop", "DD._endDragAfter")
    @js.native
    def endDragAfter(evt: js.Any): Unit = js.native
    
    @JSImport("konva/types/DragAndDrop", "DD._endDragBefore")
    @js.native
    def endDragBefore(): Unit = js.native
    @JSImport("konva/types/DragAndDrop", "DD._endDragBefore")
    @js.native
    def endDragBefore(evt: js.Any): Unit = js.native
    
    @JSImport("konva/types/DragAndDrop", "DD.isDragging")
    @js.native
    val isDragging: Boolean = js.native
    
    @JSImport("konva/types/DragAndDrop", "DD.justDragged")
    @js.native
    def justDragged: Boolean = js.native
    @scala.inline
    def justDragged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justDragged")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/DragAndDrop", "DD.node")
    @js.native
    val node: Node[NodeConfig] = js.native
  }
}
