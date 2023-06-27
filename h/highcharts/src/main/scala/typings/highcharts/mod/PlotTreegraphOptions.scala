package typings.highcharts.mod

import typings.highcharts.highchartsInts.`0`
import typings.highcharts.highchartsInts.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphOptions extends StObject {
  
  /**
    * (Highcharts) Accessibility options for a series.
    */
  var accessibility: js.UndefOr[SeriesAccessibilityOptionsObject] = js.undefined
  
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
    * - `defer`: The animation delay time in milliseconds.
    *
    * - `duration`: The duration of the animation in milliseconds. (Defaults to
    * `1000`)
    *
    * - `easing`: Can be a string reference to an easing function set on the
    * `Math` object or a function. See the _Custom easing function_ demo below.
    * (Defaults to `easeInOutSine`)
    *
    * Due to poor performance, animation is disabled in old IE browsers for
    * several chart types.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  
  /**
    * (Highcharts) For some series, there is a limit that shuts down animation
    * by default when the total number of points in the chart is too high. For
    * example, for a column chart and its derivatives, animation does not run
    * if there is more than 250 points totally. To disable this cap, set
    * `animationLimit` to `Infinity`. This option works if animation is fired
    * on individual points, not on a group of points like e.g. during the
    * initial animation.
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
    */
  var boostThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) The color of the border surrounding each tree map item.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highmaps) The width of the border surrounding each tree map item.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) An additional class name to apply to the series' graphical
    * elements. This option does not replace default class names of the
    * graphical element. Changes to the series' color will also be reflected in
    * a chart's legend and tooltip.
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
    * (Highcharts) Options applied to collapse Button. The collape button is
    * the small button which indicates, that the node is collapsable.
    */
  var collapseButton: js.UndefOr[PlotTreegraphCollapseButtonOptions] = js.undefined
  
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
    * (Highcharts) When using automatic point colors pulled from the
    * `options.colors` collection, this option determines whether the chart
    * should receive one color per series or one color per point.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Styled mode only. A specific color index to use for the
    * series, so its graphic representations are given the class name
    * `highcharts-color-{n}`.
    *
    * Since v11, CSS variables on the form `--highcharts-color-{n}` make
    * changing the color scheme very convenient.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) A series specific or series type specific color set to apply
    * instead of the global colors when colorByPoint is true.
    */
  var colors: js.UndefOr[js.Array[ColorString | GradientColorObject | PatternObject]] = js.undefined
  
  /**
    * (Highstock) When compare is `percent`, this option dictates whether to
    * use 0 or 100 as the base of comparison.
    */
  var compareBase: js.UndefOr[`0` | `100`] = js.undefined
  
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
    * (Highcharts) When the series contains less points than the crop
    * threshold, all points are drawn, event if the points fall outside the
    * visible plot area at the current zoom. The advantage of drawing all
    * points (including markers and columns), is that animation is performed on
    * updates. On the other hand, when the series contains more points than the
    * crop threshold, the series data is cropped to only contain points that
    * fall within the plot area. The advantage of cropping away invisible
    * points is to increase performance on large series.
    */
  var cropThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Cumulative Sum feature replaces points' values with the
    * following formula: `sum of all previous points' values + current point's
    * value`. Works only for points in a visible range. Adds the
    * `cumulativeSum` field to each point object that can be accessed e.g. in
    * the tooltip.pointFormat.
    *
    * With `dataGrouping` enabled, default grouping approximation is set to
    * `sum`.
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined
  
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
  var custom: js.UndefOr[Dictionary[Any]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the data labels
    * appearing on top of the nodes and links. For treegraph charts, data
    * labels are visible for the nodes by default, but hidden for links. This
    * is controlled by modifying the `nodeFormat`, and the `format` that
    * applies to links and is an empty string by default.
    */
  var dataLabels: js.UndefOr[
    SeriesTreegraphDataLabelsOptionsObject | js.Array[SeriesTreegraphDataLabelsOptionsObject]
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
    * (Highcharts) Whether the treegraph series should fill the entire plot
    * area in the X axis direction, even when there are collapsed points.
    */
  var fillSpace: js.UndefOr[Boolean] = js.undefined
  
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
    * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
    * chart width or only the zoomed area when zooming in on parts of the X
    * axis. By default, the Y axis adjusts to the min and max of the visible
    * data. Cartesian series only.
    */
  var getExtremesFromAll: js.UndefOr[Boolean] = js.undefined
  
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
    * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
    * series as possible in a natural way, seeking to avoid other series. The
    * goal of this feature is to make the chart more easily readable, like if a
    * human designer placed the labels in the optimal position.
    *
    * The series labels currently work with series types having a `graph` or an
    * `area`.
    */
  var label: js.UndefOr[SeriesLabelOptionsObject] = js.undefined
  
  /**
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[SeriesLastPriceOptionsObject] = js.undefined
  
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[SeriesLastVisiblePriceOptionsObject] = js.undefined
  
  /**
    * (Highcharts) What type of legend symbol to render for this series. Can be
    * one of `lineMarker` or `rectangle`.
    */
  var legendSymbol: js.UndefOr[OptionsLegendSymbolValue] = js.undefined
  
  /**
    * (Highcharts) Set options on specific levels. Takes precedence over series
    * options, but not point options.
    */
  var levels: js.UndefOr[js.Array[PlotTreegraphLevelsOptions]] = js.undefined
  
  var link: js.UndefOr[PlotTreegraphLinkOptions] = js.undefined
  
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
    * (Highcharts) Options for the point markers of line and scatter-like
    * series. Properties like `fillColor`, `lineColor` and `lineWidth` define
    * the visual appearance of the markers. The `symbol` option defines the
    * shape. Other series types, like column series, don't have markers, but
    * have visual options on the series level instead.
    *
    * In styled mode, the markers can be styled with the `.highcharts-point`,
    * `.highcharts-point-hover` and `.highcharts-point-select` class names.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  
  /**
    * (Highcharts) Options for the _Series on point_ feature. Only `pie` and
    * `sunburst` series are supported at this moment.
    */
  var onPoint: js.UndefOr[js.Object | PlotTreegraphOnPointOptions] = js.undefined
  
  /**
    * (Highcharts) The opacity of a point in treemap. When a point has
    * children, the visibility of the children is determined by the opacity.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotSeriesPointOptions] = js.undefined
  
  /**
    * (Highcharts) Same as accessibility.point.descriptionFormat, but for an
    * individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormat: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts) Same as accessibility.series.descriptionFormatter, but for
    * an individual series. Overrides the chart wide configuration.
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
    * If combined with `relativeXValue`, an x value can be set on each point,
    * and the `pointInterval` is added x times to the `pointStart` setting.
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
    * (Highcharts, Highstock, Gantt) If no x values are given for the points in
    * a series, pointStart defines on what value to start. For example, if a
    * series contains one yearly value starting from 1945, set pointStart to
    * 1945.
    *
    * If combined with `relativeXValue`, an x value can be set on each point.
    * The x value from the point options is multiplied by `pointInterval` and
    * added to `pointStart` to produce a modified x value.
    */
  var pointStart: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) When true, X values in the data set are relative
    * to the current `pointStart`, `pointInterval` and `pointIntervalUnit`
    * settings. This allows compression of the data for datasets with irregular
    * X values.
    *
    * The real X values are computed on the formula `f(x) = ax + b`, where `a`
    * is the `pointInterval` (optionally with a time unit given by
    * `pointIntervalUnit`), and `b` is the `pointStart`.
    */
  var relativeXValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Flips the positions of the nodes of a treegraph along the
    * horizontal axis (vertical if chart is inverted).
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
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
    * (Highcharts) Whether to display this series type or specific series item
    * in the legend.
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Whether or not to show the series in the navigator. Takes
    * precedence over navigator.baseSeries if defined.
    */
  var showInNavigator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock) When this is true, the series will not cause the
    * Y axis to cross the zero plane (or threshold option) unless the data
    * actually crosses the plane.
    *
    * For example, if `softThreshold` is `false`, a series of 0, 1, 2, 3 will
    * make the Y axis show negative values according to the `minPadding`
    * option. If `softThreshold` is `true`, the Y axis starts at 0.
    */
  var softThreshold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Sonification/audio chart options for a series.
    */
  var sonification: js.UndefOr[PlotTreegraphSonificationOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock) Whether to stack the values of each series on top
    * of each other. Possible values are `undefined` to disable, `"normal"` to
    * stack by value or `"percent"`.
    *
    * When stacking is enabled, data must be sorted in ascending X order.
    *
    * Some stacking options are related to specific series types. In the
    * streamgraph series type, the stacking option is set to `"stream"`. The
    * second one is `"overlap"`, which only applies to waterfall series.
    */
  var stacking: js.UndefOr[OptionsStackingValue] = js.undefined
  
  /**
    * (Highcharts) A wrapper object for all the series options in specific
    * states.
    */
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) Whether to apply steps to the line. Possible
    * values are `left`, `center` and `right`.
    */
  var step: js.UndefOr[OptionsStepValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) Sticky tracking of mouse events. When
    * true, the `mouseOut` event on a series isn't triggered until the mouse
    * moves over another series, or out of the plot area. When false, the
    * `mouseOut` event on a series is triggered when the mouse leaves the area
    * around the series' graph or markers. This also implies the tooltip. When
    * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
    * be hidden when moving the mouse between series.
    */
  var stickyTracking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) A configuration object for the tooltip
    * rendering of each single series. Properties are inherited from tooltip.
    * Overridable properties are `headerFormat`, `pointFormat`, `yDecimals`,
    * `xDateFormat`, `yPrefix` and `ySuffix`. Unlike other series, in a scatter
    * plot the series.name by default shows in the headerFormat and point.x and
    * point.y in the pointFormat.
    */
  var tooltip: js.UndefOr[SeriesTooltipOptionsObject] = js.undefined
  
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
object PlotTreegraphOptions {
  
  inline def apply(): PlotTreegraphOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTreegraphOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessibility(value: SeriesAccessibilityOptionsObject): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAllAreas(value: Boolean): Self = StObject.set(x, "allAreas", value.asInstanceOf[js.Any])
    
    inline def setAllAreasUndefined: Self = StObject.set(x, "allAreas", js.undefined)
    
    inline def setAllowPointSelect(value: Boolean): Self = StObject.set(x, "allowPointSelect", value.asInstanceOf[js.Any])
    
    inline def setAllowPointSelectUndefined: Self = StObject.set(x, "allowPointSelect", js.undefined)
    
    inline def setAnimation(value: Boolean | AnimationOptionsObject): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationLimit(value: Double): Self = StObject.set(x, "animationLimit", value.asInstanceOf[js.Any])
    
    inline def setAnimationLimitUndefined: Self = StObject.set(x, "animationLimit", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBoostBlending(value: OptionsBoostBlendingValue): Self = StObject.set(x, "boostBlending", value.asInstanceOf[js.Any])
    
    inline def setBoostBlendingUndefined: Self = StObject.set(x, "boostBlending", js.undefined)
    
    inline def setBoostThreshold(value: Double): Self = StObject.set(x, "boostThreshold", value.asInstanceOf[js.Any])
    
    inline def setBoostThresholdUndefined: Self = StObject.set(x, "boostThreshold", js.undefined)
    
    inline def setBorderColor(value: ColorString): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setCollapseButton(value: PlotTreegraphCollapseButtonOptions): Self = StObject.set(x, "collapseButton", value.asInstanceOf[js.Any])
    
    inline def setCollapseButtonUndefined: Self = StObject.set(x, "collapseButton", js.undefined)
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorByPoint(value: Boolean): Self = StObject.set(x, "colorByPoint", value.asInstanceOf[js.Any])
    
    inline def setColorByPointUndefined: Self = StObject.set(x, "colorByPoint", js.undefined)
    
    inline def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    inline def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColors(value: js.Array[ColorString | GradientColorObject | PatternObject]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: (ColorString | GradientColorObject | PatternObject)*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setCompareBase(value: `0` | `100`): Self = StObject.set(x, "compareBase", value.asInstanceOf[js.Any])
    
    inline def setCompareBaseUndefined: Self = StObject.set(x, "compareBase", js.undefined)
    
    inline def setCompareStart(value: Boolean): Self = StObject.set(x, "compareStart", value.asInstanceOf[js.Any])
    
    inline def setCompareStartUndefined: Self = StObject.set(x, "compareStart", js.undefined)
    
    inline def setConnectors(value: SeriesConnectorsOptionsObject): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    inline def setCrisp(value: Boolean): Self = StObject.set(x, "crisp", value.asInstanceOf[js.Any])
    
    inline def setCrispUndefined: Self = StObject.set(x, "crisp", js.undefined)
    
    inline def setCropThreshold(value: Double): Self = StObject.set(x, "cropThreshold", value.asInstanceOf[js.Any])
    
    inline def setCropThresholdUndefined: Self = StObject.set(x, "cropThreshold", js.undefined)
    
    inline def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    inline def setCursor(value: String | CursorValue): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setCustom(value: Dictionary[Any]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDataLabels(value: SeriesTreegraphDataLabelsOptionsObject | js.Array[SeriesTreegraphDataLabelsOptionsObject]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setDataLabelsVarargs(value: SeriesTreegraphDataLabelsOptionsObject*): Self = StObject.set(x, "dataLabels", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableMouseTracking(value: Boolean): Self = StObject.set(x, "enableMouseTracking", value.asInstanceOf[js.Any])
    
    inline def setEnableMouseTrackingUndefined: Self = StObject.set(x, "enableMouseTracking", js.undefined)
    
    inline def setEvents(value: SeriesEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFillSpace(value: Boolean): Self = StObject.set(x, "fillSpace", value.asInstanceOf[js.Any])
    
    inline def setFillSpaceUndefined: Self = StObject.set(x, "fillSpace", js.undefined)
    
    inline def setFindNearestPointBy(value: OptionsFindNearestPointByValue): Self = StObject.set(x, "findNearestPointBy", value.asInstanceOf[js.Any])
    
    inline def setFindNearestPointByUndefined: Self = StObject.set(x, "findNearestPointBy", js.undefined)
    
    inline def setGetExtremesFromAll(value: Boolean): Self = StObject.set(x, "getExtremesFromAll", value.asInstanceOf[js.Any])
    
    inline def setGetExtremesFromAllUndefined: Self = StObject.set(x, "getExtremesFromAll", js.undefined)
    
    inline def setIncludeInDataExport(value: Boolean): Self = StObject.set(x, "includeInDataExport", value.asInstanceOf[js.Any])
    
    inline def setIncludeInDataExportUndefined: Self = StObject.set(x, "includeInDataExport", js.undefined)
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLabel(value: SeriesLabelOptionsObject): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLastPrice(value: SeriesLastPriceOptionsObject): Self = StObject.set(x, "lastPrice", value.asInstanceOf[js.Any])
    
    inline def setLastPriceUndefined: Self = StObject.set(x, "lastPrice", js.undefined)
    
    inline def setLastVisiblePrice(value: SeriesLastVisiblePriceOptionsObject): Self = StObject.set(x, "lastVisiblePrice", value.asInstanceOf[js.Any])
    
    inline def setLastVisiblePriceUndefined: Self = StObject.set(x, "lastVisiblePrice", js.undefined)
    
    inline def setLegendSymbol(value: OptionsLegendSymbolValue): Self = StObject.set(x, "legendSymbol", value.asInstanceOf[js.Any])
    
    inline def setLegendSymbolUndefined: Self = StObject.set(x, "legendSymbol", js.undefined)
    
    inline def setLevels(value: js.Array[PlotTreegraphLevelsOptions]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: PlotTreegraphLevelsOptions*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setLink(value: PlotTreegraphLinkOptions): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkedTo(value: String): Self = StObject.set(x, "linkedTo", value.asInstanceOf[js.Any])
    
    inline def setLinkedToUndefined: Self = StObject.set(x, "linkedTo", js.undefined)
    
    inline def setMarker(value: PointMarkerOptionsObject): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setOnPoint(value: js.Object | PlotTreegraphOnPointOptions): Self = StObject.set(x, "onPoint", value.asInstanceOf[js.Any])
    
    inline def setOnPointUndefined: Self = StObject.set(x, "onPoint", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPoint(value: PlotSeriesPointOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointDescriptionFormat(value: js.Function): Self = StObject.set(x, "pointDescriptionFormat", value.asInstanceOf[js.Any])
    
    inline def setPointDescriptionFormatUndefined: Self = StObject.set(x, "pointDescriptionFormat", js.undefined)
    
    inline def setPointDescriptionFormatter(value: js.Function): Self = StObject.set(x, "pointDescriptionFormatter", value.asInstanceOf[js.Any])
    
    inline def setPointDescriptionFormatterUndefined: Self = StObject.set(x, "pointDescriptionFormatter", js.undefined)
    
    inline def setPointInterval(value: Double): Self = StObject.set(x, "pointInterval", value.asInstanceOf[js.Any])
    
    inline def setPointIntervalUndefined: Self = StObject.set(x, "pointInterval", js.undefined)
    
    inline def setPointIntervalUnit(value: OptionsPointIntervalUnitValue): Self = StObject.set(x, "pointIntervalUnit", value.asInstanceOf[js.Any])
    
    inline def setPointIntervalUnitUndefined: Self = StObject.set(x, "pointIntervalUnit", js.undefined)
    
    inline def setPointStart(value: Double): Self = StObject.set(x, "pointStart", value.asInstanceOf[js.Any])
    
    inline def setPointStartUndefined: Self = StObject.set(x, "pointStart", js.undefined)
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setRelativeXValue(value: Boolean): Self = StObject.set(x, "relativeXValue", value.asInstanceOf[js.Any])
    
    inline def setRelativeXValueUndefined: Self = StObject.set(x, "relativeXValue", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
    
    inline def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
    
    inline def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    inline def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    inline def setShowInNavigator(value: Boolean): Self = StObject.set(x, "showInNavigator", value.asInstanceOf[js.Any])
    
    inline def setShowInNavigatorUndefined: Self = StObject.set(x, "showInNavigator", js.undefined)
    
    inline def setSkipKeyboardNavigation(value: Boolean): Self = StObject.set(x, "skipKeyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def setSkipKeyboardNavigationUndefined: Self = StObject.set(x, "skipKeyboardNavigation", js.undefined)
    
    inline def setSoftThreshold(value: Boolean): Self = StObject.set(x, "softThreshold", value.asInstanceOf[js.Any])
    
    inline def setSoftThresholdUndefined: Self = StObject.set(x, "softThreshold", js.undefined)
    
    inline def setSonification(value: PlotTreegraphSonificationOptions): Self = StObject.set(x, "sonification", value.asInstanceOf[js.Any])
    
    inline def setSonificationUndefined: Self = StObject.set(x, "sonification", js.undefined)
    
    inline def setStacking(value: OptionsStackingValue): Self = StObject.set(x, "stacking", value.asInstanceOf[js.Any])
    
    inline def setStackingUndefined: Self = StObject.set(x, "stacking", js.undefined)
    
    inline def setStates(value: SeriesStatesOptionsObject): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStep(value: OptionsStepValue): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStickyTracking(value: Boolean): Self = StObject.set(x, "stickyTracking", value.asInstanceOf[js.Any])
    
    inline def setStickyTrackingUndefined: Self = StObject.set(x, "stickyTracking", js.undefined)
    
    inline def setTooltip(value: SeriesTooltipOptionsObject): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTurboThreshold(value: Double): Self = StObject.set(x, "turboThreshold", value.asInstanceOf[js.Any])
    
    inline def setTurboThresholdUndefined: Self = StObject.set(x, "turboThreshold", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
