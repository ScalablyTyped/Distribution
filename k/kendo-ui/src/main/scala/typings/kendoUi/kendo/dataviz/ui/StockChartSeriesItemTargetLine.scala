package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartSeriesItemTargetLine extends StObject {
  
  var width: js.UndefOr[js.Any | js.Function] = js.undefined
}
object StockChartSeriesItemTargetLine {
  
  inline def apply(): StockChartSeriesItemTargetLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemTargetLine]
  }
  
  extension [Self <: StockChartSeriesItemTargetLine](x: Self) {
    
    inline def setWidth(value: js.Any | js.Function): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
