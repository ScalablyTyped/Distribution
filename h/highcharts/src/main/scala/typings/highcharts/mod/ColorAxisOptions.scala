package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAxisOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) Accessibility options for an axis.
    * Requires the accessibility module.
    */
  var accessibility: js.UndefOr[AxisAccessibilityOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Whether to allow decimals on the color
    * axis.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) In a polar chart, this is the angle of the Y axis in
    * degrees, where 0 is up and 90 is right. The angle determines the position
    * of the axis line and the labels, though the coordinate system is
    * unaffected. Since v8.0.0 this option is also applicable for X axis
    * (inverted polar).
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The highest allowed value for
    * automatically computed axis extremes.
    */
  var ceiling: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) A class name that opens for styling the
    * axis by CSS, especially in Highcharts styled mode. The class name is
    * applied to group elements for the grid, axis elements and labels.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) Show an indicator on the axis for the current date and time. Can
    * be a boolean or a configuration object similar to xAxis.plotLines.
    */
  var currentDateIndicator: js.UndefOr[Boolean | AxisCurrentDateIndicatorOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Determines how to set each data class'
    * color if no individual color is set. The default value, `tween`, computes
    * intermediate colors between `minColor` and `maxColor`. The other possible
    * value, `category`, pulls colors from the global or chart specific colors
    * array.
    */
  var dataClassColor: js.UndefOr[OptionsDataClassColorValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for
    * the choropleth map. If none given, the color axis is scalar and values
    * are distributed as a gradient between the minimum and maximum colors.
    */
  var dataClasses: js.UndefOr[js.Array[ColorAxisDataClassesOptions]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
    * tick. Use this option with the maxPadding option to control the axis end.
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
    */
  var events: js.UndefOr[ColorAxisEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
    * computed axis extremes.
    */
  var floor: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
    */
  var grid: js.UndefOr[ColorAxisGridOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
    * the axis across the gradient.
    */
  var gridLineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
    * lines. For possible values, see this demonstration.
    */
  var gridLineDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts) Polar charts only. Whether the grid lines should draw as a
    * polygon with straight lines between categories, or as circles. Can be
    * either `circle` or `polygon`. Since v8.0.0 this option is also applicable
    * for X axis (inverted polar).
    */
  var gridLineInterpolation: js.UndefOr[OptionsGridLineInterpolationValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
    * from the axis across the gradient of a scalar color axis.
    */
  var gridLineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
    */
  var gridZIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
    * after render time to get a pointer to the axis object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The axis labels show the number for
    * each tick.
    *
    * For more live examples on label options, see xAxis.labels in the
    * Highcharts API.
    */
  var labels: js.UndefOr[ColorAxisLabelsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The layout of the color axis. Can be
    * `'horizontal'` or `'vertical'`. If none given, the color axis has the
    * same layout as the legend.
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
    * itself.
    *
    * In styled mode, the line stroke is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) If there are multiple axes on the same
    * side of the chart, the pixel margin between the axes. Defaults to 0 on
    * vertical axes, 15 on horizontal axes.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The triangular marker on a scalar color
    * axis that points to the value of the hovered area. To disable the marker,
    * set `marker: null`.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The maximum value of the axis in terms
    * of map point values. If `null`, the max value is automatically
    * calculated. If the `endOnTick` option is true, the max value might be
    * rounded up.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
    * the color axis. Unless dataClasses or stops are set, the gradient ends at
    * this value.
    *
    * If dataClasses are set, the color is based on minColor and maxColor
    * unless a color is set for each data class, or the dataClassColor is set.
    */
  var maxColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
    * the length of the axis. A padding of 0.05 will make a 100px axis 5px
    * longer.
    */
  var maxPadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) Maximum range which can be set using the navigator's
    * handles. Opposite of xAxis.minRange.
    */
  var maxRange: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The minimum value of the axis in terms
    * of map point values. If `null`, the min value is automatically
    * calculated. If the `startOnTick` option is true, the min value might be
    * rounded down.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
    * the color axis. Unless dataClasses or stops are set, the gradient starts
    * at this value.
    *
    * If dataClasses are set, the color is based on minColor and maxColor
    * unless a color is set for each data class, or the dataClassColor is set.
    */
  var minColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Padding of the min value relative to
    * the length of the axis. A padding of 0.05 will make a 100px axis 5px
    * longer.
    */
  var minPadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
    * lines.
    *
    * In styled mode, the stroke width is given in the
    * `.highcharts-minor-grid-line` class.
    */
  var minorGridLineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
    * lines. For possible values, see this demonstration.
    */
  var minorGridLineDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Width of the minor, secondary grid
    * lines.
    *
    * In styled mode, the stroke width is given in the `.highcharts-grid-line`
    * class.
    */
  var minorGridLineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
    */
  var minorTickColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Specific tick interval in axis units
    * for the minor ticks. On a linear axis, if `"auto"`, the minor tick
    * interval is calculated as a fifth of the tickInterval. If `null` or
    * `undefined`, minor ticks are not shown.
    *
    * On logarithmic axes, the unit is the power of the value. For example,
    * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
    * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
    * and 10, 10 and 100 etc.
    *
    * If user settings dictate minor ticks to become too dense, they don't make
    * sense, and will be ignored to prevent performance problems.
    */
  var minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
    * marks.
    */
  var minorTickLength: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
    * relative to the axis line. Can be one of `inside` and `outside`.
    */
  var minorTickPosition: js.UndefOr[OptionsMinorTickPositionValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
    */
  var minorTickWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Enable or disable minor ticks. Unless
    * minorTickInterval is set, the tick interval is calculated as a fifth of
    * the `tickInterval`.
    *
    * On a logarithmic axis, minor ticks are laid out based on a best guess,
    * attempting to enter approximately 5 minor ticks between each major tick.
    *
    * Prior to v6.0.0, ticks were unabled in auto layout by setting
    * `minorTickInterval` to `"auto"`.
    */
  var minorTicks: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) In an ordinal axis, the points are equally spaced in the
    * chart regardless of the actual time or x distance between them. This
    * means that missing data periods (e.g. nights or weekends for a stock
    * chart) will not take up space in the chart. Having `ordinal: false` will
    * show any gaps created by the `gapSize` setting proportionate to their
    * duration.
    *
    * In stock charts the X axis is ordinal by default, unless the boost module
    * is used and at least one of the series' data length exceeds the
    * boostThreshold.
    */
  var ordinal: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Additional range on the right side of the xAxis. Works
    * similar to `xAxis.maxPadding`, but value is set in milliseconds. Can be
    * set for both main `xAxis` and the navigator's `xAxis`.
    */
  var overscroll: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The zoomed range to display when only defining one or none of
    * `min` or `max`. For example, to show the latest month, a range of one
    * month can be set.
    */
  var range: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
    * highest number is closest to the origin. Defaults to `false` in a
    * horizontal legend and `true` in a vertical legend, where the smallest
    * value starts on top.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) An optional scrollbar to display on the X axis in response to
    * limiting the minimum and maximum of the axis values.
    *
    * In styled mode, all the presentational options for the scrollbar are
    * replaced by the classes `.highcharts-scrollbar-thumb`,
    * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
    * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
    */
  var scrollbar: js.UndefOr[ColorAxisScrollbarOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Whether to display the colorAxis in the
    * legend.
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
    * Defaults to `true` on cartesian charts, and `false` on polar charts.
    */
  var showLastLabel: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A soft maximum for the axis. If the series
    * data maximum is less than this, the axis will stay at this maximum, but
    * if the series data maximum is higher, the axis will flex to show all
    * data.
    */
  var softMax: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
    * data minimum is greater than this, the axis will stay at this minimum,
    * but if the series data minimum is lower, the axis will flex to show all
    * data.
    */
  var softMin: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
    * put the tick between weeks. 0 = Sunday, 1 = Monday.
    */
  var startOfWeek: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
    * tick. Use this option with the `maxPadding` option to control the axis
    * start.
    */
  var startOnTick: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Color stops for the gradient of a
    * scalar color axis. Use this in cases where a linear gradient between a
    * `minColor` and `maxColor` is not sufficient. The stops is an array of
    * tuples, where the first item is a float between 0 and 1 assigning the
    * relative position in the gradient, and the second item is the color.
    */
  var stops: js.UndefOr[js.Array[js.Tuple2[Double, ColorString]]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The amount of ticks to draw on the axis.
    * This opens up for aligning the ticks of multiple charts or panes within a
    * chart. This option overrides the `tickPixelInterval` option.
    *
    * This option only has an effect on linear axes. Datetime, logarithmic or
    * category axes are not affected.
    */
  var tickAmount: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
    *
    * In styled mode, the stroke is given in the `.highcharts-tick` class.
    */
  var tickColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
    * units. When `null`, the tick interval is computed to approximately follow
    * the `tickPixelInterval`.
    */
  var tickInterval: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The pixel length of the main tick marks
    * on the color axis.
    */
  var tickLength: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) If tickInterval is `null` this option
    * sets the approximate pixel interval of the tick marks.
    */
  var tickPixelInterval: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The position of the major tick marks
    * relative to the axis line. Can be one of `inside` and `outside`.
    */
  var tickPosition: js.UndefOr[OptionsTickPositionValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) A callback function returning array
    * defining where the ticks are laid out on the axis. This overrides the
    * default behaviour of tickPixelInterval and tickInterval. The automatic
    * tick positions are accessible through `this.tickPositions` and can be
    * modified by the callback.
    */
  var tickPositioner: js.UndefOr[AxisTickPositionerCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) An array defining where the ticks are
    * laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
    * marks. Defaults to 0 on category axes, otherwise 1.
    *
    * In styled mode, the stroke width is given in the `.highcharts-tick`
    * class, but in order for the element to be generated on category axes, the
    * option must be explicitly set to 1.
    */
  var tickWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Gantt) For categorized axes only. If `on` the tick mark is
    * placed in the center of the category, if `between` the tick mark is
    * placed between categories. The default is `between` if the `tickInterval`
    * is 1, else `on`.
    */
  var tickmarkPlacement: js.UndefOr[OptionsTickmarkPlacementValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The type of interpolation to use for
    * the color axis. Can be `linear` or `logarithmic`.
    */
  var `type`: js.UndefOr[ColorAxisTypeValue] = js.undefined
  /**
    * (Highcharts, Gantt) Applies only when the axis `type` is `category`. When
    * `uniqueNames` is true, points are placed on the X axis according to their
    * names. If the same point name is repeated in the same or another series,
    * the point is placed on the same X position as other points of the same
    * name. When `uniqueNames` is false, the points are laid out in increasing
    * X positions regardless of their names, and the X axis category will take
    * the name of the last point in each position.
    */
  var uniqueNames: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
    * what time intervals the ticks are allowed to fall on. Each array item is
    * an array where the first value is the time unit and the second value
    * another array of allowed multiples.
    *
    * Defaults to: (see online documentation for example)
    */
  var units: js.UndefOr[js.Array[js.Tuple2[String, js.Array[Double] | Null]]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
    * ticks and labels, should be visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ColorAxisOptions {
  @scala.inline
  def apply(
    accessibility: AxisAccessibilityOptionsObject = null,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    angle: Int | Double = null,
    ceiling: Int | Double = null,
    className: String = null,
    currentDateIndicator: Boolean | AxisCurrentDateIndicatorOptions = null,
    dataClassColor: OptionsDataClassColorValue = null,
    dataClasses: js.Array[ColorAxisDataClassesOptions] = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    events: ColorAxisEventsOptions = null,
    floor: Int | Double = null,
    grid: ColorAxisGridOptions = null,
    gridLineColor: ColorString | GradientColorObject | PatternObject = null,
    gridLineDashStyle: DashStyleValue = null,
    gridLineInterpolation: OptionsGridLineInterpolationValue = null,
    gridLineWidth: Int | Double = null,
    gridZIndex: Int | Double = null,
    id: String = null,
    labels: ColorAxisLabelsOptions = null,
    layout: String = null,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    margin: Int | Double = null,
    marker: PointMarkerOptionsObject = null,
    max: Int | Double = null,
    maxColor: ColorString | GradientColorObject | PatternObject = null,
    maxPadding: Int | Double = null,
    maxRange: Int | Double = null,
    min: Int | Double = null,
    minColor: ColorString | GradientColorObject | PatternObject = null,
    minPadding: Int | Double = null,
    minorGridLineColor: ColorString | GradientColorObject | PatternObject = null,
    minorGridLineDashStyle: DashStyleValue = null,
    minorGridLineWidth: Int | Double = null,
    minorTickColor: ColorString | GradientColorObject | PatternObject = null,
    minorTickInterval: Double | String = null,
    minorTickLength: Int | Double = null,
    minorTickPosition: OptionsMinorTickPositionValue = null,
    minorTickWidth: Int | Double = null,
    minorTicks: js.UndefOr[Boolean] = js.undefined,
    ordinal: js.UndefOr[Boolean] = js.undefined,
    overscroll: Int | Double = null,
    range: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    scrollbar: ColorAxisScrollbarOptions = null,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showLastLabel: js.UndefOr[Boolean] = js.undefined,
    softMax: Int | Double = null,
    softMin: Int | Double = null,
    startOfWeek: Int | Double = null,
    startOnTick: js.UndefOr[Boolean] = js.undefined,
    stops: js.Array[js.Tuple2[Double, ColorString]] = null,
    tickAmount: Int | Double = null,
    tickColor: ColorString | GradientColorObject | PatternObject = null,
    tickInterval: Int | Double = null,
    tickLength: Int | Double = null,
    tickPixelInterval: Int | Double = null,
    tickPosition: OptionsTickPositionValue = null,
    tickPositioner: AxisTickPositionerCallbackFunction = null,
    tickPositions: js.Array[Double] = null,
    tickWidth: Int | Double = null,
    tickmarkPlacement: OptionsTickmarkPlacementValue = null,
    `type`: ColorAxisTypeValue = null,
    uniqueNames: js.UndefOr[Boolean] = js.undefined,
    units: js.Array[js.Tuple2[String, js.Array[Double] | Null]] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ColorAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (ceiling != null) __obj.updateDynamic("ceiling")(ceiling.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentDateIndicator != null) __obj.updateDynamic("currentDateIndicator")(currentDateIndicator.asInstanceOf[js.Any])
    if (dataClassColor != null) __obj.updateDynamic("dataClassColor")(dataClassColor.asInstanceOf[js.Any])
    if (dataClasses != null) __obj.updateDynamic("dataClasses")(dataClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(floor.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle.asInstanceOf[js.Any])
    if (gridLineInterpolation != null) __obj.updateDynamic("gridLineInterpolation")(gridLineInterpolation.asInstanceOf[js.Any])
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (gridZIndex != null) __obj.updateDynamic("gridZIndex")(gridZIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (maxPadding != null) __obj.updateDynamic("maxPadding")(maxPadding.asInstanceOf[js.Any])
    if (maxRange != null) __obj.updateDynamic("maxRange")(maxRange.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (minPadding != null) __obj.updateDynamic("minPadding")(minPadding.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor.asInstanceOf[js.Any])
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle.asInstanceOf[js.Any])
    if (minorGridLineWidth != null) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (minorTickLength != null) __obj.updateDynamic("minorTickLength")(minorTickLength.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition.asInstanceOf[js.Any])
    if (minorTickWidth != null) __obj.updateDynamic("minorTickWidth")(minorTickWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(ordinal)) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (overscroll != null) __obj.updateDynamic("overscroll")(overscroll.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel.asInstanceOf[js.Any])
    if (softMax != null) __obj.updateDynamic("softMax")(softMax.asInstanceOf[js.Any])
    if (softMin != null) __obj.updateDynamic("softMin")(softMin.asInstanceOf[js.Any])
    if (startOfWeek != null) __obj.updateDynamic("startOfWeek")(startOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (tickAmount != null) __obj.updateDynamic("tickAmount")(tickAmount.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickPixelInterval != null) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition.asInstanceOf[js.Any])
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(tickPositioner.asInstanceOf[js.Any])
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions.asInstanceOf[js.Any])
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (tickmarkPlacement != null) __obj.updateDynamic("tickmarkPlacement")(tickmarkPlacement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNames)) __obj.updateDynamic("uniqueNames")(uniqueNames.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorAxisOptions]
  }
}

