package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartValueAxisItem extends js.Object {
  var axisCrossingValue: js.UndefOr[js.Any | stdLib.Date] = js.undefined
  var background: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var crosshair: js.UndefOr[ChartValueAxisItemCrosshair] = js.undefined
  var labels: js.UndefOr[ChartValueAxisItemLabels] = js.undefined
  var line: js.UndefOr[ChartValueAxisItemLine] = js.undefined
  var majorGridLines: js.UndefOr[ChartValueAxisItemMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[ChartValueAxisItemMajorTicks] = js.undefined
  var majorUnit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minorGridLines: js.UndefOr[ChartValueAxisItemMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[ChartValueAxisItemMinorTicks] = js.undefined
  var minorUnit: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var narrowRange: js.UndefOr[scala.Boolean] = js.undefined
  var notes: js.UndefOr[ChartValueAxisItemNotes] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var plotBands: js.UndefOr[js.Array[ChartValueAxisItemPlotBand]] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[ChartValueAxisItemTitle] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartValueAxisItem {
  @scala.inline
  def apply(
    axisCrossingValue: js.Any | stdLib.Date = null,
    background: java.lang.String = null,
    color: java.lang.String = null,
    crosshair: ChartValueAxisItemCrosshair = null,
    labels: ChartValueAxisItemLabels = null,
    line: ChartValueAxisItemLine = null,
    majorGridLines: ChartValueAxisItemMajorGridLines = null,
    majorTicks: ChartValueAxisItemMajorTicks = null,
    majorUnit: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minorGridLines: ChartValueAxisItemMinorGridLines = null,
    minorTicks: ChartValueAxisItemMinorTicks = null,
    minorUnit: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    narrowRange: js.UndefOr[scala.Boolean] = js.undefined,
    notes: ChartValueAxisItemNotes = null,
    pane: java.lang.String = null,
    plotBands: js.Array[ChartValueAxisItemPlotBand] = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    title: ChartValueAxisItemTitle = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartValueAxisItem = {
    val __obj = js.Dynamic.literal()
    if (axisCrossingValue != null) __obj.updateDynamic("axisCrossingValue")(axisCrossingValue.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background)
    if (color != null) __obj.updateDynamic("color")(color)
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (line != null) __obj.updateDynamic("line")(line)
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines)
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks)
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines)
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks)
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(narrowRange)) __obj.updateDynamic("narrowRange")(narrowRange)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartValueAxisItem]
  }
}

