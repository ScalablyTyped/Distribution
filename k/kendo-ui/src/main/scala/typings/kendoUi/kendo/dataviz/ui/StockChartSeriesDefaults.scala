package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartSeriesDefaults extends js.Object {
  
  var area: js.UndefOr[js.Any] = js.native
  
  var border: js.UndefOr[StockChartSeriesDefaultsBorder] = js.native
  
  var candlestick: js.UndefOr[js.Any] = js.native
  
  var column: js.UndefOr[js.Any] = js.native
  
  var gap: js.UndefOr[Double] = js.native
  
  var labels: js.UndefOr[StockChartSeriesDefaultsLabels] = js.native
  
  var line: js.UndefOr[js.Any] = js.native
  
  var ohlc: js.UndefOr[js.Any] = js.native
  
  var overlay: js.UndefOr[js.Any] = js.native
  
  var pie: js.UndefOr[js.Any] = js.native
  
  var spacing: js.UndefOr[Double] = js.native
  
  var stack: js.UndefOr[Boolean | StockChartSeriesDefaultsStack] = js.native
  
  var tooltip: js.UndefOr[StockChartSeriesDefaultsTooltip] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object StockChartSeriesDefaults {
  
  @scala.inline
  def apply(): StockChartSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesDefaults]
  }
  
  @scala.inline
  implicit class StockChartSeriesDefaultsOps[Self <: StockChartSeriesDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArea(value: js.Any): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setBorder(value: StockChartSeriesDefaultsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setCandlestick(value: js.Any): Self = this.set("candlestick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandlestick: Self = this.set("candlestick", js.undefined)
    
    @scala.inline
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setLabels(value: StockChartSeriesDefaultsLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLine(value: js.Any): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setOhlc(value: js.Any): Self = this.set("ohlc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOhlc: Self = this.set("ohlc", js.undefined)
    
    @scala.inline
    def setOverlay(value: js.Any): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setPie(value: js.Any): Self = this.set("pie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePie: Self = this.set("pie", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean | StockChartSeriesDefaultsStack): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setTooltip(value: StockChartSeriesDefaultsTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
