package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTargetAreaDropEvent
  extends StObject
     with DropTargetAreaEvent {
  
  var draggable: js.UndefOr[Draggable] = js.undefined
  
  var dropTarget: js.UndefOr[JQuery] = js.undefined
  
  var target: js.UndefOr[Element] = js.undefined
}
object DropTargetAreaDropEvent {
  
  @scala.inline
  def apply(sender: DropTargetArea): DropTargetAreaDropEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetAreaDropEvent]
  }
  
  @scala.inline
  implicit class DropTargetAreaDropEventMutableBuilder[Self <: DropTargetAreaDropEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggable(value: Draggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setDropTarget(value: JQuery): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
