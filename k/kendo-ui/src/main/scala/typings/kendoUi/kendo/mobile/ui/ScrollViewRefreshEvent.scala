package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollViewRefreshEvent
  extends StObject
     with ScrollViewEvent {
  
  var page: js.UndefOr[Double] = js.undefined
  
  var pageCount: js.UndefOr[Double] = js.undefined
}
object ScrollViewRefreshEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ScrollView): ScrollViewRefreshEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewRefreshEvent]
  }
  
  extension [Self <: ScrollViewRefreshEvent](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
