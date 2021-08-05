package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTargetEvent
  extends StObject
     with JQueryEventObject {
  
  var draggable: js.UndefOr[Draggable] = js.undefined
  
  var dropTarget: js.UndefOr[JQuery] = js.undefined
  
  var sender: js.UndefOr[DropTarget] = js.undefined
}
object DropTargetEvent {
  
  inline def apply(): DropTargetEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetEvent]
  }
  
  extension [Self <: DropTargetEvent](x: Self) {
    
    inline def setDraggable(value: Draggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDropTarget(value: JQuery): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    inline def setSender(value: DropTarget): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
