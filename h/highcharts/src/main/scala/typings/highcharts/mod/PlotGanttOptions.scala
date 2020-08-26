package typings.highcharts.mod

import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotGanttOptions extends js.Object {
  /**
    * (Gantt) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.native
  /**
    * (Highmaps) Whether all areas of the map defined in `mapData` should be
    * rendered. If `true`, areas which don't correspond to a data point, are
    * rendered as `null` points. If `false`, those areas are skipped.
    */
  var allAreas: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Allow this series' points to be selected by clicking on the
    * graphic (columns, point markers, pie slices, map areas etc).
    *
    * The selected points can be handled by point select and unselect events,
    * or collectively by the getSelectedPoints function.
    *
    * And alternative way of selecting points is through dragging.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Enable or disable the initial animation when a series is
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
    * (Gantt) For some series, there is a limit that shuts down initial
    * animation by default when the total number of points in the chart is too
    * high. For example, for a column chart and its derivatives, animation does
    * not run if there is more than 250 points totally. To disable this cap,
    * set `animationLimit` to `Infinity`.
    */
  var animationLimit: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Sets the color blending in the boost module.
    */
  var boostBlending: js.UndefOr[OptionsBoostBlendingValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The color of the border surrounding each
    * column or bar.
    *
    * In styled mode, the border stroke can be set with the `.highcharts-point`
    * rule.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The corner radius of the border
    * surrounding each column or bar.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The width of the border surrounding each
    * column or bar. Defaults to `1` when there is room for a border, but to
    * `0` when the columns are so dense that a border would cover the next
    * column.
    *
    * In styled mode, the stroke width can be set with the `.highcharts-point`
    * rule.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) When `true`, the columns will center in
    * the category, ignoring null or missing points. When `false`, space will
    * be reserved for null or missing points.
    */
  var centerInCategory: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Gantt) Disable this option to allow series rendering in the whole
    * plotting area.
    *
    * **Note:** Clipping should be always enabled when chart.zoomType is set
    */
  var clip: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) The main color of the series. In line type series it applies to
    * the line and the point markers unless otherwise specified. In bar type
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
    * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
    * this number defines which colorAxis the particular series is connected
    * to. It refers to either the axis id or the index of the axis in the
    * colorAxis array, with 0 being the first. Set this option to false to
    * prevent a series from connecting to the default color axis.
    *
    * Since v7.2.0 the option can also be an axis id or an axis index instead
    * of a boolean flag.
    */
  var colorAxis: js.UndefOr[Boolean | Double | String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) In an X-range series, this option makes
    * all points of the same Y-axis category the same color.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Styled mode only. A specific color index to use for the series,
    * so its graphic representations are given the class name
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
    * (Highcharts, Highstock, Gantt) A series specific or series type specific
    * color set to apply instead of the global colors when colorByPoint is
    * true.
    */
  var colors: js.UndefOr[js.Array[ColorString | GradientColorObject | PatternObject]] = js.native
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
    * (Gantt) Override Pathfinder connector options for a series. Requires
    * Highcharts Gantt to be loaded.
    */
  var connectors: js.UndefOr[SeriesConnectorsOptionsObject] = js.native
  /**
    * (Gantt) You can set the cursor to "pointer" if you have click events
    * attached to the series, to signal to the user that the points and lines
    * can be clicked.
    *
    * In styled mode, the series cursor can be set with the same classes as
    * listed under series.color.
    */
  var cursor: js.UndefOr[String | CursorValue] = js.native
  /**
    * (Gantt) A reserved subspace to store options and values for customized
    * functionality. Here you can add additional data for your own event
    * callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  /**
    * (Gantt) Name of the dash style to use for the graph, or for some series
    * types the outline of each shape.
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
  var dataLabels: js.UndefOr[PlotGanttDataLabelsOptions | js.Array[PlotGanttDataLabelsOptions]] = js.native
  /**
    * (Gantt) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Gantt) The draggable-points module allows points to be moved around or
    * modified in the chart. In addition to the options mentioned under the
    * `dragDrop` API structure, the module fires three events, point.dragStart,
    * point.drag and point.drop.
    */
  var dragDrop: js.UndefOr[SeriesDragDropOptionsObject] = js.native
  /**
    * (Gantt) Enable or disable the mouse tracking for a specific series. This
    * includes point tooltips and click events on graphs and points. For large
    * datasets it improves performance.
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) General event handlers for the series items. These event hooks
    * can also be attached to the series at run time using the
    * `Highcharts.addEvent` function.
    */
  var events: js.UndefOr[SeriesEventsOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
    * axis units.
    */
  var groupPadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
    */
  var groupZPadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
    * let them render independent of each other. Non-grouped columns will be
    * laid out individually and overlap each other.
    */
  var grouping: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) When set to `false` will prevent the series data from being
    * included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.native
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
  var joinBy: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * (Gantt) An array specifying which option maps to which key in the data
    * point array. This makes it convenient to work with unstructured data
    * arrays from different sources.
    */
  var keys: js.UndefOr[js.Array[String]] = js.native
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
    * (Highcharts, Highstock, Gantt) The id of another series to link to.
    * Additionally, the value can be ":previous" to link to the previous
    * series. When two series are linked, only the first one appears in the
    * legend. Toggling the visibility of this also toggles the linked series.
    *
    * If master series uses data sorting and linked series does not have its
    * own sorting definition, the linked series will be sorted in the same
    * order as the master one.
    */
  var linkedTo: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
    * column, translated to the height of a bar in a bar chart. This prevents
    * the columns from becoming too wide when there is a small number of points
    * in the chart.
    */
  var maxPointWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The minimal height for a column or width
    * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
    * to zero) point, set the minimal point length to a pixel value like 3\. In
    * stacked column charts, minPointLength might not be respected for tightly
    * packed values.
    */
  var minPointLength: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Options for the corresponding navigator series if
    * `showInNavigator` is `true` for this series. Available options are the
    * same as any series, documented at plotOptions and series.
    *
    * These options are merged with options in navigator.series, and will take
    * precedence if the same option is defined both places.
    */
  var navigatorOptions: js.UndefOr[PlotSeriesOptions] = js.native
  /**
    * (Gantt) Opacity of a series parts: line, fill (e.g. area) and dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Gantt) A partial fill for each point, typically used to visualize how
    * much of a task is performed. See completed.
    */
  var partialFill: js.UndefOr[PlotGanttPartialFillOptions] = js.native
  /**
    * (Gantt) Properties for each single point.
    */
  var point: js.UndefOr[PlotSeriesPointOptions] = js.native
  /**
    * (Gantt) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
    * axis units.
    */
  var pointPadding: js.UndefOr[Double] = js.native
  var pointRange: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
    * each column or bar. When `null`, the width is calculated from the
    * `pointPadding` and `groupPadding`.
    */
  var pointWidth: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Whether to apply a drop shadow to the graph line. Since 2.3 the
    * shadow can be an object configuration containing `color`, `offsetX`,
    * `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.native
  /**
    * (Gantt) If true, a checkbox is displayed next to the legend item to allow
    * selecting the series. The state of the checkbox is determined by the
    * `selected` option.
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Whether to display this particular series or series type in the
    * legend. Standalone series are shown in legend by default, and linked
    * series are not. Since v7.2.0 it is possible to show series that use
    * colorAxis by setting this option to `true`.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Whether or not to show the series in the navigator. Takes
    * precedence over navigator.baseSeries if defined.
    */
  var showInNavigator: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) If set to `true`, the accessibility module will skip past the
    * points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.native
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.native
  /**
    * (Gantt) Sticky tracking of mouse events. When true, the `mouseOut` event
    * on a series isn't triggered until the mouse moves over another series, or
    * out of the plot area. When false, the `mouseOut` event on a series is
    * triggered when the mouse leaves the area around the series' graph or
    * markers. This also implies the tooltip when not shared. When
    * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
    * be hidden when moving the mouse between series. Defaults to true for line
    * and area type series, but to false for columns, pies etc.
    *
    * **Note:** The boost module will force this option because of technical
    * limitations.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) A configuration object for the tooltip rendering of each single
    * series. Properties are inherited from tooltip, but only the following
    * properties can be defined on a series level.
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
    * (Gantt) Set the initial visibility of the series.
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

object PlotGanttOptions {
  @scala.inline
  def apply(): PlotGanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGanttOptions]
  }
  @scala.inline
  implicit class PlotGanttOptionsOps[Self <: PlotGanttOptions] (val x: Self) extends AnyVal {
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
    def setAllAreas(value: Boolean): Self = this.set("allAreas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllAreas: Self = this.set("allAreas", js.undefined)
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
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setCenterInCategory(value: Boolean): Self = this.set("centerInCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterInCategory: Self = this.set("centerInCategory", js.undefined)
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
    def setColorAxis(value: Boolean | Double | String): Self = this.set("colorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorAxis: Self = this.set("colorAxis", js.undefined)
    @scala.inline
    def setColorByPoint(value: Boolean): Self = this.set("colorByPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorByPoint: Self = this.set("colorByPoint", js.undefined)
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
    @scala.inline
    def setColorKey(value: String): Self = this.set("colorKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorKey: Self = this.set("colorKey", js.undefined)
    @scala.inline
    def setColorsVarargs(value: (ColorString | GradientColorObject | PatternObject)*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[ColorString | GradientColorObject | PatternObject]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
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
    def setConnectors(value: SeriesConnectorsOptionsObject): Self = this.set("connectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectors: Self = this.set("connectors", js.undefined)
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
    def setDataLabelsVarargs(value: PlotGanttDataLabelsOptions*): Self = this.set("dataLabels", js.Array(value :_*))
    @scala.inline
    def setDataLabels(value: PlotGanttDataLabelsOptions | js.Array[PlotGanttDataLabelsOptions]): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDragDrop(value: SeriesDragDropOptionsObject): Self = this.set("dragDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragDrop: Self = this.set("dragDrop", js.undefined)
    @scala.inline
    def setEnableMouseTracking(value: Boolean): Self = this.set("enableMouseTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMouseTracking: Self = this.set("enableMouseTracking", js.undefined)
    @scala.inline
    def setEvents(value: SeriesEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setGroupPadding(value: Double): Self = this.set("groupPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupPadding: Self = this.set("groupPadding", js.undefined)
    @scala.inline
    def setGroupZPadding(value: Double): Self = this.set("groupZPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupZPadding: Self = this.set("groupZPadding", js.undefined)
    @scala.inline
    def setGrouping(value: Boolean): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setIncludeInDataExport(value: Boolean): Self = this.set("includeInDataExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInDataExport: Self = this.set("includeInDataExport", js.undefined)
    @scala.inline
    def setJoinByVarargs(value: String*): Self = this.set("joinBy", js.Array(value :_*))
    @scala.inline
    def setJoinBy(value: String | js.Array[String]): Self = this.set("joinBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinBy: Self = this.set("joinBy", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
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
    def setLinkedTo(value: String): Self = this.set("linkedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedTo: Self = this.set("linkedTo", js.undefined)
    @scala.inline
    def setMaxPointWidth(value: Double): Self = this.set("maxPointWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPointWidth: Self = this.set("maxPointWidth", js.undefined)
    @scala.inline
    def setMinPointLength(value: Double): Self = this.set("minPointLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPointLength: Self = this.set("minPointLength", js.undefined)
    @scala.inline
    def setNavigatorOptions(value: PlotSeriesOptions): Self = this.set("navigatorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorOptions: Self = this.set("navigatorOptions", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPartialFill(value: PlotGanttPartialFillOptions): Self = this.set("partialFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialFill: Self = this.set("partialFill", js.undefined)
    @scala.inline
    def setPoint(value: PlotSeriesPointOptions): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPointDescriptionFormatter(value: js.Function): Self = this.set("pointDescriptionFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointDescriptionFormatter: Self = this.set("pointDescriptionFormatter", js.undefined)
    @scala.inline
    def setPointPadding(value: Double): Self = this.set("pointPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointPadding: Self = this.set("pointPadding", js.undefined)
    @scala.inline
    def setPointRange(value: Double): Self = this.set("pointRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointRange: Self = this.set("pointRange", js.undefined)
    @scala.inline
    def setPointWidth(value: Double): Self = this.set("pointWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointWidth: Self = this.set("pointWidth", js.undefined)
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
    def setShowInNavigator(value: Boolean): Self = this.set("showInNavigator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInNavigator: Self = this.set("showInNavigator", js.undefined)
    @scala.inline
    def setSkipKeyboardNavigation(value: Boolean): Self = this.set("skipKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipKeyboardNavigation: Self = this.set("skipKeyboardNavigation", js.undefined)
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    @scala.inline
    def setStickyTracking(value: Boolean): Self = this.set("stickyTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyTracking: Self = this.set("stickyTracking", js.undefined)
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

