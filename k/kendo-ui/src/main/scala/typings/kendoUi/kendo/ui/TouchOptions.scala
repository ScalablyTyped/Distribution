package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchOptions extends StObject {
  
  var doubleTapTimeout: js.UndefOr[Double] = js.undefined
  
  var doubletap: js.UndefOr[js.Function1[/* e */ TouchDoubletapEvent, Unit]] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ TouchDragEvent, Unit]] = js.undefined
  
  var dragend: js.UndefOr[js.Function1[/* e */ TouchDragendEvent, Unit]] = js.undefined
  
  var dragstart: js.UndefOr[js.Function1[/* e */ TouchDragstartEvent, Unit]] = js.undefined
  
  var enableSwipe: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var gesturechange: js.UndefOr[js.Function1[/* e */ TouchGesturechangeEvent, Unit]] = js.undefined
  
  var gestureend: js.UndefOr[js.Function1[/* e */ TouchGestureendEvent, Unit]] = js.undefined
  
  var gesturestart: js.UndefOr[js.Function1[/* e */ TouchGesturestartEvent, Unit]] = js.undefined
  
  var hold: js.UndefOr[js.Function1[/* e */ TouchHoldEvent, Unit]] = js.undefined
  
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  var maxYDelta: js.UndefOr[Double] = js.undefined
  
  var minHold: js.UndefOr[Double] = js.undefined
  
  var minXDelta: js.UndefOr[Double] = js.undefined
  
  var multiTouch: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var surface: js.UndefOr[JQuery] = js.undefined
  
  var swipe: js.UndefOr[js.Function1[/* e */ TouchSwipeEvent, Unit]] = js.undefined
  
  var tap: js.UndefOr[js.Function1[/* e */ TouchTapEvent, Unit]] = js.undefined
  
  var touchstart: js.UndefOr[js.Function1[/* e */ TouchTouchstartEvent, Unit]] = js.undefined
}
object TouchOptions {
  
  @scala.inline
  def apply(): TouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptions]
  }
  
  @scala.inline
  implicit class TouchOptionsMutableBuilder[Self <: TouchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoubleTapTimeout(value: Double): Self = StObject.set(x, "doubleTapTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleTapTimeoutUndefined: Self = StObject.set(x, "doubleTapTimeout", js.undefined)
    
    @scala.inline
    def setDoubletap(value: /* e */ TouchDoubletapEvent => Unit): Self = StObject.set(x, "doubletap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoubletapUndefined: Self = StObject.set(x, "doubletap", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ TouchDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDragend(value: /* e */ TouchDragendEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* e */ TouchDragstartEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    @scala.inline
    def setEnableSwipe(value: Boolean): Self = StObject.set(x, "enableSwipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSwipeUndefined: Self = StObject.set(x, "enableSwipe", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGesturechange(value: /* e */ TouchGesturechangeEvent => Unit): Self = StObject.set(x, "gesturechange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGesturechangeUndefined: Self = StObject.set(x, "gesturechange", js.undefined)
    
    @scala.inline
    def setGestureend(value: /* e */ TouchGestureendEvent => Unit): Self = StObject.set(x, "gestureend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGestureendUndefined: Self = StObject.set(x, "gestureend", js.undefined)
    
    @scala.inline
    def setGesturestart(value: /* e */ TouchGesturestartEvent => Unit): Self = StObject.set(x, "gesturestart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGesturestartUndefined: Self = StObject.set(x, "gesturestart", js.undefined)
    
    @scala.inline
    def setHold(value: /* e */ TouchHoldEvent => Unit): Self = StObject.set(x, "hold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setMaxYDelta(value: Double): Self = StObject.set(x, "maxYDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxYDeltaUndefined: Self = StObject.set(x, "maxYDelta", js.undefined)
    
    @scala.inline
    def setMinHold(value: Double): Self = StObject.set(x, "minHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHoldUndefined: Self = StObject.set(x, "minHold", js.undefined)
    
    @scala.inline
    def setMinXDelta(value: Double): Self = StObject.set(x, "minXDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinXDeltaUndefined: Self = StObject.set(x, "minXDelta", js.undefined)
    
    @scala.inline
    def setMultiTouch(value: Boolean): Self = StObject.set(x, "multiTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiTouchUndefined: Self = StObject.set(x, "multiTouch", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSurface(value: JQuery): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
    
    @scala.inline
    def setSwipe(value: /* e */ TouchSwipeEvent => Unit): Self = StObject.set(x, "swipe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    
    @scala.inline
    def setTap(value: /* e */ TouchTapEvent => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
    
    @scala.inline
    def setTouchstart(value: /* e */ TouchTouchstartEvent => Unit): Self = StObject.set(x, "touchstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTouchstartUndefined: Self = StObject.set(x, "touchstart", js.undefined)
  }
}
