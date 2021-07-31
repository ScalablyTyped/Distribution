package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartXAxisItem extends StObject {
  
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var baseUnit: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var crosshair: js.UndefOr[ChartXAxisItemCrosshair] = js.undefined
  
  var labels: js.UndefOr[ChartXAxisItemLabels] = js.undefined
  
  var line: js.UndefOr[ChartXAxisItemLine] = js.undefined
  
  var majorGridLines: js.UndefOr[ChartXAxisItemMajorGridLines] = js.undefined
  
  var majorTicks: js.UndefOr[ChartXAxisItemMajorTicks] = js.undefined
  
  var majorUnit: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[js.Any] = js.undefined
  
  var min: js.UndefOr[js.Any] = js.undefined
  
  var minorGridLines: js.UndefOr[ChartXAxisItemMinorGridLines] = js.undefined
  
  var minorTicks: js.UndefOr[ChartXAxisItemMinorTicks] = js.undefined
  
  var minorUnit: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var narrowRange: js.UndefOr[Boolean] = js.undefined
  
  var notes: js.UndefOr[ChartXAxisItemNotes] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var plotBands: js.UndefOr[js.Array[ChartXAxisItemPlotBand]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[ChartXAxisItemTitle] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartXAxisItem {
  
  @scala.inline
  def apply(): ChartXAxisItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxisItem]
  }
  
  @scala.inline
  implicit class ChartXAxisItemMutableBuilder[Self <: ChartXAxisItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisCrossingValue(value: js.Any | Date): Self = StObject.set(x, "axisCrossingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisCrossingValueUndefined: Self = StObject.set(x, "axisCrossingValue", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBaseUnit(value: String): Self = StObject.set(x, "baseUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUnitUndefined: Self = StObject.set(x, "baseUnit", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCrosshair(value: ChartXAxisItemCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartXAxisItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: ChartXAxisItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMajorGridLines(value: ChartXAxisItemMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: ChartXAxisItemMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    @scala.inline
    def setMajorUnit(value: Double): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    @scala.inline
    def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinorGridLines(value: ChartXAxisItemMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: ChartXAxisItemMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: Double): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNarrowRange(value: Boolean): Self = StObject.set(x, "narrowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrowRangeUndefined: Self = StObject.set(x, "narrowRange", js.undefined)
    
    @scala.inline
    def setNotes(value: ChartXAxisItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPlotBands(value: js.Array[ChartXAxisItemPlotBand]): Self = StObject.set(x, "plotBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBandsUndefined: Self = StObject.set(x, "plotBands", js.undefined)
    
    @scala.inline
    def setPlotBandsVarargs(value: ChartXAxisItemPlotBand*): Self = StObject.set(x, "plotBands", js.Array(value :_*))
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartXAxisItemTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
