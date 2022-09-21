package typings.kendoUi.kendo.ui

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableEvent extends StObject {
  
  var originalEvent: MouseEvent
  
  var sender: js.UndefOr[Draggable] = js.undefined
}
object DraggableEvent {
  
  inline def apply(originalEvent: MouseEvent): DraggableEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableEvent]
  }
  
  extension [Self <: DraggableEvent](x: Self) {
    
    inline def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Draggable): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
