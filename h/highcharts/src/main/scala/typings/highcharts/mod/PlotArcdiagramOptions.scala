package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotArcdiagramOptions extends StObject {
  
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
  var boostBlending: js.UndefOr[String] = js.undefined
  
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
    * (Highcharts, Highstock, Gantt) The color of the border surrounding each
    * column or bar.
    *
    * In styled mode, the border stroke can be set with the `.highcharts-point`
    * rule.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
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
    * (Highcharts) The option to center links rather than position them one
    * after another
    */
  var centeredLinks: js.UndefOr[Boolean] = js.undefined
  
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
  var compareBase: js.UndefOr[Double] = js.undefined
  
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
    * (Highstock) Cumulative Sum feature replaces points' values with the
    * following formula: `sum of all previous points' values + current point's
    * value`. Works only for points in a visible range. Adds the
    * `cumulativeSum` field to each point object that can be accessed e.g. in
    * the tooltip.pointFormat.
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
    * (Highcharts) Name of the dash style to use for the graph, or for some
    * series types the outline of each shape.
    *
    * In styled mode, the stroke dash-array can be set with the same classes as
    * listed under series.color.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Highcharts) Indicates data is structured as columns instead of rows.
    */
  var dataAsColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Data grouping is the concept of sampling the data values into
    * larger blocks in order to ease readability and increase performance of
    * the JavaScript charts. Highcharts Stock by default applies data grouping
    * when the points become closer than a certain pixel value, determined by
    * the `groupPixelWidth` option.
    *
    * If data grouping is applied, the grouping information of grouped points
    * can be read from the Point.dataGroup. If point options other than the
    * data itself are set, for example `name` or `color` or custom properties,
    * the grouping logic doesn't know how to group it. In this case the options
    * of the first point instance are copied over to the group point. This can
    * be altered through a custom `approximation` callback function.
    */
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the data labels
    * appearing on top of the nodes and links. For arc diagram charts, data
    * labels are visible for the nodes by default, but hidden for links. This
    * is controlled by modifying the `nodeFormat`, and the `format` that
    * applies to links and is an empty string by default.
    */
  var dataLabels: js.UndefOr[
    SeriesArcDiagramDataLabelsOptionsObject | js.Array[SeriesArcDiagramDataLabelsOptionsObject]
  ] = js.undefined
  
  /**
    * (Highcharts) Depth of the columns in a 3D column chart.
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) A description of the series to add to the screen reader
    * information about the series.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) 3D columns only. The color of the edges. Similar to
    * `borderColor`, except it defaults to the same color as the column.
    */
  var edgeColor: js.UndefOr[ColorString] = js.undefined
  
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
    * (Highcharts) Whether nodes with different values should have the same
    * size. If set to true, all nodes are calculated based on the `nodePadding`
    * and current `plotArea`. It is possible to override it using the
    * `marker.radius` option.
    */
  var equalNodes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) General event handlers for the series items. These event
    * hooks can also be attached to the series at run time using the
    * `Highcharts.addEvent` function.
    */
  var events: js.UndefOr[SeriesEventsOptionsObject] = js.undefined
  
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
  var findNearestPointBy: js.UndefOr[String] = js.undefined
  
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
    * When the `gapUnit` is `"relative"` (default), a gap size of 5 means that
    * if the distance between two points is greater than 5 times that of the
    * two closest points, the graph will be broken.
    *
    * When the `gapUnit` is `"value"`, the gap is based on absolute axis
    * values, which on a datetime axis is milliseconds. This also applies to
    * the navigator series that inherits gap options from the base series.
    */
  var gapUnit: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
    * axis units.
    */
  var groupPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
    */
  var groupZPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
    * let them render independent of each other. Non-grouped columns will be
    * laid out individually and overlap each other.
    */
  var grouping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) When set to `false` will prevent the series data from being
    * included in any form of data export.
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
    * (Highcharts) Set options on specific levels. Takes precedence over series
    * options, but not node and link options.
    */
  var levels: js.UndefOr[js.Array[PlotArcdiagramLevelsOptions]] = js.undefined
  
  /**
    * (Highcharts, Highstock) Pixel width of the graph line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) The SVG value used for the `stroke-linecap` and
    * `stroke-linejoin` of a line graph. Round means that lines are rounded in
    * the ends and bends.
    */
  var linecap: js.UndefOr[SeriesLinecapValue] = js.undefined
  
  /**
    * (Highcharts) Opacity for the links between nodes in the sankey diagram.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  
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
    * (Highcharts) Options for the point markers of line-like series.
    * Properties like `fillColor`, `lineColor` and `lineWidth` define the
    * visual appearance of the markers. Other series types, like column series,
    * don't have markers, but have visual options on the series level instead.
    *
    * In styled mode, the markers can be styled with the `.highcharts-point`,
    * `.highcharts-point-hover` and `.highcharts-point-select` class names.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
    * column, translated to the height of a bar in a bar chart. This prevents
    * the columns from becoming too wide when there is a small number of points
    * in the chart.
    */
  var maxPointWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The minimal width for a line of a sankey. By default, 0
    * values are not shown.
    */
  var minLinkWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The minimal height for a column or width
    * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
    * to zero) point, set the minimal point length to a pixel value like 3\. In
    * stacked column charts, minPointLength might not be respected for tightly
    * packed values.
    */
  var minPointLength: js.UndefOr[Double] = js.undefined
  
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
    * (Highcharts) The color for the parts of the graph or points that are
    * below the threshold. Note that `zones` takes precedence over the negative
    * color. Using `negativeColor` is equivalent to applying a zone with value
    * of 0.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The pixel width of each node in a sankey diagram or
    * dependency wheel, or the height in case the chart is inverted.
    */
  var nodeWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Options for the _Series on point_ feature. Only `pie` and
    * `sunburst` series are supported at this moment.
    */
  var onPoint: js.UndefOr[js.Object | PlotArcdiagramOnPointOptions] = js.undefined
  
  /**
    * (Highcharts) Opacity for the nodes in the sankey diagram.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Properties for each single point.
    */
  var point: js.UndefOr[PlotSeriesPointOptions] = js.undefined
  
  /**
    * (Highcharts) Same as accessibility.series.descriptionFormatter, but for
    * an individual series. Overrides the chart wide configuration.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
    * axis units.
    */
  var pointPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The X axis range that each point is valid
    * for. This determines the width of the column. On a categorized axis, the
    * range will be 1 by default (one category unit). On linear and datetime
    * axes, the range will be computed as the distance between the two closest
    * data points.
    *
    * The default `null` means it is computed automatically, but this option
    * can be used to override the automatic value.
    *
    * This option is set by default to 1 if data sorting is enabled.
    */
  var pointRange: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
    * each column or bar point. When set to `undefined`, the width is
    * calculated from the `pointPadding` and `groupPadding`. The width effects
    * the dimension that is not based on the point value. For column series it
    * is the hoizontal length and for bar series it is the vertical length.
    */
  var pointWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Whether the series should be placed on the other side of the
    * `plotArea`.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
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
    * (Highcharts) If set to `true`, the accessibility module will skip past
    * the points in this series for keyboard navigation.
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  
  var states: js.UndefOr[SeriesStatesOptionsObject] = js.undefined
  
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
  var stickyTracking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) The Y axis value to serve as the base for the columns, for
    * distinguishing between values above and below a threshold. If `null`, the
    * columns extend from the padding Y axis minimum.
    */
  var threshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highcharts) A configuration object for the tooltip rendering of each
    * single series. Properties are inherited from tooltip, but only the
    * following properties can be defined on a series level.
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
  var zones: js.UndefOr[js.Array[SeriesZonesOptionsObject]] = js.undefined
}
object PlotArcdiagramOptions {
  
  inline def apply(): PlotArcdiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotArcdiagramOptions]
  }
  
  extension [Self <: PlotArcdiagramOptions](x: Self) {
    
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
    
    inline def setBoostBlending(value: String): Self = StObject.set(x, "boostBlending", value.asInstanceOf[js.Any])
    
    inline def setBoostBlendingUndefined: Self = StObject.set(x, "boostBlending", js.undefined)
    
    inline def setBoostThreshold(value: Double): Self = StObject.set(x, "boostThreshold", value.asInstanceOf[js.Any])
    
    inline def setBoostThresholdUndefined: Self = StObject.set(x, "boostThreshold", js.undefined)
    
    inline def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCenteredLinks(value: Boolean): Self = StObject.set(x, "centeredLinks", value.asInstanceOf[js.Any])
    
    inline def setCenteredLinksUndefined: Self = StObject.set(x, "centeredLinks", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorByPoint(value: Boolean): Self = StObject.set(x, "colorByPoint", value.asInstanceOf[js.Any])
    
    inline def setColorByPointUndefined: Self = StObject.set(x, "colorByPoint", js.undefined)
    
    inline def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    inline def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColors(value: js.Array[ColorString | GradientColorObject | PatternObject]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: (ColorString | GradientColorObject | PatternObject)*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setCompare(value: String): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareBase(value: Double): Self = StObject.set(x, "compareBase", value.asInstanceOf[js.Any])
    
    inline def setCompareBaseUndefined: Self = StObject.set(x, "compareBase", js.undefined)
    
    inline def setCompareStart(value: Boolean): Self = StObject.set(x, "compareStart", value.asInstanceOf[js.Any])
    
    inline def setCompareStartUndefined: Self = StObject.set(x, "compareStart", js.undefined)
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
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
    
    inline def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setDataAsColumns(value: Boolean): Self = StObject.set(x, "dataAsColumns", value.asInstanceOf[js.Any])
    
    inline def setDataAsColumnsUndefined: Self = StObject.set(x, "dataAsColumns", js.undefined)
    
    inline def setDataGrouping(value: DataGroupingOptionsObject): Self = StObject.set(x, "dataGrouping", value.asInstanceOf[js.Any])
    
    inline def setDataGroupingUndefined: Self = StObject.set(x, "dataGrouping", js.undefined)
    
    inline def setDataLabels(value: SeriesArcDiagramDataLabelsOptionsObject | js.Array[SeriesArcDiagramDataLabelsOptionsObject]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setDataLabelsVarargs(value: SeriesArcDiagramDataLabelsOptionsObject*): Self = StObject.set(x, "dataLabels", js.Array(value*))
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEdgeColor(value: ColorString): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
    
    inline def setEdgeColorUndefined: Self = StObject.set(x, "edgeColor", js.undefined)
    
    inline def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
    
    inline def setEdgeWidthUndefined: Self = StObject.set(x, "edgeWidth", js.undefined)
    
    inline def setEnableMouseTracking(value: Boolean): Self = StObject.set(x, "enableMouseTracking", value.asInstanceOf[js.Any])
    
    inline def setEnableMouseTrackingUndefined: Self = StObject.set(x, "enableMouseTracking", js.undefined)
    
    inline def setEqualNodes(value: Boolean): Self = StObject.set(x, "equalNodes", value.asInstanceOf[js.Any])
    
    inline def setEqualNodesUndefined: Self = StObject.set(x, "equalNodes", js.undefined)
    
    inline def setEvents(value: SeriesEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFindNearestPointBy(value: String): Self = StObject.set(x, "findNearestPointBy", value.asInstanceOf[js.Any])
    
    inline def setFindNearestPointByUndefined: Self = StObject.set(x, "findNearestPointBy", js.undefined)
    
    inline def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    
    inline def setGapUnit(value: String): Self = StObject.set(x, "gapUnit", value.asInstanceOf[js.Any])
    
    inline def setGapUnitUndefined: Self = StObject.set(x, "gapUnit", js.undefined)
    
    inline def setGroupPadding(value: Double): Self = StObject.set(x, "groupPadding", value.asInstanceOf[js.Any])
    
    inline def setGroupPaddingUndefined: Self = StObject.set(x, "groupPadding", js.undefined)
    
    inline def setGroupZPadding(value: Double): Self = StObject.set(x, "groupZPadding", value.asInstanceOf[js.Any])
    
    inline def setGroupZPaddingUndefined: Self = StObject.set(x, "groupZPadding", js.undefined)
    
    inline def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setIncludeInDataExport(value: Boolean): Self = StObject.set(x, "includeInDataExport", value.asInstanceOf[js.Any])
    
    inline def setIncludeInDataExportUndefined: Self = StObject.set(x, "includeInDataExport", js.undefined)
    
    inline def setJoinBy(value: String | js.Array[String]): Self = StObject.set(x, "joinBy", value.asInstanceOf[js.Any])
    
    inline def setJoinByUndefined: Self = StObject.set(x, "joinBy", js.undefined)
    
    inline def setJoinByVarargs(value: String*): Self = StObject.set(x, "joinBy", js.Array(value*))
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLabel(value: SeriesLabelOptionsObject): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLastPrice(value: SeriesLastPriceOptionsObject): Self = StObject.set(x, "lastPrice", value.asInstanceOf[js.Any])
    
    inline def setLastPriceUndefined: Self = StObject.set(x, "lastPrice", js.undefined)
    
    inline def setLastVisiblePrice(value: SeriesLastVisiblePriceOptionsObject): Self = StObject.set(x, "lastVisiblePrice", value.asInstanceOf[js.Any])
    
    inline def setLastVisiblePriceUndefined: Self = StObject.set(x, "lastVisiblePrice", js.undefined)
    
    inline def setLevels(value: js.Array[PlotArcdiagramLevelsOptions]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: PlotArcdiagramLevelsOptions*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setLinecap(value: SeriesLinecapValue): Self = StObject.set(x, "linecap", value.asInstanceOf[js.Any])
    
    inline def setLinecapUndefined: Self = StObject.set(x, "linecap", js.undefined)
    
    inline def setLinkOpacity(value: Double): Self = StObject.set(x, "linkOpacity", value.asInstanceOf[js.Any])
    
    inline def setLinkOpacityUndefined: Self = StObject.set(x, "linkOpacity", js.undefined)
    
    inline def setLinkedTo(value: String): Self = StObject.set(x, "linkedTo", value.asInstanceOf[js.Any])
    
    inline def setLinkedToUndefined: Self = StObject.set(x, "linkedTo", js.undefined)
    
    inline def setMarker(value: PointMarkerOptionsObject): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMaxPointWidth(value: Double): Self = StObject.set(x, "maxPointWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxPointWidthUndefined: Self = StObject.set(x, "maxPointWidth", js.undefined)
    
    inline def setMinLinkWidth(value: Double): Self = StObject.set(x, "minLinkWidth", value.asInstanceOf[js.Any])
    
    inline def setMinLinkWidthUndefined: Self = StObject.set(x, "minLinkWidth", js.undefined)
    
    inline def setMinPointLength(value: Double): Self = StObject.set(x, "minPointLength", value.asInstanceOf[js.Any])
    
    inline def setMinPointLengthUndefined: Self = StObject.set(x, "minPointLength", js.undefined)
    
    inline def setNavigatorOptions(value: PlotSeriesOptions): Self = StObject.set(x, "navigatorOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigatorOptionsUndefined: Self = StObject.set(x, "navigatorOptions", js.undefined)
    
    inline def setNegativeColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    inline def setNodeWidth(value: Double): Self = StObject.set(x, "nodeWidth", value.asInstanceOf[js.Any])
    
    inline def setNodeWidthUndefined: Self = StObject.set(x, "nodeWidth", js.undefined)
    
    inline def setOnPoint(value: js.Object | PlotArcdiagramOnPointOptions): Self = StObject.set(x, "onPoint", value.asInstanceOf[js.Any])
    
    inline def setOnPointUndefined: Self = StObject.set(x, "onPoint", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPoint(value: PlotSeriesPointOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointDescriptionFormatter(value: js.Function): Self = StObject.set(x, "pointDescriptionFormatter", value.asInstanceOf[js.Any])
    
    inline def setPointDescriptionFormatterUndefined: Self = StObject.set(x, "pointDescriptionFormatter", js.undefined)
    
    inline def setPointPadding(value: Double): Self = StObject.set(x, "pointPadding", value.asInstanceOf[js.Any])
    
    inline def setPointPaddingUndefined: Self = StObject.set(x, "pointPadding", js.undefined)
    
    inline def setPointRange(value: Double): Self = StObject.set(x, "pointRange", value.asInstanceOf[js.Any])
    
    inline def setPointRangeNull: Self = StObject.set(x, "pointRange", null)
    
    inline def setPointRangeUndefined: Self = StObject.set(x, "pointRange", js.undefined)
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPointWidth(value: Double): Self = StObject.set(x, "pointWidth", value.asInstanceOf[js.Any])
    
    inline def setPointWidthUndefined: Self = StObject.set(x, "pointWidth", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShadow(value: Boolean | ShadowOptionsObject): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
    
    inline def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
    
    inline def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    inline def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    inline def setShowInNavigator(value: Boolean): Self = StObject.set(x, "showInNavigator", value.asInstanceOf[js.Any])
    
    inline def setShowInNavigatorUndefined: Self = StObject.set(x, "showInNavigator", js.undefined)
    
    inline def setSkipKeyboardNavigation(value: Boolean): Self = StObject.set(x, "skipKeyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def setSkipKeyboardNavigationUndefined: Self = StObject.set(x, "skipKeyboardNavigation", js.undefined)
    
    inline def setStates(value: SeriesStatesOptionsObject): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStickyTracking(value: Boolean): Self = StObject.set(x, "stickyTracking", value.asInstanceOf[js.Any])
    
    inline def setStickyTrackingUndefined: Self = StObject.set(x, "stickyTracking", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdNull: Self = StObject.set(x, "threshold", null)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTooltip(value: SeriesTooltipOptionsObject): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTurboThreshold(value: Double): Self = StObject.set(x, "turboThreshold", value.asInstanceOf[js.Any])
    
    inline def setTurboThresholdUndefined: Self = StObject.set(x, "turboThreshold", js.undefined)
    
    inline def setUseOhlcData(value: Boolean): Self = StObject.set(x, "useOhlcData", value.asInstanceOf[js.Any])
    
    inline def setUseOhlcDataUndefined: Self = StObject.set(x, "useOhlcData", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    inline def setZoneAxis(value: String): Self = StObject.set(x, "zoneAxis", value.asInstanceOf[js.Any])
    
    inline def setZoneAxisUndefined: Self = StObject.set(x, "zoneAxis", js.undefined)
    
    inline def setZones(value: js.Array[SeriesZonesOptionsObject]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: SeriesZonesOptionsObject*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
