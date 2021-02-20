package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTargetEvent extends JQueryEventObject {
  
  var draggable: js.UndefOr[Draggable] = js.native
  
  var dropTarget: js.UndefOr[JQuery] = js.native
  
  var sender: js.UndefOr[DropTarget] = js.native
}
object DropTargetEvent {
  
  @scala.inline
  def apply(): DropTargetEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetEvent]
  }
  
  @scala.inline
  implicit class DropTargetEventMutableBuilder[Self <: DropTargetEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggable(value: Draggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setDropTarget(value: JQuery): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    @scala.inline
    def setSender(value: DropTarget): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
