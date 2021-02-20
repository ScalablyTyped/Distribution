package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartValueAxisItemPlotBand extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[Double] = js.native
}
object StockChartValueAxisItemPlotBand {
  
  @scala.inline
  def apply(): StockChartValueAxisItemPlotBand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartValueAxisItemPlotBand]
  }
  
  @scala.inline
  implicit class StockChartValueAxisItemPlotBandMutableBuilder[Self <: StockChartValueAxisItemPlotBand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
