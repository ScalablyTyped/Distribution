package typings.kendoDashUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItem extends js.Object {
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
  def apply(
    autoBaseUnitSteps: ChartCategoryAxisItemAutoBaseUnitSteps = null,
    axisCrossingValue: js.Any | Date = null,
    background: String = null,
    baseUnit: String = null,
    baseUnitStep: js.Any = null,
    categories: js.Any = null,
    color: String = null,
    crosshair: ChartCategoryAxisItemCrosshair = null,
    field: String = null,
    justified: js.UndefOr[Boolean] = js.undefined,
    labels: ChartCategoryAxisItemLabels = null,
    line: ChartCategoryAxisItemLine = null,
    majorGridLines: ChartCategoryAxisItemMajorGridLines = null,
    majorTicks: ChartCategoryAxisItemMajorTicks = null,
    max: js.Any = null,
    maxDateGroups: Int | Double = null,
    maxDivisions: Int | Double = null,
    min: js.Any = null,
    minorGridLines: ChartCategoryAxisItemMinorGridLines = null,
    minorTicks: ChartCategoryAxisItemMinorTicks = null,
    name: String = null,
    notes: ChartCategoryAxisItemNotes = null,
    pane: String = null,
    plotBands: js.Array[ChartCategoryAxisItemPlotBand] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    roundToBaseUnit: js.UndefOr[Boolean] = js.undefined,
    select: ChartCategoryAxisItemSelect = null,
    startAngle: Int | Double = null,
    title: ChartCategoryAxisItemTitle = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    weekStartDay: Int | Double = null
  ): ChartCategoryAxisItem = {
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
    if (maxDivisions != null) __obj.updateDynamic("maxDivisions")(maxDivisions.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(roundToBaseUnit)) __obj.updateDynamic("roundToBaseUnit")(roundToBaseUnit.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (weekStartDay != null) __obj.updateDynamic("weekStartDay")(weekStartDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCategoryAxisItem]
  }
}

