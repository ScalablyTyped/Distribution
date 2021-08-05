package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCategoryAxisItem extends StObject {
  
  var autoBaseUnitSteps: js.UndefOr[ChartCategoryAxisItemAutoBaseUnitSteps] = js.undefined
  
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.undefined
  
  var background: js.UndefOr[String] = js.undefined
  
  var baseUnit: js.UndefOr[String] = js.undefined
  
  var baseUnitStep: js.UndefOr[js.Any] = js.undefined
  
  var categories: js.UndefOr[js.Any] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var crosshair: js.UndefOr[ChartCategoryAxisItemCrosshair] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var justified: js.UndefOr[Boolean] = js.undefined
  
  var labels: js.UndefOr[ChartCategoryAxisItemLabels] = js.undefined
  
  var line: js.UndefOr[ChartCategoryAxisItemLine] = js.undefined
  
  var majorGridLines: js.UndefOr[ChartCategoryAxisItemMajorGridLines] = js.undefined
  
  var majorTicks: js.UndefOr[ChartCategoryAxisItemMajorTicks] = js.undefined
  
  var max: js.UndefOr[js.Any] = js.undefined
  
  var maxDateGroups: js.UndefOr[Double] = js.undefined
  
  var maxDivisions: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[js.Any] = js.undefined
  
  var minorGridLines: js.UndefOr[ChartCategoryAxisItemMinorGridLines] = js.undefined
  
  var minorTicks: js.UndefOr[ChartCategoryAxisItemMinorTicks] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var notes: js.UndefOr[ChartCategoryAxisItemNotes] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var plotBands: js.UndefOr[js.Array[ChartCategoryAxisItemPlotBand]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var roundToBaseUnit: js.UndefOr[Boolean] = js.undefined
  
  var select: js.UndefOr[ChartCategoryAxisItemSelect] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[ChartCategoryAxisItemTitle] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var weekStartDay: js.UndefOr[Double] = js.undefined
}
object ChartCategoryAxisItem {
  
  inline def apply(): ChartCategoryAxisItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItem]
  }
  
  extension [Self <: ChartCategoryAxisItem](x: Self) {
    
    inline def setAutoBaseUnitSteps(value: ChartCategoryAxisItemAutoBaseUnitSteps): Self = StObject.set(x, "autoBaseUnitSteps", value.asInstanceOf[js.Any])
    
    inline def setAutoBaseUnitStepsUndefined: Self = StObject.set(x, "autoBaseUnitSteps", js.undefined)
    
    inline def setAxisCrossingValue(value: js.Any | Date): Self = StObject.set(x, "axisCrossingValue", value.asInstanceOf[js.Any])
    
    inline def setAxisCrossingValueUndefined: Self = StObject.set(x, "axisCrossingValue", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBaseUnit(value: String): Self = StObject.set(x, "baseUnit", value.asInstanceOf[js.Any])
    
    inline def setBaseUnitStep(value: js.Any): Self = StObject.set(x, "baseUnitStep", value.asInstanceOf[js.Any])
    
    inline def setBaseUnitStepUndefined: Self = StObject.set(x, "baseUnitStep", js.undefined)
    
    inline def setBaseUnitUndefined: Self = StObject.set(x, "baseUnit", js.undefined)
    
    inline def setCategories(value: js.Any): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCrosshair(value: ChartCategoryAxisItemCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
    
    inline def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
    
    inline def setLabels(value: ChartCategoryAxisItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLine(value: ChartCategoryAxisItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMajorGridLines(value: ChartCategoryAxisItemMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
    
    inline def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
    
    inline def setMajorTicks(value: ChartCategoryAxisItemMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    inline def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    inline def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxDateGroups(value: Double): Self = StObject.set(x, "maxDateGroups", value.asInstanceOf[js.Any])
    
    inline def setMaxDateGroupsUndefined: Self = StObject.set(x, "maxDateGroups", js.undefined)
    
    inline def setMaxDivisions(value: Double): Self = StObject.set(x, "maxDivisions", value.asInstanceOf[js.Any])
    
    inline def setMaxDivisionsUndefined: Self = StObject.set(x, "maxDivisions", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinorGridLines(value: ChartCategoryAxisItemMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
    
    inline def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
    
    inline def setMinorTicks(value: ChartCategoryAxisItemMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: ChartCategoryAxisItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setPlotBands(value: js.Array[ChartCategoryAxisItemPlotBand]): Self = StObject.set(x, "plotBands", value.asInstanceOf[js.Any])
    
    inline def setPlotBandsUndefined: Self = StObject.set(x, "plotBands", js.undefined)
    
    inline def setPlotBandsVarargs(value: ChartCategoryAxisItemPlotBand*): Self = StObject.set(x, "plotBands", js.Array(value :_*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setRoundToBaseUnit(value: Boolean): Self = StObject.set(x, "roundToBaseUnit", value.asInstanceOf[js.Any])
    
    inline def setRoundToBaseUnitUndefined: Self = StObject.set(x, "roundToBaseUnit", js.undefined)
    
    inline def setSelect(value: ChartCategoryAxisItemSelect): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setTitle(value: ChartCategoryAxisItemTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWeekStartDay(value: Double): Self = StObject.set(x, "weekStartDay", value.asInstanceOf[js.Any])
    
    inline def setWeekStartDayUndefined: Self = StObject.set(x, "weekStartDay", js.undefined)
  }
}
