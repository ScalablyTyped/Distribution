package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartYAxisItem extends js.Object {
  var axisCrossingValue: js.UndefOr[js.Any | Date] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var baseUnit: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var crosshair: js.UndefOr[ChartYAxisItemCrosshair] = js.undefined
  var labels: js.UndefOr[ChartYAxisItemLabels] = js.undefined
  var line: js.UndefOr[ChartYAxisItemLine] = js.undefined
  var majorGridLines: js.UndefOr[ChartYAxisItemMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[ChartYAxisItemMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minorGridLines: js.UndefOr[ChartYAxisItemMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[ChartYAxisItemMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var narrowRange: js.UndefOr[Boolean] = js.undefined
  var notes: js.UndefOr[ChartYAxisItemNotes] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var plotBands: js.UndefOr[js.Array[ChartYAxisItemPlotBand]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[ChartYAxisItemTitle] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartYAxisItem {
  @scala.inline
  def apply(
    axisCrossingValue: js.Any | Date = null,
    background: String = null,
    baseUnit: String = null,
    color: String = null,
    crosshair: ChartYAxisItemCrosshair = null,
    labels: ChartYAxisItemLabels = null,
    line: ChartYAxisItemLine = null,
    majorGridLines: ChartYAxisItemMajorGridLines = null,
    majorTicks: ChartYAxisItemMajorTicks = null,
    majorUnit: js.UndefOr[Double] = js.undefined,
    max: js.Any = null,
    min: js.Any = null,
    minorGridLines: ChartYAxisItemMinorGridLines = null,
    minorTicks: ChartYAxisItemMinorTicks = null,
    minorUnit: js.UndefOr[Double] = js.undefined,
    name: String = null,
    narrowRange: js.UndefOr[Boolean] = js.undefined,
    notes: ChartYAxisItemNotes = null,
    pane: String = null,
    plotBands: js.Array[ChartYAxisItemPlotBand] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    title: ChartYAxisItemTitle = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartYAxisItem = {
    val __obj = js.Dynamic.literal()
    if (axisCrossingValue != null) __obj.updateDynamic("axisCrossingValue")(axisCrossingValue.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (baseUnit != null) __obj.updateDynamic("baseUnit")(baseUnit.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(majorUnit)) __obj.updateDynamic("majorUnit")(majorUnit.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(minorUnit)) __obj.updateDynamic("minorUnit")(minorUnit.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(narrowRange)) __obj.updateDynamic("narrowRange")(narrowRange.get.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartYAxisItem]
  }
}

