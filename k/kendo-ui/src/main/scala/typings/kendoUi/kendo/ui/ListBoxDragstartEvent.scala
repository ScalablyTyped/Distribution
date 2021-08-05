package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxDragstartEvent
  extends StObject
     with ListBoxEvent {
  
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  
  var items: js.UndefOr[JQuery] = js.undefined
}
object ListBoxDragstartEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ListBox): ListBoxDragstartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxDragstartEvent]
  }
  
  extension [Self <: ListBoxDragstartEvent](x: Self) {
    
    inline def setDraggableEvent(value: js.Any): Self = StObject.set(x, "draggableEvent", value.asInstanceOf[js.Any])
    
    inline def setDraggableEventUndefined: Self = StObject.set(x, "draggableEvent", js.undefined)
    
    inline def setItems(value: JQuery): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
