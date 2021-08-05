package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartNavigatorSeriesItemHighlight extends StObject {
  
  var border: js.UndefOr[StockChartNavigatorSeriesItemHighlightBorder] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var line: js.UndefOr[StockChartNavigatorSeriesItemHighlightLine] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object StockChartNavigatorSeriesItemHighlight {
  
  inline def apply(): StockChartNavigatorSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSeriesItemHighlight]
  }
  
  extension [Self <: StockChartNavigatorSeriesItemHighlight](x: Self) {
    
    inline def setBorder(value: StockChartNavigatorSeriesItemHighlightBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLine(value: StockChartNavigatorSeriesItemHighlightLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
