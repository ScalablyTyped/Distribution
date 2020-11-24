package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorCategoryAxis extends js.Object {
  
  var autoBaseUnitSteps: js.UndefOr[StockChartNavigatorCategoryAxisAutoBaseUnitSteps] = js.native
  
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var baseUnit: js.UndefOr[String] = js.native
  
  var baseUnitStep: js.UndefOr[js.Any] = js.native
  
  var categories: js.UndefOr[js.Any] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var crosshair: js.UndefOr[StockChartNavigatorCategoryAxisCrosshair] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var justified: js.UndefOr[Boolean] = js.native
  
  var labels: js.UndefOr[StockChartNavigatorCategoryAxisLabels] = js.native
  
  var line: js.UndefOr[StockChartNavigatorCategoryAxisLine] = js.native
  
  var majorGridLines: js.UndefOr[StockChartNavigatorCategoryAxisMajorGridLines] = js.native
  
  var majorTicks: js.UndefOr[StockChartNavigatorCategoryAxisMajorTicks] = js.native
  
  var max: js.UndefOr[js.Any] = js.native
  
  var maxDateGroups: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[js.Any] = js.native
  
  var minorGridLines: js.UndefOr[StockChartNavigatorCategoryAxisMinorGridLines] = js.native
  
  var minorTicks: js.UndefOr[StockChartNavigatorCategoryAxisMinorTicks] = js.native
  
  var notes: js.UndefOr[StockChartNavigatorCategoryAxisNotes] = js.native
  
  var plotBands: js.UndefOr[js.Array[StockChartNavigatorCategoryAxisPlotBand]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var roundToBaseUnit: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[StockChartNavigatorCategoryAxisTitle] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var weekStartDay: js.UndefOr[Double] = js.native
}
object StockChartNavigatorCategoryAxis {
  
  @scala.inline
  def apply(): StockChartNavigatorCategoryAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorCategoryAxis]
  }
  
  @scala.inline
  implicit class StockChartNavigatorCategoryAxisOps[Self <: StockChartNavigatorCategoryAxis] (val x: Self) extends AnyVal {
    
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
    def setAutoBaseUnitSteps(value: StockChartNavigatorCategoryAxisAutoBaseUnitSteps): Self = this.set("autoBaseUnitSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBaseUnitSteps: Self = this.set("autoBaseUnitSteps", js.undefined)
    
    @scala.inline
    def setAxisCrossingValue(value: js.Any | Date): Self = this.set("axisCrossingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisCrossingValue: Self = this.set("axisCrossingValue", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBaseUnit(value: String): Self = this.set("baseUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUnit: Self = this.set("baseUnit", js.undefined)
    
    @scala.inline
    def setBaseUnitStep(value: js.Any): Self = this.set("baseUnitStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUnitStep: Self = this.set("baseUnitStep", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Any): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCrosshair(value: StockChartNavigatorCategoryAxisCrosshair): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setJustified(value: Boolean): Self = this.set("justified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustified: Self = this.set("justified", js.undefined)
    
    @scala.inline
    def setLabels(value: StockChartNavigatorCategoryAxisLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLine(value: StockChartNavigatorCategoryAxisLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMajorGridLines(value: StockChartNavigatorCategoryAxisMajorGridLines): Self = this.set("majorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorGridLines: Self = this.set("majorGridLines", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: StockChartNavigatorCategoryAxisMajorTicks): Self = this.set("majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTicks: Self = this.set("majorTicks", js.undefined)
    
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxDateGroups(value: Double): Self = this.set("maxDateGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDateGroups: Self = this.set("maxDateGroups", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinorGridLines(value: StockChartNavigatorCategoryAxisMinorGridLines): Self = this.set("minorGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorGridLines: Self = this.set("minorGridLines", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: StockChartNavigatorCategoryAxisMinorTicks): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTicks: Self = this.set("minorTicks", js.undefined)
    
    @scala.inline
    def setNotes(value: StockChartNavigatorCategoryAxisNotes): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPlotBandsVarargs(value: StockChartNavigatorCategoryAxisPlotBand*): Self = this.set("plotBands", js.Array(value :_*))
    
    @scala.inline
    def setPlotBands(value: js.Array[StockChartNavigatorCategoryAxisPlotBand]): Self = this.set("plotBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlotBands: Self = this.set("plotBands", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setRoundToBaseUnit(value: Boolean): Self = this.set("roundToBaseUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundToBaseUnit: Self = this.set("roundToBaseUnit", js.undefined)
    
    @scala.inline
    def setTitle(value: StockChartNavigatorCategoryAxisTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWeekStartDay(value: Double): Self = this.set("weekStartDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStartDay: Self = this.set("weekStartDay", js.undefined)
  }
}
