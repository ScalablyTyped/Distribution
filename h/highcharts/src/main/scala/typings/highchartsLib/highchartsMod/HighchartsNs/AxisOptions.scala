package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisOptions extends js.Object {
  /**
    * Whether to allow decimals in this axis' ticks. When counting integers,
    * like persons or hits on a web page, decimals must be avoided in the axis
    * tick labels.
    * @default true
    * @since 2.0
    */
  var allowDecimals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When using an alternate grid color, a band is painted across the plot
    * area between every other grid line.
    */
  var alternateGridColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to
    * each other. Requires that the broken-axis.js module is loaded.
    * @since 4.1.0
    */
  var breaks: js.UndefOr[js.Array[AxisBreak]] = js.undefined
  /**
    * If categories are present for the xAxis, names are used instead of numbers for that axis. Since Highcharts 3.0,
    * categories can also be extracted by giving each point a name and setting axis type to category. However, if you
    * have multiple series, best practice remains defining the categories array.
    * Example:
    * categories: ['Apples', 'Bananas', 'Oranges']
    * @default null
    */
  var categories: js.UndefOr[js.Array[_] | scala.Null] = js.undefined
  /**
    * The highest allowed value for automatically computed axis extremes.
    * @since 4.0
    */
  var ceiling: js.UndefOr[scala.Double] = js.undefined
  /**
    * A class name that opens for styling the axis by CSS, especially in Highcharts styled mode. The class name is applied to group elements for the grid, axis elements and labels.
    * @since 5.0.0
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Configure a crosshair that follows either the mouse pointer or the hovered point.
    */
  var crosshair: js.UndefOr[CrosshairObject | scala.Boolean] = js.undefined
  /**
    * For a datetime axis, the scale will automatically adjust to the appropriate unit. This member gives the default
    * string representations used for each unit. For an overview of the replacement codes, see dateFormat.
    */
  var dateTimeLabelFormats: js.UndefOr[DateTimeFormats] = js.undefined
  /**
    * Description of the axis to screen reader users.
    * @since 5.0.0
    * @default undefined
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to force the axis to end on a tick. Use this option with the maxPadding option to control the axis end.
    * @default false
    */
  var endOnTick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Event handlers for the axis
    */
  var events: js.UndefOr[highchartsLib.Anon_AfterBreaks] = js.undefined
  /**
    * The lowest allowed value for automatically computed axis extremes.
    * @default null
    * @since 4.0
    */
  var floor: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Color of the grid lines extending the ticks across the plot area.
    * @defaults to '#D8D8D8'.
    */
  var gridLineColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The dash or dot style of the grid lines. For possible values,
    * see {@http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/|this demonstration}.
    * Defaults to Solid.
    * @since 1.2
    */
  var gridLineDashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the grid lines extending the ticks across the plot area.
    * @default 0
    */
  var gridLineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The Z index of the grid lines.
    * @default 1
    */
  var gridZIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * An id for the axis. This can be used after render time to get a pointer to the axis object through chart.get().
    * @since 1.2.0
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The axis labels show the number or category for each tick.
    */
  var labels: js.UndefOr[AxisLabels] = js.undefined
  /**
    * The color of the line marking the axis itself.
    * @default '#C0D0E0'.
    */
  var lineColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The width of the line marking the axis itself.
    * @default 1
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same
    * extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info,
    * or to ease reading the chart by duplicating the scales.
    * @since 2.0.2
    */
  var linkedTo: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum value of the axis. If null, the max value is automatically calculated. If the endOnTick option is
    * true, the max value might be rounded up. The actual maximum value is also influenced by chart.alignTicks.
    */
  var max: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis'
    * max option is set or a max extreme is set using axis.setExtremes(), the maxPadding will be ignored.
    * @default 0.01
    * @since 1.2.0
    */
  var maxPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Renamed to minRange as of Highcharts 2.2.
    * @deprecated
    */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum value of the axis. If null the min value is automatically calculated. If the startOnTick option is
    * true, the min value might be rounded down.
    */
  var min: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis'
    * min option is set or a min extreme is set using axis.setExtremes(), the minPadding will be ignored.
    * @default 0.01
    * @since 1.2.0
    */
  var minPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval
    * than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you
    * can't zoom in more than to one hour.
    *
    * The default minRange for the x axis is five times the smallest interval between any of the data points.
    *
    * On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 1 means that the axis can be
    * zoomed to 10-100, 100-1000, 1000-10000 etc.
    *
    * Note that the minPadding, maxPadding, startOnTick and endOnTick settings also affect how the extremes of the axis
    * are computed.
    */
  var minRange: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can
    * be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    * @since 2.3.0
    */
  var minTickInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Color of the minor, secondary grid lines.
    * @default '#E0E0E0'
    */
  var minorGridLineColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The dash or dot style of the minor grid lines. For possible values,
    * see {@link http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/|this demonstration}.
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
    * @default to '#A0A0A0'
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
    *
    * On axes using categories, minor ticks are not supported.
    */
  var minorTickInterval: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  /**
    * The pixel length of the minor tick marks.
    * @default 2
    */
  var minorTickLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The position of the minor tick marks relative to the axis line. Can be one of 'inside' and 'outside'.
    * @default 'outside'
    */
  var minorTickPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pixel width of the minor tick mark.
    * @default 0
    */
  var minorTickWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line,
    * labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same
    * side of the plot.
    * @default 0
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes
    * and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with
    * dual or multiple axes.
    * @default false
    */
  var opposite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of colored bands stretching across the plot area marking an interval on the axis.
    *
    * In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.
    */
  var plotBands: js.UndefOr[js.Array[PlotBands]] = js.undefined
  /**
    * An array of lines stretching across the plot area, marking a specific value on one of the axes.
    */
  var plotLines: js.UndefOr[js.Array[PlotLines]] = js.undefined
  /**
    * Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x
    * axis is reversed by default.
    * @default false
    */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the first series in a stack will be drawn on top in a positive, non-reversed Y axis. If false, the first series is in the base of the stack.
    * Only used for yAxis
    * @default true
    * @since 3.0.10
    */
  var reversedStacks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the axis line and title when the axis has no data.
    * @default true
    * @since 1.1
    */
  var showEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the first tick label.
    * @default true
    */
  var showFirstLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the last tick label.
    * @default true
    */
  var showLastLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A soft maximum for the axis. If the series data maximum is less than this, the axis will stay at this maximum,
    * but if the series data maximum is higher, the axis will flex to show all data.
    * @since 5.0.1
    */
  var softMax: js.UndefOr[scala.Double] = js.undefined
  /**
    * A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum,
    * but if the series data minimum is lower, the axis will flex to show all data.
    * @since 5.0.1
    */
  var softMin: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show the total value for each bar in a stacked column or bar chart.
    * The label will be placed on top of positive columns and below negative columns.
    * In case of an inverted column chart or a bar chart the label is placed to the right of positive bars and to the left of negative bars.
    * Only used for yAxis
    */
  var stackLabels: js.UndefOr[highchartsLib.Anon_AlignEnabled] = js.undefined
  /**
    * For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
    * @default 1
    */
  var startOfWeek: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to force the axis to start on a tick. Use this option with the minPadding option to control the axis
    * start.
    * @default false
    * @since 1.2.0
    */
  var startOnTick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Solid gauge series only. Color stops for the solid gauge.
    * Use this in cases where a linear gradient between a minColor and maxColor is not sufficient.
    * The stops is an array of tuples, where the first item is a float between 0 and 1 assigning the relative position in the gradient, and the second item is the color.
    */
  var stops: js.UndefOr[js.Array[js.Array[scala.Double | java.lang.String]]] = js.undefined
  /**
    * The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within
    * a chart. This option overrides the tickPixelInterval option.
    *
    * This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected.
    */
  var tickAmount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Color for the main tick marks.
    * @default '#C0D0E0'
    */
  var tickColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The interval of the tick marks in axis units. When null, the tick interval is computed to approximately follow
    * the tickPixelInterval on linear and datetime axes. On categorized axes, a null tickInterval will default to 1,
    * one category. Note that datetime axes are based on milliseconds, so for example an interval of one day is
    * expressed as 24 * 3600 * 1000.
    *
    * On logarithmic axes, the tickInterval is based on powers, so a tickInterval of 1 means one tick on each of 0.1,
    * 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of 0.2 puts a tick on 0.1,
    * 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc.
    *
    * If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks.
    */
  var tickInterval: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The pixel length of the main tick marks.
    * @default 10
    */
  var tickLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * If tickInterval is null this option sets the approximate pixel interval of the tick marks. Not applicable to
    * categorized axis.
    *
    * @default 72 for the Y axis, 100 for the X axis.
    */
  var tickPixelInterval: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The position of the major tick marks relative to the axis line. Can be one of 'inside' and 'outside'.
    * @default 'outside'
    */
  var tickPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback function returning array defining where the ticks are laid out on the axis. This overrides the default
    * behaviour of tickPixelInterval and tickInterval. The automatic tick positions are accessible through
    * this.tickPositions and can be modified by the callback.
    */
  var tickPositioner: js.UndefOr[js.Function2[/* min */ scala.Double, /* max */ scala.Double, scala.Unit]] = js.undefined
  /**
    * An array defining where the ticks are laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The pixel width of the major tick marks.
    * @default 1
    */
  var tickWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * For categorized axes only. If 'on' the tick mark is placed in the center of the category, if 'between' the tick
    * mark is placed between categories. The default is 'between' if the tickInterval is 1, else 'on'.
    * @default null
    */
  var tickmarkPlacement: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The axis title, showing next to the axis line. To disable the title, set the text to null.
    */
  var title: js.UndefOr[AxisTitle | scala.Null] = js.undefined
  /**
    * The type of axis. Can be one of 'linear', 'logarithmic', 'datetime' or 'category'. In a datetime axis, the
    * numbers are given in milliseconds, and tick marks are placed on appropriate values like full hours or days. In a
    * category axis, the point names of the chart's series are used for categories, if not a categories array is
    * defined.
    * @default 'linear'
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is
    * an array where the first value is the time unit and the second value another array of allowed multiples.
    */
  var units: js.UndefOr[js.Array[js.Tuple2[java.lang.String, js.Array[scala.Double]]]] = js.undefined
  /**
    * Whether axis, including axis title, line, ticks and labels, should be visible.
    * @default true
    * @since 4.1.9
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

