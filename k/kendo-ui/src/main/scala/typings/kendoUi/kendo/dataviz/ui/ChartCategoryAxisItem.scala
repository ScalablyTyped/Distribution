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
  
  @scala.inline
  def apply(): ChartCategoryAxisItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItem]
  }
  
  @scala.inline
  implicit class ChartCategoryAxisItemMutableBuilder[Self <: ChartCategoryAxisItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBaseUnitSteps(value: ChartCategoryAxisItemAutoBaseUnitSteps): Self = StObject.set(x, "autoBaseUnitSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBaseUnitStepsUndefined: Self = StObject.set(x, "autoBaseUnitSteps", js.undefined)
    
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
    def setBaseUnitStep(value: js.Any): Self = StObject.set(x, "baseUnitStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUnitStepUndefined: Self = StObject.set(x, "baseUnitStep", js.undefined)
    
    @scala.inline
    def setBaseUnitUndefined: Self = StObject.set(x, "baseUnit", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Any): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCrosshair(value: ChartCategoryAxisItemCrosshair): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartCategoryAxisItemLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLine(value: ChartCategoryAxisItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMajorGridLines(value: ChartCategoryAxisItemMajorGridLines): Self = StObject.set(x, "majorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorGridLinesUndefined: Self = StObject.set(x, "majorGridLines", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: ChartCategoryAxisItemMajorTicks): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
    
    @scala.inline
    def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateGroups(value: Double): Self = StObject.set(x, "maxDateGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateGroupsUndefined: Self = StObject.set(x, "maxDateGroups", js.undefined)
    
    @scala.inline
    def setMaxDivisions(value: Double): Self = StObject.set(x, "maxDivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDivisionsUndefined: Self = StObject.set(x, "maxDivisions", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinorGridLines(value: ChartCategoryAxisItemMinorGridLines): Self = StObject.set(x, "minorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridLinesUndefined: Self = StObject.set(x, "minorGridLines", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: ChartCategoryAxisItemMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: ChartCategoryAxisItemNotes): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPlotBands(value: js.Array[ChartCategoryAxisItemPlotBand]): Self = StObject.set(x, "plotBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBandsUndefined: Self = StObject.set(x, "plotBands", js.undefined)
    
    @scala.inline
    def setPlotBandsVarargs(value: ChartCategoryAxisItemPlotBand*): Self = StObject.set(x, "plotBands", js.Array(value :_*))
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setRoundToBaseUnit(value: Boolean): Self = StObject.set(x, "roundToBaseUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundToBaseUnitUndefined: Self = StObject.set(x, "roundToBaseUnit", js.undefined)
    
    @scala.inline
    def setSelect(value: ChartCategoryAxisItemSelect): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartCategoryAxisItemTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setWeekStartDay(value: Double): Self = StObject.set(x, "weekStartDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekStartDayUndefined: Self = StObject.set(x, "weekStartDay", js.undefined)
  }
}
