package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisOptions extends AxisOptions {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for an
    * axis. Requires the accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | XAxisAccessibilityOptions] = js.undefined
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
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow decimals in
    * this axis' ticks. When counting integers, like persons or hits on a web
    * page, decimals should be avoided in the labels.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When using an alternate grid
    * color, a band is painted across the plot area between every other grid
    * line.
    */
  var alternateGridColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
    * sections defined will be left out and all the points shifted closer to
    * each other.
    */
  var breaks: js.UndefOr[js.Array[XAxisBreaksOptions]] = js.undefined
  /**
    * (Highcharts, Gantt) If categories are present for the xAxis, names are
    * used instead of numbers for that axis. Since Highcharts 3.0, categories
    * can also be extracted by giving each point a name and setting axis type
    * to `category`. However, if you have multiple series, best practice
    * remains defining the `categories` array.
    *
    * Example:
    *
    *  (see online documentation for example)
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The highest allowed value for
    * automatically computed axis extremes.
    */
  var ceiling: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A class name that opens for
    * styling the axis by CSS, especially in Highcharts styled mode. The class
    * name is applied to group elements for the grid, axis elements and labels.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Configure a crosshair that
    * follows either the mouse pointer or the hovered point.
    *
    * In styled mode, the crosshairs are styled in the `.highcharts-crosshair`,
    * `.highcharts-crosshair-thin` or `.highcharts-xaxis-category` classes.
    */
  var crosshair: js.UndefOr[Boolean | XAxisCrosshairOptions] = js.undefined
  /**
    * (Gantt) Show an indicator on the axis for the current date and time. Can
    * be a boolean or a configuration object similar to xAxis.plotLines.
    */
  var currentDateIndicator: js.UndefOr[Boolean | XAxisCurrentDateIndicatorOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
    * automatically adjust to the appropriate unit. This member gives the
    * default string representations used for each unit. For intermediate
    * values, different units may be used, for example the `day` unit can be
    * used on midnight and `hour` unit be used for intermediate values on the
    * same axis. For an overview of the replacement codes, see dateFormat.
    * Defaults to:
    *
    *  (see online documentation for example)
    */
  var dateTimeLabelFormats: js.UndefOr[XAxisDateTimeLabelFormatsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to force the axis to end
    * on a tick. Use this option with the `maxPadding` option to control the
    * axis end.
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event handlers for the axis.
    */
  var events: js.UndefOr[XAxisEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
    * computed axis extremes.
    */
  var floor: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
    */
  var grid: js.UndefOr[XAxisGridOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Color of the grid lines
    * extending the ticks across the plot area.
    *
    * In styled mode, the stroke is given in the `.highcharts-grid-line` class.
    */
  var gridLineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The dash or dot style of the
    * grid lines. For possible values, see this demonstration.
    */
  var gridLineDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the grid lines
    * extending the ticks across the plot area.
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
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the axis. This can be
    * used after render time to get a pointer to the axis object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The axis labels show the number
    * or category for each tick.
    */
  var labels: js.UndefOr[XAxisLabelsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the line marking
    * the axis itself.
    *
    * In styled mode, the line stroke is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the line marking
    * the axis itself.
    *
    * In styled mode, the stroke width is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Index of another axis that this axis is
    * linked to. When an axis is linked to a master axis, it will take the same
    * extremes as the master, but as assigned by min or max or by setExtremes.
    * It can be used to show additional info, or to ease reading the chart by
    * duplicating the scales.
    */
  var linkedTo: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If there are multiple axes on
    * the same side of the chart, the pixel margin between the axes. Defaults
    * to 0 on vertical axes, 15 on horizontal axes.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The maximum value of the axis.
    * If `null`, the max value is automatically calculated.
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
    * (Highcharts, Highstock, Highmaps, Gantt) Padding of the max value
    * relative to the length of the axis. A padding of 0.05 will make a 100px
    * axis 5px longer. This is useful when you don't want the highest data
    * value to appear on the edge of the plot area. When the axis' `max` option
    * is set or a max extreme is set using `axis.setExtremes()`, the maxPadding
    * will be ignored.
    */
  var maxPadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) Maximum range which can be set using the navigator's
    * handles. Opposite of xAxis.minRange.
    */
  var maxRange: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The minimum value of the axis.
    * If `null` the min value is automatically calculated.
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
    * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
    * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * This is useful when you don't want the lowest data value to appear on the
    * edge of the plot area. When the axis' `min` option is set or a min
    * extreme is set using `axis.setExtremes()`, the minPadding will be
    * ignored.
    */
  var minPadding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The minimum range to display on
    * this axis. The entire axis will not be allowed to span over a smaller
    * interval than this. For example, for a datetime axis the main unit is
    * milliseconds. If minRange is set to 3600000, you can't zoom in more than
    * to one hour.
    *
    * The default minRange for the x axis is five times the smallest interval
    * between any of the data points.
    *
    * On a logarithmic axis, the unit for the minimum range is the power. So a
    * minRange of 1 means that the axis can be zoomed to 10-100, 100-1000,
    * 1000-10000 etc.
    *
    * Note that the `minPadding`, `maxPadding`, `startOnTick` and `endOnTick`
    * settings also affect how the extremes of the axis are computed.
    */
  var minRange: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The minimum tick interval
    * allowed in axis values. For example on zooming in on an axis with daily
    * data, this can be used to prevent the axis from showing hours. Defaults
    * to the closest distance between two points on the axis.
    */
  var minTickInterval: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Color of the minor, secondary
    * grid lines.
    *
    * In styled mode, the stroke width is given in the
    * `.highcharts-minor-grid-line` class.
    */
  var minorGridLineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The dash or dot style of the
    * minor grid lines. For possible values, see this demonstration.
    */
  var minorGridLineDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Width of the minor, secondary
    * grid lines.
    *
    * In styled mode, the stroke width is given in the `.highcharts-grid-line`
    * class.
    */
  var minorGridLineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Color for the minor tick marks.
    */
  var minorTickColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Specific tick interval in axis
    * units for the minor ticks. On a linear axis, if `"auto"`, the minor tick
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
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel length of the minor
    * tick marks.
    */
  var minorTickLength: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The position of the minor tick
    * marks relative to the axis line. Can be one of `inside` and `outside`.
    */
  var minorTickPosition: js.UndefOr[OptionsMinorTickPositionValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the minor
    * tick mark.
    */
  var minorTickWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable minor ticks.
    * Unless minorTickInterval is set, the tick interval is calculated as a
    * fifth of the `tickInterval`.
    *
    * On a logarithmic axis, minor ticks are laid out based on a best guess,
    * attempting to enter approximately 5 minor ticks between each major tick.
    *
    * Prior to v6.0.0, ticks were unabled in auto layout by setting
    * `minorTickInterval` to `"auto"`.
    */
  var minorTicks: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The distance in pixels from the
    * plot area to the axis line. A positive offset moves the axis with it's
    * line, labels and ticks away from the plot area. This is typically used
    * when two or more axes are displayed on the same side of the plot. With
    * multiple axes the offset is dynamically adjusted to avoid collision, this
    * can be overridden by setting offset explicitly.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to display the axis on
    * the opposite side of the normal. The normal is on the left side for
    * vertical axes and bottom for horizontal, so the opposite sides will be
    * right and top respectively. This is typically used with dual or multiple
    * axes.
    */
  var opposite: js.UndefOr[Boolean] = js.undefined
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
  var plotBands: js.UndefOr[js.Array[XAxisPlotBandsOptions]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An array of lines stretching across the
    * plot area, marking a specific value on one of the axes.
    *
    * In styled mode, the plot lines are styled by the `.highcharts-plot-line`
    * class in addition to the `className` option.
    */
  var plotLines: js.UndefOr[js.Array[XAxisPlotLinesOptions]] = js.undefined
  /**
    * (Highstock) The zoomed range to display when only defining one or none of
    * `min` or `max`. For example, to show the latest month, a range of one
    * month can be set.
    */
  var range: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to reverse the axis so
    * that the highest number is closest to the origin. If the chart is
    * inverted, the x axis is reversed by default.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) This option determines how stacks should be
    * ordered within a group. For example reversed xAxis also reverses stacks,
    * so first series comes last in a group. To keep order like for
    * non-reversed xAxis enable this option.
    */
  var reversedStacks: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) An optional scrollbar to display on the X axis in response to
    * limiting the minimum and maximum of the axis values.
    *
    * In styled mode, all the presentational options for the scrollbar are
    * replaced by the classes `.highcharts-scrollbar-thumb`,
    * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
    * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
    */
  var scrollbar: js.UndefOr[XAxisScrollbarOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the axis line
    * and title when the axis has no data.
    */
  var showEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the first tick
    * label.
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
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to force the axis to
    * start on a tick. Use this option with the `minPadding` option to control
    * the axis start.
    */
  var startOnTick: js.UndefOr[Boolean] = js.undefined
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
    * (Highcharts, Highstock, Highmaps, Gantt) Color for the main tick marks.
    *
    * In styled mode, the stroke is given in the `.highcharts-tick` class.
    */
  var tickColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The interval of the tick marks
    * in axis units. When `undefined`, the tick interval is computed to
    * approximately follow the tickPixelInterval on linear and datetime axes.
    * On categorized axes, a `undefined` tickInterval will default to 1, one
    * category. Note that datetime axes are based on milliseconds, so for
    * example an interval of one day is expressed as `24 * 3600 * 1000`.
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
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel length of the main
    * tick marks.
    */
  var tickLength: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If tickInterval is `null` this
    * option sets the approximate pixel interval of the tick marks. Not
    * applicable to categorized axis.
    *
    * The tick interval is also influenced by the minTickInterval option, that,
    * by default prevents ticks from being denser than the data points.
    */
  var tickPixelInterval: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The position of the major tick
    * marks relative to the axis line. Can be one of `inside` and `outside`.
    */
  var tickPosition: js.UndefOr[OptionsTickPositionValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function returning
    * array defining where the ticks are laid out on the axis. This overrides
    * the default behaviour of tickPixelInterval and tickInterval. The
    * automatic tick positions are accessible through `this.tickPositions` and
    * can be modified by the callback.
    */
  var tickPositioner: js.UndefOr[AxisTickPositionerCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array defining where the
    * ticks are laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the major
    * tick marks. Defaults to 0 on category axes, otherwise 1.
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
    * (Highcharts, Highstock, Highmaps, Gantt) The axis title, showing next to
    * the axis line.
    */
  var title: js.UndefOr[XAxisTitleOptions] = js.undefined
  /**
    * (Highcharts, Gantt) The type of axis. Can be one of `linear`,
    * `logarithmic`, `datetime` or `category`. In a datetime axis, the numbers
    * are given in milliseconds, and tick marks are placed on appropriate
    * values like full hours or days. In a category axis, the point names of
    * the chart's series are used for categories, if not a categories array is
    * defined.
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
    * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
    * what time intervals the ticks are allowed to fall on. Each array item is
    * an array where the first value is the time unit and the second value
    * another array of allowed multiples. Defaults to:
    *
    *  (see online documentation for example)
    */
  var units: js.UndefOr[js.Array[js.Tuple2[String, js.Array[Double] | Null]]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
    * ticks and labels, should be visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to zoom axis. If
    * `chart.zoomType` is set, the option allows to disable zooming on an
    * individual axis.
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.undefined
}

object XAxisOptions {
  @scala.inline
  def apply(
    accessibility: js.Object | XAxisAccessibilityOptions = null,
    alignTicks: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    alternateGridColor: ColorString | GradientColorObject | PatternObject = null,
    breaks: js.Array[XAxisBreaksOptions] = null,
    categories: js.Array[String] = null,
    ceiling: Int | Double = null,
    className: String = null,
    crosshair: Boolean | XAxisCrosshairOptions = null,
    currentDateIndicator: Boolean | XAxisCurrentDateIndicatorOptions = null,
    dateTimeLabelFormats: XAxisDateTimeLabelFormatsOptions = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    events: XAxisEventsOptions = null,
    floor: Int | Double = null,
    grid: XAxisGridOptions = null,
    gridLineColor: ColorString | GradientColorObject | PatternObject = null,
    gridLineDashStyle: DashStyleValue = null,
    gridLineWidth: Int | Double = null,
    gridZIndex: Int | Double = null,
    id: String = null,
    labels: XAxisLabelsOptions = null,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: Int | Double = null,
    linkedTo: Int | Double = null,
    margin: Int | Double = null,
    max: Int | Double = null,
    maxPadding: Int | Double = null,
    maxRange: Int | Double = null,
    min: Int | Double = null,
    minPadding: Int | Double = null,
    minRange: Int | Double = null,
    minTickInterval: Int | Double = null,
    minorGridLineColor: ColorString | GradientColorObject | PatternObject = null,
    minorGridLineDashStyle: DashStyleValue = null,
    minorGridLineWidth: Int | Double = null,
    minorTickColor: ColorString | GradientColorObject | PatternObject = null,
    minorTickInterval: Double | String = null,
    minorTickLength: Int | Double = null,
    minorTickPosition: OptionsMinorTickPositionValue = null,
    minorTickWidth: Int | Double = null,
    minorTicks: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    opposite: js.UndefOr[Boolean] = js.undefined,
    ordinal: js.UndefOr[Boolean] = js.undefined,
    overscroll: Int | Double = null,
    pane: Int | Double = null,
    plotBands: js.Array[XAxisPlotBandsOptions] = null,
    plotLines: js.Array[XAxisPlotLinesOptions] = null,
    range: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    reversedStacks: js.UndefOr[Boolean] = js.undefined,
    scrollbar: XAxisScrollbarOptions = null,
    showEmpty: js.UndefOr[Boolean] = js.undefined,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    showLastLabel: js.UndefOr[Boolean] = js.undefined,
    softMax: Int | Double = null,
    softMin: Int | Double = null,
    startOfWeek: Int | Double = null,
    startOnTick: js.UndefOr[Boolean] = js.undefined,
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
    title: XAxisTitleOptions = null,
    `type`: AxisTypeValue = null,
    uniqueNames: js.UndefOr[Boolean] = js.undefined,
    units: js.Array[js.Tuple2[String, js.Array[Double] | Null]] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined
  ): XAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (alternateGridColor != null) __obj.updateDynamic("alternateGridColor")(alternateGridColor.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (ceiling != null) __obj.updateDynamic("ceiling")(ceiling.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (currentDateIndicator != null) __obj.updateDynamic("currentDateIndicator")(currentDateIndicator.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(floor.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle.asInstanceOf[js.Any])
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (gridZIndex != null) __obj.updateDynamic("gridZIndex")(gridZIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxPadding != null) __obj.updateDynamic("maxPadding")(maxPadding.asInstanceOf[js.Any])
    if (maxRange != null) __obj.updateDynamic("maxRange")(maxRange.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minPadding != null) __obj.updateDynamic("minPadding")(minPadding.asInstanceOf[js.Any])
    if (minRange != null) __obj.updateDynamic("minRange")(minRange.asInstanceOf[js.Any])
    if (minTickInterval != null) __obj.updateDynamic("minTickInterval")(minTickInterval.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor.asInstanceOf[js.Any])
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle.asInstanceOf[js.Any])
    if (minorGridLineWidth != null) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (minorTickLength != null) __obj.updateDynamic("minorTickLength")(minorTickLength.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition.asInstanceOf[js.Any])
    if (minorTickWidth != null) __obj.updateDynamic("minorTickWidth")(minorTickWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite.asInstanceOf[js.Any])
    if (!js.isUndefined(ordinal)) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (overscroll != null) __obj.updateDynamic("overscroll")(overscroll.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (plotLines != null) __obj.updateDynamic("plotLines")(plotLines.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedStacks)) __obj.updateDynamic("reversedStacks")(reversedStacks.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmpty)) __obj.updateDynamic("showEmpty")(showEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel.asInstanceOf[js.Any])
    if (softMax != null) __obj.updateDynamic("softMax")(softMax.asInstanceOf[js.Any])
    if (softMin != null) __obj.updateDynamic("softMin")(softMin.asInstanceOf[js.Any])
    if (startOfWeek != null) __obj.updateDynamic("startOfWeek")(startOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick.asInstanceOf[js.Any])
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
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNames)) __obj.updateDynamic("uniqueNames")(uniqueNames.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisOptions]
  }
}

