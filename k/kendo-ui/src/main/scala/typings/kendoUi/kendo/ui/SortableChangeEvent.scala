package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableChangeEvent extends SortableEvent {
  
  var action: js.UndefOr[String] = js.native
  
  var draggableEvent: js.UndefOr[js.Any] = js.native
  
  var item: js.UndefOr[JQuery] = js.native
  
  var newIndex: js.UndefOr[Double] = js.native
  
  var oldIndex: js.UndefOr[Double] = js.native
}
object SortableChangeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Sortable): SortableChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableChangeEvent]
  }
  
  @scala.inline
  implicit class SortableChangeEventMutableBuilder[Self <: SortableChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDraggableEvent(value: js.Any): Self = StObject.set(x, "draggableEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableEventUndefined: Self = StObject.set(x, "draggableEvent", js.undefined)
    
    @scala.inline
    def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    @scala.inline
    def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndexUndefined: Self = StObject.set(x, "oldIndex", js.undefined)
  }
}
