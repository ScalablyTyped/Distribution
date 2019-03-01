package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest
  * observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample
  * maximum).
  */
trait BoxPlotChart extends ErrorBarChart {
  /**
    * The fill color of the box.
    * @default '#FFFFFF'
    * @since 3.0
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Padding between each value groups, in x axis units.
    * @default 0.2
    */
  var groupPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be
    * laid out individually and overlap each other.
    * @default true
    * @since 2.3.0
    */
  var grouping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color of the median line. If null, the general series color applies.
    * @default null
    * @since 3.0
    */
  var medianColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The pixel width of the median line. If null, the lineWidth is used.
    * @default 2
    * @since 3.0
    */
  var medianWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object BoxPlotChart {
  @scala.inline
  def apply(
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    colorByPoint: js.UndefOr[scala.Boolean] = js.undefined,
    colors: js.Array[Color] = null,
    connectEnds: js.UndefOr[scala.Boolean] = js.undefined,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    cropThreshold: scala.Int | scala.Double = null,
    cursor: java.lang.String = null,
    dashStyle: java.lang.String = null,
    dataLabels: DataLabels = null,
    depth: scala.Int | scala.Double = null,
    edgeColor: java.lang.String = null,
    edgeWidth: scala.Int | scala.Double = null,
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
    fillColor: java.lang.String = null,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    groupPadding: scala.Int | scala.Double = null,
    groupZPadding: scala.Int | scala.Double = null,
    grouping: js.UndefOr[scala.Boolean] = js.undefined,
    keys: js.Array[java.lang.String] = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    maxPointWidth: scala.Int | scala.Double = null,
    medianColor: java.lang.String = null,
    medianWidth: scala.Int | scala.Double = null,
    negativeColor: java.lang.String = null,
    point: highchartsLib.Anon_Events = null,
    pointInterval: scala.Int | scala.Double = null,
    pointIntervalUnit: java.lang.String = null,
    pointPadding: scala.Int | scala.Double = null,
    pointPlacement: java.lang.String | scala.Double = null,
    pointRange: scala.Int | scala.Double = null,
    pointStart: scala.Int | scala.Double = null,
    pointWidth: scala.Int | scala.Double = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: scala.Boolean | Shadow = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    softThreshold: js.UndefOr[scala.Boolean] = js.undefined,
    stacking: java.lang.String = null,
    states: highchartsLib.Anon_HoverBarStates = null,
    stemColor: java.lang.String = null,
    stemDashStyle: java.lang.String = null,
    stemWidth: scala.Int | scala.Double = null,
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    turboThreshold: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    whiskerColor: java.lang.String = null,
    whiskerLength: scala.Double | java.lang.String = null,
    whiskerWidth: scala.Int | scala.Double = null,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): BoxPlotChart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(connectEnds)) __obj.updateDynamic("connectEnds")(connectEnds)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor)
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (groupPadding != null) __obj.updateDynamic("groupPadding")(groupPadding.asInstanceOf[js.Any])
    if (groupZPadding != null) __obj.updateDynamic("groupZPadding")(groupZPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxPointWidth != null) __obj.updateDynamic("maxPointWidth")(maxPointWidth.asInstanceOf[js.Any])
    if (medianColor != null) __obj.updateDynamic("medianColor")(medianColor)
    if (medianWidth != null) __obj.updateDynamic("medianWidth")(medianWidth.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointInterval != null) __obj.updateDynamic("pointInterval")(pointInterval.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit)
    if (pointPadding != null) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (pointPlacement != null) __obj.updateDynamic("pointPlacement")(pointPlacement.asInstanceOf[js.Any])
    if (pointRange != null) __obj.updateDynamic("pointRange")(pointRange.asInstanceOf[js.Any])
    if (pointStart != null) __obj.updateDynamic("pointStart")(pointStart.asInstanceOf[js.Any])
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (states != null) __obj.updateDynamic("states")(states)
    if (stemColor != null) __obj.updateDynamic("stemColor")(stemColor)
    if (stemDashStyle != null) __obj.updateDynamic("stemDashStyle")(stemDashStyle)
    if (stemWidth != null) __obj.updateDynamic("stemWidth")(stemWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (whiskerColor != null) __obj.updateDynamic("whiskerColor")(whiskerColor)
    if (whiskerLength != null) __obj.updateDynamic("whiskerLength")(whiskerLength.asInstanceOf[js.Any])
    if (whiskerWidth != null) __obj.updateDynamic("whiskerWidth")(whiskerWidth.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[BoxPlotChart]
  }
}

