package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartParallelAxesOptions extends js.Object {
  
  /**
    * (Highcharts) Accessibility options for an axis. Requires the
    * accessibility module.
    */
  var accessibility: js.UndefOr[AxisAccessibilityOptionsObject] = js.native
  
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
  var alignTicks: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Whether to allow decimals in this axis' ticks. When counting
    * integers, like persons or hits on a web page, decimals should be avoided
    * in the labels.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  
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
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The highest allowed value for
    * automatically computed axis extremes.
    */
  var ceiling: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) A class name that opens for styling the axis by CSS,
    * especially in Highcharts styled mode. The class name is applied to group
    * elements for the grid, axis elements and labels.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Configure a crosshair that follows either the mouse pointer
    * or the hovered point.
    *
    * In styled mode, the crosshairs are styled in the `.highcharts-crosshair`,
    * `.highcharts-crosshair-thin` or `.highcharts-xaxis-category` classes.
    */
  var crosshair: js.UndefOr[Boolean | AxisCrosshairOptions] = js.native
  
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
  var dateTimeLabelFormats: js.UndefOr[AxisDateTimeLabelFormatsOptions] = js.native
  
  /**
    * (Highcharts) Whether to force the axis to end on a tick. Use this option
    * with the `maxPadding` option to control the axis end.
    *
    * This option is always disabled, when panning type is either `y` or `xy`.
    */
  var endOnTick: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Event handlers for the axis.
    */
  var events: js.UndefOr[ChartParallelAxesEventsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
    * computed axis extremes.
    */
  var floor: js.UndefOr[Double] = js.native
  
  /**
    * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
    */
  var grid: js.UndefOr[ChartParallelAxesGridOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
    */
  var gridZIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The height of the Y axis. If it's a number, it is
    * interpreted as pixels.
    *
    * Since Highcharts 2: If it's a percentage string, it is interpreted as
    * percentages of the total plot height.
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The axis labels show the number or category for each tick.
    *
    * Since v8.0.0: Labels are animated in categorized x-axis with updating
    * data if `tickInterval` and `step` is set to 1.
    */
  var labels: js.UndefOr[ChartParallelAxesLabelsOptions] = js.native
  
  /**
    * (Highcharts, Highstock) The left position as the horizontal axis. If it's
    * a number, it is interpreted as pixel position relative to the chart.
    *
    * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
    * as percentages of the plot width, offset from plot area left.
    */
  var left: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The color of the line marking the axis itself.
    *
    * In styled mode, the line stroke is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineColor: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts) The width of the line marking the axis itself.
    *
    * In styled mode, the stroke width is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Index of another axis that this axis is
    * linked to. When an axis is linked to a master axis, it will take the same
    * extremes as the master, but as assigned by min or max or by setExtremes.
    * It can be used to show additional info, or to ease reading the chart by
    * duplicating the scales.
    */
  var linkedTo: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) If there are multiple axes on the same side of the chart,
    * the pixel margin between the axes. Defaults to 0 on vertical axes, 15 on
    * horizontal axes.
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The maximum value of the axis. If `null`, the max value is
    * automatically calculated.
    *
    * If the endOnTick option is true, the `max` value might be rounded up.
    *
    * If a tickAmount is set, the axis may be extended beyond the set max in
    * order to reach the given number of ticks. The same may happen in a chart
    * with multiple axes, determined by chart. alignTicks, where a `tickAmount`
    * is applied internally.
    */
  var max: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highstock) Maximal size of a resizable axis. Could be set as a percent
    * of plot area or pixel size.
    */
  var maxLength: js.UndefOr[Double | String] = js.native
  
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
  var maxPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock, Gantt) Maximum range which can be set using the navigator's
    * handles. Opposite of xAxis.minRange.
    */
  var maxRange: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The minimum value of the axis. If `null` the min value is
    * automatically calculated.
    *
    * If the startOnTick option is true (default), the `min` value might be
    * rounded down.
    *
    * The automatically calculated minimum value is also affected by floor,
    * softMin, minPadding, minRange as well as series.threshold and
    * series.softThreshold.
    */
  var min: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highstock) Minimal size of a resizable axis. Could be set as a percent
    * of plot area or pixel size.
    */
  var minLength: js.UndefOr[Double | String] = js.native
  
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
  var minPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The minimum range to display on this axis. The entire axis
    * will not be allowed to span over a smaller interval than this. For
    * example, for a datetime axis the main unit is milliseconds. If minRange
    * is set to 3600000, you can't zoom in more than to one hour.
    *
    * The default minRange for the x axis is five times the smallest interval
    * between any of the data points.
    *
    * On a logarithmic axis, the unit for the minimum range is the power. So a
    * minRange of 1 means that the axis can be zoomed to 10-100, 100-1000,
    * 1000-10000 etc.
    *
    * **Note**: The `minPadding`, `maxPadding`, `startOnTick` and `endOnTick`
    * settings also affect how the extremes of the axis are computed.
    */
  var minRange: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The minimum tick interval allowed in axis values. For
    * example on zooming in on an axis with daily data, this can be used to
    * prevent the axis from showing hours. Defaults to the closest distance
    * between two points on the axis.
    */
  var minTickInterval: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Color for the minor tick marks.
    */
  var minorTickColor: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts) Specific tick interval in axis units for the minor ticks. On
    * a linear axis, if `"auto"`, the minor tick interval is calculated as a
    * fifth of the tickInterval. If `null` or `undefined`, minor ticks are not
    * shown.
    *
    * On logarithmic axes, the unit is the power of the value. For example,
    * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
    * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
    * and 10, 10 and 100 etc.
    *
    * If user settings dictate minor ticks to become too dense, they don't make
    * sense, and will be ignored to prevent performance problems.
    */
  var minorTickInterval: js.UndefOr[Double | String | Null] = js.native
  
  /**
    * (Highcharts) The pixel length of the minor tick marks.
    */
  var minorTickLength: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The position of the minor tick marks relative to the axis
    * line. Can be one of `inside` and `outside`.
    */
  var minorTickPosition: js.UndefOr[OptionsMinorTickPositionValue] = js.native
  
  /**
    * (Highcharts) The pixel width of the minor tick mark.
    */
  var minorTickWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Enable or disable minor ticks. Unless minorTickInterval is
    * set, the tick interval is calculated as a fifth of the `tickInterval`.
    *
    * On a logarithmic axis, minor ticks are laid out based on a best guess,
    * attempting to enter approximately 5 minor ticks between each major tick.
    *
    * Prior to v6.0.0, ticks were unabled in auto layout by setting
    * `minorTickInterval` to `"auto"`.
    */
  var minorTicks: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) The distance in pixels from the plot area to the axis line.
    * A positive offset moves the axis with it's line, labels and ticks away
    * from the plot area. This is typically used when two or more axes are
    * displayed on the same side of the plot. With multiple axes the offset is
    * dynamically adjusted to avoid collision, this can be overridden by
    * setting offset explicitly.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock, Highcharts, Gantt) Whether to display the axis on the
    * opposite side of the normal. The normal is on the left side for vertical
    * axes and bottom for horizontal, so the opposite sides will be right and
    * top respectively. This is typically used with dual or multiple axes.
    */
  var opposite: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Refers to the index in the panes array. Used for circular
    * gauges and polar charts. When the option is not set then first pane will
    * be used.
    */
  var pane: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The zoomed range to display when only defining one or none of
    * `min` or `max`. For example, to show the latest month, a range of one
    * month can be set.
    */
  var range: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Options for axis resizing. It adds a thick line between panes
    * which the user can drag in order to resize the panes.
    */
  var resize: js.UndefOr[ChartParallelAxesResizeOptions] = js.native
  
  /**
    * (Highcharts) Whether to reverse the axis so that the highest number is
    * closest to the origin.
    */
  var reversed: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) If `true`, the first series in a stack will be
    * drawn on top in a positive, non-reversed Y axis. If `false`, the first
    * series is in the base of the stack.
    */
  var reversedStacks: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Whether to show the axis line and title when the axis has no
    * data.
    */
  var showEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Whether to show the first tick label.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
    * Defaults to `true` on cartesian charts, and `false` on polar charts.
    */
  var showLastLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A soft maximum for the axis. If the series
    * data maximum is less than this, the axis will stay at this maximum, but
    * if the series data maximum is higher, the axis will flex to show all
    * data.
    *
    * **Note**: The series.softThreshold option takes precedence over this
    * option.
    */
  var softMax: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
    * data minimum is greater than this, the axis will stay at this minimum,
    * but if the series data minimum is lower, the axis will flex to show all
    * data.
    *
    * **Note**: The series.softThreshold option takes precedence over this
    * option.
    */
  var softMin: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
    * put the tick between weeks. 0 = Sunday, 1 = Monday.
    */
  var startOfWeek: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
    * tick. Use this option with the `maxPadding` option to control the axis
    * start.
    *
    * This option is always disabled, when panning type is either `y` or `xy`.
    */
  var startOnTick: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) For vertical axes only. Setting the static scale ensures that
    * each tick unit is translated into a fixed pixel height. For example,
    * setting the static scale to 24 results in each Y axis category taking up
    * 24 pixels, and the height of the chart adjusts. Adding or removing items
    * will make the chart resize.
    */
  var staticScale: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The amount of ticks to draw on the axis.
    * This opens up for aligning the ticks of multiple charts or panes within a
    * chart. This option overrides the `tickPixelInterval` option.
    *
    * This option only has an effect on linear axes. Datetime, logarithmic or
    * category axes are not affected.
    */
  var tickAmount: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Color for the main tick marks.
    *
    * In styled mode, the stroke is given in the `.highcharts-tick` class.
    */
  var tickColor: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts) The interval of the tick marks in axis units. When
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
  var tickInterval: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The pixel length of the main tick marks.
    */
  var tickLength: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) If tickInterval is `null` this option sets the approximate
    * pixel interval of the tick marks. Not applicable to categorized axis.
    *
    * The tick interval is also influenced by the minTickInterval option, that,
    * by default prevents ticks from being denser than the data points.
    */
  var tickPixelInterval: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The position of the major tick marks relative to the axis
    * line. Can be one of `inside` and `outside`.
    */
  var tickPosition: js.UndefOr[OptionsTickPositionValue] = js.native
  
  /**
    * (Highcharts) A callback function returning array defining where the ticks
    * are laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval. The automatic tick positions are
    * accessible through `this.tickPositions` and can be modified by the
    * callback.
    */
  var tickPositioner: js.UndefOr[AxisTickPositionerCallbackFunction] = js.native
  
  /**
    * (Highcharts) An array defining where the ticks are laid out on the axis.
    * This overrides the default behaviour of tickPixelInterval and
    * tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
    */
  var tickWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Gantt) For categorized axes only. If `on` the tick mark is
    * placed in the center of the category, if `between` the tick mark is
    * placed between categories. The default is `between` if the `tickInterval`
    * is 1, else `on`.
    */
  var tickmarkPlacement: js.UndefOr[OptionsTickmarkPlacementValue] = js.native
  
  /**
    * (Highcharts) Titles for yAxes are taken from xAxis.categories. All
    * options for `xAxis.labels` applies to parallel coordinates titles. For
    * example, to style categories, use xAxis.labels.style.
    */
  var title: js.UndefOr[ChartParallelAxesTitleOptions] = js.native
  
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
  var tooltipValueFormat: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock) The top position of the Y axis. If it's a number,
    * it is interpreted as pixel position relative to the chart.
    *
    * Since Highcharts 2: If it's a percentage string, it is interpreted as
    * percentages of the plot height, offset from plot area top.
    */
  var top: js.UndefOr[Double | String] = js.native
  
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
  var `type`: js.UndefOr[AxisTypeValue] = js.native
  
  /**
    * (Highcharts, Gantt) Applies only when the axis `type` is `category`. When
    * `uniqueNames` is true, points are placed on the X axis according to their
    * names. If the same point name is repeated in the same or another series,
    * the point is placed on the same X position as other points of the same
    * name. When `uniqueNames` is false, the points are laid out in increasing
    * X positions regardless of their names, and the X axis category will take
    * the name of the last point in each position.
    */
  var uniqueNames: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
    * what time intervals the ticks are allowed to fall on. Each array item is
    * an array where the first value is the time unit and the second value
    * another array of allowed multiples.
    *
    * Defaults to: (see online documentation for example)
    */
  var units: js.UndefOr[js.Array[js.Tuple2[String, js.Array[Double] | Null]]] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
    * ticks and labels, should be visible.
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) The width as the horizontal axis. If it's a
    * number, it is interpreted as pixels.
    *
    * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
    * as percentages of the total plot width.
    */
  var width: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) Whether to zoom axis. If `chart.zoomType` is set, the option
    * allows to disable zooming on an individual axis.
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.native
}
object ChartParallelAxesOptions {
  
  @scala.inline
  def apply(): ChartParallelAxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesOptions]
  }
  
  @scala.inline
  implicit class ChartParallelAxesOptionsOps[Self <: ChartParallelAxesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibility(value: AxisAccessibilityOptionsObject): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setAlignTicks(value: Boolean): Self = this.set("alignTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignTicks: Self = this.set("alignTicks", js.undefined)
    
    @scala.inline
    def setAllowDecimals(value: Boolean): Self = this.set("allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDecimals: Self = this.set("allowDecimals", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setCeiling(value: Double): Self = this.set("ceiling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCeiling: Self = this.set("ceiling", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCrosshair(value: Boolean | AxisCrosshairOptions): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    
    @scala.inline
    def setDateTimeLabelFormats(value: AxisDateTimeLabelFormatsOptions): Self = this.set("dateTimeLabelFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeLabelFormats: Self = this.set("dateTimeLabelFormats", js.undefined)
    
    @scala.inline
    def setEndOnTick(value: Boolean): Self = this.set("endOnTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOnTick: Self = this.set("endOnTick", js.undefined)
    
    @scala.inline
    def setEvents(value: ChartParallelAxesEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFloor(value: Double): Self = this.set("floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    
    @scala.inline
    def setGrid(value: ChartParallelAxesGridOptions): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setGridZIndex(value: Double): Self = this.set("gridZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridZIndex: Self = this.set("gridZIndex", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartParallelAxesLabelsOptions): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorType): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setLinkedTo(value: Double): Self = this.set("linkedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedTo: Self = this.set("linkedTo", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxNull: Self = this.set("max", null)
    
    @scala.inline
    def setMaxLength(value: Double | String): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxPadding(value: Double): Self = this.set("maxPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPadding: Self = this.set("maxPadding", js.undefined)
    
    @scala.inline
    def setMaxRange(value: Double): Self = this.set("maxRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRange: Self = this.set("maxRange", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinNull: Self = this.set("min", null)
    
    @scala.inline
    def setMinLength(value: Double | String): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMinPadding(value: Double): Self = this.set("minPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPadding: Self = this.set("minPadding", js.undefined)
    
    @scala.inline
    def setMinRange(value: Double): Self = this.set("minRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRange: Self = this.set("minRange", js.undefined)
    
    @scala.inline
    def setMinTickInterval(value: Double): Self = this.set("minTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTickInterval: Self = this.set("minTickInterval", js.undefined)
    
    @scala.inline
    def setMinorTickColor(value: ColorType): Self = this.set("minorTickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickColor: Self = this.set("minorTickColor", js.undefined)
    
    @scala.inline
    def setMinorTickInterval(value: Double | String): Self = this.set("minorTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickInterval: Self = this.set("minorTickInterval", js.undefined)
    
    @scala.inline
    def setMinorTickIntervalNull: Self = this.set("minorTickInterval", null)
    
    @scala.inline
    def setMinorTickLength(value: Double): Self = this.set("minorTickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickLength: Self = this.set("minorTickLength", js.undefined)
    
    @scala.inline
    def setMinorTickPosition(value: OptionsMinorTickPositionValue): Self = this.set("minorTickPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickPosition: Self = this.set("minorTickPosition", js.undefined)
    
    @scala.inline
    def setMinorTickWidth(value: Double): Self = this.set("minorTickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickWidth: Self = this.set("minorTickWidth", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: Boolean): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTicks: Self = this.set("minorTicks", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpposite(value: Boolean): Self = this.set("opposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpposite: Self = this.set("opposite", js.undefined)
    
    @scala.inline
    def setPane(value: Double): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    
    @scala.inline
    def setRange(value: Double): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setResize(value: ChartParallelAxesResizeOptions): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    
    @scala.inline
    def setReversedStacks(value: Boolean): Self = this.set("reversedStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversedStacks: Self = this.set("reversedStacks", js.undefined)
    
    @scala.inline
    def setShowEmpty(value: Boolean): Self = this.set("showEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEmpty: Self = this.set("showEmpty", js.undefined)
    
    @scala.inline
    def setShowFirstLabel(value: Boolean): Self = this.set("showFirstLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFirstLabel: Self = this.set("showFirstLabel", js.undefined)
    
    @scala.inline
    def setShowLastLabel(value: Boolean): Self = this.set("showLastLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLastLabel: Self = this.set("showLastLabel", js.undefined)
    
    @scala.inline
    def setSoftMax(value: Double): Self = this.set("softMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftMax: Self = this.set("softMax", js.undefined)
    
    @scala.inline
    def setSoftMin(value: Double): Self = this.set("softMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftMin: Self = this.set("softMin", js.undefined)
    
    @scala.inline
    def setStartOfWeek(value: Double): Self = this.set("startOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOfWeek: Self = this.set("startOfWeek", js.undefined)
    
    @scala.inline
    def setStartOnTick(value: Boolean): Self = this.set("startOnTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOnTick: Self = this.set("startOnTick", js.undefined)
    
    @scala.inline
    def setStaticScale(value: Double): Self = this.set("staticScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticScale: Self = this.set("staticScale", js.undefined)
    
    @scala.inline
    def setTickAmount(value: Double): Self = this.set("tickAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickAmount: Self = this.set("tickAmount", js.undefined)
    
    @scala.inline
    def setTickColor(value: ColorType): Self = this.set("tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickColor: Self = this.set("tickColor", js.undefined)
    
    @scala.inline
    def setTickInterval(value: Double): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
    
    @scala.inline
    def setTickLength(value: Double): Self = this.set("tickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLength: Self = this.set("tickLength", js.undefined)
    
    @scala.inline
    def setTickPixelInterval(value: Double): Self = this.set("tickPixelInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickPixelInterval: Self = this.set("tickPixelInterval", js.undefined)
    
    @scala.inline
    def setTickPosition(value: OptionsTickPositionValue): Self = this.set("tickPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickPosition: Self = this.set("tickPosition", js.undefined)
    
    @scala.inline
    def setTickPositioner(value: AxisTickPositionerCallbackFunction): Self = this.set("tickPositioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickPositioner: Self = this.set("tickPositioner", js.undefined)
    
    @scala.inline
    def setTickPositionsVarargs(value: Double*): Self = this.set("tickPositions", js.Array(value :_*))
    
    @scala.inline
    def setTickPositions(value: js.Array[Double]): Self = this.set("tickPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickPositions: Self = this.set("tickPositions", js.undefined)
    
    @scala.inline
    def setTickWidth(value: Double): Self = this.set("tickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickWidth: Self = this.set("tickWidth", js.undefined)
    
    @scala.inline
    def setTickmarkPlacement(value: OptionsTickmarkPlacementValue): Self = this.set("tickmarkPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickmarkPlacement: Self = this.set("tickmarkPlacement", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartParallelAxesTitleOptions): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTooltipValueFormat(value: String): Self = this.set("tooltipValueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipValueFormat: Self = this.set("tooltipValueFormat", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setType(value: AxisTypeValue): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUniqueNames(value: Boolean): Self = this.set("uniqueNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueNames: Self = this.set("uniqueNames", js.undefined)
    
    @scala.inline
    def setUnitsVarargs(value: (js.Tuple2[String, js.Array[Double] | Null])*): Self = this.set("units", js.Array(value :_*))
    
    @scala.inline
    def setUnits(value: js.Array[js.Tuple2[String, js.Array[Double] | Null]]): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoomEnabled(value: Boolean): Self = this.set("zoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomEnabled: Self = this.set("zoomEnabled", js.undefined)
  }
}
