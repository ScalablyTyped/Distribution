package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableEvent extends StObject {
  
  var sender: js.UndefOr[Draggable] = js.undefined
}
object DraggableEvent {
  
  inline def apply(): DraggableEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableEvent]
  }
  
  extension [Self <: DraggableEvent](x: Self) {
    
    inline def setSender(value: Draggable): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
