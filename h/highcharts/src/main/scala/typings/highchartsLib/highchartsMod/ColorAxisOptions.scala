package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color axis for choropleth mapping. Visually, the color axis will appear as a gradient or as separate items inside
  * the legend, depending on whether the axis is scalar or based on data classes.
  *
  * For supported color formats, see the docs article about colors.
  *
  * A scalar color axis is represented by a gradient. The colors either range between the minColor and the maxColor, or
  * for more fine grained control the colors can be defined in stops. Often times, the color axis needs to be adjusted to
  * get the right color spread for the data. In addition to stops, consider using a logarithmic axis type, or setting min
  * and max to avoid the colors being determined by outliers.
  *
  * When dataClasses are used, the ranges are subdivided into separate classes like categories based on their values.
  * This can be used for ranges between two values, but also for a true category. However, when your data is categorized,
  * it may be as convenient to add each category to a separate series.
  *
  * See the Axis object for programmatic access to the axis.
  */
trait ColorAxisOptions extends js.Object {
  /**
    * Determines how to set each data class' color if no individual color is set. The default value, tween, computes
    * intermediate colors between minColor and maxColor. The other possible value, category, pulls colors from the
    * global or chart specific colors array.
    * @default 'tween'
    */
  var dataClassColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of data classes or ranges for the choropleth map. If none given, the color axis is scalar and values are
    * distributed as a gradient between the minimum and maximum colors.
    */
  var dataClasses: js.UndefOr[js.Array[ColorAxisDataClass]] = js.undefined
  /**
    * Whether to force the axis to end on a tick. Use this option with the maxPadding option to control the axis end.
    * @default true
    */
  var endOnTick: js.UndefOr[scala.Boolean] = js.undefined
  var events: js.UndefOr[highchartsLib.Anon_AfterSetExtremes] = js.undefined
  /**
    * Color of the grid lines extending from the axis across the gradient.
    * @default '#C0C0C0'
    */
  var gridLineColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The dash or dot style of the grid lines.
    * @default 'Solid'
    */
  var gridLineDashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the grid lines extending from the axis across the gradient of a scalar color axis.
    * @default 1
    */
  var gridLineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * An id for the axis. This can be used after render time to get a pointer to the axis object through chart.get().
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The axis labels show the number for each tick.
    */
  var labels: js.UndefOr[AxisLabels] = js.undefined
  /**
    * The color of the line marking the axis itself.
    * @default '#C0D0E0'
    */
  var lineColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The width of the line marking the axis itself.
    * @default 0
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The triangular marker on a scalar color axis that points to the value of the hovered area. To disable the marker,
    * set marker: null.
    */
  var marker: js.UndefOr[highchartsLib.Anon_Animation | scala.Null] = js.undefined
  /**
    * The maximum value of the axis in terms of map point values. If null, the max value is automatically calculated.
    * If the endOnTick option is true, the max value might be rounded up.
    */
  var max: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The color to represent the maximum of the color axis. Unless dataClasses or stops are set, the gradient ends at
    * this value.
    *
    * If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or
    * the dataClassColor is set.
    * @default '#102D4C'
    */
  var maxColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * @default 0.05
    */
  var maxPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum value of the axis in terms of map point values. If null, the min value is automatically calculated.
    * If the startOnTick option is true, the min value might be rounded down.
    */
  var min: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The color to represent the minimum of the color axis. Unless dataClasses or stops are set, the gradient starts at
    * this value.
    *
    * If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or
    * the dataClassColor is set.
    * @default '#EFEFFF'
    */
  var minColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * @default 0.05
    */
  var minPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Color of the minor, secondary grid lines.
    * @default '#E0E0E0'
    */
  var minorGridLineColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The dash or dot style of the minor grid lines.
    * @default 'Solid'
    */
  var minorGridLineDashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of the minor, secondary grid lines.
    * @default 1
    */
  var minorGridLineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Color for the minor tick marks.
    * @default '#A0A0A0'
    */
  var minorTickColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tick interval in scale units for the minor ticks. On a linear axis, if 'auto', the minor tick interval is
    * calculated as a fifth of the tickInterval. If null, minor ticks are not shown.
    *
    * On logarithmic axes, the unit is the power of the value. For example, setting the minorTickInterval to 1 puts one
    * tick on each of 0.1, 1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10
    * and 100 etc. A minorTickInterval of 'auto' on a log axis results in a best guess, attempting to enter
    * approximately 5 minor ticks between each major tick.
    *
    * If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent
    * performance problems.
    */
  var minorTickInterval: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.undefined
  /**
    * The pixel length of the minor tick marks.
    * @default 2
    */
  var minorTickLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The position of the minor tick marks relative to the axis line. Can be one of inside and outside.
    * @default 'outside'
    */
  var minorTickPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pixel width of the minor tick mark
    * @default 0
    */
  var minorTickWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to reverse the axis so that the highest number is closest to the origin. Defaults to false in a
    * horizontal legend and true in a vertical legend, where the smallest value starts on top.
    */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If labels are enabled, whether to show the first tick label.
    * @default true
    */
  var showFirstLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If labels are enabled, whether to show the last tick label.
    * @default true
    */
  var showLastLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to force the axis to start on a tick. Use this option with the maxPadding option to control the axis
    * start.
    * @default true
    */
  var startOnTick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Color stops for the gradient of a scalar color axis. Use this in cases where a linear gradient between a minColor
    * and maxColor is not sufficient. The stops is an array of tuples, where the first item is a float between 0 and 1
    * assigning the relative position in the gradient, and the second item is the color.
    */
  var stops: js.UndefOr[js.Array[js.Tuple2[scala.Double, java.lang.String]]] = js.undefined
  /**
    * Color for the main tick marks.
    * @default '#C0D0E0'
    */
  var tickColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The interval of the tick marks in axis units. When null, the tick interval is computed to approximately follow
    * the tickPixelInterval.
    */
  var tickInterval: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The pixel length of the main tick marks.
    * @default 10
    */
  var tickLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * If tickInterval is null this option sets the approximate pixel interval of the tick marks.
    * @default 72
    */
  var tickPixelInterval: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The position of the major tick marks relative to the axis line. Can be one of 'inside' and 'outside'.
    * @default 'outside'
    */
  var tickPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback function returning array defining where the ticks are laid out on the axis. This overrides the default
    * behaviour of tickPixelInterval and tickInterval.
    */
  var tickPositioner: js.UndefOr[js.Function2[/* min */ scala.Double, /* max */ scala.Double, scala.Unit]] = js.undefined
  /**
    * An array defining where the ticks are laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The pixel width of the major tick marks.
    * @default 0
    */
  var tickWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The type of interpolation to use for the color axis. Can be 'linear' or 'logarithmic'.
    * @default 'linear'
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ColorAxisOptions {
  @scala.inline
  def apply(
    dataClassColor: java.lang.String = null,
    dataClasses: js.Array[ColorAxisDataClass] = null,
    endOnTick: js.UndefOr[scala.Boolean] = js.undefined,
    events: highchartsLib.Anon_AfterSetExtremes = null,
    gridLineColor: java.lang.String = null,
    gridLineDashStyle: java.lang.String = null,
    gridLineWidth: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    labels: AxisLabels = null,
    lineColor: java.lang.String | Gradient = null,
    lineWidth: scala.Int | scala.Double = null,
    marker: highchartsLib.Anon_Animation = null,
    max: scala.Int | scala.Double = null,
    maxColor: java.lang.String = null,
    maxPadding: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minColor: java.lang.String = null,
    minPadding: scala.Int | scala.Double = null,
    minorGridLineColor: java.lang.String = null,
    minorGridLineDashStyle: java.lang.String = null,
    minorGridLineWidth: scala.Int | scala.Double = null,
    minorTickColor: java.lang.String = null,
    minorTickInterval: java.lang.String | scala.Double = null,
    minorTickLength: scala.Int | scala.Double = null,
    minorTickPosition: java.lang.String = null,
    minorTickWidth: scala.Int | scala.Double = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    showFirstLabel: js.UndefOr[scala.Boolean] = js.undefined,
    showLastLabel: js.UndefOr[scala.Boolean] = js.undefined,
    startOnTick: js.UndefOr[scala.Boolean] = js.undefined,
    stops: js.Array[js.Tuple2[scala.Double, java.lang.String]] = null,
    tickColor: java.lang.String = null,
    tickInterval: scala.Int | scala.Double = null,
    tickLength: scala.Int | scala.Double = null,
    tickPixelInterval: scala.Int | scala.Double = null,
    tickPosition: java.lang.String = null,
    tickPositioner: (/* min */ scala.Double, /* max */ scala.Double) => scala.Unit = null,
    tickPositions: js.Array[scala.Double] = null,
    tickWidth: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ColorAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (dataClassColor != null) __obj.updateDynamic("dataClassColor")(dataClassColor)
    if (dataClasses != null) __obj.updateDynamic("dataClasses")(dataClasses)
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick)
    if (events != null) __obj.updateDynamic("events")(events)
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor)
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle)
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor)
    if (maxPadding != null) __obj.updateDynamic("maxPadding")(maxPadding.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor)
    if (minPadding != null) __obj.updateDynamic("minPadding")(minPadding.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor)
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle)
    if (minorGridLineWidth != null) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor)
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (minorTickLength != null) __obj.updateDynamic("minorTickLength")(minorTickLength.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition)
    if (minorTickWidth != null) __obj.updateDynamic("minorTickWidth")(minorTickWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel)
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel)
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor)
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickPixelInterval != null) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition)
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(js.Any.fromFunction2(tickPositioner))
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions)
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColorAxisOptions]
  }
}

