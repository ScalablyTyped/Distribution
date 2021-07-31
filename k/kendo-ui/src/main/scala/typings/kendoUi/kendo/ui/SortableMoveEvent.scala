package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortableMoveEvent
  extends StObject
     with SortableEvent {
  
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  
  var item: js.UndefOr[JQuery] = js.undefined
  
  var list: js.UndefOr[Sortable] = js.undefined
  
  var target: js.UndefOr[JQuery] = js.undefined
}
object SortableMoveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Sortable): SortableMoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableMoveEvent]
  }
  
  @scala.inline
  implicit class SortableMoveEventMutableBuilder[Self <: SortableMoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggableEvent(value: js.Any): Self = StObject.set(x, "draggableEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableEventUndefined: Self = StObject.set(x, "draggableEvent", js.undefined)
    
    @scala.inline
    def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setList(value: Sortable): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
