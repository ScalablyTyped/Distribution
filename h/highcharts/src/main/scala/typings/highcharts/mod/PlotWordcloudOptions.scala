package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotWordcloudOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.native
  /**
    * (Highcharts) If there is no space for a word on the playing field, then
    * this option will allow the playing field to be extended to fit the word.
    * If false then the word will be dropped from the visualization.
    *
    * NB! This option is currently not decided to be published in the API, and
    * is therefore marked as private.
    */
  var allowExtendPlayingField: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Allow this series' points to be selected by clicking on the
    * graphic (columns, point markers, pie slices, map areas etc).
    *
    * The selected points can be handled by point select and unselect events,
    * or collectively by the getSelectedPoints function.
    *
    * And alternative way of selecting points is through dragging.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.native
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
    * (Highcharts) For some series, there is a limit that shuts down initial
    * animation by default when the total number of points in the chart is too
    * high. For example, for a column chart and its derivatives, animation does
    * not run if there is more than 250 points totally. To disable this cap,
    * set `animationLimit` to `Infinity`.
    */
  var animationLimit: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Sets the color blending in the boost module.
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
    * (Highcharts) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.native
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
    * (Highcharts, Highstock, Gantt) When the series contains less points than
    * the crop threshold, all points are drawn, event if the points fall
    * outside the visible plot area at the current zoom. The advantage of
    * drawing all points (including markers and columns), is that animation is
    * performed on updates. On the other hand, when the series contains more
    * points than the crop threshold, the series data is cropped to only
    * contain points that fall within the plot area. The advantage of cropping
    * away invisible points is to increase performance on large series.
    */
  var cropThreshold: js.UndefOr[Double] = js.native
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
    * (Highcharts) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts) 3D columns only. The width of the colored edges.
    */
  var edgeWidth: js.UndefOr[Double] = js.native
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
    * (Highcharts) When set to `false` will prevent the series data from being
    * included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.native
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
    * (Highcharts) The word with the largest weight will have a font size equal
    * to this value. The font size of a word is the ratio between its weight
    * and the largest occuring weight, multiplied with the value of
    * maxFontSize.
    */
  var maxFontSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) A threshold determining the minimum font size that can be
    * applied to a word.
    */
  var minFontSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) This option decides which algorithm is used for placement,
    * and rotation of a word. The choice of algorith is therefore a crucial
    * part of the resulting layout of the wordcloud. It is possible for users
    * to add their own custom placement strategies for use in word cloud. Read
    * more about it in our documentation
    */
  var placementStrategy: js.UndefOr[String] = js.native
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
    * (Highcharts) Rotation options for the words in the wordcloud.
    */
  var rotation: js.UndefOr[PlotWordcloudRotationOptions] = js.native
  /**
    * (Highcharts) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to display this particular series or series type in
    * the legend. Standalone series are shown in legend by default, and linked
    * series are not. Since v7.2.0 it is possible to show series that use
    * colorAxis by setting this option to `true`.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Spiral used for placing a word after the initial position
    * experienced a collision with either another word or the borders. It is
    * possible for users to add their own custom spiralling algorithms for use
    * in word cloud. Read more about it in our documentation
    */
  var spiral: js.UndefOr[String] = js.native
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
    * (Highcharts) CSS styles for the words.
    */
  var style: js.UndefOr[CSSObject] = js.native
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

object PlotWordcloudOptions {
  @scala.inline
  def apply(): PlotWordcloudOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWordcloudOptions]
  }
  @scala.inline
  implicit class PlotWordcloudOptionsOps[Self <: PlotWordcloudOptions] (val x: Self) extends AnyVal {
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
    def setAllowExtendPlayingField(value: Boolean): Self = this.set("allowExtendPlayingField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExtendPlayingField: Self = this.set("allowExtendPlayingField", js.undefined)
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
    def setCompareStart(value: Boolean): Self = this.set("compareStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareStart: Self = this.set("compareStart", js.undefined)
    @scala.inline
    def setConnectors(value: SeriesConnectorsOptionsObject): Self = this.set("connectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectors: Self = this.set("connectors", js.undefined)
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEdgeWidth(value: Double): Self = this.set("edgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeWidth: Self = this.set("edgeWidth", js.undefined)
    @scala.inline
    def setEnableMouseTracking(value: Boolean): Self = this.set("enableMouseTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMouseTracking: Self = this.set("enableMouseTracking", js.undefined)
    @scala.inline
    def setEvents(value: SeriesEventsOptionsObject): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setIncludeInDataExport(value: Boolean): Self = this.set("includeInDataExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInDataExport: Self = this.set("includeInDataExport", js.undefined)
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
    def setMaxFontSize(value: Double): Self = this.set("maxFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFontSize: Self = this.set("maxFontSize", js.undefined)
    @scala.inline
    def setMinFontSize(value: Double): Self = this.set("minFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinFontSize: Self = this.set("minFontSize", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPlacementStrategy(value: String): Self = this.set("placementStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementStrategy: Self = this.set("placementStrategy", js.undefined)
    @scala.inline
    def setPoint(value: PlotSeriesPointOptions): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPointDescriptionFormatter(value: js.Function): Self = this.set("pointDescriptionFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointDescriptionFormatter: Self = this.set("pointDescriptionFormatter", js.undefined)
    @scala.inline
    def setRotation(value: PlotWordcloudRotationOptions): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    @scala.inline
    def setSkipKeyboardNavigation(value: Boolean): Self = this.set("skipKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipKeyboardNavigation: Self = this.set("skipKeyboardNavigation", js.undefined)
    @scala.inline
    def setSpiral(value: String): Self = this.set("spiral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpiral: Self = this.set("spiral", js.undefined)
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    @scala.inline
    def setStickyTracking(value: Boolean): Self = this.set("stickyTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyTracking: Self = this.set("stickyTracking", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
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

