package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryEventObject
import typings.kendoUi.kendo.mobile.ui.TouchEventOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchDoubletapEvent
  extends StObject
     with TouchEvent {
  
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  
  var touch: js.UndefOr[TouchEventOptions] = js.undefined
}
object TouchDoubletapEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Touch): TouchDoubletapEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchDoubletapEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchDoubletapEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: JQueryEventObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setTouch(value: TouchEventOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
