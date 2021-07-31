package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPieOptions extends StObject {
  
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
    * - `duration`: The duration of the animation in milliseconds.
    *
    * - `easing`: Can be a string reference to an easing function set on the
    * `Math` object or a function. See the _Custom easing function_ demo below.
    *
    * Due to poor performance, animation is disabled in old IE browsers for
    * several chart types.
    */
  var animation: js.UndefOr[Boolean | PlotPieAnimationOptions | PartialAnimationOptionsOb] = js.undefined
  
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
    * (Highcharts) The center of the pie chart relative to the plot area. Can
    * be percentages or pixel values. The default behaviour (as of 3.0) is to
    * center the pie so that all slices and data labels are within the plot
    * area. As a consequence, the pie may actually jump around in a chart with
    * dynamic values, as the data labels move. In that case, the center should
    * be explicitly set, for example to `["50%", "50%"]`.
    */
  var center: js.UndefOr[js.Tuple2[Double | String | Null, Double | String | Null]] = js.undefined
  
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
    * (Highcharts) A series specific or series type specific color set to use
    * instead of the global colors.
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
  var custom: js.UndefOr[Dictionary[js.Any]] = js.undefined
  
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
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.undefined
  
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
  var dataLabels: js.UndefOr[SeriesPieDataLabelsOptionsObject | js.Array[SeriesPieDataLabelsOptionsObject]] = js.undefined
  
  /**
    * (Highcharts) The thickness of a 3D pie.
    */
  var depth: js.UndefOr[Double] = js.undefined
  
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
    * (Highcharts) The end angle of the pie in degrees where 0 is top and 90 is
    * right. Defaults to `startAngle` plus 360.
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
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
  var gapUnit: js.UndefOr[OptionsGapUnitValue] = js.undefined
  
  /**
    * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
    * whether the series shall be redrawn as if the hidden point were `null`.
    *
    * The default value changed from `false` to `true` with Highcharts 3.0.
    */
  var ignoreHiddenPoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) When set to `false` will prevent the series data from being
    * included in any form of data export.
    *
    * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
    * `includeInCSVExport`.
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) The size of the inner diameter for the pie. A size greater
    * than 0 renders a donut chart. Can be a percentage or pixel value.
    * Percentages are relative to the pie size. Pixel values are given as
    * integers.
    *
    * Note: in Highcharts < 4.1.2, the percentage was relative to the plot
    * area, not the pie size.
    */
  var innerSize: js.UndefOr[Double | String] = js.undefined
  
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
    * (Highstock) The line marks the last price from all points.
    */
  var lastPrice: js.UndefOr[SeriesLastPriceOptionsObject] = js.undefined
  
  /**
    * (Highstock) The line marks the last price from visible range of points.
    */
  var lastVisiblePrice: js.UndefOr[SeriesLastVisiblePriceOptionsObject] = js.undefined
  
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
    *
    * If master series uses data sorting and linked series does not have its
    * own sorting definition, the linked series will be sorted in the same
    * order as the master one.
    */
  var linkedTo: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The minimum size for a pie in response to auto margins. The
    * pie will try to shrink to make room for data labels in side the plot
    * area, but only to this size.
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
    * (Highstock) The width of each point on the x axis. For example in a
    * column chart with one value each day, the pointRange would be 1 day (= 24
    * * 3600
    *
    * * 1000 milliseconds). This is normally computed automatically, but this
    * option can be used to override the automatic value.
    */
  var pointRange: js.UndefOr[Double] = js.undefined
  
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
object PlotPieOptions {
  
  @scala.inline
  def apply(): PlotPieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPieOptions]
  }
  
  @scala.inline
  implicit class PlotPieOptionsMutableBuilder[Self <: PlotPieOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: SeriesAccessibilityOptionsObject): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAllAreas(value: Boolean): Self = StObject.set(x, "allAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllAreasUndefined: Self = StObject.set(x, "allAreas", js.undefined)
    
    @scala.inline
    def setAllowPointSelect(value: Boolean): Self = StObject.set(x, "allowPointSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPointSelectUndefined: Self = StObject.set(x, "allowPointSelect", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PlotPieAnimationOptions | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setCenter(value: js.Tuple2[Double | String | Null, Double | String | Null]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAxis(value: Boolean | Double | String): Self = StObject.set(x, "colorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAxisUndefined: Self = StObject.set(x, "colorAxis", js.undefined)
    
    @scala.inline
    def setColorIndex(value: Double): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
    
    @scala.inline
    def setColorKey(value: String): Self = StObject.set(x, "colorKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorKeyUndefined: Self = StObject.set(x, "colorKey", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[ColorString | GradientColorObject | PatternObject]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: (ColorString | GradientColorObject | PatternObject)*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setCompare(value: String): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareBase(value: `0` | `100`): Self = StObject.set(x, "compareBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareBaseUndefined: Self = StObject.set(x, "compareBase", js.undefined)
    
    @scala.inline
    def setCompareStart(value: Boolean): Self = StObject.set(x, "compareStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareStartUndefined: Self = StObject.set(x, "compareStart", js.undefined)
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setConnectors(value: SeriesConnectorsOptionsObject): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    @scala.inline
    def setCrisp(value: Boolean): Self = StObject.set(x, "crisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrispUndefined: Self = StObject.set(x, "crisp", js.undefined)
    
    @scala.inline
    def setCursor(value: String | CursorValue): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCustom(value: Dictionary[js.Any]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = StObject.set(x, "dataGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataGroupingUndefined: Self = StObject.set(x, "dataGrouping", js.undefined)
    
    @scala.inline
    def setDataLabels(value: SeriesPieDataLabelsOptionsObject | js.Array[SeriesPieDataLabelsOptionsObject]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: SeriesPieDataLabelsOptionsObject*): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnableMouseTracking(value: Boolean): Self = StObject.set(x, "enableMouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMouseTrackingUndefined: Self = StObject.set(x, "enableMouseTracking", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setEvents(value: SeriesEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    
    @scala.inline
    def setGapUnit(value: OptionsGapUnitValue): Self = StObject.set(x, "gapUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUnitUndefined: Self = StObject.set(x, "gapUnit", js.undefined)
    
    @scala.inline
    def setIgnoreHiddenPoint(value: Boolean): Self = StObject.set(x, "ignoreHiddenPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreHiddenPointUndefined: Self = StObject.set(x, "ignoreHiddenPoint", js.undefined)
    
    @scala.inline
    def setIncludeInDataExport(value: Boolean): Self = StObject.set(x, "includeInDataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInDataExportUndefined: Self = StObject.set(x, "includeInDataExport", js.undefined)
    
    @scala.inline
    def setInnerSize(value: Double | String): Self = StObject.set(x, "innerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerSizeUndefined: Self = StObject.set(x, "innerSize", js.undefined)
    
    @scala.inline
    def setJoinBy(value: String | js.Array[String]): Self = StObject.set(x, "joinBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinByUndefined: Self = StObject.set(x, "joinBy", js.undefined)
    
    @scala.inline
    def setJoinByVarargs(value: String*): Self = StObject.set(x, "joinBy", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setLastPrice(value: SeriesLastPriceOptionsObject): Self = StObject.set(x, "lastPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPriceUndefined: Self = StObject.set(x, "lastPrice", js.undefined)
    
    @scala.inline
    def setLastVisiblePrice(value: SeriesLastVisiblePriceOptionsObject): Self = StObject.set(x, "lastVisiblePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastVisiblePriceUndefined: Self = StObject.set(x, "lastVisiblePrice", js.undefined)
    
    @scala.inline
    def setLinecap(value: SeriesLinecapValue): Self = StObject.set(x, "linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinecapUndefined: Self = StObject.set(x, "linecap", js.undefined)
    
    @scala.inline
    def setLinkedTo(value: String): Self = StObject.set(x, "linkedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedToUndefined: Self = StObject.set(x, "linkedTo", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double | String): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setNavigatorOptions(value: PlotSeriesOptions): Self = StObject.set(x, "navigatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorOptionsUndefined: Self = StObject.set(x, "navigatorOptions", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPoint(value: PlotSeriesPointOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointDescriptionFormatter(value: js.Function): Self = StObject.set(x, "pointDescriptionFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointDescriptionFormatterUndefined: Self = StObject.set(x, "pointDescriptionFormatter", js.undefined)
    
    @scala.inline
    def setPointRange(value: Double): Self = StObject.set(x, "pointRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointRangeUndefined: Self = StObject.set(x, "pointRange", js.undefined)
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean | ShadowOptionsObject): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
    
    @scala.inline
    def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    @scala.inline
    def setShowInNavigator(value: Boolean): Self = StObject.set(x, "showInNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInNavigatorUndefined: Self = StObject.set(x, "showInNavigator", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeNull: Self = StObject.set(x, "size", null)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkipKeyboardNavigation(value: Boolean): Self = StObject.set(x, "skipKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipKeyboardNavigationUndefined: Self = StObject.set(x, "skipKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setSlicedOffset(value: Double): Self = StObject.set(x, "slicedOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicedOffsetUndefined: Self = StObject.set(x, "slicedOffset", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setStates(value: SeriesStatesOptionsObject): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStickyTracking(value: Boolean): Self = StObject.set(x, "stickyTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyTrackingUndefined: Self = StObject.set(x, "stickyTracking", js.undefined)
    
    @scala.inline
    def setTooltip(value: SeriesTooltipOptionsObject): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setUseOhlcData(value: Boolean): Self = StObject.set(x, "useOhlcData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOhlcDataUndefined: Self = StObject.set(x, "useOhlcData", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
