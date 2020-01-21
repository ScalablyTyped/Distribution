package typings.kendoUi.kendo.dataviz.ui

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
    if (autoBaseUnitSteps != null) __obj.updateDynamic("autoBaseUnitSteps")(autoBaseUnitSteps.asInstanceOf[js.Any])
    if (axisCrossingValue != null) __obj.updateDynamic("axisCrossingValue")(axisCrossingValue.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (baseUnit != null) __obj.updateDynamic("baseUnit")(baseUnit.asInstanceOf[js.Any])
    if (baseUnitStep != null) __obj.updateDynamic("baseUnitStep")(baseUnitStep.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxDateGroups != null) __obj.updateDynamic("maxDateGroups")(maxDateGroups.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(roundToBaseUnit)) __obj.updateDynamic("roundToBaseUnit")(roundToBaseUnit.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (weekStartDay != null) __obj.updateDynamic("weekStartDay")(weekStartDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorCategoryAxis]
  }
}

