package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollerScrollEvent
  extends StObject
     with ScrollerEvent {
  
  var scrollLeft: js.UndefOr[Double] = js.undefined
  
  var scrollTop: js.UndefOr[Double] = js.undefined
}
object ScrollerScrollEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Scroller): ScrollerScrollEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollerScrollEvent]
  }
  
  @scala.inline
  implicit class ScrollerScrollEventMutableBuilder[Self <: ScrollerScrollEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
  }
}
