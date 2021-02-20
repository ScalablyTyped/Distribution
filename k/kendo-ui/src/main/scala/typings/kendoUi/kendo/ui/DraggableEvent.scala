package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableEvent extends StObject {
  
  var sender: js.UndefOr[Draggable] = js.native
}
object DraggableEvent {
  
  @scala.inline
  def apply(): DraggableEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableEvent]
  }
  
  @scala.inline
  implicit class DraggableEventMutableBuilder[Self <: DraggableEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSender(value: Draggable): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
