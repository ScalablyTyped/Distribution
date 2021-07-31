package typings.kendoUi.kendo.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceMouseleaveEvent
  extends StObject
     with SurfaceEvent {
  
  var element: js.UndefOr[Element] = js.undefined
  
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}
object SurfaceMouseleaveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Surface): SurfaceMouseleaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceMouseleaveEvent]
  }
  
  @scala.inline
  implicit class SurfaceMouseleaveEventMutableBuilder[Self <: SurfaceMouseleaveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
