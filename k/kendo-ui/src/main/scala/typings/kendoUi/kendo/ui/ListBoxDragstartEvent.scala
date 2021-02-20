package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxDragstartEvent extends ListBoxEvent {
  
  var draggableEvent: js.UndefOr[js.Any] = js.native
  
  var items: js.UndefOr[JQuery] = js.native
}
object ListBoxDragstartEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ListBox): ListBoxDragstartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxDragstartEvent]
  }
  
  @scala.inline
  implicit class ListBoxDragstartEventMutableBuilder[Self <: ListBoxDragstartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggableEvent(value: js.Any): Self = StObject.set(x, "draggableEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableEventUndefined: Self = StObject.set(x, "draggableEvent", js.undefined)
    
    @scala.inline
    def setItems(value: JQuery): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
