package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableEvents extends StObject {
  
  var create: js.UndefOr[DraggableEvent] = js.native
  
  var drag: js.UndefOr[DraggableEvent] = js.native
  
  var start: js.UndefOr[DraggableEvent] = js.native
  
  var stop: js.UndefOr[DraggableEvent] = js.native
}
object DraggableEvents {
  
  @scala.inline
  def apply(): DraggableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableEvents]
  }
  
  @scala.inline
  implicit class DraggableEventsMutableBuilder[Self <: DraggableEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
