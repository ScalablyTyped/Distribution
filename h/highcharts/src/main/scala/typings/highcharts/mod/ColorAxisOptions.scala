package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorAxisOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps) Accessibility options for an axis.
    * Requires the accessibility module.
    */
  var accessibility: js.UndefOr[AxisAccessibilityOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to allow decimals on the color
    * axis.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) In a polar chart, this is the angle of the Y axis in
    * degrees, where 0 is up and 90 is right. The angle determines the position
    * of the axis line and the labels, though the coordinate system is
    * unaffected. Since v8.0.0 this option is also applicable for X axis
    * (inverted polar).
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The highest allowed value for
    * automatically computed axis extremes.
    */
  var ceiling: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) A class name that opens for styling the
    * axis by CSS, especially in Highcharts styled mode. The class name is
    * applied to group elements for the grid, axis elements and labels.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) Show an indicator on the axis for the current date and time. Can
    * be a boolean or a configuration object similar to xAxis.plotLines.
    */
  var currentDateIndicator: js.UndefOr[Boolean | AxisCurrentDateIndicatorOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Determines how to set each data class'
    * color if no individual color is set. The default value, `tween`, computes
    * intermediate colors between `minColor` and `maxColor`. The other possible
    * value, `category`, pulls colors from the global or chart specific colors
    * array.
    */
  var dataClassColor: js.UndefOr[OptionsDataClassColorValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for
    * the choropleth map. If none given, the color axis is scalar and values
    * are distributed as a gradient between the minimum and maximum colors.
    */
  var dataClasses: js.UndefOr[js.Array[ColorAxisDataClassesOptions]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
    * tick. Use this option with the maxPadding option to control the axis end.
    */
  var endOnTick: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
    */
  var events: js.UndefOr[ColorAxisEventsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
    * computed axis extremes.
    */
  var floor: js.UndefOr[Double] = js.native
  
  /**
    * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
    */
  var grid: js.UndefOr[ColorAxisGridOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
    * the axis across the gradient.
    */
  var gridLineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
    * lines. For possible values, see this demonstration.
    */
  var gridLineDashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts) Polar charts only. Whether the grid lines should draw as a
    * polygon with straight lines between categories, or as circles. Can be
    * either `circle` or `polygon`. Since v8.0.0 this option is also applicable
    * for X axis (inverted polar).
    */
  var gridLineInterpolation: js.UndefOr[OptionsGridLineInterpolationValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
    * from the axis across the gradient of a scalar color axis.
    */
  var gridLineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
    */
  var gridZIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
    * after render time to get a pointer to the axis object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The axis labels show the number for
    * each tick.
    *
    * For more live examples on label options, see xAxis.labels in the
    * Highcharts API.
    */
  var labels: js.UndefOr[ColorAxisLabelsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The layout of the color axis. Can be
    * `'horizontal'` or `'vertical'`. If none given, the color axis has the
    * same layout as the legend.
    */
  var layout: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
    * itself.
    *
    * In styled mode, the line stroke is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineColor: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) If there are multiple axes on the same
    * side of the chart, the pixel margin between the axes. Defaults to 0 on
    * vertical axes, 15 on horizontal axes.
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The triangular marker on a scalar color
    * axis that points to the value of the hovered area. To disable the marker,
    * set `marker: null`.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The maximum value of the axis in terms
    * of map point values. If `null`, the max value is automatically
    * calculated. If the `endOnTick` option is true, the max value might be
    * rounded up.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
    * the color axis. Unless dataClasses or stops are set, the gradient ends at
    * this value.
    *
    * If dataClasses are set, the color is based on minColor and maxColor
    * unless a color is set for each data class, or the dataClassColor is set.
    */
  var maxColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
    * the length of the axis. A padding of 0.05 will make a 100px axis 5px
    * longer.
    */
  var maxPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock, Gantt) Maximum range which can be set using the navigator's
    * handles. Opposite of xAxis.minRange.
    */
  var maxRange: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The minimum value of the axis in terms
    * of map point values. If `null`, the min value is automatically
    * calculated. If the `startOnTick` option is true, the min value might be
    * rounded down.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
    * the color axis. Unless dataClasses or stops are set, the gradient starts
    * at this value.
    *
    * If dataClasses are set, the color is based on minColor and maxColor
    * unless a color is set for each data class, or the dataClassColor is set.
    */
  var minColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Padding of the min value relative to
    * the length of the axis. A padding of 0.05 will make a 100px axis 5px
    * longer.
    */
  var minPadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
    * lines.
    *
    * In styled mode, the stroke width is given in the
    * `.highcharts-minor-grid-line` class.
    */
  var minorGridLineColor: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
    * lines. For possible values, see this demonstration.
    */
  var minorGridLineDashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Width of the minor, secondary grid
    * lines.
    *
    * In styled mode, the stroke width is given in the `.highcharts-grid-line`
    * class.
    */
  var minorGridLineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
    */
  var minorTickColor: js.UndefOr[ColorType] = js.native
  
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
  var minorTickInterval: js.UndefOr[Double | String | Null] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
    * marks.
    */
  var minorTickLength: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
    * relative to the axis line. Can be one of `inside` and `outside`.
    */
  var minorTickPosition: js.UndefOr[OptionsMinorTickPositionValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
    */
  var minorTickWidth: js.UndefOr[Double] = js.native
  
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
  var minorTicks: js.UndefOr[Boolean] = js.native
  
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
  var ordinal: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Additional range on the right side of the xAxis. Works
    * similar to `xAxis.maxPadding`, but value is set in milliseconds. Can be
    * set for both main `xAxis` and the navigator's `xAxis`.
    */
  var overscroll: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The zoomed range to display when only defining one or none of
    * `min` or `max`. For example, to show the latest month, a range of one
    * month can be set.
    */
  var range: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
    * highest number is closest to the origin. Defaults to `false` in a
    * horizontal legend and `true` in a vertical legend, where the smallest
    * value starts on top.
    */
  var reversed: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) An optional scrollbar to display on the X axis in response to
    * limiting the minimum and maximum of the axis values.
    *
    * In styled mode, all the presentational options for the scrollbar are
    * replaced by the classes `.highcharts-scrollbar-thumb`,
    * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
    * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
    */
  var scrollbar: js.UndefOr[ColorAxisScrollbarOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to display the colorAxis in the
    * legend.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  
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
    */
  var softMax: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
    * data minimum is greater than this, the axis will stay at this minimum,
    * but if the series data minimum is lower, the axis will flex to show all
    * data.
    */
  var softMin: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
    * put the tick between weeks. 0 = Sunday, 1 = Monday.
    */
  var startOfWeek: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
    * tick. Use this option with the `maxPadding` option to control the axis
    * start.
    */
  var startOnTick: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Color stops for the gradient of a
    * scalar color axis. Use this in cases where a linear gradient between a
    * `minColor` and `maxColor` is not sufficient. The stops is an array of
    * tuples, where the first item is a float between 0 and 1 assigning the
    * relative position in the gradient, and the second item is the color.
    */
  var stops: js.UndefOr[js.Array[js.Tuple2[Double, ColorString]]] = js.native
  
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
    * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
    *
    * In styled mode, the stroke is given in the `.highcharts-tick` class.
    */
  var tickColor: js.UndefOr[ColorType] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
    * units. When `null`, the tick interval is computed to approximately follow
    * the `tickPixelInterval`.
    */
  var tickInterval: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The pixel length of the main tick marks
    * on the color axis.
    */
  var tickLength: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) If tickInterval is `null` this option
    * sets the approximate pixel interval of the tick marks.
    */
  var tickPixelInterval: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The position of the major tick marks
    * relative to the axis line. Can be one of `inside` and `outside`.
    */
  var tickPosition: js.UndefOr[OptionsTickPositionValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) A callback function returning array
    * defining where the ticks are laid out on the axis. This overrides the
    * default behaviour of tickPixelInterval and tickInterval. The automatic
    * tick positions are accessible through `this.tickPositions` and can be
    * modified by the callback.
    */
  var tickPositioner: js.UndefOr[AxisTickPositionerCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) An array defining where the ticks are
    * laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
    * marks. Defaults to 0 on category axes, otherwise 1.
    *
    * In styled mode, the stroke width is given in the `.highcharts-tick`
    * class, but in order for the element to be generated on category axes, the
    * option must be explicitly set to 1.
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
    * (Highcharts, Highstock, Highmaps) The type of interpolation to use for
    * the color axis. Can be `linear` or `logarithmic`.
    */
  var `type`: js.UndefOr[ColorAxisTypeValue] = js.native
  
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
}
object ColorAxisOptions {
  
  @scala.inline
  def apply(): ColorAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisOptions]
  }
  
  @scala.inline
  implicit class ColorAxisOptionsOps[Self <: ColorAxisOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowDecimals(value: Boolean): Self = this.set("allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDecimals: Self = this.set("allowDecimals", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setCeiling(value: Double): Self = this.set("ceiling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCeiling: Self = this.set("ceiling", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCurrentDateIndicator(value: Boolean | AxisCurrentDateIndicatorOptions): Self = this.set("currentDateIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDateIndicator: Self = this.set("currentDateIndicator", js.undefined)
    
    @scala.inline
    def setDataClassColor(value: OptionsDataClassColorValue): Self = this.set("dataClassColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataClassColor: Self = this.set("dataClassColor", js.undefined)
    
    @scala.inline
    def setDataClassesVarargs(value: ColorAxisDataClassesOptions*): Self = this.set("dataClasses", js.Array(value :_*))
    
    @scala.inline
    def setDataClasses(value: js.Array[ColorAxisDataClassesOptions]): Self = this.set("dataClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataClasses: Self = this.set("dataClasses", js.undefined)
    
    @scala.inline
    def setEndOnTick(value: Boolean): Self = this.set("endOnTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOnTick: Self = this.set("endOnTick", js.undefined)
    
    @scala.inline
    def setEvents(value: ColorAxisEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFloor(value: Double): Self = this.set("floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    
    @scala.inline
    def setGrid(value: ColorAxisGridOptions): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setGridLineColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("gridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLineColor: Self = this.set("gridLineColor", js.undefined)
    
    @scala.inline
    def setGridLineDashStyle(value: DashStyleValue): Self = this.set("gridLineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLineDashStyle: Self = this.set("gridLineDashStyle", js.undefined)
    
    @scala.inline
    def setGridLineInterpolation(value: OptionsGridLineInterpolationValue): Self = this.set("gridLineInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLineInterpolation: Self = this.set("gridLineInterpolation", js.undefined)
    
    @scala.inline
    def setGridLineWidth(value: Double): Self = this.set("gridLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLineWidth: Self = this.set("gridLineWidth", js.undefined)
    
    @scala.inline
    def setGridZIndex(value: Double): Self = this.set("gridZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridZIndex: Self = this.set("gridZIndex", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabels(value: ColorAxisLabelsOptions): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorType): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("maxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxColor: Self = this.set("maxColor", js.undefined)
    
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
    def setMinColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("minColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColor: Self = this.set("minColor", js.undefined)
    
    @scala.inline
    def setMinPadding(value: Double): Self = this.set("minPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPadding: Self = this.set("minPadding", js.undefined)
    
    @scala.inline
    def setMinorGridLineColor(value: ColorType): Self = this.set("minorGridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorGridLineColor: Self = this.set("minorGridLineColor", js.undefined)
    
    @scala.inline
    def setMinorGridLineDashStyle(value: DashStyleValue): Self = this.set("minorGridLineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorGridLineDashStyle: Self = this.set("minorGridLineDashStyle", js.undefined)
    
    @scala.inline
    def setMinorGridLineWidth(value: Double): Self = this.set("minorGridLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorGridLineWidth: Self = this.set("minorGridLineWidth", js.undefined)
    
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
    def setOrdinal(value: Boolean): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    
    @scala.inline
    def setOverscroll(value: Double): Self = this.set("overscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscroll: Self = this.set("overscroll", js.undefined)
    
    @scala.inline
    def setRange(value: Double): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    
    @scala.inline
    def setScrollbar(value: ColorAxisScrollbarOptions): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
    
    @scala.inline
    def setShowFirstLabel(value: Boolean): Self = this.set("showFirstLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFirstLabel: Self = this.set("showFirstLabel", js.undefined)
    
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    
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
    def setStopsVarargs(value: (js.Tuple2[Double, ColorString])*): Self = this.set("stops", js.Array(value :_*))
    
    @scala.inline
    def setStops(value: js.Array[js.Tuple2[Double, ColorString]]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    
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
    def setType(value: ColorAxisTypeValue): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
  }
}
