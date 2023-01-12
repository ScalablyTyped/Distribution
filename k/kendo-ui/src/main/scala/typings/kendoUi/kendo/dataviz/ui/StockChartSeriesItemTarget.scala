package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartSeriesItemTarget extends StObject {
  
  var border: js.UndefOr[js.Function | StockChartSeriesItemTargetBorder] = js.undefined
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var line: js.UndefOr[StockChartSeriesItemTargetLine] = js.undefined
}
object StockChartSeriesItemTarget {
  
  inline def apply(): StockChartSeriesItemTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockChartSeriesItemTarget] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: js.Function | StockChartSeriesItemTargetBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLine(value: StockChartSeriesItemTargetLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
