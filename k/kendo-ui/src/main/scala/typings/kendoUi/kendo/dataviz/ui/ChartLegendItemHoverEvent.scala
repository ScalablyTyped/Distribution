package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendItemHoverEvent
  extends StObject
     with ChartEvent {
  
  var element: js.UndefOr[js.Any] = js.undefined
  
  var pointIndex: js.UndefOr[Double] = js.undefined
  
  var series: js.UndefOr[js.Any] = js.undefined
  
  var seriesIndex: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object ChartLegendItemHoverEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Chart): ChartLegendItemHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendItemHoverEvent]
  }
  
  @scala.inline
  implicit class ChartLegendItemHoverEventMutableBuilder[Self <: ChartLegendItemHoverEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIndexUndefined: Self = StObject.set(x, "pointIndex", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
