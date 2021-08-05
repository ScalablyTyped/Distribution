package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendItemLeaveEvent
  extends StObject
     with ChartEvent {
  
  var element: js.UndefOr[js.Any] = js.undefined
  
  var pointIndex: js.UndefOr[Double] = js.undefined
  
  var series: js.UndefOr[js.Any] = js.undefined
  
  var seriesIndex: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object ChartLegendItemLeaveEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Chart): ChartLegendItemLeaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendItemLeaveEvent]
  }
  
  extension [Self <: ChartLegendItemLeaveEvent](x: Self) {
    
    inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    inline def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
    
    inline def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
    
    inline def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
