package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineValueAxisItem extends StObject {
  
  var axisCrossingValue: js.UndefOr[Any | js.Date] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var crosshair: js.UndefOr[SparklineValueAxisItemCrosshair] = js.undefined
  
  var labels: js.UndefOr[SparklineValueAxisItemLabels] = js.undefined
  
  var line: js.UndefOr[SparklineValueAxisItemLine] = js.undefined
  
  var majorGridLines: js.UndefOr[SparklineValueAxisItemMajorGridLines] = js.undefined
  
  var majorTicks: js.UndefOr[SparklineValueAxisItemMajorTicks] = js.undefined
  
  var majorUnit: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var minorGridLines: js.UndefOr[SparklineValueAxisItemMinorGridLines] = js.undefined
  
  var minorTicks: js.UndefOr[SparklineValueAxisItemMinorTicks] = js.undefined
  
  var minorUnit: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[Any] = js.undefined
  
  var narrowRange: js.UndefOr[Boolean] = js.undefined
  
  var notes: js.UndefOr[SparklineValueAxisItemNotes] = js.undefined
  
  var plotBands: js.UndefOr[js.Array[SparklineValueAxisItemPlotBand]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[SparklineValueAxisItemTitle] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object SparklineValueAxisItem {
  
  inline def apply(): SparklineValueAxisItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineValueAxisItem]
  }
  
  extension [Self <: SparklineValueAxisItem](x: Self) {
    
    inline def setAxisCrossingValue(value: Any | js.Date): Self = StObject.set(x, "axisCrossingValue", value.asInstanceOf[js.Any])
    
    inline def setAxisCrossingValueUndefined: Self = StObject.set(x, "axisCrossingValue", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCrosshair(value: SparklineValueAxisItemCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    inline def setLabels(value: SparklineValueAxisItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLine(value: SparklineValueAxisItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMajorGridLines(value: SparklineValueAxisItemMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
    
    inline def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
    
    inline def setMajorTicks(value: SparklineValueAxisItemMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    inline def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    inline def setMajorUnit(value: Double): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinorGridLines(value: SparklineValueAxisItemMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
    
    inline def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
    
    inline def setMinorTicks(value: SparklineValueAxisItemMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    inline def setMinorUnit(value: Double): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNarrowRange(value: Boolean): Self = StObject.set(x, "narrowRange", value.asInstanceOf[js.Any])
    
    inline def setNarrowRangeUndefined: Self = StObject.set(x, "narrowRange", js.undefined)
    
    inline def setNotes(value: SparklineValueAxisItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPlotBands(value: js.Array[SparklineValueAxisItemPlotBand]): Self = StObject.set(x, "plotBands", value.asInstanceOf[js.Any])
    
    inline def setPlotBandsUndefined: Self = StObject.set(x, "plotBands", js.undefined)
    
    inline def setPlotBandsVarargs(value: SparklineValueAxisItemPlotBand*): Self = StObject.set(x, "plotBands", js.Array(value*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTitle(value: SparklineValueAxisItemTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
