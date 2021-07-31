package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartValueAxisItem extends StObject {
  
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var crosshair: js.UndefOr[StockChartValueAxisItemCrosshair] = js.undefined
  
  var labels: js.UndefOr[StockChartValueAxisItemLabels] = js.undefined
  
  var line: js.UndefOr[StockChartValueAxisItemLine] = js.undefined
  
  var majorGridLines: js.UndefOr[StockChartValueAxisItemMajorGridLines] = js.undefined
  
  var majorTicks: js.UndefOr[StockChartValueAxisItemMajorTicks] = js.undefined
  
  var majorUnit: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var minorGridLines: js.UndefOr[StockChartValueAxisItemMinorGridLines] = js.undefined
  
  var minorTicks: js.UndefOr[StockChartValueAxisItemMinorTicks] = js.undefined
  
  var minorUnit: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[js.Any] = js.undefined
  
  var narrowRange: js.UndefOr[Boolean] = js.undefined
  
  var notes: js.UndefOr[StockChartValueAxisItemNotes] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var plotBands: js.UndefOr[js.Array[StockChartValueAxisItemPlotBand]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[StockChartValueAxisItemTitle] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object StockChartValueAxisItem {
  
  @scala.inline
  def apply(): StockChartValueAxisItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartValueAxisItem]
  }
  
  @scala.inline
  implicit class StockChartValueAxisItemMutableBuilder[Self <: StockChartValueAxisItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisCrossingValue(value: js.Any | Date): Self = StObject.set(x, "axisCrossingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisCrossingValueUndefined: Self = StObject.set(x, "axisCrossingValue", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCrosshair(value: StockChartValueAxisItemCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    @scala.inline
    def setLabels(value: StockChartValueAxisItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: StockChartValueAxisItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMajorGridLines(value: StockChartValueAxisItemMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: StockChartValueAxisItemMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    @scala.inline
    def setMajorUnit(value: Double): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinorGridLines(value: StockChartValueAxisItemMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: StockChartValueAxisItemMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: Double): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNarrowRange(value: Boolean): Self = StObject.set(x, "narrowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrowRangeUndefined: Self = StObject.set(x, "narrowRange", js.undefined)
    
    @scala.inline
    def setNotes(value: StockChartValueAxisItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPlotBands(value: js.Array[StockChartValueAxisItemPlotBand]): Self = StObject.set(x, "plotBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBandsUndefined: Self = StObject.set(x, "plotBands", js.undefined)
    
    @scala.inline
    def setPlotBandsVarargs(value: StockChartValueAxisItemPlotBand*): Self = StObject.set(x, "plotBands", js.Array(value :_*))
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setTitle(value: StockChartValueAxisItemTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
