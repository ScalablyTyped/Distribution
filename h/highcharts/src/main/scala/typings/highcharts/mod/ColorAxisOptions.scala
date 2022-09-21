package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorAxisOptions extends StObject {
  
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
  var currentDateIndicator: js.UndefOr[Boolean | CurrentDateIndicatorOptions] = js.undefined
  
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
  var lineColor: js.UndefOr[ColorType] = js.undefined
  
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
  var minorGridLineColor: js.UndefOr[ColorType] = js.undefined
  
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
  var minorTickColor: js.UndefOr[ColorType] = js.undefined
  
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
    *
    * For an ordinal axis, `minPadding` and `maxPadding` are ignored. Use
    * overscroll instead.
    */
  var ordinal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Additional range on the right side of the xAxis. Works
    * similar to `xAxis.maxPadding`, but value is set in milliseconds. Can be
    * set for both main `xAxis` and the navigator's `xAxis`.
    */
  var overscroll: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to pan axis. If `chart.panning`
    * is enabled, the option allows to disable panning on an individual axis.
    */
  var panningEnabled: js.UndefOr[Boolean] = js.undefined
  
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
  var tickColor: js.UndefOr[ColorType] = js.undefined
  
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
  
  /**
    * (Highcharts, Highstock, Highmaps) The Z index for the axis group.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object ColorAxisOptions {
  
  inline def apply(): ColorAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisOptions]
  }
  
  extension [Self <: ColorAxisOptions](x: Self) {
    
    inline def setAccessibility(value: AxisAccessibilityOptionsObject): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    inline def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setCeiling(value: Double): Self = StObject.set(x, "ceiling", value.asInstanceOf[js.Any])
    
    inline def setCeilingUndefined: Self = StObject.set(x, "ceiling", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCurrentDateIndicator(value: Boolean | CurrentDateIndicatorOptions): Self = StObject.set(x, "currentDateIndicator", value.asInstanceOf[js.Any])
    
    inline def setCurrentDateIndicatorUndefined: Self = StObject.set(x, "currentDateIndicator", js.undefined)
    
    inline def setDataClassColor(value: OptionsDataClassColorValue): Self = StObject.set(x, "dataClassColor", value.asInstanceOf[js.Any])
    
    inline def setDataClassColorUndefined: Self = StObject.set(x, "dataClassColor", js.undefined)
    
    inline def setDataClasses(value: js.Array[ColorAxisDataClassesOptions]): Self = StObject.set(x, "dataClasses", value.asInstanceOf[js.Any])
    
    inline def setDataClassesUndefined: Self = StObject.set(x, "dataClasses", js.undefined)
    
    inline def setDataClassesVarargs(value: ColorAxisDataClassesOptions*): Self = StObject.set(x, "dataClasses", js.Array(value*))
    
    inline def setEndOnTick(value: Boolean): Self = StObject.set(x, "endOnTick", value.asInstanceOf[js.Any])
    
    inline def setEndOnTickUndefined: Self = StObject.set(x, "endOnTick", js.undefined)
    
    inline def setEvents(value: ColorAxisEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFloor(value: Double): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    inline def setGrid(value: ColorAxisGridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridLineColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "gridLineColor", value.asInstanceOf[js.Any])
    
    inline def setGridLineColorUndefined: Self = StObject.set(x, "gridLineColor", js.undefined)
    
    inline def setGridLineDashStyle(value: DashStyleValue): Self = StObject.set(x, "gridLineDashStyle", value.asInstanceOf[js.Any])
    
    inline def setGridLineDashStyleUndefined: Self = StObject.set(x, "gridLineDashStyle", js.undefined)
    
    inline def setGridLineInterpolation(value: OptionsGridLineInterpolationValue): Self = StObject.set(x, "gridLineInterpolation", value.asInstanceOf[js.Any])
    
    inline def setGridLineInterpolationUndefined: Self = StObject.set(x, "gridLineInterpolation", js.undefined)
    
    inline def setGridLineWidth(value: Double): Self = StObject.set(x, "gridLineWidth", value.asInstanceOf[js.Any])
    
    inline def setGridLineWidthUndefined: Self = StObject.set(x, "gridLineWidth", js.undefined)
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGridZIndex(value: Double): Self = StObject.set(x, "gridZIndex", value.asInstanceOf[js.Any])
    
    inline def setGridZIndexUndefined: Self = StObject.set(x, "gridZIndex", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabels(value: ColorAxisLabelsOptions): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLineColor(value: ColorType): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarker(value: PointMarkerOptionsObject): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "maxColor", value.asInstanceOf[js.Any])
    
    inline def setMaxColorUndefined: Self = StObject.set(x, "maxColor", js.undefined)
    
    inline def setMaxPadding(value: Double): Self = StObject.set(x, "maxPadding", value.asInstanceOf[js.Any])
    
    inline def setMaxPaddingUndefined: Self = StObject.set(x, "maxPadding", js.undefined)
    
    inline def setMaxRange(value: Double): Self = StObject.set(x, "maxRange", value.asInstanceOf[js.Any])
    
    inline def setMaxRangeUndefined: Self = StObject.set(x, "maxRange", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "minColor", value.asInstanceOf[js.Any])
    
    inline def setMinColorUndefined: Self = StObject.set(x, "minColor", js.undefined)
    
    inline def setMinPadding(value: Double): Self = StObject.set(x, "minPadding", value.asInstanceOf[js.Any])
    
    inline def setMinPaddingUndefined: Self = StObject.set(x, "minPadding", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinorGridLineColor(value: ColorType): Self = StObject.set(x, "minorGridLineColor", value.asInstanceOf[js.Any])
    
    inline def setMinorGridLineColorUndefined: Self = StObject.set(x, "minorGridLineColor", js.undefined)
    
    inline def setMinorGridLineDashStyle(value: DashStyleValue): Self = StObject.set(x, "minorGridLineDashStyle", value.asInstanceOf[js.Any])
    
    inline def setMinorGridLineDashStyleUndefined: Self = StObject.set(x, "minorGridLineDashStyle", js.undefined)
    
    inline def setMinorGridLineWidth(value: Double): Self = StObject.set(x, "minorGridLineWidth", value.asInstanceOf[js.Any])
    
    inline def setMinorGridLineWidthUndefined: Self = StObject.set(x, "minorGridLineWidth", js.undefined)
    
    inline def setMinorTickColor(value: ColorType): Self = StObject.set(x, "minorTickColor", value.asInstanceOf[js.Any])
    
    inline def setMinorTickColorUndefined: Self = StObject.set(x, "minorTickColor", js.undefined)
    
    inline def setMinorTickInterval(value: Double | String): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTickIntervalNull: Self = StObject.set(x, "minorTickInterval", null)
    
    inline def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    inline def setMinorTickLength(value: Double): Self = StObject.set(x, "minorTickLength", value.asInstanceOf[js.Any])
    
    inline def setMinorTickLengthUndefined: Self = StObject.set(x, "minorTickLength", js.undefined)
    
    inline def setMinorTickPosition(value: OptionsMinorTickPositionValue): Self = StObject.set(x, "minorTickPosition", value.asInstanceOf[js.Any])
    
    inline def setMinorTickPositionUndefined: Self = StObject.set(x, "minorTickPosition", js.undefined)
    
    inline def setMinorTickWidth(value: Double): Self = StObject.set(x, "minorTickWidth", value.asInstanceOf[js.Any])
    
    inline def setMinorTickWidthUndefined: Self = StObject.set(x, "minorTickWidth", js.undefined)
    
    inline def setMinorTicks(value: Boolean): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksUndefined: Self = StObject.set(x, "minorTicks", js.undefined)
    
    inline def setOrdinal(value: Boolean): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setOverscroll(value: Double): Self = StObject.set(x, "overscroll", value.asInstanceOf[js.Any])
    
    inline def setOverscrollUndefined: Self = StObject.set(x, "overscroll", js.undefined)
    
    inline def setPanningEnabled(value: Boolean): Self = StObject.set(x, "panningEnabled", value.asInstanceOf[js.Any])
    
    inline def setPanningEnabledUndefined: Self = StObject.set(x, "panningEnabled", js.undefined)
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setShowFirstLabel(value: Boolean): Self = StObject.set(x, "showFirstLabel", value.asInstanceOf[js.Any])
    
    inline def setShowFirstLabelUndefined: Self = StObject.set(x, "showFirstLabel", js.undefined)
    
    inline def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    inline def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    inline def setShowLastLabel(value: Boolean): Self = StObject.set(x, "showLastLabel", value.asInstanceOf[js.Any])
    
    inline def setShowLastLabelUndefined: Self = StObject.set(x, "showLastLabel", js.undefined)
    
    inline def setSoftMax(value: Double): Self = StObject.set(x, "softMax", value.asInstanceOf[js.Any])
    
    inline def setSoftMaxUndefined: Self = StObject.set(x, "softMax", js.undefined)
    
    inline def setSoftMin(value: Double): Self = StObject.set(x, "softMin", value.asInstanceOf[js.Any])
    
    inline def setSoftMinUndefined: Self = StObject.set(x, "softMin", js.undefined)
    
    inline def setStartOfWeek(value: Double): Self = StObject.set(x, "startOfWeek", value.asInstanceOf[js.Any])
    
    inline def setStartOfWeekUndefined: Self = StObject.set(x, "startOfWeek", js.undefined)
    
    inline def setStartOnTick(value: Boolean): Self = StObject.set(x, "startOnTick", value.asInstanceOf[js.Any])
    
    inline def setStartOnTickUndefined: Self = StObject.set(x, "startOnTick", js.undefined)
    
    inline def setStops(value: js.Array[js.Tuple2[Double, ColorString]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: (js.Tuple2[Double, ColorString])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setTickAmount(value: Double): Self = StObject.set(x, "tickAmount", value.asInstanceOf[js.Any])
    
    inline def setTickAmountUndefined: Self = StObject.set(x, "tickAmount", js.undefined)
    
    inline def setTickColor(value: ColorType): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
    
    inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
    
    inline def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    
    inline def setTickLengthUndefined: Self = StObject.set(x, "tickLength", js.undefined)
    
    inline def setTickPixelInterval(value: Double): Self = StObject.set(x, "tickPixelInterval", value.asInstanceOf[js.Any])
    
    inline def setTickPixelIntervalUndefined: Self = StObject.set(x, "tickPixelInterval", js.undefined)
    
    inline def setTickPosition(value: OptionsTickPositionValue): Self = StObject.set(x, "tickPosition", value.asInstanceOf[js.Any])
    
    inline def setTickPositionUndefined: Self = StObject.set(x, "tickPosition", js.undefined)
    
    inline def setTickPositioner(value: AxisTickPositionerCallbackFunction): Self = StObject.set(x, "tickPositioner", value.asInstanceOf[js.Any])
    
    inline def setTickPositionerUndefined: Self = StObject.set(x, "tickPositioner", js.undefined)
    
    inline def setTickPositions(value: js.Array[Double]): Self = StObject.set(x, "tickPositions", value.asInstanceOf[js.Any])
    
    inline def setTickPositionsUndefined: Self = StObject.set(x, "tickPositions", js.undefined)
    
    inline def setTickPositionsVarargs(value: Double*): Self = StObject.set(x, "tickPositions", js.Array(value*))
    
    inline def setTickWidth(value: Double): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
    
    inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
    
    inline def setTickmarkPlacement(value: OptionsTickmarkPlacementValue): Self = StObject.set(x, "tickmarkPlacement", value.asInstanceOf[js.Any])
    
    inline def setTickmarkPlacementUndefined: Self = StObject.set(x, "tickmarkPlacement", js.undefined)
    
    inline def setType(value: ColorAxisTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniqueNames(value: Boolean): Self = StObject.set(x, "uniqueNames", value.asInstanceOf[js.Any])
    
    inline def setUniqueNamesUndefined: Self = StObject.set(x, "uniqueNames", js.undefined)
    
    inline def setUnits(value: js.Array[js.Tuple2[String, js.Array[Double] | Null]]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUnitsVarargs(value: (js.Tuple2[String, js.Array[Double] | Null])*): Self = StObject.set(x, "units", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
