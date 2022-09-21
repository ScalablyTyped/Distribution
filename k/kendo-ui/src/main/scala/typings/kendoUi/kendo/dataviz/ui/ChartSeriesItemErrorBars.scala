package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemErrorBars extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var endCaps: js.UndefOr[Boolean] = js.undefined
  
  var line: js.UndefOr[ChartSeriesItemErrorBarsLine] = js.undefined
  
  var value: js.UndefOr[String | Double | Any | js.Function] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
  
  var xValue: js.UndefOr[String | Double | Any | js.Function] = js.undefined
  
  var yValue: js.UndefOr[String | Double | Any | js.Function] = js.undefined
}
object ChartSeriesItemErrorBars {
  
  inline def apply(): ChartSeriesItemErrorBars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemErrorBars]
  }
  
  extension [Self <: ChartSeriesItemErrorBars](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndCaps(value: Boolean): Self = StObject.set(x, "endCaps", value.asInstanceOf[js.Any])
    
    inline def setEndCapsUndefined: Self = StObject.set(x, "endCaps", js.undefined)
    
    inline def setLine(value: ChartSeriesItemErrorBarsLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setValue(value: String | Double | Any | js.Function): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    inline def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
    
    inline def setXValue(value: String | Double | Any | js.Function): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
    
    inline def setXValueUndefined: Self = StObject.set(x, "xValue", js.undefined)
    
    inline def setYValue(value: String | Double | Any | js.Function): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
    
    inline def setYValueUndefined: Self = StObject.set(x, "yValue", js.undefined)
  }
}
