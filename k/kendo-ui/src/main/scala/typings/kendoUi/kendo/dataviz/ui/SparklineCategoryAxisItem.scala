package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineCategoryAxisItem extends js.Object {
  var autoBaseUnitSteps: js.UndefOr[js.Any] = js.undefined
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.undefined
  var baseUnit: js.UndefOr[String] = js.undefined
  var baseUnitStep: js.UndefOr[js.Any] = js.undefined
  var categories: js.UndefOr[js.Any] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var crosshair: js.UndefOr[SparklineCategoryAxisItemCrosshair] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var justified: js.UndefOr[Boolean] = js.undefined
  var labels: js.UndefOr[SparklineCategoryAxisItemLabels] = js.undefined
  var line: js.UndefOr[SparklineCategoryAxisItemLine] = js.undefined
  var majorGridLines: js.UndefOr[SparklineCategoryAxisItemMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[SparklineCategoryAxisItemMajorTicks] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var maxDateGroups: js.UndefOr[Double] = js.undefined
  var maxDivisions: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minorGridLines: js.UndefOr[SparklineCategoryAxisItemMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[SparklineCategoryAxisItemMinorTicks] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[SparklineCategoryAxisItemNotes] = js.undefined
  var plotBands: js.UndefOr[js.Array[SparklineCategoryAxisItemPlotBand]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var roundToBaseUnit: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[SparklineCategoryAxisItemTitle] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var weekStartDay: js.UndefOr[Double] = js.undefined
}

object SparklineCategoryAxisItem {
  @scala.inline
  def apply(
    autoBaseUnitSteps: js.Any = null,
    axisCrossingValue: js.Any | Date = null,
    baseUnit: String = null,
    baseUnitStep: js.Any = null,
    categories: js.Any = null,
    color: String = null,
    crosshair: SparklineCategoryAxisItemCrosshair = null,
    field: String = null,
    justified: js.UndefOr[Boolean] = js.undefined,
    labels: SparklineCategoryAxisItemLabels = null,
    line: SparklineCategoryAxisItemLine = null,
    majorGridLines: SparklineCategoryAxisItemMajorGridLines = null,
    majorTicks: SparklineCategoryAxisItemMajorTicks = null,
    max: js.Any = null,
    maxDateGroups: js.UndefOr[Double] = js.undefined,
    maxDivisions: js.UndefOr[Double] = js.undefined,
    min: js.Any = null,
    minorGridLines: SparklineCategoryAxisItemMinorGridLines = null,
    minorTicks: SparklineCategoryAxisItemMinorTicks = null,
    name: String = null,
    notes: SparklineCategoryAxisItemNotes = null,
    plotBands: js.Array[SparklineCategoryAxisItemPlotBand] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    roundToBaseUnit: js.UndefOr[Boolean] = js.undefined,
    title: SparklineCategoryAxisItemTitle = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    weekStartDay: js.UndefOr[Double] = js.undefined
  ): SparklineCategoryAxisItem = {
    val __obj = js.Dynamic.literal()
    if (autoBaseUnitSteps != null) __obj.updateDynamic("autoBaseUnitSteps")(autoBaseUnitSteps.asInstanceOf[js.Any])
    if (axisCrossingValue != null) __obj.updateDynamic("axisCrossingValue")(axisCrossingValue.asInstanceOf[js.Any])
    if (baseUnit != null) __obj.updateDynamic("baseUnit")(baseUnit.asInstanceOf[js.Any])
    if (baseUnitStep != null) __obj.updateDynamic("baseUnitStep")(baseUnitStep.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDateGroups)) __obj.updateDynamic("maxDateGroups")(maxDateGroups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDivisions)) __obj.updateDynamic("maxDivisions")(maxDivisions.get.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(roundToBaseUnit)) __obj.updateDynamic("roundToBaseUnit")(roundToBaseUnit.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekStartDay)) __obj.updateDynamic("weekStartDay")(weekStartDay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineCategoryAxisItem]
  }
}

