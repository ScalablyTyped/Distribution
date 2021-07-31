package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryEventObject
import typings.kendoUi.kendo.mobile.ui.TouchEventOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchDragendEvent
  extends StObject
     with TouchEvent {
  
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  
  var touch: js.UndefOr[TouchEventOptions] = js.undefined
}
object TouchDragendEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Touch): TouchDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchDragendEvent]
  }
  
  @scala.inline
  implicit class TouchDragendEventMutableBuilder[Self <: TouchDragendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: JQueryEventObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setTouch(value: TouchEventOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
