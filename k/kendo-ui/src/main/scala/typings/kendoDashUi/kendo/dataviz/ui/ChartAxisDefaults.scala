package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisDefaults extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var crosshair: js.UndefOr[ChartAxisDefaultsCrosshair] = js.undefined
  var labels: js.UndefOr[ChartAxisDefaultsLabels] = js.undefined
  var line: js.UndefOr[ChartAxisDefaultsLine] = js.undefined
  var majorGridLines: js.UndefOr[ChartAxisDefaultsMajorGridLines] = js.undefined
  var majorTicks: js.UndefOr[ChartAxisDefaultsMajorTicks] = js.undefined
  var minorGridLines: js.UndefOr[ChartAxisDefaultsMinorGridLines] = js.undefined
  var minorTicks: js.UndefOr[ChartAxisDefaultsMinorTicks] = js.undefined
  var narrowRange: js.UndefOr[Boolean] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var plotBands: js.UndefOr[js.Array[ChartAxisDefaultsPlotBand]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[ChartAxisDefaultsTitle] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartAxisDefaults {
  @scala.inline
  def apply(
    background: String = null,
    color: String = null,
    crosshair: ChartAxisDefaultsCrosshair = null,
    labels: ChartAxisDefaultsLabels = null,
    line: ChartAxisDefaultsLine = null,
    majorGridLines: ChartAxisDefaultsMajorGridLines = null,
    majorTicks: ChartAxisDefaultsMajorTicks = null,
    minorGridLines: ChartAxisDefaultsMinorGridLines = null,
    minorTicks: ChartAxisDefaultsMinorTicks = null,
    narrowRange: js.UndefOr[Boolean] = js.undefined,
    pane: String = null,
    plotBands: js.Array[ChartAxisDefaultsPlotBand] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    title: ChartAxisDefaultsTitle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartAxisDefaults = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (color != null) __obj.updateDynamic("color")(color)
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (line != null) __obj.updateDynamic("line")(line)
    if (majorGridLines != null) __obj.updateDynamic("majorGridLines")(majorGridLines)
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks)
    if (minorGridLines != null) __obj.updateDynamic("minorGridLines")(minorGridLines)
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks)
    if (!js.isUndefined(narrowRange)) __obj.updateDynamic("narrowRange")(narrowRange)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartAxisDefaults]
  }
}

