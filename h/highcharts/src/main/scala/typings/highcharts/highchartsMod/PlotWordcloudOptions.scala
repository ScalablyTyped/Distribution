package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWordcloudOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for a series. Requires the
    * accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | PlotWordcloudAccessibilityOptions] = js.undefined
  /**
    * (Highcharts) If there is no space for a word on the playing field, then
    * this option will allow the playing field to be extended to fit the word.
    * If false then the word will be dropped from the visualization.
    *
    * NB! This option is currently not decided to be published in the API, and
    * is therefore marked as private.
    */
  var allowExtendPlayingField: js.UndefOr[Boolean] = js.undefined
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
  var animation: js.UndefOr[PlotWordcloudAnimationOptions] = js.undefined
  /**
    * (Highcharts) For some series, there is a limit that shuts down initial
    * animation by default when the total number of points in the chart is too
    * high. For example, for a column chart and its derivatives, animation does
    * not run if there is more than 250 points totally. To disable this cap,
    * set `animationLimit` to `Infinity`.
    */
  var animationLimit: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Sets the color blending in the boost module.
    */
  var boostBlending: js.UndefOr[OptionsBoostBlendingValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The color of the border surrounding each
    * column or bar.
    *
    * In styled mode, the border stroke can be set with the `.highcharts-point`
    * rule.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The corner radius of the border
    * surrounding each column or bar.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The width of the border surrounding each
    * column or bar. Defaults to `1` when there is room for a border, but to
    * `0` when the columns are so dense that a border would cover the next
    * column.
    *
    * In styled mode, the stroke width can be set with the `.highcharts-point`
    * rule.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.undefined
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
    * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
    * from the global colors or series-specific plotOptions.column.colors
    * collections, this option determines whether the chart should receive one
    * color per series or one color per point.
    *
    * In styled mode, the `colors` or `series.colors` arrays are not supported,
    * and instead this option gives the points individual color class names on
    * the form `highcharts-color-{n}`.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Styled mode only. A specific color index to use for the
    * series, so its graphic representations are given the class name
    * `highcharts-color-{n}`.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A series specific or series type specific
    * color set to apply instead of the global colors when colorByPoint is
    * true.
    */
  var colors: js.UndefOr[js.Array[ColorString | GradientColorObject | PatternObject]] = js.undefined
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
  var connectors: js.UndefOr[PlotWordcloudConnectorsOptions] = js.undefined
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
    * (Highcharts) Requires the Accessibility module.
    *
    * A description of the series to add to the screen reader information about
    * the series.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The draggable-points module allows points to be moved around
    * or modified in the chart. In addition to the options mentioned under the
    * `dragDrop` API structure, the module fires three events, point.dragStart,
    * point.drag and point.drop.
    *
    * It requires the `modules/draggable-points.js` file to be loaded.
    */
  var dragDrop: js.UndefOr[PlotWordcloudDragDropOptions] = js.undefined
  /**
    * (Highcharts) 3D columns only. The width of the colored edges.
    */
  var edgeWidth: js.UndefOr[Double] = js.undefined
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
  var events: js.UndefOr[PlotWordcloudEventsOptions] = js.undefined
  /**
    * (Highcharts) By default, series are exposed to screen readers as regions.
    * By enabling this option, the series element itself will be exposed in the
    * same way as the data points. This is useful if the series is not used as
    * a grouping entity in the chart, but you still want to attach a
    * description to the series.
    *
    * Requires the Accessibility module.
    */
  var exposeElementToA11y: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Export-data module required. When set to `false` will
    * prevent the series data from being included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) An array specifying which option maps to which key in the
    * data point array. This makes it convenient to work with unstructured data
    * arrays from different sources.
    */
  var keys: js.UndefOr[js.Array[String]] = js.undefined
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
  var label: js.UndefOr[PlotWordcloudLabelOptions] = js.undefined
  /**
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[PlotWordcloudLastPriceOptions] = js.undefined
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[PlotWordcloudLastVisiblePriceOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The id of another series to link to.
    * Additionally, the value can be ":previous" to link to the previous
    * series. When two series are linked, only the first one appears in the
    * legend. Toggling the visibility of this also toggles the linked series.
    */
  var linkedTo: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The word with the largest weight will have a font size equal
    * to this value. The font size of a word is the ratio between its weight
    * and the largest occuring weight, multiplied with the value of
    * maxFontSize.
    */
  var maxFontSize: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) A threshold determining the minimum font size that can be
    * applied to a word.
    */
  var minFontSize: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) This option decides which algorithm is used for placement,
    * and rotation of a word. The choice of algorith is therefore a crucial
    * part of the resulting layout of the wordcloud. It is possible for users
    * to add their own custom placement strategies for use in word cloud. Read
    * more about it in our documentation
    */
  var placementStrategy: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotWordcloudPointOptions] = js.undefined
  /**
    * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts) Rotation options for the words in the wordcloud.
    */
  var rotation: js.UndefOr[PlotWordcloudRotationOptions] = js.undefined
  /**
    * (Highcharts) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether to display this particular series or series type in
    * the legend. The default value is `true` for standalone series, `false`
    * for linked series.
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Spiral used for placing a word after the initial position
    * experienced a collision with either another word or the borders. It is
    * possible for users to add their own custom spiralling algorithms for use
    * in word cloud. Read more about it in our documentation
    */
  var spiral: js.UndefOr[String] = js.undefined
  var states: js.UndefOr[PlotWordcloudStatesOptions] = js.undefined
  /**
    * (Highcharts) Sticky tracking of mouse events. When true, the `mouseOut`
    * event on a series isn't triggered until the mouse moves over another
    * series, or out of the plot area. When false, the `mouseOut` event on a
    * series is triggered when the mouse leaves the area around the series'
    * graph or markers. This also implies the tooltip when not shared. When
    * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
    * be hidden when moving the mouse between series. Defaults to true for line
    * and area type series, but to false for columns, pies etc.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) CSS styles for the words.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts) A configuration object for the tooltip rendering of each
    * single series. Properties are inherited from tooltip, but only the
    * following properties can be defined on a series level.
    */
  var tooltip: js.UndefOr[PlotWordcloudTooltipOptions] = js.undefined
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
    * (Highcharts) Set the initial visibility of the series.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Define the z index of the series.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotWordcloudOptions {
  @scala.inline
  def apply(
    accessibility: js.Object | PlotWordcloudAccessibilityOptions = null,
    allowExtendPlayingField: js.UndefOr[Boolean] = js.undefined,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: PlotWordcloudAnimationOptions = null,
    animationLimit: Int | Double = null,
    boostBlending: OptionsBoostBlendingValue = null,
    borderColor: ColorString = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorByPoint: js.UndefOr[Boolean] = js.undefined,
    colorIndex: Int | Double = null,
    colors: js.Array[ColorString | GradientColorObject | PatternObject] = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: PlotWordcloudConnectorsOptions = null,
    cropThreshold: Int | Double = null,
    cursor: String | CursorValue = null,
    description: String = null,
    dragDrop: PlotWordcloudDragDropOptions = null,
    edgeWidth: Int | Double = null,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: PlotWordcloudEventsOptions = null,
    exposeElementToA11y: js.UndefOr[Boolean] = js.undefined,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    label: PlotWordcloudLabelOptions = null,
    lastPrice: PlotWordcloudLastPriceOptions = null,
    lastVisiblePrice: PlotWordcloudLastVisiblePriceOptions = null,
    linkedTo: String = null,
    maxFontSize: Int | Double = null,
    minFontSize: Int | Double = null,
    opacity: Int | Double = null,
    placementStrategy: String = null,
    point: PlotWordcloudPointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    rotation: PlotWordcloudRotationOptions = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    spiral: String = null,
    states: PlotWordcloudStatesOptions = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    style: CSSObject = null,
    tooltip: PlotWordcloudTooltipOptions = null,
    turboThreshold: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): PlotWordcloudOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExtendPlayingField)) __obj.updateDynamic("allowExtendPlayingField")(allowExtendPlayingField)
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animationLimit != null) __obj.updateDynamic("animationLimit")(animationLimit.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint)
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop)
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(exposeElementToA11y)) __obj.updateDynamic("exposeElementToA11y")(exposeElementToA11y)
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice)
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placementStrategy != null) __obj.updateDynamic("placementStrategy")(placementStrategy)
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation)
    if (spiral != null) __obj.updateDynamic("spiral")(spiral)
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWordcloudOptions]
  }
}

