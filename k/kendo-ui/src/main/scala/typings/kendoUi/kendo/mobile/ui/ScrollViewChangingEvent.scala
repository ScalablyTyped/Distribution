package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollViewChangingEvent
  extends StObject
     with ScrollViewEvent {
  
  var currentPage: js.UndefOr[Double] = js.undefined
  
  var nextPage: js.UndefOr[Double] = js.undefined
}
object ScrollViewChangingEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ScrollView): ScrollViewChangingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewChangingEvent]
  }
  
  @scala.inline
  implicit class ScrollViewChangingEventMutableBuilder[Self <: ScrollViewChangingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    @scala.inline
    def setNextPage(value: Double): Self = StObject.set(x, "nextPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageUndefined: Self = StObject.set(x, "nextPage", js.undefined)
  }
}
