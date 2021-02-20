package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartPlotArea extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[StockChartPlotAreaBorder] = js.native
  
  var margin: js.UndefOr[Double | js.Any] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object StockChartPlotArea {
  
  @scala.inline
  def apply(): StockChartPlotArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartPlotArea]
  }
  
  @scala.inline
  implicit class StockChartPlotAreaMutableBuilder[Self <: StockChartPlotArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: StockChartPlotAreaBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
