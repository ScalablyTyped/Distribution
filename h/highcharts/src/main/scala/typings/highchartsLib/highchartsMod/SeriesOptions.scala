package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- highchartsLib.highchartsMod.SeriesChart because var conflicts: color, cursor, linkedTo, visible. Inlined allowPointSelect, animation, className, connectEnds, connectNulls, cropThreshold, dashStyle, dataLabels, enableMouseTracking, events, findNearestPointBy, getExtremesFromAll, keys, lineWidth, linecap, marker, negativeColor, point, pointInterval, pointIntervalUnit, pointPlacement, pointStart, selected, shadow, showCheckbox, showInLegend, softThreshold, stacking, states, stickyTracking, threshold, tooltip, turboThreshold, zoneAxis, zones */ trait SeriesOptions extends IndividualSeriesOptions {
  /**
    * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
    * @default false
    * @since 1.2.0
    */
  var allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable or disable the initial animation when a series is displayed. The animation can also be set as a
    * configuration object. Please note that this option only applies to the initial animation of the series itself.
    * For other animations, see chart.animation and the animation parameter under the API methods.
    * @default true
    */
  var animation: js.UndefOr[scala.Boolean | Animation] = js.undefined
  /**
    * A class name to apply to the series' graphical elements.
    * @since 5.0.0
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Polar charts only. Whether to connect the ends of a line series plot across the extremes.
    * @default true
    * @since 2.3.0
    */
  var connectEnds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to connect a graph line across null points.
    * @default false
    */
  var connectNulls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When the series contains less points than the crop threshold, all points are drawn, event if the points fall
    * outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and
    * columns), is that animation is performed on updates. On the other hand, when the series contains more points than
    * the crop threshold, the series data is cropped to only contain points that fall within the plot area. The
    * advantage of cropping away invisible points is to increase performance on large series.
    * @default 300
    * @since 2.2
    */
  var cropThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * A name for the dash style to use for the graph. Applies only to series type having a graph, like line, spline,
    * area and scatter in case it has a lineWidth. The value for the dashStyle include:
    * - Solid
    * - ShortDash
    * - ShortDot
    * - ShortDashDot
    * - ShortDashDotDot
    * - Dot
    * - Dash
    * - LongDash
    * - DashDot
    * - LongDashDot
    * - LongDashDotDot
    * @default 'Solid'
    */
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gantt charts use one or more data labels for each series, for showing multiple date periods.
    */
  var dataLabels: js.UndefOr[DataLabels | js.Array[DataLabels]] = js.undefined
  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on
    * graphs and points. For large datasets it improves performance.
    * @default true
    */
  var enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined
  var events: js.UndefOr[PlotEvents] = js.undefined
  /**
    * Determines whether the series should look for the nearest point in both dimensions or just the x-dimension when
    * hovering the series. Defaults to 'xy' for scatter series and 'x' for most other series. If the data has duplicate
    * x-values, it is recommended to set this to 'xy' to allow hovering over all points.
    *
    * Applies only to series types using nearest neighbor search (not direct hover) for tooltip.
    * @since 5.0.10
    */
  var findNearestPointBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X
    * axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @default false
    * @since 4.1.6
    */
  var getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array specifying which option maps to which key in the data point array. This makes it convenient to work with
    * unstructured data arrays from different sources.
    * @since 4.1.6
    */
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Pixel with of the graph line.
    * @default 2
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The line cap used for line ends and line joins on the graph.
    * @default 'round'
    */
  var linecap: js.UndefOr[java.lang.String] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
  /**
    * The color for the parts of the graph or points that are below the threshold.
    * @default null.
    * @since 3.0
    */
  var negativeColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var point: js.UndefOr[highchartsLib.Anon_Events] = js.undefined
  /**
    * If no x values are given for the points in a series, pointInterval defines the interval of the x values. For
    * example, if a series contains one value every decade starting from year 0, set pointInterval to 10.
    *
    * Since Highcharts 4.1, it can be combined with pointIntervalUnit to draw irregular intervals.
    * @default 1
    */
  var pointInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * On datetime series, this allows for setting the pointInterval to the two irregular time units, month and year.
    * Combine it with pointInterval to draw quarters, 6 months, 10 years etc.
    * @since 4.1.0
    */
  var pointIntervalUnit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Possible values: null, 'on', 'between'.
    *
    * In a column chart, when pointPlacement is 'on', the point will not create any padding of the X axis. In a polar
    * column chart this means that the first column points directly north. If the pointPlacement is 'between', the
    * columns will be laid out between ticks. This is useful for example for visualising an amount between two points
    * in time or in a certain sector of a polar chart.
    *
    * Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between
    * this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric
    * point placement options won't affect axis padding.
    *
    * Note that pointPlacement needs a pointRange to work. For column series this is computed, but for line-type series
    * it needs to be set.
    *
    * Defaults to null in cartesian charts, 'between' in polar charts.
    * @since 2.3.0
    */
  var pointPlacement: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.undefined
  /**
    * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a
    * series contains one yearly value starting from 1945, set pointStart to 1945.
    * @default 0
    */
  var pointStart: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to select the series initially. If showCheckbox is true, the checkbox next to the series name will be
    * checked for a selected series.
    * @default false
    * @since 1.2.0
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing
    * color, offsetX, offsetY, opacity and width.
    * @default false
    */
  var shadow: js.UndefOr[scala.Boolean | Shadow] = js.undefined
  /**
    * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox
    * is determined by the selected option.
    * @default false
    * @since 1.2.0
    */
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to display this particular series or series type in the legend. The default value is true for standalone
    * series, false for linked series. Defaults to true.
    */
  var showInLegend: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When this is true, the series will not cause the Y axis to cross the zero plane (or threshold option) unless the
    * data actually crosses the plane.
    *
    * For example, if softThreshold is false, a series of 0, 1, 2, 3 will make the Y axis show negative values
    * according to the minPadding option. If softThreshold is true, the Y axis starts at 0.
    * @default true
    * @since 4.1.9
    */
  var softThreshold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to stack the values of each series on top of each other. Possible values are null to disable, 'normal' to
    * stack by value or 'percent'.
    */
  var stacking: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A wrapper object for all the series options in specific states.
    */
  var states: js.UndefOr[highchartsLib.Anon_HoverLineStates] = js.undefined
  /**
    * Sticky tracking of mouse events. When true, the mouseOut event on a series isn't triggered until the mouse moves
    * over another series, or out of the plot area. When false, the mouseOut event on a series is triggered when the
    * mouse leaves the area around the series' graph or markers. This also implies the tooltip. When stickyTracking is
    * false and tooltip.shared is false, the tooltip will be hidden when moving the mouse between series. Defaults to
    * true for line and area type series, but to false for columns, pies etc.
    * @default true
    * @since 2.0
    */
  var stickyTracking: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Y axis value to serve as the base for the area, for distinguishing between values above and below a
    * threshold. If null, the area behaves like a line series with fill between the graph and the Y axis minimum.
    * @default 0
    * @since 2.0
    */
  var threshold: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * A configuration object for the tooltip rendering of each single series. Properties are inherited from tooltip,
    * but only the following properties can be defined on a series level.
    * @since 2.3
    */
  var tooltip: js.UndefOr[SeriesTooltipOptions] = js.undefined
  /**
    * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two
    * dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are
    * assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to 0
    * disable.
    * @default 1000
    * @since 2.2
    */
  var turboThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the Axis on which the zones are applied.
    * @default 'y'
    * @since 4.1.0
    */
  var zoneAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles,
    * according to the zoneAxis option.
    */
  var zones: js.UndefOr[js.Array[AreaZone]] = js.undefined
}

object SeriesOptions {
  @scala.inline
  def apply(
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    colorIndex: scala.Int | scala.Double = null,
    connectEnds: js.UndefOr[scala.Boolean] = js.undefined,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    crisp: js.UndefOr[scala.Boolean] = js.undefined,
    cropThreshold: scala.Int | scala.Double = null,
    cursor: java.lang.String = null,
    dashStyle: java.lang.String = null,
    data: js.Array[
      scala.Double | scala.Null | (js.Tuple2[scala.Double | java.lang.String, scala.Double | scala.Null]) | (js.Tuple3[scala.Double | java.lang.String, scala.Double, scala.Double]) | DataPoint
    ] = null,
    dataLabels: DataLabels | js.Array[DataLabels] = null,
    description: java.lang.String = null,
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    innerSize: scala.Double | java.lang.String = null,
    keys: js.Array[java.lang.String] = null,
    legendIndex: scala.Int | scala.Double = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    maxFontSize: scala.Int | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    negativeColor: java.lang.String = null,
    point: highchartsLib.Anon_Events = null,
    pointInterval: scala.Int | scala.Double = null,
    pointIntervalUnit: java.lang.String = null,
    pointPlacement: java.lang.String | scala.Double = null,
    pointStart: scala.Int | scala.Double = null,
    pointWidth: scala.Int | scala.Double = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: scala.Boolean | Shadow = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Double | java.lang.String = null,
    softThreshold: js.UndefOr[scala.Boolean] = js.undefined,
    stack: js.Any = null,
    stacking: java.lang.String = null,
    states: highchartsLib.Anon_HoverLineStates = null,
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    turboThreshold: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    xAxis: java.lang.String | scala.Double = null,
    yAxis: java.lang.String | scala.Double = null,
    zIndex: scala.Int | scala.Double = null,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): SeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(connectEnds)) __obj.updateDynamic("connectEnds")(connectEnds)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (!js.isUndefined(crisp)) __obj.updateDynamic("crisp")(crisp)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (innerSize != null) __obj.updateDynamic("innerSize")(innerSize.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointInterval != null) __obj.updateDynamic("pointInterval")(pointInterval.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit)
    if (pointPlacement != null) __obj.updateDynamic("pointPlacement")(pointPlacement.asInstanceOf[js.Any])
    if (pointStart != null) __obj.updateDynamic("pointStart")(pointStart.asInstanceOf[js.Any])
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[SeriesOptions]
  }
}

