package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableEvents extends StObject {
  
  var create: js.UndefOr[DraggableEvent] = js.undefined
  
  var drag: js.UndefOr[DraggableEvent] = js.undefined
  
  var start: js.UndefOr[DraggableEvent] = js.undefined
  
  var stop: js.UndefOr[DraggableEvent] = js.undefined
}
object DraggableEvents {
  
  inline def apply(): DraggableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableEvents]
  }
  
  extension [Self <: DraggableEvents](x: Self) {
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDrag(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setStart(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
