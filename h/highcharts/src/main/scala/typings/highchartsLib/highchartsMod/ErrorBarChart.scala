package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or
  * uncertainty in a reported measurement.
  */
trait ErrorBarChart extends SeriesChart {
  /**
    * When using automatic point colors pulled from the options.colors collection, this option determines whether the
    * chart should receive one color per series or one color per point.
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
    * The spacing between columns on the Z Axis in a 3D chart. Requires highcharts-3d.js.
    * @default 1
    * @since 4.0
    */
  var groupZPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the
    * columns from becoming too wide when there is a small number of points in the chart.
    * @default null
    * @since 4.1.8
    */
  var maxPointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Padding between each column or bar, in x axis units.
    * @default 0.1
    */
  var pointPadding: js.UndefOr[scala.Double] = js.undefined
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
  var states_ErrorBarChart: js.UndefOr[highchartsLib.Anon_HoverBarStates] = js.undefined
  /**
    * The color of the stem, the vertical line extending from the box to the whiskers. If null, the series color is
    * used.
    * @default null
    * @since 3.0
    */
  var stemColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The dash style of the stem, the vertical line extending from the box to the whiskers.
    * @default 'Solid'
    * @since 3.0
    */
  var stemDashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the stem, the vertical line extending from the box to the whiskers. If null, the width is inherited
    * from the lineWidth option.
    * @default null
    * @since 3.0
    */
  var stemWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The color of the whiskers, the horizontal lines marking low and high values. When null, the general series color
    * is used.
    * @default null
    * @since 3.0
    */
  var whiskerColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value,
    * or a percentage value of the box width. Set 0 to disable whiskers.
    * @default '50%'
    * @since 3.0
    */
  var whiskerLength: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The line width of the whiskers, the horizontal lines marking low and high values. When null, the general
    * lineWidth applies.
    * @default 2
    * @since 3.0
    */
  var whiskerWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object ErrorBarChart {
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
    dataLabels: DataLabels | js.Array[DataLabels] = null,
    depth: scala.Int | scala.Double = null,
    edgeColor: java.lang.String = null,
    edgeWidth: scala.Int | scala.Double = null,
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    groupZPadding: scala.Int | scala.Double = null,
    keys: js.Array[java.lang.String] = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    maxPointWidth: scala.Int | scala.Double = null,
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
  ): ErrorBarChart = {
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
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor)
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (groupZPadding != null) __obj.updateDynamic("groupZPadding")(groupZPadding.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxPointWidth != null) __obj.updateDynamic("maxPointWidth")(maxPointWidth.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ErrorBarChart]
  }
}

