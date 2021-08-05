package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortableEndEvent
  extends StObject
     with SortableEvent {
  
  var action: js.UndefOr[String] = js.undefined
  
  var draggableEvent: js.UndefOr[js.Any] = js.undefined
  
  var item: js.UndefOr[JQuery] = js.undefined
  
  var newIndex: js.UndefOr[Double] = js.undefined
  
  var oldIndex: js.UndefOr[Double] = js.undefined
}
object SortableEndEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Sortable): SortableEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableEndEvent]
  }
  
  extension [Self <: SortableEndEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDraggableEvent(value: js.Any): Self = StObject.set(x, "draggableEvent", value.asInstanceOf[js.Any])
    
    inline def setDraggableEventUndefined: Self = StObject.set(x, "draggableEvent", js.undefined)
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    inline def setOldIndexUndefined: Self = StObject.set(x, "oldIndex", js.undefined)
  }
}
