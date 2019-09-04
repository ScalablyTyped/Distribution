package typings.highcharts.highchartsMod

import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for a series. Requires the
    * accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | PlotPackedbubbleAccessibilityOptions] = js.undefined
  /**
    * (Highmaps) Whether all areas of the map defined in `mapData` should be
    * rendered. If `true`, areas which don't correspond to a data point, are
    * rendered as `null` points. If `false`, those areas are skipped.
    */
  var allAreas: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Allow this series' points to be selected by clicking on the
    * graphic (columns, point markers, pie slices, map areas etc).
    *
    * The selected points can be handled by point select and unselect events,
    * or collectively by the getSelectedPoints function.
    *
    * And alternative way of selecting points is through dragging.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Enable or disable the initial animation when a series is
    * displayed. The animation can also be set as a configuration object.
    * Please note that this option only applies to the initial animation of the
    * series itself. For other animations, see chart.animation and the
    * animation parameter under the API methods. The following properties are
    * supported:
    *
    * - `duration`: The duration of the animation in milliseconds.
    *
    * - `easing`: Can be a string reference to an easing function set on the
    * `Math` object or a function. See the _Custom easing function_ demo below.
    *
    * Due to poor performance, animation is disabled in old IE browsers for
    * several chart types.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotPackedbubbleAnimationOptions] = js.undefined
  /**
    * (Highcharts) If there are more points in the series than the
    * `animationLimit`, the animation won't run. Animation affects overall
    * performance and doesn't work well with heavy data series.
    */
  var animationLimit: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Sets the color blending in the boost module.
    */
  var boostBlending: js.UndefOr[OptionsBoostBlendingValue] = js.undefined
  /**
    * (Highcharts) Set the point threshold for when a series should enter boost
    * mode.
    *
    * Setting it to e.g. 2000 will cause the series to enter boost mode when
    * there are 2000 or more points in the series.
    *
    * To disable boosting on the series, set the `boostThreshold` to 0. Setting
    * it to 1 will force boosting.
    *
    * Note that the cropThreshold also affects this setting. When zooming in on
    * a series that has fewer points than the `cropThreshold`, all points are
    * rendered although outside the visible plot area, and the `boostThreshold`
    * won't take effect.
    *
    * Requires `modules/boost.js`.
    */
  var boostThreshold: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The border color of the map areas.
    *
    * In styled mode, the border stroke is given in the `.highcharts-point`
    * class.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) The border width of each map area.
    *
    * In styled mode, the border stroke width is given in the
    * `.highcharts-point` class.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Disable this option to allow series rendering in the whole
    * plotting area.
    *
    * **Note:** Clipping should be always enabled when chart.zoomType is set
    */
  var clip: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The main color of the series. In line type series it applies
    * to the line and the point markers unless otherwise specified. In bar type
    * series it applies to the bars unless a color is specified per point. The
    * default value is pulled from the `options.colors` array.
    *
    * In styled mode, the color can be defined by the colorIndex option. Also,
    * the series color can be set with the `.highcharts-series`,
    * `.highcharts-color-{n}`, `.highcharts-{type}-series` or
    * `.highcharts-series-{n}` class, or individual classes given by the
    * `className` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
    * this number defines which colorAxis the particular series is connected
    * to. It refers to either the axis id or the index of the axis in the
    * colorAxis array, with 0 being the first. Set this option to false to
    * prevent a series from connecting to the default color axis.
    *
    * Since v7.2.0 the option can also be an axis id or an axis index instead
    * of a boolean flag.
    */
  var colorAxis: js.UndefOr[Boolean | Double | String] = js.undefined
  /**
    * (Highcharts) Styled mode only. A specific color index to use for the
    * series, so its graphic representations are given the class name
    * `highcharts-color-{n}`.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Determines what data value should be
    * used to calculate point color if `colorAxis` is used. Requires to set
    * `min` and `max` if some custom point property is used or if approximation
    * for data grouping is set to `'sum'`.
    */
  var colorKey: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Compare the values of the series against the first non-null,
    * non- zero value in the visible range. The y axis will show percentage or
    * absolute change depending on whether `compare` is set to `"percent"` or
    * `"value"`. When this is applied to multiple series, it allows comparing
    * the development of the series against each other. Adds a `change` field
    * to every point object.
    */
  var compare: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) When compare is `percent`, this option dictates whether to
    * use 0 or 100 as the base of comparison.
    */
  var compareBase: js.UndefOr[`0` | `100`] = js.undefined
  /**
    * (Highstock) Defines if comparison should start from the first point
    * within the visible range or should start from the first point (see online
    * documentation for example) the range. In other words, this flag
    * determines if first point within the visible range will have 0%
    * (`compareStart=true`) or should have been already calculated according to
    * the previous point (`compareStart=false`).
    */
  var compareStart: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Override Pathfinder connector options for a series. Requires
    * Highcharts Gantt to be loaded.
    */
  var connectors: js.UndefOr[PlotPackedbubbleConnectorsOptions] = js.undefined
  /**
    * (Highcharts, Highstock) When the series contains less points than the
    * crop threshold, all points are drawn, even if the points fall outside the
    * visible plot area at the current zoom. The advantage of drawing all
    * points (including markers and columns), is that animation is performed on
    * updates. On the other hand, when the series contains more points than the
    * crop threshold, the series data is cropped to only contain points that
    * fall within the plot area. The advantage of cropping away invisible
    * points is to increase performance on large series.
    */
  var cropThreshold: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) You can set the cursor to "pointer" if you have click events
    * attached to the series, to signal to the user that the points and lines
    * can be clicked.
    *
    * In styled mode, the series cursor can be set with the same classes as
    * listed under series.color.
    */
  var cursor: js.UndefOr[String | CursorValue] = js.undefined
  /**
    * (Highcharts) A name for the dash style to use for the graph, or for some
    * series types the outline of each shape.
    *
    * In styled mode, the stroke dash-array can be set with the same classes as
    * listed under series.color.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highstock) Data grouping is the concept of sampling the data values into
    * larger blocks in order to ease readability and increase performance of
    * the JavaScript charts. Highstock by default applies data grouping when
    * the points become closer than a certain pixel value, determined by the
    * `groupPixelWidth` option.
    *
    * If data grouping is applied, the grouping information of grouped points
    * can be read from the Point.dataGroup. If point options other than the
    * data itself are set, for example `name` or `color` or custom properties,
    * the grouping logic doesn't know how to group it. In this case the options
    * of the first point instance are copied over to the group point. This can
    * be altered through a custom `approximation` callback function.
    */
  var dataGrouping: js.UndefOr[PlotPackedbubbleDataGroupingOptions] = js.undefined
  /**
    * (Highcharts) Options for the series data labels, appearing next to each
    * data point.
    *
    * Since v6.2.0, multiple data labels can be applied to each single point by
    * defining them as an array of configs.
    *
    * In styled mode, the data labels can be styled with the
    * `.highcharts-data-label-box` and `.highcharts-data-label` class names
    * (see example).
    */
  var dataLabels: js.UndefOr[
    SeriesPackedBubbleDataLabelsOptionsObject | js.Array[SeriesPackedBubbleDataLabelsOptionsObject]
  ] = js.undefined
  /**
    * (Highcharts) Requires the Accessibility module.
    *
    * A description of the series to add to the screen reader information about
    * the series.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Whether to display negative sized bubbles. The threshold is
    * given by the zThreshold option, and negative bubbles can be visualized by
    * setting negativeColor.
    */
  var displayNegative: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Flag to determine if nodes are draggable or not. Available
    * for graph with useSimulation set to true only.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Enable or disable the mouse tracking for a specific series.
    * This includes point tooltips and click events on graphs and points. For
    * large datasets it improves performance.
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) General event handlers for the series items. These event
    * hooks can also be attached to the series at run time using the
    * `Highcharts.addEvent` function.
    */
  var events: js.UndefOr[PlotPackedbubbleEventsOptions] = js.undefined
  /**
    * (Highcharts) Determines whether the series should look for the nearest
    * point in both dimensions or just the x-dimension when hovering the
    * series. Defaults to `'xy'` for scatter series and `'x'` for most other
    * series. If the data has duplicate x-values, it is recommended to set this
    * to `'xy'` to allow hovering over all points.
    *
    * Applies only to series types using nearest neighbor search (not direct
    * hover) for tooltip.
    */
  var findNearestPointBy: js.UndefOr[OptionsFindNearestPointByValue] = js.undefined
  /**
    * (Highstock) Defines when to display a gap in the graph, together with the
    * gapUnit option.
    *
    * In case when `dataGrouping` is enabled, points can be grouped into a
    * larger time span. This can make the grouped points to have a greater
    * distance than the absolute value of `gapSize` property, which will result
    * in disappearing graph completely. To prevent this situation the mentioned
    * distance between grouped points is used instead of previously defined
    * `gapSize`.
    *
    * In practice, this option is most often used to visualize gaps in time
    * series. In a stock chart, intraday data is available for daytime hours,
    * while gaps will appear in nights and weekends.
    */
  var gapSize: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Together with gapSize, this option defines where to draw gaps
    * in the graph.
    *
    * When the `gapUnit` is `relative` (default), a gap size of 5 means that if
    * the distance between two points is greater than five times that of the
    * two closest points, the graph will be broken.
    *
    * When the `gapUnit` is `value`, the gap is based on absolute axis values,
    * which on a datetime axis is milliseconds. This also applies to the
    * navigator series that inherits gap options from the base series.
    */
  var gapUnit: js.UndefOr[OptionsGapUnitValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
    * chart width or only the zoomed area when zooming in on parts of the X
    * axis. By default, the Y axis adjusts to the min and max of the visible
    * data. Cartesian series only.
    */
  var getExtremesFromAll: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Export-data module required. When set to `false` will
    * prevent the series data from being included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) What property to join the `mapData` to the value data. For
    * example, if joinBy is "code", the mapData items with a specific code is
    * merged into the data with the same code. For maps loaded from GeoJSON,
    * the keys may be held in each point's `properties` object.
    *
    * The joinBy option can also be an array of two values, where the first
    * points to a key in the `mapData`, and the second points to another key in
    * the `data`.
    *
    * When joinBy is `null`, the map items are joined by their position in the
    * array, which performs much better in maps with many data points. This is
    * the recommended option if you are printing more than a thousand data
    * points and have a backend that can preprocess the data into a parallel
    * array of the mapData.
    */
  var joinBy: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
    * series as possible in a natural way, seeking to avoid other series. The
    * goal of this feature is to make the chart more easily readable, like if a
    * human designer placed the labels in the optimal position.
    *
    * The series labels currently work with series types having a `graph` or an
    * `area`.
    *
    * Requires the `series-label.js` module.
    */
  var label: js.UndefOr[PlotPackedbubbleLabelOptions] = js.undefined
  /**
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[PlotPackedbubbleLastPriceOptions] = js.undefined
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[PlotPackedbubbleLastVisiblePriceOptions] = js.undefined
  /**
    * (Highcharts) Options for layout algorithm when simulation is enabled.
    * Inside there are options to change the speed, padding, initial bubbles
    * positions and more.
    */
  var layoutAlgorithm: js.UndefOr[PlotPackedbubbleLayoutAlgorithmOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The width of the line connecting the data points.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The SVG value used for the `stroke-linecap` and
    * `stroke-linejoin` of a line graph. Round means that lines are rounded in
    * the ends and bends.
    */
  var linecap: js.UndefOr[SeriesLinecapValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The id of another series to link to.
    * Additionally, the value can be ":previous" to link to the previous
    * series. When two series are linked, only the first one appears in the
    * legend. Toggling the visibility of this also toggles the linked series.
    */
  var linkedTo: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Options for the point markers of line-like series.
    * Properties like `fillColor`, `lineColor` and `lineWidth` define the
    * visual appearance of the markers. Other series types, like column series,
    * don't have markers, but have visual options on the series level instead.
    *
    * In styled mode, the markers can be styled with the `.highcharts-point`,
    * `.highcharts-point-hover` and `.highcharts-point-select` class names.
    */
  var marker: js.UndefOr[PlotPackedbubbleMarkerOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Maximum bubble size. Bubbles will automatically
    * size between the `minSize` and `maxSize` to reflect the value of each
    * bubble. Can be either pixels (when no unit is given), or a percentage of
    * the smallest one of the plot width and height, divided by the square root
    * of total number of points.
    */
  var maxSize: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock) Minimum bubble size. Bubbles will automatically
    * size between the `minSize` and `maxSize` to reflect the value of each
    * bubble. Can be either pixels (when no unit is given), or a percentage of
    * the smallest one of the plot width and height, divided by the square root
    * of total number of points.
    */
  var minSize: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highstock) Options for the corresponding navigator series if
    * `showInNavigator` is `true` for this series. Available options are the
    * same as any series, documented at plotOptions and series.
    *
    * These options are merged with options in navigator.series, and will take
    * precedence if the same option is defined both places.
    */
  var navigatorOptions: js.UndefOr[PlotSeriesOptions] = js.undefined
  /**
    * (Highcharts) When a point's Z value is below the zThreshold setting, this
    * color is used.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotPackedbubblePointOptions] = js.undefined
  /**
    * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) If no x values are given for the points in
    * a series, `pointInterval` defines the interval of the x values. For
    * example, if a series contains one value every decade starting from year
    * 0, set `pointInterval` to `10`. In true `datetime` axes, the
    * `pointInterval` is set in milliseconds.
    *
    * It can be also be combined with `pointIntervalUnit` to draw irregular
    * time intervals.
    *
    * Please note that this options applies to the _series data_, not the
    * interval of the axis ticks, which is independent.
    */
  var pointInterval: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) On datetime series, this allows for
    * setting the pointInterval to irregular time units, `day`, `month` and
    * `year`. A day is usually the same as 24 hours, but `pointIntervalUnit`
    * also takes the DST crossover into consideration when dealing with local
    * time. Combine this option with `pointInterval` to draw weeks, quarters, 6
    * months, 10 years etc.
    *
    * Please note that this options applies to the _series data_, not the
    * interval of the axis ticks, which is independent.
    */
  var pointIntervalUnit: js.UndefOr[OptionsPointIntervalUnitValue] = js.undefined
  /**
    * (Highstock) The width of each point on the x axis. For example in a
    * column chart with one value each day, the pointRange would be 1 day (= 24
    * * 3600
    *
    * * 1000 milliseconds). This is normally computed automatically, but this
    * option can be used to override the automatic value.
    */
  var pointRange: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) If no x values are given for the points in
    * a series, pointStart defines on what value to start. For example, if a
    * series contains one yearly value starting from 1945, set pointStart to
    * 1945.
    */
  var pointStart: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) If true, a checkbox is displayed next to the legend item to
    * allow selecting the series. The state of the checkbox is determined by
    * the `selected` option.
    */
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether to display this particular series or series type in
    * the legend. Standalone series are shown in legend by default, and linked
    * series are not. Since v7.2.0 it is possible to show series that use
    * colorAxis by setting this option to `true`.
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Whether or not to show the series in the navigator. Takes
    * precedence over navigator.baseSeries if defined.
    */
  var showInNavigator: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether the bubble's value should be represented by the area
    * or the width of the bubble. The default, `area`, corresponds best to the
    * human perception of the size of each bubble.
    */
  var sizeBy: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) When this is true, the series will not cause the Y axis to
    * cross the zero plane (or threshold option) unless the data actually
    * crosses the plane.
    *
    * For example, if `softThreshold` is `false`, a series of 0, 1, 2, 3 will
    * make the Y axis show negative values according to the `minPadding`
    * option. If `softThreshold` is `true`, the Y axis starts at 0.
    */
  var softThreshold: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Whether to stack the values of each series on top
    * of each other. Possible values are `undefined` to disable, `"normal"` to
    * stack by value or `"percent"`. When stacking is enabled, data must be
    * sorted in ascending X order. A special stacking option is with the
    * streamgraph series type, where the stacking option is set to `"stream"`.
    * The second one is `"overlap"`, which only applies to waterfall series.
    */
  var stacking: js.UndefOr[OptionsStackingValue] = js.undefined
  var states: js.UndefOr[PlotPackedbubbleStatesOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
    * `mouseOut` event on a series isn't triggered until the mouse moves over
    * another series, or out of the plot area. When false, the `mouseOut` event
    * on a series is triggered when the mouse leaves the area around the
    * series' graph or markers. This also implies the tooltip. When
    * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
    * be hidden when moving the mouse between series.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The threshold, also called zero level or base
    * level. For line type series this is only used in conjunction with
    * negativeColor.
    */
  var threshold: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) A configuration object for the tooltip rendering
    * of each single series. Properties are inherited from tooltip. Overridable
    * properties are `headerFormat`, `pointFormat`, `yDecimals`, `xDateFormat`,
    * `yPrefix` and `ySuffix`. Unlike other series, in a scatter plot the
    * series.name by default shows in the headerFormat and point.x and point.y
    * in the pointFormat.
    */
  var tooltip: js.UndefOr[PlotPackedbubbleTooltipOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) When a series contains a data array that
    * is longer than this, only one dimensional arrays of numbers, or two
    * dimensional arrays with x and y values are allowed. Also, only the first
    * point is tested, and the rest are assumed to be the same format. This
    * saves expensive data checking and indexing in long series. Set it to `0`
    * disable.
    */
  var turboThreshold: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) An option is giving a possibility to choose between using
    * simulation for calculating bubble positions. These reflects in both
    * animation and final position of bubbles. Simulation is also adding
    * options to the series graph based on used layout. In case of big data
    * sets, with any performance issues, it is possible to disable animation
    * and pack bubble in a simple circular way.
    */
  var useSimulation: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Set the initial visibility of the series.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Define the z index of the series.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) When displayNegative is `false`, bubbles with lower Z values
    * are skipped. When `displayNegative` is `true` and a negativeColor is
    * given, points with lower Z is colored.
    */
  var zThreshold: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
    */
  var zoneAxis: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) An array defining zones within a series. Zones
    * can be applied to the X axis, Y axis or Z axis for bubbles, according to
    * the `zoneAxis` option. The zone definitions have to be in ascending order
    * regarding to the value.
    *
    * In styled mode, the color zones are styled with the
    * `.highcharts-zone-{n}` class, or custom classed from the `className`
    * option (view live demo).
    */
  var zones: js.UndefOr[js.Array[PlotPackedbubbleZonesOptions]] = js.undefined
}

object PlotPackedbubbleOptions {
  @scala.inline
  def apply(
    accessibility: js.Object | PlotPackedbubbleAccessibilityOptions = null,
    allAreas: js.UndefOr[Boolean] = js.undefined,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject | PlotPackedbubbleAnimationOptions = null,
    animationLimit: Int | Double = null,
    boostBlending: OptionsBoostBlendingValue = null,
    boostThreshold: Int | Double = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: Int | Double = null,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorAxis: Boolean | Double | String = null,
    colorIndex: Int | Double = null,
    colorKey: String = null,
    compare: String = null,
    compareBase: `0` | `100` = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: PlotPackedbubbleConnectorsOptions = null,
    cropThreshold: Int | Double = null,
    cursor: String | CursorValue = null,
    dashStyle: DashStyleValue = null,
    dataGrouping: PlotPackedbubbleDataGroupingOptions = null,
    dataLabels: SeriesPackedBubbleDataLabelsOptionsObject | js.Array[SeriesPackedBubbleDataLabelsOptionsObject] = null,
    description: String = null,
    displayNegative: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: PlotPackedbubbleEventsOptions = null,
    findNearestPointBy: OptionsFindNearestPointByValue = null,
    gapSize: Int | Double = null,
    gapUnit: OptionsGapUnitValue = null,
    getExtremesFromAll: js.UndefOr[Boolean] = js.undefined,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    joinBy: String | js.Array[String] = null,
    label: PlotPackedbubbleLabelOptions = null,
    lastPrice: PlotPackedbubbleLastPriceOptions = null,
    lastVisiblePrice: PlotPackedbubbleLastVisiblePriceOptions = null,
    layoutAlgorithm: PlotPackedbubbleLayoutAlgorithmOptions = null,
    lineWidth: Int | Double = null,
    linecap: SeriesLinecapValue = null,
    linkedTo: String = null,
    marker: PlotPackedbubbleMarkerOptions = null,
    maxSize: Double | String = null,
    minSize: Double | String = null,
    navigatorOptions: PlotSeriesOptions = null,
    negativeColor: ColorString | GradientColorObject | PatternObject = null,
    opacity: Int | Double = null,
    point: PlotPackedbubblePointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    pointInterval: Int | Double = null,
    pointIntervalUnit: OptionsPointIntervalUnitValue = null,
    pointRange: Int | Double = null,
    pointStart: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    sizeBy: String = null,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    softThreshold: js.UndefOr[Boolean] = js.undefined,
    stacking: OptionsStackingValue = null,
    states: PlotPackedbubbleStatesOptions = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null,
    tooltip: PlotPackedbubbleTooltipOptions = null,
    turboThreshold: Int | Double = null,
    useSimulation: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zThreshold: Int | Double = null,
    zoneAxis: String = null,
    zones: js.Array[PlotPackedbubbleZonesOptions] = null
  ): PlotPackedbubbleOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allAreas)) __obj.updateDynamic("allAreas")(allAreas)
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationLimit != null) __obj.updateDynamic("animationLimit")(animationLimit.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending)
    if (boostThreshold != null) __obj.updateDynamic("boostThreshold")(boostThreshold.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (colorKey != null) __obj.updateDynamic("colorKey")(colorKey)
    if (compare != null) __obj.updateDynamic("compare")(compare)
    if (compareBase != null) __obj.updateDynamic("compareBase")(compareBase.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(displayNegative)) __obj.updateDynamic("displayNegative")(displayNegative)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (gapUnit != null) __obj.updateDynamic("gapUnit")(gapUnit)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport)
    if (joinBy != null) __obj.updateDynamic("joinBy")(joinBy.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice)
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice)
    if (layoutAlgorithm != null) __obj.updateDynamic("layoutAlgorithm")(layoutAlgorithm)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (navigatorOptions != null) __obj.updateDynamic("navigatorOptions")(navigatorOptions)
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter)
    if (pointInterval != null) __obj.updateDynamic("pointInterval")(pointInterval.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit)
    if (pointRange != null) __obj.updateDynamic("pointRange")(pointRange.asInstanceOf[js.Any])
    if (pointStart != null) __obj.updateDynamic("pointStart")(pointStart.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator)
    if (sizeBy != null) __obj.updateDynamic("sizeBy")(sizeBy)
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation)
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useSimulation)) __obj.updateDynamic("useSimulation")(useSimulation)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zThreshold != null) __obj.updateDynamic("zThreshold")(zThreshold.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[PlotPackedbubbleOptions]
  }
}

