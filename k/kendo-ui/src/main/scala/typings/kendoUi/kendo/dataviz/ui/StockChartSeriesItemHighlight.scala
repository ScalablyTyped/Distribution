package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartSeriesItemHighlight extends StObject {
  
  var border: js.UndefOr[StockChartSeriesItemHighlightBorder] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var line: js.UndefOr[StockChartSeriesItemHighlightLine] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object StockChartSeriesItemHighlight {
  
  @scala.inline
  def apply(): StockChartSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemHighlight]
  }
  
  @scala.inline
  implicit class StockChartSeriesItemHighlightMutableBuilder[Self <: StockChartSeriesItemHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: StockChartSeriesItemHighlightBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLine(value: StockChartSeriesItemHighlightLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
