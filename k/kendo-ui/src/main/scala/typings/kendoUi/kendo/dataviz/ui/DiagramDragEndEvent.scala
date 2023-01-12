package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramDragEndEvent
  extends StObject
     with DiagramEvent {
  
  var connectionHandle: js.UndefOr[String] = js.undefined
  
  var connections: js.UndefOr[Any] = js.undefined
  
  var shapes: js.UndefOr[Any] = js.undefined
}
object DiagramDragEndEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramDragEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramDragEndEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramDragEndEvent] (val x: Self) extends AnyVal {
    
    inline def setConnectionHandle(value: String): Self = StObject.set(x, "connectionHandle", value.asInstanceOf[js.Any])
    
    inline def setConnectionHandleUndefined: Self = StObject.set(x, "connectionHandle", js.undefined)
    
    inline def setConnections(value: Any): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setShapes(value: Any): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
  }
}
