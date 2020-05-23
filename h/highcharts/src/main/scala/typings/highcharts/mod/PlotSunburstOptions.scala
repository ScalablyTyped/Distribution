package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSunburstOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.undefined
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
    * (Highcharts) When enabled the user can click on a point which is a parent
    * and zoom in on its children.
    */
  var allowTraversingTree: js.UndefOr[Boolean] = js.undefined
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
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts) Sets the color blending in the boost module.
    */
  var boostBlending: js.UndefOr[OptionsBoostBlendingValue] = js.undefined
  /**
    * (Highcharts) The color of the border surrounding each slice. When `null`,
    * the border takes the same color as the slice fill. This can be used
    * together with a `borderWidth` to fill drawing gaps created by
    * antialiazing artefacts in borderless pies.
    *
    * In styled mode, the border stroke is given in the `.highcharts-point`
    * class.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The width of the border surrounding each slice.
    *
    * When setting the border width to 0, there may be small gaps between the
    * slices due to SVG antialiasing artefacts. To work around this, keep the
    * border width at 0.5 or 1, but set the `borderColor` to `null` instead.
    *
    * In styled mode, the border stroke width is given in the
    * `.highcharts-point` class.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The center of the sunburst chart relative to the plot area.
    * Can be percentages or pixel values.
    */
  var center: js.UndefOr[js.Array[Double | String]] = js.undefined
  /**
    * (Highcharts) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The color of the pie series. A pie series is represented as
    * an empty circle if the total sum of its values is 0. Use this property to
    * define the color of its border.
    *
    * In styled mode, the color can be defined by the colorIndex option. Also,
    * the series color can be set with the `.highcharts-series`,
    * `.highcharts-color-{n}`, `.highcharts-{type}-series` or
    * `.highcharts-series-{n}` class, or individual classes given by the
    * `className` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  var colorByPoint: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Styled mode only. A specific color index to use for the
    * series, so its graphic representations are given the class name
    * `highcharts-color-{n}`.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) A series specific or series type specific color set to use
    * instead of the global colors.
    */
  var colors: js.UndefOr[js.Array[ColorString | GradientColorObject | PatternObject]] = js.undefined
  /**
    * (Highstock) Defines if comparison should start from the first point
    * within the visible range or should start from the first point **before**
    * the range.
    *
    * In other words, this flag determines if first point within the visible
    * range will have 0% (`compareStart=true`) or should have been already
    * calculated according to the previous point (`compareStart=false`).
    */
  var compareStart: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Override Pathfinder connector options for a series. Requires
    * Highcharts Gantt to be loaded.
    */
  var connectors: js.UndefOr[SeriesConnectorsOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) When true, each point or column edge is
    * rounded to its nearest pixel in order to render sharp on screen. In some
    * cases, when there are a lot of densely packed columns, this leads to
    * visible difference in column widths or distance between columns. In these
    * cases, setting `crisp` to `false` may look better, even though each
    * column is rendered blurry.
    */
  var crisp: js.UndefOr[Boolean] = js.undefined
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
    * (Highcharts) A reserved subspace to store options and values for
    * customized functionality. Here you can add additional data for your own
    * event callbacks and formatter callbacks.
    */
  var custom: js.UndefOr[Dictionary[_]] = js.undefined
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
    SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject]
  ] = js.undefined
  /**
    * (Highcharts) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.undefined
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
  var events: js.UndefOr[SeriesEventsOptionsObject] = js.undefined
  /**
    * (Highcharts) If the total sum of the pie's values is 0, the series is
    * represented as an empty circle . The `fillColor` option defines the color
    * of that circle. Use pie.borderWidth to set the border thickness.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) When set to `false` will prevent the series data from being
    * included in any form of data export.
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
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[SeriesLastPriceOptionsObject] = js.undefined
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[SeriesLastVisiblePriceOptionsObject] = js.undefined
  /**
    * (Highcharts) Used together with the levels and `allowDrillToNode`
    * options. When set to false the first level visible when drilling is
    * considered to be level one. Otherwise the level will be the same as the
    * tree structure.
    */
  var levelIsConstant: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Determines the width of the ring per level.
    */
  var levelSize: js.UndefOr[PlotSunburstLevelSizeOptions] = js.undefined
  /**
    * (Highcharts) Set options on specific levels. Takes precedence over series
    * options, but not point options.
    */
  var levels: js.UndefOr[js.Array[PlotSunburstLevelsOptions]] = js.undefined
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
  var linkedTo: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
    * dataLabels.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotSeriesPointOptions] = js.undefined
  /**
    * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts) Which point to use as a root in the visualization.
    */
  var rootId: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Whether to select the series initially. If `showCheckbox` is
    * true, the checkbox next to the series name in the legend will be checked
    * for a selected series.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
    * the shadow can be an object configuration containing `color`, `offsetX`,
    * `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.undefined
  /**
    * (Highcharts) If true, a checkbox is displayed next to the legend item to
    * allow selecting the series. The state of the checkbox is determined by
    * the `selected` option.
    */
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether to display this particular series or series type in
    * the legend. Since 2.1, pies are not shown in the legend by default.
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Whether or not to show the series in the navigator. Takes
    * precedence over navigator.baseSeries if defined.
    */
  var showInNavigator: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The diameter of the pie relative to the plot area. Can be a
    * percentage or pixel value. Pixel values are given as integers. The
    * default behaviour (as of 3.0) is to scale to the plot area and give room
    * for data labels within the plot area. slicedOffset is also included in
    * the default size calculation. As a consequence, the size of the pie may
    * vary when points are updated and data labels more around. In that case it
    * is best to set a fixed value, for example `"75%"`.
    */
  var size: js.UndefOr[Double | String | Null] = js.undefined
  /**
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) If a point is sliced, moved out from the center, how many
    * pixels should it be moved?.
    */
  var slicedOffset: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The start angle of the pie slices in degrees where 0 is top
    * and 90 right.
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.undefined
  /**
    * (Highcharts) Sticky tracking of mouse events. When true, the `mouseOut`
    * event on a series isn't triggered until the mouse moves over another
    * series, or out of the plot area. When false, the `mouseOut` event on a
    * series is triggered when the mouse leaves the area around the series'
    * graph or markers. This also implies the tooltip. When `stickyTracking` is
    * false and `tooltip.shared` is false, the tooltip will be hidden when
    * moving the mouse between series.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) A configuration object for the tooltip rendering of each
    * single series. Properties are inherited from tooltip, but only the
    * following properties can be defined on a series level.
    */
  var tooltip: js.UndefOr[SeriesTooltipOptionsObject] = js.undefined
  /**
    * (Highcharts) Options for the button appearing when traversing down in a
    * treemap.
    */
  var traverseUpButton: js.UndefOr[PlotSunburstTraverseUpButtonOptions] = js.undefined
  /**
    * (Highstock) The parameter allows setting line series type and use OHLC
    * indicators. Data in OHLC format is required.
    */
  var useOhlcData: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Set the initial visibility of the series.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Define the z index of the series.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotSunburstOptions {
  @scala.inline
  def apply(
    accessibility: SeriesAccessibilityOptionsObject = null,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    allowTraversingTree: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject = null,
    boostBlending: OptionsBoostBlendingValue = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    center: js.Array[Double | String] = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorByPoint: js.UndefOr[Boolean] = js.undefined,
    colorIndex: js.UndefOr[Double] = js.undefined,
    colors: js.Array[ColorString | GradientColorObject | PatternObject] = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: SeriesConnectorsOptionsObject = null,
    crisp: js.UndefOr[Boolean] = js.undefined,
    cursor: String | CursorValue = null,
    custom: Dictionary[_] = null,
    dataLabels: SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject] = null,
    description: String = null,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: SeriesEventsOptionsObject = null,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    lastPrice: SeriesLastPriceOptionsObject = null,
    lastVisiblePrice: SeriesLastVisiblePriceOptionsObject = null,
    levelIsConstant: js.UndefOr[Boolean] = js.undefined,
    levelSize: PlotSunburstLevelSizeOptions = null,
    levels: js.Array[PlotSunburstLevelsOptions] = null,
    linkedTo: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    point: PlotSeriesPointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    rootId: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    shadow: Boolean | ShadowOptionsObject = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Null | Double | String] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    slicedOffset: js.UndefOr[Double] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined,
    states: SeriesStatesOptionsObject = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    tooltip: SeriesTooltipOptionsObject = null,
    traverseUpButton: PlotSunburstTraverseUpButtonOptions = null,
    useOhlcData: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): PlotSunburstOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTraversingTree)) __obj.updateDynamic("allowTraversingTree")(allowTraversingTree.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart.get.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (!js.isUndefined(crisp)) __obj.updateDynamic("crisp")(crisp.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice.asInstanceOf[js.Any])
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice.asInstanceOf[js.Any])
    if (!js.isUndefined(levelIsConstant)) __obj.updateDynamic("levelIsConstant")(levelIsConstant.get.asInstanceOf[js.Any])
    if (levelSize != null) __obj.updateDynamic("levelSize")(levelSize.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter.asInstanceOf[js.Any])
    if (rootId != null) __obj.updateDynamic("rootId")(rootId.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slicedOffset)) __obj.updateDynamic("slicedOffset")(slicedOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (traverseUpButton != null) __obj.updateDynamic("traverseUpButton")(traverseUpButton.asInstanceOf[js.Any])
    if (!js.isUndefined(useOhlcData)) __obj.updateDynamic("useOhlcData")(useOhlcData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSunburstOptions]
  }
}

