package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryEventObject
import typings.kendoUi.kendo.mobile.ui.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchGesturestartEvent
  extends StObject
     with TouchEvent {
  
  var center: js.UndefOr[Point] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  
  var touches: js.UndefOr[js.Any] = js.undefined
}
object TouchGesturestartEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Touch): TouchGesturestartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchGesturestartEvent]
  }
  
  extension [Self <: TouchGesturestartEvent](x: Self) {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEvent(value: JQueryEventObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setTouches(value: js.Any): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    inline def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
  }
}
