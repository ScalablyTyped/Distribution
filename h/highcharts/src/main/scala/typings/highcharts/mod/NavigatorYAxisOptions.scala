package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorYAxisOptions extends StObject {
  
  /**
    * (Highstock, Gantt) Accessibility options for an axis. Requires the
    * accessibility module.
    */
  var accessibility: js.UndefOr[AxisAccessibilityOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two
    * or more opposite axes will automatically be aligned by adding ticks to
    * the axis or axes with the least ticks, as if `tickAmount` were specified.
    *
    * This can be prevented by setting `alignTicks` to false. If the grid lines
    * look messy, it's a good idea to hide them for the secondary axis by
    * setting `gridLineWidth` to 0.
    *
    * If `startOnTick` or `endOnTick` in an Axis options are set to false, then
    * the `alignTicks ` will be disabled for the Axis.
    *
    * Disabled for logarithmic axes.
    */
  var alignTicks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) Whether to allow decimals in this axis' ticks. When
    * counting integers, like persons or hits on a web page, decimals should be
    * avoided in the labels.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) When using an alternate grid color, a band is painted
    * across the plot area between every other grid line.
    */
  var alternateGridColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highcharts) In a polar chart, this is the angle of the Y axis in
    * degrees, where 0 is up and 90 is right. The angle determines the position
    * of the axis line and the labels, though the coordinate system is
    * unaffected. Since v8.0.0 this option is also applicable for X axis
    * (inverted polar).
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
    * sections defined will be left out and all the points shifted closer to
    * each other.
    */
  var breaks: js.UndefOr[js.Array[NavigatorYAxisBreaksOptions]] = js.undefined
  
  /**
    * (Highcharts, Gantt) If categories are present for the xAxis, names are
    * used instead of numbers for that axis.
    *
    * Since Highcharts 3.0, categories can also be extracted by giving each
    * point a name and setting axis type to `category`. However, if you have
    * multiple series, best practice remains defining the `categories` array.
    *
    * Example: `categories: ['Apples', 'Bananas', 'Oranges']`
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The highest allowed value for
    * automatically computed axis extremes.
    */
  var ceiling: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) A class name that opens for styling the axis by CSS,
    * especially in Highcharts styled mode. The class name is applied to group
    * elements for the grid, axis elements and labels.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock, Gantt) Configure a crosshair that follows either the mouse
    * pointer or the hovered point.
    *
    * In styled mode, the crosshairs are styled in the `.highcharts-crosshair`,
    * `.highcharts-crosshair-thin` or `.highcharts-xaxis-category` classes.
    */
  var crosshair: js.UndefOr[Boolean | AxisCrosshairOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
    * automatically adjust to the appropriate unit. This member gives the
    * default string representations used for each unit. For intermediate
    * values, different units may be used, for example the `day` unit can be
    * used on midnight and `hour` unit be used for intermediate values on the
    * same axis.
    *
    * For an overview of the replacement codes, see dateFormat.
    *
    * Defaults to: (see online documentation for example)
    */
  var dateTimeLabelFormats: js.UndefOr[AxisDateTimeLabelFormatsOptions] = js.undefined
  
  /**
    * (Highstock, Gantt) Whether to force the axis to end on a tick. Use this
    * option with the `maxPadding` option to control the axis end.
    *
    * This option is always disabled, when panning type is either `y` or `xy`.
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) Event handlers for the axis.
    */
  var events: js.UndefOr[NavigatorYAxisEventsOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
    * computed axis extremes.
    */
  var floor: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
    */
  var grid: js.UndefOr[NavigatorYAxisGridOptions] = js.undefined
  
  /**
    * (Highstock, Gantt) Color of the grid lines extending the ticks across the
    * plot area.
    *
    * In styled mode, the stroke is given in the `.highcharts-grid-line` class.
    */
  var gridLineColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highstock, Gantt) The dash or dot style of the grid lines. For possible
    * values, see this demonstration.
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
    * (Highstock, Gantt) The width of the grid lines extending the ticks across
    * the plot area.
    *
    * In styled mode, the stroke width is given in the `.highcharts-grid-line`
    * class.
    */
  var gridLineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
    */
  var gridZIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) An id for the axis. This can be used after render time
    * to get a pointer to the axis object through `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock, Gantt) The axis labels show the number or category for each
    * tick.
    *
    * Since v8.0.0: Labels are animated in categorized x-axis with updating
    * data if `tickInterval` and `step` is set to 1.
    */
  var labels: js.UndefOr[NavigatorYAxisLabelsOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock) The left position as the horizontal axis. If it's
    * a number, it is interpreted as pixel position relative to the chart.
    *
    * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
    * as percentages of the plot width, offset from plot area left.
    */
  var left: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highstock, Gantt) The color of the line marking the axis itself.
    *
    * In styled mode, the line stroke is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highstock, Gantt) The width of the line marking the axis itself.
    *
    * In styled mode, the stroke width is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) If there are multiple axes on the same side of the
    * chart, the pixel margin between the axes. Defaults to 0 on vertical axes,
    * 15 on horizontal axes.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The maximum value of the axis. If `null`, the max
    * value is automatically calculated.
    *
    * If the endOnTick option is true, the `max` value might be rounded up.
    *
    * If a tickAmount is set, the axis may be extended beyond the set max in
    * order to reach the given number of ticks. The same may happen in a chart
    * with multiple axes, determined by chart. alignTicks, where a `tickAmount`
    * is applied internally.
    */
  var max: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highcharts) Solid gauge only. Unless stops are set, the color to
    * represent the maximum value of the Y axis.
    */
  var maxColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Padding of the max value relative to the
    * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * This is useful when you don't want the highest data value to appear on
    * the edge of the plot area. When the axis' `max` option is set or a max
    * extreme is set using `axis.setExtremes()`, the maxPadding will be
    * ignored.
    *
    * Also the `softThreshold` option takes precedence over `maxPadding`, so if
    * the data is tangent to the threshold, `maxPadding` may not apply unless
    * `softThreshold` is set to false.
    */
  var maxPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The minimum value of the axis. If `null` the min value
    * is automatically calculated.
    *
    * If the startOnTick option is true (default), the `min` value might be
    * rounded down.
    *
    * The automatically calculated minimum value is also affected by floor,
    * softMin, minPadding, minRange as well as series.threshold and
    * series.softThreshold.
    */
  var min: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highcharts) Solid gauge only. Unless stops are set, the color to
    * represent the minimum value of the Y axis.
    */
  var minColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
    * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * This is useful when you don't want the lowest data value to appear on the
    * edge of the plot area. When the axis' `min` option is set or a max
    * extreme is set using `axis.setExtremes()`, the maxPadding will be
    * ignored.
    *
    * Also the `softThreshold` option takes precedence over `minPadding`, so if
    * the data is tangent to the threshold, `minPadding` may not apply unless
    * `softThreshold` is set to false.
    */
  var minPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The minimum tick interval allowed in axis values. For
    * example on zooming in on an axis with daily data, this can be used to
    * prevent the axis from showing hours. Defaults to the closest distance
    * between two points on the axis.
    */
  var minTickInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) Color of the minor, secondary grid lines.
    *
    * In styled mode, the stroke width is given in the
    * `.highcharts-minor-grid-line` class.
    */
  var minorGridLineColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highstock, Gantt) The dash or dot style of the minor grid lines. For
    * possible values, see this demonstration.
    */
  var minorGridLineDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Highstock, Gantt) Width of the minor, secondary grid lines.
    *
    * In styled mode, the stroke width is given in the `.highcharts-grid-line`
    * class.
    */
  var minorGridLineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) Color for the minor tick marks.
    */
  var minorTickColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highstock, Gantt) Specific tick interval in axis units for the minor
    * ticks. On a linear axis, if `"auto"`, the minor tick interval is
    * calculated as a fifth of the tickInterval. If `null` or `undefined`,
    * minor ticks are not shown.
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
    * (Highstock, Gantt) The pixel length of the minor tick marks.
    */
  var minorTickLength: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The position of the minor tick marks relative to the
    * axis line. Can be one of `inside` and `outside`.
    */
  var minorTickPosition: js.UndefOr[OptionsMinorTickPositionValue] = js.undefined
  
  /**
    * (Highstock, Gantt) The pixel width of the minor tick mark.
    */
  var minorTickWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) Enable or disable minor ticks. Unless
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
    * (Highstock, Gantt) The distance in pixels from the plot area to the axis
    * line. A positive offset moves the axis with it's line, labels and ticks
    * away from the plot area. This is typically used when two or more axes are
    * displayed on the same side of the plot. With multiple axes the offset is
    * dynamically adjusted to avoid collision, this can be overridden by
    * setting offset explicitly.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Highcharts, Gantt) Whether to display the axis on the
    * opposite side of the normal. The normal is on the left side for vertical
    * axes and bottom for horizontal, so the opposite sides will be right and
    * top respectively. This is typically used with dual or multiple axes.
    */
  var opposite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Refers to the index in the panes array. Used for circular
    * gauges and polar charts. When the option is not set then first pane will
    * be used.
    */
  var pane: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) An array of colored bands stretching
    * across the plot area marking an interval on the axis.
    *
    * In styled mode, the plot bands are styled by the `.highcharts-plot-band`
    * class in addition to the `className` option.
    */
  var plotBands: js.UndefOr[js.Array[NavigatorYAxisPlotBandsOptions]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) An array of lines stretching across the
    * plot area, marking a specific value on one of the axes.
    *
    * In styled mode, the plot lines are styled by the `.highcharts-plot-line`
    * class in addition to the `className` option.
    */
  var plotLines: js.UndefOr[js.Array[NavigatorYAxisPlotLinesOptions]] = js.undefined
  
  /**
    * (Highstock, Gantt) Whether to reverse the axis so that the highest number
    * is closest to the origin.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock) If `true`, the first series in a stack will be
    * drawn on top in a positive, non-reversed Y axis. If `false`, the first
    * series is in the base of the stack.
    */
  var reversedStacks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock, Gantt) Whether to show the first tick label.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.undefined
  
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
    *
    * **Note**: The series.softThreshold option takes precedence over this
    * option.
    */
  var softMax: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
    * data minimum is greater than this, the axis will stay at this minimum,
    * but if the series data minimum is lower, the axis will flex to show all
    * data.
    *
    * **Note**: The series.softThreshold option takes precedence over this
    * option.
    */
  var softMin: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The stack labels show the total value for each bar in a
    * stacked column or bar chart. The label will be placed on top of positive
    * columns and below negative columns. In case of an inverted column chart
    * or a bar chart the label is placed to the right of positive bars and to
    * the left of negative bars.
    */
  var stackLabels: js.UndefOr[NavigatorYAxisStackLabelsOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
    * put the tick between weeks. 0 = Sunday, 1 = Monday.
    */
  var startOfWeek: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
    * tick. Use this option with the `maxPadding` option to control the axis
    * start.
    *
    * This option is always disabled, when panning type is either `y` or `xy`.
    */
  var startOnTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Gantt) For vertical axes only. Setting the static scale ensures that
    * each tick unit is translated into a fixed pixel height. For example,
    * setting the static scale to 24 results in each Y axis category taking up
    * 24 pixels, and the height of the chart adjusts. Adding or removing items
    * will make the chart resize.
    */
  var staticScale: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Solid gauge series only. Color stops for the solid gauge.
    * Use this in cases where a linear gradient between a `minColor` and
    * `maxColor` is not sufficient. The stops is an array of tuples, where the
    * first item is a float between 0 and 1 assigning the relative position in
    * the gradient, and the second item is the color.
    *
    * For solid gauges, the Y axis also inherits the concept of data classes
    * from the Highmaps color axis.
    */
  var stops: js.UndefOr[js.Array[js.Tuple2[Double, ColorType]]] = js.undefined
  
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
    * (Highstock, Gantt) Color for the main tick marks.
    *
    * In styled mode, the stroke is given in the `.highcharts-tick` class.
    */
  var tickColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highstock, Gantt) The interval of the tick marks in axis units. When
    * `undefined`, the tick interval is computed to approximately follow the
    * tickPixelInterval on linear and datetime axes. On categorized axes, a
    * `undefined` tickInterval will default to 1, one category. Note that
    * datetime axes are based on milliseconds, so for example an interval of
    * one day is expressed as `24 * 3600 * 1000`.
    *
    * On logarithmic axes, the tickInterval is based on powers, so a
    * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
    * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of
    * 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40
    * etc.
    *
    * If the tickInterval is too dense for labels to be drawn, Highcharts may
    * remove ticks.
    *
    * If the chart has multiple axes, the alignTicks option may interfere with
    * the `tickInterval` setting.
    */
  var tickInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The pixel length of the main tick marks.
    */
  var tickLength: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) If tickInterval is `null` this option sets the
    * approximate pixel interval of the tick marks. Not applicable to
    * categorized axis.
    *
    * The tick interval is also influenced by the minTickInterval option, that,
    * by default prevents ticks from being denser than the data points.
    */
  var tickPixelInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock, Gantt) The position of the major tick marks relative to the
    * axis line. Can be one of `inside` and `outside`.
    */
  var tickPosition: js.UndefOr[OptionsTickPositionValue] = js.undefined
  
  /**
    * (Highstock, Gantt) A callback function returning array defining where the
    * ticks are laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval. The automatic tick positions are
    * accessible through `this.tickPositions` and can be modified by the
    * callback.
    */
  var tickPositioner: js.UndefOr[AxisTickPositionerCallbackFunction] = js.undefined
  
  /**
    * (Highstock, Gantt) An array defining where the ticks are laid out on the
    * axis. This overrides the default behaviour of tickPixelInterval and
    * tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
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
    * (Highstock, Gantt) The axis title, showing next to the axis line.
    */
  var title: js.UndefOr[NavigatorYAxisTitleOptions] = js.undefined
  
  /**
    * (Highcharts) Parallel coordinates only. Format that will be used for
    * point.y and available in tooltip.pointFormat as `{point.formattedValue}`.
    * If not set, `{point.formattedValue}` will use other options, in this
    * order:
    *
    * 1. yAxis.labels.format will be used if set
    *
    * 2. If yAxis is a category, then category name will be displayed
    *
    * 3. If yAxis is a datetime, then value will use the same format as yAxis
    * labels
    *
    * 4. If yAxis is linear/logarithmic type, then simple value will be used
    */
  var tooltipValueFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Gantt) The type of axis. Can be one of `linear`,
    * `logarithmic`, `datetime`, `category` or `treegrid`. Defaults to
    * `treegrid` for Gantt charts, `linear` for other chart types.
    *
    * In a datetime axis, the numbers are given in milliseconds, and tick marks
    * are placed on appropriate values, like full hours or days. In a category
    * or treegrid axis, the point names of the chart's series are used for
    * categories, if a categories array is not defined.
    */
  var `type`: js.UndefOr[AxisTypeValue] = js.undefined
  
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
    * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
    * ticks and labels, should be visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock) The width as the horizontal axis. If it's a
    * number, it is interpreted as pixels.
    *
    * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
    * as percentages of the total plot width.
    */
  var width: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highstock, Gantt) Whether to zoom axis. If `chart.zoomType` is set, the
    * option allows to disable zooming on an individual axis.
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.undefined
}
object NavigatorYAxisOptions {
  
  @scala.inline
  def apply(): NavigatorYAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisOptions]
  }
  
  @scala.inline
  implicit class NavigatorYAxisOptionsMutableBuilder[Self <: NavigatorYAxisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: AxisAccessibilityOptionsObject): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAlignTicks(value: Boolean): Self = StObject.set(x, "alignTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignTicksUndefined: Self = StObject.set(x, "alignTicks", js.undefined)
    
    @scala.inline
    def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    @scala.inline
    def setAlternateGridColor(value: ColorType): Self = StObject.set(x, "alternateGridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateGridColorUndefined: Self = StObject.set(x, "alternateGridColor", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setBreaks(value: js.Array[NavigatorYAxisBreaksOptions]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    @scala.inline
    def setBreaksVarargs(value: NavigatorYAxisBreaksOptions*): Self = StObject.set(x, "breaks", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setCeiling(value: Double): Self = StObject.set(x, "ceiling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCeilingUndefined: Self = StObject.set(x, "ceiling", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCrosshair(value: Boolean | AxisCrosshairOptions): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    @scala.inline
    def setDateTimeLabelFormats(value: AxisDateTimeLabelFormatsOptions): Self = StObject.set(x, "dateTimeLabelFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeLabelFormatsUndefined: Self = StObject.set(x, "dateTimeLabelFormats", js.undefined)
    
    @scala.inline
    def setEndOnTick(value: Boolean): Self = StObject.set(x, "endOnTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOnTickUndefined: Self = StObject.set(x, "endOnTick", js.undefined)
    
    @scala.inline
    def setEvents(value: NavigatorYAxisEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFloor(value: Double): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    @scala.inline
    def setGrid(value: NavigatorYAxisGridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLineColor(value: ColorType): Self = StObject.set(x, "gridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLineColorUndefined: Self = StObject.set(x, "gridLineColor", js.undefined)
    
    @scala.inline
    def setGridLineDashStyle(value: DashStyleValue): Self = StObject.set(x, "gridLineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLineDashStyleUndefined: Self = StObject.set(x, "gridLineDashStyle", js.undefined)
    
    @scala.inline
    def setGridLineInterpolation(value: OptionsGridLineInterpolationValue): Self = StObject.set(x, "gridLineInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLineInterpolationUndefined: Self = StObject.set(x, "gridLineInterpolation", js.undefined)
    
    @scala.inline
    def setGridLineWidth(value: Double): Self = StObject.set(x, "gridLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLineWidthUndefined: Self = StObject.set(x, "gridLineWidth", js.undefined)
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setGridZIndex(value: Double): Self = StObject.set(x, "gridZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridZIndexUndefined: Self = StObject.set(x, "gridZIndex", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabels(value: NavigatorYAxisLabelsOptions): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorType): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColor(value: ColorType): Self = StObject.set(x, "maxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColorUndefined: Self = StObject.set(x, "maxColor", js.undefined)
    
    @scala.inline
    def setMaxNull: Self = StObject.set(x, "max", null)
    
    @scala.inline
    def setMaxPadding(value: Double): Self = StObject.set(x, "maxPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPaddingUndefined: Self = StObject.set(x, "maxPadding", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinColor(value: ColorType): Self = StObject.set(x, "minColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinColorUndefined: Self = StObject.set(x, "minColor", js.undefined)
    
    @scala.inline
    def setMinNull: Self = StObject.set(x, "min", null)
    
    @scala.inline
    def setMinPadding(value: Double): Self = StObject.set(x, "minPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPaddingUndefined: Self = StObject.set(x, "minPadding", js.undefined)
    
    @scala.inline
    def setMinTickInterval(value: Double): Self = StObject.set(x, "minTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTickIntervalUndefined: Self = StObject.set(x, "minTickInterval", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinorGridLineColor(value: ColorType): Self = StObject.set(x, "minorGridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridLineColorUndefined: Self = StObject.set(x, "minorGridLineColor", js.undefined)
    
    @scala.inline
    def setMinorGridLineDashStyle(value: DashStyleValue): Self = StObject.set(x, "minorGridLineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridLineDashStyleUndefined: Self = StObject.set(x, "minorGridLineDashStyle", js.undefined)
    
    @scala.inline
    def setMinorGridLineWidth(value: Double): Self = StObject.set(x, "minorGridLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridLineWidthUndefined: Self = StObject.set(x, "minorGridLineWidth", js.undefined)
    
    @scala.inline
    def setMinorTickColor(value: ColorType): Self = StObject.set(x, "minorTickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickColorUndefined: Self = StObject.set(x, "minorTickColor", js.undefined)
    
    @scala.inline
    def setMinorTickInterval(value: Double | String): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickIntervalNull: Self = StObject.set(x, "minorTickInterval", null)
    
    @scala.inline
    def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    @scala.inline
    def setMinorTickLength(value: Double): Self = StObject.set(x, "minorTickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickLengthUndefined: Self = StObject.set(x, "minorTickLength", js.undefined)
    
    @scala.inline
    def setMinorTickPosition(value: OptionsMinorTickPositionValue): Self = StObject.set(x, "minorTickPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickPositionUndefined: Self = StObject.set(x, "minorTickPosition", js.undefined)
    
    @scala.inline
    def setMinorTickWidth(value: Double): Self = StObject.set(x, "minorTickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickWidthUndefined: Self = StObject.set(x, "minorTickWidth", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: Boolean): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOpposite(value: Boolean): Self = StObject.set(x, "opposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOppositeUndefined: Self = StObject.set(x, "opposite", js.undefined)
    
    @scala.inline
    def setPane(value: Double): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPlotBands(value: js.Array[NavigatorYAxisPlotBandsOptions]): Self = StObject.set(x, "plotBands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBandsUndefined: Self = StObject.set(x, "plotBands", js.undefined)
    
    @scala.inline
    def setPlotBandsVarargs(value: NavigatorYAxisPlotBandsOptions*): Self = StObject.set(x, "plotBands", js.Array(value :_*))
    
    @scala.inline
    def setPlotLines(value: js.Array[NavigatorYAxisPlotLinesOptions]): Self = StObject.set(x, "plotLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotLinesUndefined: Self = StObject.set(x, "plotLines", js.undefined)
    
    @scala.inline
    def setPlotLinesVarargs(value: NavigatorYAxisPlotLinesOptions*): Self = StObject.set(x, "plotLines", js.Array(value :_*))
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedStacks(value: Boolean): Self = StObject.set(x, "reversedStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedStacksUndefined: Self = StObject.set(x, "reversedStacks", js.undefined)
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setShowFirstLabel(value: Boolean): Self = StObject.set(x, "showFirstLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFirstLabelUndefined: Self = StObject.set(x, "showFirstLabel", js.undefined)
    
    @scala.inline
    def setShowLastLabel(value: Boolean): Self = StObject.set(x, "showLastLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLastLabelUndefined: Self = StObject.set(x, "showLastLabel", js.undefined)
    
    @scala.inline
    def setSoftMax(value: Double): Self = StObject.set(x, "softMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftMaxUndefined: Self = StObject.set(x, "softMax", js.undefined)
    
    @scala.inline
    def setSoftMin(value: Double): Self = StObject.set(x, "softMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftMinUndefined: Self = StObject.set(x, "softMin", js.undefined)
    
    @scala.inline
    def setStackLabels(value: NavigatorYAxisStackLabelsOptions): Self = StObject.set(x, "stackLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackLabelsUndefined: Self = StObject.set(x, "stackLabels", js.undefined)
    
    @scala.inline
    def setStartOfWeek(value: Double): Self = StObject.set(x, "startOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOfWeekUndefined: Self = StObject.set(x, "startOfWeek", js.undefined)
    
    @scala.inline
    def setStartOnTick(value: Boolean): Self = StObject.set(x, "startOnTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOnTickUndefined: Self = StObject.set(x, "startOnTick", js.undefined)
    
    @scala.inline
    def setStaticScale(value: Double): Self = StObject.set(x, "staticScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticScaleUndefined: Self = StObject.set(x, "staticScale", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[js.Tuple2[Double, ColorType]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: (js.Tuple2[Double, ColorType])*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setTickAmount(value: Double): Self = StObject.set(x, "tickAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickAmountUndefined: Self = StObject.set(x, "tickAmount", js.undefined)
    
    @scala.inline
    def setTickColor(value: ColorType): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
    
    @scala.inline
    def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    @scala.inline
    def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLengthUndefined: Self = StObject.set(x, "tickLength", js.undefined)
    
    @scala.inline
    def setTickPixelInterval(value: Double): Self = StObject.set(x, "tickPixelInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickPixelIntervalUndefined: Self = StObject.set(x, "tickPixelInterval", js.undefined)
    
    @scala.inline
    def setTickPosition(value: OptionsTickPositionValue): Self = StObject.set(x, "tickPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickPositionUndefined: Self = StObject.set(x, "tickPosition", js.undefined)
    
    @scala.inline
    def setTickPositioner(value: AxisTickPositionerCallbackFunction): Self = StObject.set(x, "tickPositioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickPositionerUndefined: Self = StObject.set(x, "tickPositioner", js.undefined)
    
    @scala.inline
    def setTickPositions(value: js.Array[Double]): Self = StObject.set(x, "tickPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickPositionsUndefined: Self = StObject.set(x, "tickPositions", js.undefined)
    
    @scala.inline
    def setTickPositionsVarargs(value: Double*): Self = StObject.set(x, "tickPositions", js.Array(value :_*))
    
    @scala.inline
    def setTickWidth(value: Double): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
    
    @scala.inline
    def setTickmarkPlacement(value: OptionsTickmarkPlacementValue): Self = StObject.set(x, "tickmarkPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickmarkPlacementUndefined: Self = StObject.set(x, "tickmarkPlacement", js.undefined)
    
    @scala.inline
    def setTitle(value: NavigatorYAxisTitleOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltipValueFormat(value: String): Self = StObject.set(x, "tooltipValueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipValueFormatUndefined: Self = StObject.set(x, "tooltipValueFormat", js.undefined)
    
    @scala.inline
    def setType(value: AxisTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUniqueNames(value: Boolean): Self = StObject.set(x, "uniqueNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNamesUndefined: Self = StObject.set(x, "uniqueNames", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
  }
}
