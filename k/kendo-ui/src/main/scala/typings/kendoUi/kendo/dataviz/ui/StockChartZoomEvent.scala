package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartZoomEvent
  extends StObject
     with StockChartEvent {
  
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}
object StockChartZoomEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: StockChart): StockChartZoomEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartZoomEvent]
  }
  
  extension [Self <: StockChartZoomEvent](x: Self) {
    
    inline def setAxisRanges(value: js.Any): Self = StObject.set(x, "axisRanges", value.asInstanceOf[js.Any])
    
    inline def setAxisRangesUndefined: Self = StObject.set(x, "axisRanges", js.undefined)
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
