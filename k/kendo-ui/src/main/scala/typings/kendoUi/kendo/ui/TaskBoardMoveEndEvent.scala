package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardMoveEndEvent
  extends StObject
     with TaskBoardEvent {
  
  var action: js.UndefOr[String] = js.undefined
  
  var card: js.UndefOr[Model] = js.undefined
  
  var cardElement: js.UndefOr[JQuery] = js.undefined
  
  var column: js.UndefOr[Model] = js.undefined
  
  var columnElement: js.UndefOr[JQuery] = js.undefined
  
  var draggableEvent: js.UndefOr[Any] = js.undefined
  
  var item: js.UndefOr[JQuery] = js.undefined
  
  var newIndex: js.UndefOr[Double] = js.undefined
  
  var oldIndex: js.UndefOr[Double] = js.undefined
}
object TaskBoardMoveEndEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TaskBoard_): TaskBoardMoveEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskBoardMoveEndEvent]
  }
  
  extension [Self <: TaskBoardMoveEndEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCard(value: Model): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardElement(value: JQuery): Self = StObject.set(x, "cardElement", value.asInstanceOf[js.Any])
    
    inline def setCardElementUndefined: Self = StObject.set(x, "cardElement", js.undefined)
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setColumn(value: Model): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnElement(value: JQuery): Self = StObject.set(x, "columnElement", value.asInstanceOf[js.Any])
    
    inline def setColumnElementUndefined: Self = StObject.set(x, "columnElement", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDraggableEvent(value: Any): Self = StObject.set(x, "draggableEvent", value.asInstanceOf[js.Any])
    
    inline def setDraggableEventUndefined: Self = StObject.set(x, "draggableEvent", js.undefined)
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    inline def setOldIndexUndefined: Self = StObject.set(x, "oldIndex", js.undefined)
  }
}
