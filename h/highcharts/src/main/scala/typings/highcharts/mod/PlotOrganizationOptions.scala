package typings.highcharts.mod

import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotOrganizationOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.native
  /**
    * (Highmaps) Whether all areas of the map defined in `mapData` should be
    * rendered. If `true`, areas which don't correspond to a data point, are
    * rendered as `null` points. If `false`, those areas are skipped.
    */
  var allAreas: js.UndefOr[Boolean] = js.native
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
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  /**
    * (Highcharts) Sets the color blending in the boost module.
    */
  var boostBlending: js.UndefOr[OptionsBoostBlendingValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The border color of the node cards.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) The border radius of the node cards.
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
    * (Highcharts) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Disable this option to allow series rendering in the whole
    * plotting area.
    *
    * **Note:** Clipping should be always enabled when chart.zoomType is set
    */
  var clip: js.UndefOr[Boolean] = js.native
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
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
    * from the global colors or series-specific plotOptions.column.colors
    * collections, this option determines whether the chart should receive one
    * color per series or one color per point.
    *
    * In styled mode, the `colors` or `series.colors` arrays are not supported,
    * and instead this option gives the points individual color class names on
    * the form `highcharts-color-{n}`.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Styled mode only. A specific color index to use for the
    * series, so its graphic representations are given the class name
    * `highcharts-color-{n}`.
    */
  var colorIndex: js.UndefOr[Double] = js.native
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
    * (Highcharts) You can set the cursor to "pointer" if you have click events
    * attached to the series, to signal to the user that the points and lines
    * can be clicked.
    *
    * In styled mode, the series cursor can be set with the same classes as
    * listed under series.color.
    */
  var cursor: js.UndefOr[String | CursorValue] = js.native
  /**
    * (Highcharts) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.native
  /**
    * (Highcharts) Name of the dash style to use for the graph, or for some
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
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the data labels
    * appearing on top of the nodes and links. For sankey charts, data labels
    * are visible for the nodes by default, but hidden for links. This is
    * controlled by modifying the `nodeFormat`, and the `format` that applies
    * to links and is an empty string by default.
    */
  var dataLabels: js.UndefOr[
    SeriesOrganizationDataLabelsOptionsObject | js.Array[SeriesOrganizationDataLabelsOptionsObject]
  ] = js.native
  /**
    * (Highcharts) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Enable or disable the mouse tracking for a specific series.
    * This includes point tooltips and click events on graphs and points. For
    * large datasets it improves performance.
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) General event handlers for the series items. These event
    * hooks can also be attached to the series at run time using the
    * `Highcharts.addEvent` function.
    */
  var events: js.UndefOr[SeriesEventsOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
    * chart width or only the zoomed area when zooming in on parts of the X
    * axis. By default, the Y axis adjusts to the min and max of the visible
    * data. Cartesian series only.
    */
  var getExtremesFromAll: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The indentation in pixels of hanging nodes, nodes which
    * parent has layout set to `hanging`.
    */
  var hangingIndent: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) When set to `false` will prevent the series data from being
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
    * (Highcharts) An array specifying which option maps to which key in the
    * data point array. This makes it convenient to work with unstructured data
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
    * (Highcharts) Set options on specific levels. Takes precedence over series
    * options, but not node and link options.
    */
  var levels: js.UndefOr[js.Array[PlotOrganizationLevelsOptions]] = js.native
  /**
    * (Highcharts) The color of the links between nodes.
    */
  var linkColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) The line width of the links connecting nodes, in pixels.
    */
  var linkLineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Opacity for the links between nodes in the sankey diagram.
    */
  var linkOpacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Radius for the rounded corners of the links between nodes.
    */
  var linkRadius: js.UndefOr[Double] = js.native
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
    * (Highcharts) The minimal width for a line of a sankey. By default, 0
    * values are not shown.
    */
  var minLinkWidth: js.UndefOr[Double] = js.native
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
    * (Highcharts) The padding between nodes in a sankey diagram or dependency
    * wheel, in pixels.
    *
    * If the number of nodes is so great that it is possible to lay them out
    * within the plot area with the given `nodePadding`, they will be rendered
    * with a smaller padding as a strategy to avoid overflow.
    */
  var nodePadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) In a horizontal chart, the width of the nodes in pixels.
    * Node that most organization charts are vertical, so the name of this
    * option is counterintuitive.
    */
  var nodeWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotSeriesPointOptions] = js.native
  /**
    * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) If true, a checkbox is displayed next to the legend item to
    * allow selecting the series. The state of the checkbox is determined by
    * the `selected` option.
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to display this particular series or series type in
    * the legend. Standalone series are shown in legend by default, and linked
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
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.native
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.native
  /**
    * (Highcharts) Sticky tracking of mouse events. When true, the `mouseOut`
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
    * (Highcharts) A configuration object for the tooltip rendering of each
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
    * (Highcharts) Set the initial visibility of the series.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * (Highmaps) Define the z index of the series.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object PlotOrganizationOptions {
  @scala.inline
  def apply(): PlotOrganizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOrganizationOptions]
  }
  @scala.inline
  implicit class PlotOrganizationOptionsOps[Self <: PlotOrganizationOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean | AnimationOptionsObject): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBoostBlending(value: OptionsBoostBlendingValue): Self = this.set("boostBlending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoostBlending: Self = this.set("boostBlending", js.undefined)
    @scala.inline
    def setBorderColor(value: ColorString): Self = this.set("borderColor", value.asInstanceOf[js.Any])
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
    def setColorByPoint(value: Boolean): Self = this.set("colorByPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorByPoint: Self = this.set("colorByPoint", js.undefined)
    @scala.inline
    def setColorIndex(value: Double): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
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
    def setDataLabelsVarargs(value: SeriesOrganizationDataLabelsOptionsObject*): Self = this.set("dataLabels", js.Array(value :_*))
    @scala.inline
    def setDataLabels(
      value: SeriesOrganizationDataLabelsOptionsObject | js.Array[SeriesOrganizationDataLabelsOptionsObject]
    ): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
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
    def setGetExtremesFromAll(value: Boolean): Self = this.set("getExtremesFromAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetExtremesFromAll: Self = this.set("getExtremesFromAll", js.undefined)
    @scala.inline
    def setHangingIndent(value: Double): Self = this.set("hangingIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHangingIndent: Self = this.set("hangingIndent", js.undefined)
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
    def setLevelsVarargs(value: PlotOrganizationLevelsOptions*): Self = this.set("levels", js.Array(value :_*))
    @scala.inline
    def setLevels(value: js.Array[PlotOrganizationLevelsOptions]): Self = this.set("levels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    @scala.inline
    def setLinkColor(value: ColorString): Self = this.set("linkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkColor: Self = this.set("linkColor", js.undefined)
    @scala.inline
    def setLinkLineWidth(value: Double): Self = this.set("linkLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkLineWidth: Self = this.set("linkLineWidth", js.undefined)
    @scala.inline
    def setLinkOpacity(value: Double): Self = this.set("linkOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkOpacity: Self = this.set("linkOpacity", js.undefined)
    @scala.inline
    def setLinkRadius(value: Double): Self = this.set("linkRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkRadius: Self = this.set("linkRadius", js.undefined)
    @scala.inline
    def setLinkedTo(value: String): Self = this.set("linkedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedTo: Self = this.set("linkedTo", js.undefined)
    @scala.inline
    def setMinLinkWidth(value: Double): Self = this.set("minLinkWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLinkWidth: Self = this.set("minLinkWidth", js.undefined)
    @scala.inline
    def setNavigatorOptions(value: PlotSeriesOptions): Self = this.set("navigatorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorOptions: Self = this.set("navigatorOptions", js.undefined)
    @scala.inline
    def setNodePadding(value: Double): Self = this.set("nodePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePadding: Self = this.set("nodePadding", js.undefined)
    @scala.inline
    def setNodeWidth(value: Double): Self = this.set("nodeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeWidth: Self = this.set("nodeWidth", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
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
  }
  
}

