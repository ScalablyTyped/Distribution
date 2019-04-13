package typings
package highchartsLib.highstockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisOptions
  extends highchartsLib.highchartsMod.AxisOptions {
  var scrollbar: js.UndefOr[ScrollbarOptions] = js.undefined
}

object AxisOptions {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[scala.Boolean] = js.undefined,
    alternateGridColor: java.lang.String = null,
    breaks: js.Array[highchartsLib.highchartsMod.AxisBreak] = null,
    categories: js.Array[_] = null,
    ceiling: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    crosshair: highchartsLib.highchartsMod.CrosshairObject | scala.Boolean = null,
    dateTimeLabelFormats: highchartsLib.highchartsMod.DateTimeFormats = null,
    description: java.lang.String = null,
    endOnTick: js.UndefOr[scala.Boolean] = js.undefined,
    events: highchartsLib.Anon_AfterBreaks = null,
    floor: scala.Int | scala.Double = null,
    gridLineColor: java.lang.String = null,
    gridLineDashStyle: java.lang.String = null,
    gridLineWidth: scala.Int | scala.Double = null,
    gridZIndex: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    labels: highchartsLib.highchartsMod.AxisLabels = null,
    lineColor: java.lang.String | highchartsLib.highchartsMod.Gradient = null,
    lineWidth: scala.Int | scala.Double = null,
    linkedTo: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    maxPadding: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minPadding: scala.Int | scala.Double = null,
    minRange: scala.Int | scala.Double = null,
    minTickInterval: scala.Int | scala.Double = null,
    minorGridLineColor: java.lang.String = null,
    minorGridLineDashStyle: java.lang.String = null,
    minorGridLineWidth: scala.Int | scala.Double = null,
    minorTickColor: java.lang.String = null,
    minorTickInterval: scala.Double | java.lang.String = null,
    minorTickLength: scala.Int | scala.Double = null,
    minorTickPosition: java.lang.String = null,
    minorTickWidth: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    opposite: js.UndefOr[scala.Boolean] = js.undefined,
    plotBands: js.Array[highchartsLib.highchartsMod.PlotBands] = null,
    plotLines: js.Array[highchartsLib.highchartsMod.PlotLines] = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    reversedStacks: js.UndefOr[scala.Boolean] = js.undefined,
    scrollbar: ScrollbarOptions = null,
    showEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    showFirstLabel: js.UndefOr[scala.Boolean] = js.undefined,
    showLastLabel: js.UndefOr[scala.Boolean] = js.undefined,
    softMax: scala.Int | scala.Double = null,
    softMin: scala.Int | scala.Double = null,
    stackLabels: highchartsLib.Anon_AlignEnabled = null,
    startOfWeek: scala.Int | scala.Double = null,
    startOnTick: js.UndefOr[scala.Boolean] = js.undefined,
    stops: js.Array[js.Array[scala.Double | java.lang.String]] = null,
    tickAmount: scala.Int | scala.Double = null,
    tickColor: java.lang.String = null,
    tickInterval: scala.Int | scala.Double = null,
    tickLength: scala.Int | scala.Double = null,
    tickPixelInterval: scala.Int | scala.Double = null,
    tickPosition: java.lang.String = null,
    tickPositioner: (/* min */ scala.Double, /* max */ scala.Double) => scala.Unit = null,
    tickPositions: js.Array[scala.Double] = null,
    tickWidth: scala.Int | scala.Double = null,
    tickmarkPlacement: java.lang.String = null,
    title: highchartsLib.highchartsMod.AxisTitle = null,
    `type`: java.lang.String = null,
    units: js.Array[js.Tuple2[java.lang.String, js.Array[scala.Double]]] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): AxisOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals)
    if (alternateGridColor != null) __obj.updateDynamic("alternateGridColor")(alternateGridColor)
    if (breaks != null) __obj.updateDynamic("breaks")(breaks)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (ceiling != null) __obj.updateDynamic("ceiling")(ceiling.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick)
    if (events != null) __obj.updateDynamic("events")(events)
    if (floor != null) __obj.updateDynamic("floor")(floor.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor)
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle)
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (gridZIndex != null) __obj.updateDynamic("gridZIndex")(gridZIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxPadding != null) __obj.updateDynamic("maxPadding")(maxPadding.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minPadding != null) __obj.updateDynamic("minPadding")(minPadding.asInstanceOf[js.Any])
    if (minRange != null) __obj.updateDynamic("minRange")(minRange.asInstanceOf[js.Any])
    if (minTickInterval != null) __obj.updateDynamic("minTickInterval")(minTickInterval.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor)
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle)
    if (minorGridLineWidth != null) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor)
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (minorTickLength != null) __obj.updateDynamic("minorTickLength")(minorTickLength.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition)
    if (minorTickWidth != null) __obj.updateDynamic("minorTickWidth")(minorTickWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite)
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands)
    if (plotLines != null) __obj.updateDynamic("plotLines")(plotLines)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (!js.isUndefined(reversedStacks)) __obj.updateDynamic("reversedStacks")(reversedStacks)
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar)
    if (!js.isUndefined(showEmpty)) __obj.updateDynamic("showEmpty")(showEmpty)
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel)
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel)
    if (softMax != null) __obj.updateDynamic("softMax")(softMax.asInstanceOf[js.Any])
    if (softMin != null) __obj.updateDynamic("softMin")(softMin.asInstanceOf[js.Any])
    if (stackLabels != null) __obj.updateDynamic("stackLabels")(stackLabels)
    if (startOfWeek != null) __obj.updateDynamic("startOfWeek")(startOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (tickAmount != null) __obj.updateDynamic("tickAmount")(tickAmount.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor)
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickPixelInterval != null) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition)
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(js.Any.fromFunction2(tickPositioner))
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions)
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (tickmarkPlacement != null) __obj.updateDynamic("tickmarkPlacement")(tickmarkPlacement)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (units != null) __obj.updateDynamic("units")(units)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AxisOptions]
  }
}

