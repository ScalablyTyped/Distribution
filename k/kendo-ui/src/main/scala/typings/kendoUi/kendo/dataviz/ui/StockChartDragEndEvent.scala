package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartDragEndEvent
  extends StObject
     with StockChartEvent {
  
  var axisRanges: js.UndefOr[Any] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
}
object StockChartDragEndEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: StockChart): StockChartDragEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartDragEndEvent]
  }
  
  extension [Self <: StockChartDragEndEvent](x: Self) {
    
    inline def setAxisRanges(value: Any): Self = StObject.set(x, "axisRanges", value.asInstanceOf[js.Any])
    
    inline def setAxisRangesUndefined: Self = StObject.set(x, "axisRanges", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
