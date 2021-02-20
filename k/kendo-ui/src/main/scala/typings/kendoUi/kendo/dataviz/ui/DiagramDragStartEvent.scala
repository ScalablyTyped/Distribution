package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramDragStartEvent extends DiagramEvent {
  
  var connectionHandle: js.UndefOr[String] = js.native
  
  var connections: js.UndefOr[js.Any] = js.native
  
  var shapes: js.UndefOr[js.Any] = js.native
}
object DiagramDragStartEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramDragStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramDragStartEvent]
  }
  
  @scala.inline
  implicit class DiagramDragStartEventMutableBuilder[Self <: DiagramDragStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionHandle(value: String): Self = StObject.set(x, "connectionHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionHandleUndefined: Self = StObject.set(x, "connectionHandle", js.undefined)
    
    @scala.inline
    def setConnections(value: js.Any): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setShapes(value: js.Any): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
  }
}
