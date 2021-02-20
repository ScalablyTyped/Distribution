package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorSeriesItemHighlight extends StObject {
  
  var border: js.UndefOr[StockChartNavigatorSeriesItemHighlightBorder] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var line: js.UndefOr[StockChartNavigatorSeriesItemHighlightLine] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object StockChartNavigatorSeriesItemHighlight {
  
  @scala.inline
  def apply(): StockChartNavigatorSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSeriesItemHighlight]
  }
  
  @scala.inline
  implicit class StockChartNavigatorSeriesItemHighlightMutableBuilder[Self <: StockChartNavigatorSeriesItemHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: StockChartNavigatorSeriesItemHighlightBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLine(value: StockChartNavigatorSeriesItemHighlightLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
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
