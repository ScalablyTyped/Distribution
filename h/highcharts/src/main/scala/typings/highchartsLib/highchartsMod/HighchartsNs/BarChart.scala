package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarChart extends SeriesChart {
  /**
    * The color of the border surrounding each column or bar.
    * @default '#FFFFFF'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The corner radius of the border surrounding each column or bar.
    * @default 0
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the border surrounding each column or bar.
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * When using automatic point colors pulled from the options.colors collection, this option determines whether the
    * chart should receive one color per series or one color per point. Defaults to false.
    * @default false
    * @since 2.0
    */
  var colorByPoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true.
    * @since 3.0
    */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  /**
    * Depth of the columns in a 3D column chart. Requires highcharts-3d.js.
    * @default 25
    * @since 4.0
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * 3D columns only. The color of the edges. Similar to borderColor, except it defaults to the same color as the
    * column.
    */
  var edgeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 3D columns only. The width of the colored edges.
    * @default 1
    */
  var edgeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Padding between each value groups, in x axis units.
    * @default 0.2
    */
  var groupPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The spacing between columns on the Z Axis in a 3D chart. Requires highcharts-3d.js.
    * @default 1
    * @since 4.0
    */
  var groupZPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be
    * laid out individually and overlap each other.
    * @default true
    * @since 2.3.0
    */
  var grouping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the
    * columns from becoming too wide when there is a small number of points in the chart.
    * @default null
    * @since 4.1.8
    */
  var maxPointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The minimal height for a column or width for a bar. By default, 0 values are not shown. To visualize a 0 (or
    * close to zero) point, set the minimal point length to a pixel value like 3. In stacked column charts,
    * minPointLength might not be respected for tightly packed values.
    * @default 0
    */
  var minPointLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Padding between each column or bar, in x axis units.
    * @default 0.1
    */
  var pointPadding: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The X axis range that each point is valid for. This determines the width of the column. On a categorized axis,
    * the range will be 1 by default (one category unit). On linear and datetime axes, the range will be computed as
    * the distance between the two closest data points.
    * @since 2.3
    */
  var pointRange: js.UndefOr[scala.Double] = js.undefined
  /**
    * A pixel value specifying a fixed width for each column or bar. When null, the width is calculated from the
    * pointPadding and groupPadding.
    * @since 1.2.5
    */
  var pointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * A wrapper object for all the series options in specific states.
    */
  @JSName("states")
  var states_BarChart: js.UndefOr[highchartsLib.Anon_HoverBarStates] = js.undefined
}

object BarChart {
  @scala.inline
  def apply(
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    borderColor: java.lang.String | Gradient = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    colorByPoint: js.UndefOr[scala.Boolean] = js.undefined,
    colors: js.Array[Color] = null,
    connectEnds: js.UndefOr[scala.Boolean] = js.undefined,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    cropThreshold: scala.Int | scala.Double = null,
    cursor: java.lang.String = null,
    dashStyle: java.lang.String = null,
    dataLabels: DataLabels | js.Array[DataLabels] = null,
    depth: scala.Int | scala.Double = null,
    edgeColor: java.lang.String = null,
    edgeWidth: scala.Int | scala.Double = null,
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
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
    maxFontSize: scala.Int | scala.Double = null,
    maxPointWidth: scala.Int | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
    minPointLength: scala.Int | scala.Double = null,
    negativeColor: java.lang.String = null,
    point: highchartsLib.Anon_Events = null,
    pointInterval: scala.Int | scala.Double = null,
    pointIntervalUnit: java.lang.String = null,
    pointPadding: java.lang.String | scala.Double = null,
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
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    turboThreshold: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): BarChart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(connectEnds)) __obj.updateDynamic("connectEnds")(connectEnds)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor)
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
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
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (maxPointWidth != null) __obj.updateDynamic("maxPointWidth")(maxPointWidth.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (minPointLength != null) __obj.updateDynamic("minPointLength")(minPointLength.asInstanceOf[js.Any])
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
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[BarChart]
  }
}

