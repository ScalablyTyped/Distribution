package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartCategoryAxisItem extends js.Object {
  var autoBaseUnitSteps: js.UndefOr[StockChartCategoryAxisItemAutoBaseUnitSteps] = js.undefined
  var axisCrossingValue: js.UndefOr[js.Any | stdLib.Date] = js.undefined
  var background: js.UndefOr[java.lang.String] = js.undefined
  var baseUnit: js.UndefOr[java.lang.String] = js.undefined
  var baseUnitStep: js.UndefOr[js.Any] = js.undefined
  var categories: js.UndefOr[js.Any] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var crosshair: js.UndefOr[StockChartCategoryAxisItemCrosshair] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var justified: js.UndefOr[scala.Boolean] = js.undefined
  var labels: js.UndefOr[StockChartCategoryAxisItemLabels] = js.undefined
  var line: js.UndefOr[StockChartCategoryAxisItemLine] = js.undefined
  var majorGridLines: js.UndefOr[StockChartCategoryAxisItemMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[StockChartCategoryAxisItemMajorTicks] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var maxDateGroups: js.UndefOr[scala.Double] = js.undefined
  var maxDivisions: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minorGridLines: js.UndefOr[StockChartCategoryAxisItemMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[StockChartCategoryAxisItemMinorTicks] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[StockChartCategoryAxisItemNotes] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var plotBands: js.UndefOr[js.Array[StockChartCategoryAxisItemPlotBand]] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var roundToBaseUnit: js.UndefOr[scala.Boolean] = js.undefined
  var select: js.UndefOr[StockChartCategoryAxisItemSelect] = js.undefined
  var title: js.UndefOr[StockChartCategoryAxisItemTitle] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var weekStartDay: js.UndefOr[scala.Double] = js.undefined
}

object StockChartCategoryAxisItem {
  @scala.inline
  def apply(
    autoBaseUnitSteps: StockChartCategoryAxisItemAutoBaseUnitSteps = null,
    axisCrossingValue: js.Any | stdLib.Date = null,
    background: java.lang.String = null,
    baseUnit: java.lang.String = null,
    baseUnitStep: js.Any = null,
    categories: js.Any = null,
    color: java.lang.String = null,
    crosshair: StockChartCategoryAxisItemCrosshair = null,
    field: java.lang.String = null,
    justified: js.UndefOr[scala.Boolean] = js.undefined,
    labels: StockChartCategoryAxisItemLabels = null,
    line: StockChartCategoryAxisItemLine = null,
    majorGridLines: StockChartCategoryAxisItemMajorGridLines = null,
    majorTicks: StockChartCategoryAxisItemMajorTicks = null,
    max: js.Any = null,
    maxDateGroups: scala.Int | scala.Double = null,
    maxDivisions: scala.Int | scala.Double = null,
    min: js.Any = null,
    minorGridLines: StockChartCategoryAxisItemMinorGridLines = null,
    minorTicks: StockChartCategoryAxisItemMinorTicks = null,
    name: java.lang.String = null,
    notes: StockChartCategoryAxisItemNotes = null,
    pane: java.lang.String = null,
    plotBands: js.Array[StockChartCategoryAxisItemPlotBand] = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    roundToBaseUnit: js.UndefOr[scala.Boolean] = js.undefined,
    select: StockChartCategoryAxisItemSelect = null,
    title: StockChartCategoryAxisItemTitle = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    weekStartDay: scala.Int | scala.Double = null
  ): StockChartCategoryAxisItem = {
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
    if (maxDivisions != null) __obj.updateDynamic("maxDivisions")(maxDivisions.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min)
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines)
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(roundToBaseUnit)) __obj.updateDynamic("roundToBaseUnit")(roundToBaseUnit)
    if (select != null) __obj.updateDynamic("select")(select)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (weekStartDay != null) __obj.updateDynamic("weekStartDay")(weekStartDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartCategoryAxisItem]
  }
}

