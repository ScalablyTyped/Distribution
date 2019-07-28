package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxis extends js.Object {
  var autoBaseUnitSteps: js.UndefOr[StockChartNavigatorCategoryAxisAutoBaseUnitSteps] = js.undefined
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var baseUnit: js.UndefOr[String] = js.undefined
  var baseUnitStep: js.UndefOr[js.Any] = js.undefined
  var categories: js.UndefOr[js.Any] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var crosshair: js.UndefOr[StockChartNavigatorCategoryAxisCrosshair] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var justified: js.UndefOr[Boolean] = js.undefined
  var labels: js.UndefOr[StockChartNavigatorCategoryAxisLabels] = js.undefined
  var line: js.UndefOr[StockChartNavigatorCategoryAxisLine] = js.undefined
  var majorGridLines: js.UndefOr[StockChartNavigatorCategoryAxisMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[StockChartNavigatorCategoryAxisMajorTicks] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var maxDateGroups: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minorGridLines: js.UndefOr[StockChartNavigatorCategoryAxisMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[StockChartNavigatorCategoryAxisMinorTicks] = js.undefined
  var notes: js.UndefOr[StockChartNavigatorCategoryAxisNotes] = js.undefined
  var plotBands: js.UndefOr[js.Array[StockChartNavigatorCategoryAxisPlotBand]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var roundToBaseUnit: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[StockChartNavigatorCategoryAxisTitle] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var weekStartDay: js.UndefOr[Double] = js.undefined
}

object StockChartNavigatorCategoryAxis {
  @scala.inline
  def apply(
    autoBaseUnitSteps: StockChartNavigatorCategoryAxisAutoBaseUnitSteps = null,
    axisCrossingValue: js.Any | Date = null,
    background: String = null,
    baseUnit: String = null,
    baseUnitStep: js.Any = null,
    categories: js.Any = null,
    color: String = null,
    crosshair: StockChartNavigatorCategoryAxisCrosshair = null,
    field: String = null,
    justified: js.UndefOr[Boolean] = js.undefined,
    labels: StockChartNavigatorCategoryAxisLabels = null,
    line: StockChartNavigatorCategoryAxisLine = null,
    majorGridLines: StockChartNavigatorCategoryAxisMajorGridLines = null,
    majorTicks: StockChartNavigatorCategoryAxisMajorTicks = null,
    max: js.Any = null,
    maxDateGroups: Int | Double = null,
    min: js.Any = null,
    minorGridLines: StockChartNavigatorCategoryAxisMinorGridLines = null,
    minorTicks: StockChartNavigatorCategoryAxisMinorTicks = null,
    notes: StockChartNavigatorCategoryAxisNotes = null,
    plotBands: js.Array[StockChartNavigatorCategoryAxisPlotBand] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    roundToBaseUnit: js.UndefOr[Boolean] = js.undefined,
    title: StockChartNavigatorCategoryAxisTitle = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    weekStartDay: Int | Double = null
  ): StockChartNavigatorCategoryAxis = {
    val __obj = js.Dynamic.literal()
    if (autoBaseUnitSteps != null) __obj.updateDynamic("autoBaseUnitSteps")(autoBaseUnitSteps)
    if (axisCrossingValue != null) __obj.updateDynamic("axisCrossingValue")(axisCrossingValue.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background)
    if (baseUnit != null) __obj.updateDynamic("baseUnit")(baseUnit)
    if (baseUnitStep != null) __obj.updateDynamic("baseUnitStep")(baseUnitStep)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (color != null) __obj.updateDynamic("color")(color)
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (line != null) __obj.updateDynamic("line")(line)
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines)
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks)
    if (max != null) __obj.updateDynamic("max")(max)
    if (maxDateGroups != null) __obj.updateDynamic("maxDateGroups")(maxDateGroups.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min)
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines)
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(roundToBaseUnit)) __obj.updateDynamic("roundToBaseUnit")(roundToBaseUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (weekStartDay != null) __obj.updateDynamic("weekStartDay")(weekStartDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorCategoryAxis]
  }
}

