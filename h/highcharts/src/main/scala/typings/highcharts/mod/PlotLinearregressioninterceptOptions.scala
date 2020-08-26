package typings.highcharts.mod

import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotLinearregressioninterceptOptions extends js.Object {
  /**
    * (Highstock) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.native
  /**
    * (Highstock) Allow this series' points to be selected by clicking on the
    * graphic (columns, point markers, pie slices, map areas etc).
    *
    * The selected points can be handled by point select and unselect events,
    * or collectively by the getSelectedPoints function.
    *
    * And alternative way of selecting points is through dragging.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Enable or disable the initial animation when a series is
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
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  /**
    * (Highstock) For some series, there is a limit that shuts down initial
    * animation by default when the total number of points in the chart is too
    * high. For example, for a column chart and its derivatives, animation does
    * not run if there is more than 250 points totally. To disable this cap,
    * set `animationLimit` to `Infinity`.
    */
  var animationLimit: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Sets the color blending in the boost module.
    */
  var boostBlending: js.UndefOr[OptionsBoostBlendingValue] = js.native
  /**
    * (Highstock) Set the point threshold for when a series should enter boost
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
    */
  var boostThreshold: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The border color of the map areas.
    *
    * In styled mode, the border stroke is given in the `.highcharts-point`
    * class.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highmaps) The border width of each map area.
    *
    * In styled mode, the border stroke width is given in the
    * `.highcharts-point` class.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highstock) Disable this option to allow series rendering in the whole
    * plotting area.
    *
    * **Note:** Clipping should be always enabled when chart.zoomType is set
    */
  var clip: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) The main color of the series. In line type series it applies
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
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) Styled mode only. A specific color index to use for the
    * series, so its graphic representations are given the class name
    * `highcharts-color-{n}`.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Determines what data value should be
    * used to calculate point color if `colorAxis` is used. Requires to set
    * `min` and `max` if some custom point property is used or if approximation
    * for data grouping is set to `'sum'`.
    */
  var colorKey: js.UndefOr[String] = js.native
  /**
    * (Highstock) Compare the values of the series against the first non-null,
    * non- zero value in the visible range. The y axis will show percentage or
    * absolute change depending on whether `compare` is set to `"percent"` or
    * `"value"`. When this is applied to multiple series, it allows comparing
    * the development of the series against each other. Adds a `change` field
    * to every point object.
    */
  var compare: js.UndefOr[String] = js.native
  /**
    * (Highstock) When compare is `percent`, this option dictates whether to
    * use 0 or 100 as the base of comparison.
    */
  var compareBase: js.UndefOr[`0` | `100`] = js.native
  /**
    * (Highstock) Defines if comparison should start from the first point
    * within the visible range or should start from the first point **before**
    * the range.
    *
    * In other words, this flag determines if first point within the visible
    * range will have 0% (`compareStart=true`) or should have been already
    * calculated according to the previous point (`compareStart=false`).
    */
  var compareStart: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Whether to compare indicator to the main series values or
    * indicator values.
    */
  var compareToMain: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Polar charts only. Whether to connect the ends of a line
    * series plot across the extremes.
    */
  var connectEnds: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Whether to connect a graph line across null
    * points, or render a gap between the two points on either side of the
    * null.
    */
  var connectNulls: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Override Pathfinder connector options for a series. Requires
    * Highcharts Gantt to be loaded.
    */
  var connectors: js.UndefOr[SeriesConnectorsOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) When true, each point or column edge is
    * rounded to its nearest pixel in order to render sharp on screen. In some
    * cases, when there are a lot of densely packed columns, this leads to
    * visible difference in column widths or distance between columns. In these
    * cases, setting `crisp` to `false` may look better, even though each
    * column is rendered blurry.
    */
  var crisp: js.UndefOr[Boolean] = js.native
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
  var cropThreshold: js.UndefOr[Double] = js.native
  /**
    * (Highstock) You can set the cursor to "pointer" if you have click events
    * attached to the series, to signal to the user that the points and lines
    * can be clicked.
    *
    * In styled mode, the series cursor can be set with the same classes as
    * listed under series.color.
    */
  var cursor: js.UndefOr[String | CursorValue] = js.native
  /**
    * (Highstock) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  /**
    * (Highstock) Name of the dash style to use for the graph, or for some
    * series types the outline of each shape.
    *
    * In styled mode, the stroke dash-array can be set with the same classes as
    * listed under series.color.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
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
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data
    * labels, appearing next to each data point.
    *
    * Since v6.2.0, multiple data labels can be applied to each single point by
    * defining them as an array of configs.
    *
    * In styled mode, the data labels can be styled with the
    * `.highcharts-data-label-box` and `.highcharts-data-label` class names
    * (see example).
    */
  var dataLabels: js.UndefOr[
    PlotLinearregressioninterceptDataLabelsOptions | js.Array[PlotLinearregressioninterceptDataLabelsOptions]
  ] = js.native
  /**
    * (Highcharts, Highstock) Options for the series data sorting.
    */
  var dataSorting: js.UndefOr[DataSortingOptionsObject | PlotLinearregressioninterceptDataSortingOptions] = js.native
  /**
    * (Highstock) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highstock) Enable or disable the mouse tracking for a specific series.
    * This includes point tooltips and click events on graphs and points. For
    * large datasets it improves performance.
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) General event handlers for the series items. These event
    * hooks can also be attached to the series at run time using the
    * `Highcharts.addEvent` function.
    */
  var events: js.UndefOr[SeriesEventsOptionsObject] = js.native
  /**
    * (Highstock) Determines whether the series should look for the nearest
    * point in both dimensions or just the x-dimension when hovering the
    * series. Defaults to `'xy'` for scatter series and `'x'` for most other
    * series. If the data has duplicate x-values, it is recommended to set this
    * to `'xy'` to allow hovering over all points.
    *
    * Applies only to series types using nearest neighbor search (not direct
    * hover) for tooltip.
    */
  var findNearestPointBy: js.UndefOr[OptionsFindNearestPointByValue] = js.native
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
  var gapSize: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Together with gapSize, this option defines where to draw gaps
    * in the graph.
    *
    * When the `gapUnit` is `"relative"` (default), a gap size of 5 means that
    * if the distance between two points is greater than 5 times that of the
    * two closest points, the graph will be broken.
    *
    * When the `gapUnit` is `"value"`, the gap is based on absolute axis
    * values, which on a datetime axis is milliseconds. This also applies to
    * the navigator series that inherits gap options from the base series.
    */
  var gapUnit: js.UndefOr[OptionsGapUnitValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
    * chart width or only the zoomed area when zooming in on parts of the X
    * axis. By default, the Y axis adjusts to the min and max of the visible
    * data. Cartesian series only.
    */
  var getExtremesFromAll: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) When set to `false` will prevent the series data from being
    * included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
    * series as possible in a natural way, seeking to avoid other series. The
    * goal of this feature is to make the chart more easily readable, like if a
    * human designer placed the labels in the optimal position.
    *
    * The series labels currently work with series types having a `graph` or an
    * `area`.
    */
  var label: js.UndefOr[SeriesLabelOptionsObject] = js.native
  /**
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[SeriesLastPriceOptionsObject] = js.native
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[SeriesLastVisiblePriceOptionsObject] = js.native
  /**
    * (Highcharts, Highstock) Pixel width of the graph line.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The SVG value used for the `stroke-linecap` and
    * `stroke-linejoin` of a line graph. Round means that lines are rounded in
    * the ends and bends.
    */
  var linecap: js.UndefOr[SeriesLinecapValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The main series ID that indicator will be
    * based on. Required for this indicator.
    */
  var linkedTo: js.UndefOr[String] = js.native
  /**
    * (Highstock) Options for the point markers of line-like series. Properties
    * like `fillColor`, `lineColor` and `lineWidth` define the visual
    * appearance of the markers. Other series types, like column series, don't
    * have markers, but have visual options on the series level instead.
    *
    * In styled mode, the markers can be styled with the `.highcharts-point`,
    * `.highcharts-point-hover` and `.highcharts-point-select` class names.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  /**
    * (Highstock) The name of the series as shown in the legend, tooltip etc.
    * If not set, it will be based on a technical indicator type and default
    * params.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highstock) The color for the parts of the graph or points that are below
    * the threshold. Note that `zones` takes precedence over the negative
    * color. Using `negativeColor` is equivalent to applying a zone with value
    * of 0.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Paramters used in calculation of regression series' points.
    */
  var params: js.UndefOr[PlotLinearregressioninterceptParamsOptions] = js.native
  /**
    * (Highstock) Properties for each single point.
    */
  var point: js.UndefOr[PlotSeriesPointOptions] = js.native
  /**
    * (Highstock) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highstock) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Whether to apply a drop shadow to the graph line. Since 2.3
    * the shadow can be an object configuration containing `color`, `offsetX`,
    * `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.native
  /**
    * (Highstock) If true, a checkbox is displayed next to the legend item to
    * allow selecting the series. The state of the checkbox is determined by
    * the `selected` option.
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Whether to display this particular series or series type in
    * the legend. Standalone series are shown in legend by default, and linked
    * series are not. Since v7.2.0 it is possible to show series that use
    * colorAxis by setting this option to `true`.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) If set to `true`, the accessibility module will skip past the
    * points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) When this is true, the series will not cause the
    * Y axis to cross the zero plane (or threshold option) unless the data
    * actually crosses the plane.
    *
    * For example, if `softThreshold` is `false`, a series of 0, 1, 2, 3 will
    * make the Y axis show negative values according to the `minPadding`
    * option. If `softThreshold` is `true`, the Y axis starts at 0.
    */
  var softThreshold: js.UndefOr[Boolean] = js.native
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.native
  /**
    * (Highcharts, Highstock) Whether to apply steps to the line. Possible
    * values are `left`, `center` and `right`.
    */
  var step: js.UndefOr[OptionsStepValue] = js.native
  /**
    * (Highstock) Sticky tracking of mouse events. When true, the `mouseOut`
    * event on a series isn't triggered until the mouse moves over another
    * series, or out of the plot area. When false, the `mouseOut` event on a
    * series is triggered when the mouse leaves the area around the series'
    * graph or markers. This also implies the tooltip when not shared. When
    * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
    * be hidden when moving the mouse between series. Defaults to true for line
    * and area type series, but to false for columns, pies etc.
    *
    * **Note:** The boost module will force this option because of technical
    * limitations.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) The threshold, also called zero level or base
    * level. For line type series this is only used in conjunction with
    * negativeColor.
    */
  var threshold: js.UndefOr[Double] = js.native
  /**
    * (Highstock) A configuration object for the tooltip rendering of each
    * single series. Properties are inherited from tooltip, but only the
    * following properties can be defined on a series level.
    */
  var tooltip: js.UndefOr[SeriesTooltipOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) When a series contains a data array that
    * is longer than this, only one dimensional arrays of numbers, or two
    * dimensional arrays with x and y values are allowed. Also, only the first
    * point is tested, and the rest are assumed to be the same format. This
    * saves expensive data checking and indexing in long series. Set it to `0`
    * disable.
    *
    * Note: In boost mode turbo threshold is forced. Only array of numbers or
    * two dimensional arrays are allowed.
    */
  var turboThreshold: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Set the initial visibility of the series.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Define the z index of the series.
    */
  var zIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
    */
  var zoneAxis: js.UndefOr[String] = js.native
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
  var zones: js.UndefOr[js.Array[SeriesZonesOptionsObject]] = js.native
}

object PlotLinearregressioninterceptOptions {
  @scala.inline
  def apply(): PlotLinearregressioninterceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLinearregressioninterceptOptions]
  }
  @scala.inline
  implicit class PlotLinearregressioninterceptOptionsOps[Self <: PlotLinearregressioninterceptOptions] (val x: Self) extends AnyVal {
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
    def setAccessibility(value: SeriesAccessibilityOptionsObject): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setAllowPointSelect(value: Boolean): Self = this.set("allowPointSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPointSelect: Self = this.set("allowPointSelect", js.undefined)
    @scala.inline
    def setAnimation(value: Boolean | AnimationOptionsObject): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationLimit(value: Double): Self = this.set("animationLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationLimit: Self = this.set("animationLimit", js.undefined)
    @scala.inline
    def setBoostBlending(value: OptionsBoostBlendingValue): Self = this.set("boostBlending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoostBlending: Self = this.set("boostBlending", js.undefined)
    @scala.inline
    def setBoostThreshold(value: Double): Self = this.set("boostThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoostThreshold: Self = this.set("boostThreshold", js.undefined)
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClip(value: Boolean): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
    @scala.inline
    def setColorKey(value: String): Self = this.set("colorKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorKey: Self = this.set("colorKey", js.undefined)
    @scala.inline
    def setCompare(value: String): Self = this.set("compare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    @scala.inline
    def setCompareBase(value: `0` | `100`): Self = this.set("compareBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareBase: Self = this.set("compareBase", js.undefined)
    @scala.inline
    def setCompareStart(value: Boolean): Self = this.set("compareStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareStart: Self = this.set("compareStart", js.undefined)
    @scala.inline
    def setCompareToMain(value: Boolean): Self = this.set("compareToMain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareToMain: Self = this.set("compareToMain", js.undefined)
    @scala.inline
    def setConnectEnds(value: Boolean): Self = this.set("connectEnds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectEnds: Self = this.set("connectEnds", js.undefined)
    @scala.inline
    def setConnectNulls(value: Boolean): Self = this.set("connectNulls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectNulls: Self = this.set("connectNulls", js.undefined)
    @scala.inline
    def setConnectors(value: SeriesConnectorsOptionsObject): Self = this.set("connectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectors: Self = this.set("connectors", js.undefined)
    @scala.inline
    def setCrisp(value: Boolean): Self = this.set("crisp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrisp: Self = this.set("crisp", js.undefined)
    @scala.inline
    def setCropThreshold(value: Double): Self = this.set("cropThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropThreshold: Self = this.set("cropThreshold", js.undefined)
    @scala.inline
    def setCursor(value: String | CursorValue): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setCustom(value: Dictionary[_]): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = this.set("dataGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataGrouping: Self = this.set("dataGrouping", js.undefined)
    @scala.inline
    def setDataLabelsVarargs(value: PlotLinearregressioninterceptDataLabelsOptions*): Self = this.set("dataLabels", js.Array(value :_*))
    @scala.inline
    def setDataLabels(
      value: PlotLinearregressioninterceptDataLabelsOptions | js.Array[PlotLinearregressioninterceptDataLabelsOptions]
    ): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setDataSorting(value: DataSortingOptionsObject | PlotLinearregressioninterceptDataSortingOptions): Self = this.set("dataSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSorting: Self = this.set("dataSorting", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnableMouseTracking(value: Boolean): Self = this.set("enableMouseTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMouseTracking: Self = this.set("enableMouseTracking", js.undefined)
    @scala.inline
    def setEvents(value: SeriesEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setFindNearestPointBy(value: OptionsFindNearestPointByValue): Self = this.set("findNearestPointBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindNearestPointBy: Self = this.set("findNearestPointBy", js.undefined)
    @scala.inline
    def setGapSize(value: Double): Self = this.set("gapSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapSize: Self = this.set("gapSize", js.undefined)
    @scala.inline
    def setGapUnit(value: OptionsGapUnitValue): Self = this.set("gapUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapUnit: Self = this.set("gapUnit", js.undefined)
    @scala.inline
    def setGetExtremesFromAll(value: Boolean): Self = this.set("getExtremesFromAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetExtremesFromAll: Self = this.set("getExtremesFromAll", js.undefined)
    @scala.inline
    def setIncludeInDataExport(value: Boolean): Self = this.set("includeInDataExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInDataExport: Self = this.set("includeInDataExport", js.undefined)
    @scala.inline
    def setLabel(value: SeriesLabelOptionsObject): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLastPrice(value: SeriesLastPriceOptionsObject): Self = this.set("lastPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPrice: Self = this.set("lastPrice", js.undefined)
    @scala.inline
    def setLastVisiblePrice(value: SeriesLastVisiblePriceOptionsObject): Self = this.set("lastVisiblePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastVisiblePrice: Self = this.set("lastVisiblePrice", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setLinecap(value: SeriesLinecapValue): Self = this.set("linecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinecap: Self = this.set("linecap", js.undefined)
    @scala.inline
    def setLinkedTo(value: String): Self = this.set("linkedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedTo: Self = this.set("linkedTo", js.undefined)
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNegativeColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("negativeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColor: Self = this.set("negativeColor", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setParams(value: PlotLinearregressioninterceptParamsOptions): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPoint(value: PlotSeriesPointOptions): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPointDescriptionFormatter(value: js.Function): Self = this.set("pointDescriptionFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointDescriptionFormatter: Self = this.set("pointDescriptionFormatter", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShadow(value: Boolean | ShadowOptionsObject): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = this.set("showCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCheckbox: Self = this.set("showCheckbox", js.undefined)
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    @scala.inline
    def setSkipKeyboardNavigation(value: Boolean): Self = this.set("skipKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipKeyboardNavigation: Self = this.set("skipKeyboardNavigation", js.undefined)
    @scala.inline
    def setSoftThreshold(value: Boolean): Self = this.set("softThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftThreshold: Self = this.set("softThreshold", js.undefined)
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    @scala.inline
    def setStep(value: OptionsStepValue): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStickyTracking(value: Boolean): Self = this.set("stickyTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyTracking: Self = this.set("stickyTracking", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setTooltip(value: SeriesTooltipOptionsObject): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTurboThreshold(value: Double): Self = this.set("turboThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurboThreshold: Self = this.set("turboThreshold", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZoneAxis(value: String): Self = this.set("zoneAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneAxis: Self = this.set("zoneAxis", js.undefined)
    @scala.inline
    def setZonesVarargs(value: SeriesZonesOptionsObject*): Self = this.set("zones", js.Array(value :_*))
    @scala.inline
    def setZones(value: js.Array[SeriesZonesOptionsObject]): Self = this.set("zones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
  
}

