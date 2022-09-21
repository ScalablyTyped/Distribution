package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable animation of
    * the tooltip.
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the tooltip.
    *
    * In styled mode, the stroke width is set in the `.highcharts-tooltip-box`
    * class.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
    * When `undefined`, the border takes the color of the corresponding series
    * or point.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The radius of the rounded border
    * corners.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the tooltip
    * border.
    *
    * In styled mode, the stroke width is set in the `.highcharts-tooltip-box`
    * class.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) How many decimals to show for the `point.change` or the
    * `point.cumulativeSum` value when the `series.compare` or the
    * `series.cumulative` option is set. This is overridable in each series'
    * tooltip options object.
    */
  var changeDecimals: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
    * tooltip's container div, allowing unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the cluster point's
    * in the tooltip. Works only with marker-clusters module and analogously to
    * pointFormat.
    *
    * The cluster tooltip can be also formatted using `tooltip.formatter`
    * callback function and `point.isCluster` flag.
    */
  var clusterFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) For series on datetime axes, the date
    * format in the tooltip's header will by default be guessed based on the
    * closest data points. This member gives the default string representations
    * used for each unit. For an overview of the replacement codes, see
    * dateFormat.
    */
  var dateTimeLabelFormats: js.UndefOr[Dictionary[String]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Distance from point to tooltip
    * in pixels.
    */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the tooltip.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
    * follow the mouse as it moves across columns, pie slices and other point
    * types with an extent. By default it behaves this way for pie, polygon,
    * map, sankey and wordcloud series by override in the `plotOptions` for
    * those series types.
    *
    * Does not apply if split is `true`.
    *
    * For touch moves to behave the same way, followTouchMove must be `true`
    * also.
    */
  var followPointer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
    * update as the finger moves on a touch device. If this is `true` and
    * chart.panning is set,`followTouchMove` will take over one-finger touches,
    * so the user needs to use two fingers for zooming and panning.
    *
    * Note the difference to followPointer that only defines the _position_ of
    * the tooltip. If `followPointer` is false in for example a column series,
    * the tooltip will show above or below the column, but as `followTouchMove`
    * is true, the tooltip will jump from column to column as the user swipes
    * across the plot area.
    */
  var followTouchMove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A string to append to the
    * tooltip format.
    */
  var footerFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
    * text of the tooltip from scratch. In case of single or shared tooltips, a
    * string should be returned. In case of split tooltips, it should return an
    * array where the first item is the header, and subsequent items are mapped
    * to the points. Return `false` to disable tooltip for a specific point on
    * series.
    *
    * A subset of HTML is supported. Unless `useHTML` is true, the HTML of the
    * tooltip is parsed and converted to SVG, therefore this isn't a complete
    * HTML renderer. The following HTML tags are supported: `b`, `br`, `em`,
    * `i`, `span`, `strong`. Spans can be styled with a `style` attribute, but
    * only text-related CSS, that is shared with SVG, is handled.
    *
    * The available data in the formatter differ a bit depending on whether the
    * tooltip is shared or split, or belongs to a single point. In a
    * shared/split tooltip, all properties except `x`, which is common for all
    * points, are kept in an array, `this.points`.
    *
    * Available data are:
    *
    * - **this.percentage (not shared) / ** **this.points[i].percentage
    * (shared)**: Stacked series and pies only. The point's percentage of the
    * total.
    *
    * - **this.point (not shared) / this.points[i].point (shared)**: The point
    * object. The point name, if defined, is available through
    * `this.point.name`.
    *
    * - **this.points**: In a shared tooltip, this is an array containing all
    * other properties for each point.
    *
    * - **this.series (not shared) / this.points[i].series (shared)**: The
    * series object. The series name is available through `this.series.name`.
    *
    * - **this.total (not shared) / this.points[i].total (shared)**: Stacked
    * series only. The total value at this point's x value.
    *
    * - **this.x**: The x value. This property is the same regardless of the
    * tooltip being shared or not.
    *
    * - **this.y (not shared) / this.points[i].y (shared)**: The y value.
    */
  var formatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the tooltip header
    * line. Variables are enclosed by curly brackets. Available variables are
    * `point.key`, `series.name`, `series.color` and other members from the
    * `point` and `series` objects. The `point.key` variable contains the
    * category name, x value or datetime string depending on the type of axis.
    * For datetime axes, the `point.key` date format can be set using
    * `tooltip.xDateFormat`.
    */
  var headerFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
    * the border around the tooltip header. Applies only when tooltip.split is
    * enabled.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
    * series.marker.symbol.
    */
  var headerShape: js.UndefOr[OptionsHeaderShapeValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The number of milliseconds to
    * wait until the tooltip is hidden when mouse out from a point or chart.
    */
  var hideDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the null point's
    * line in the tooltip. Works analogously to pointFormat.
    */
  var nullFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
    * text of the tooltip for visible null points. Works analogously to
    * formatter.
    */
  var nullFormatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the tooltip to
    * render outside the chart's SVG element box. By default (`false`), the
    * tooltip is rendered within the chart's SVG element, which results in the
    * tooltip being aligned inside the chart area. For small charts, this may
    * result in clipping or overlapping. When `true`, a separate SVG element is
    * created and overlaid on the page, allowing the tooltip to be aligned
    * inside the page itself.
    *
    * Defaults to `true` if `chart.scrollablePlotArea` is activated, otherwise
    * `false`.
    */
  var outside: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Padding inside the tooltip, in
    * pixels.
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the point's line in
    * the tooltip. Variables are enclosed by curly brackets. Available
    * variables are `point.x`, `point.y`, `series.name` and `series.color` and
    * other properties on the same form. Furthermore, `point.y` can be extended
    * by the `tooltip.valuePrefix` and `tooltip.valueSuffix` variables. This
    * can also be overridden for each series, which makes it a good hook for
    * displaying units.
    *
    * In styled mode, the dot is colored by a class name rather than the point
    * color.
    */
  var pointFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function for
    * formatting the HTML output for a single point in the tooltip. Like the
    * `pointFormat` string, but with more flexibility.
    */
  var pointFormatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to place the
    * tooltip in a custom position. The callback receives three parameters:
    * `labelWidth`, `labelHeight` and `point`, where point contains values for
    * `plotX` and `plotY` telling where the reference point is in the plot
    * area. Add `chart.plotLeft` and `chart.plotTop` to get the full
    * coordinates.
    *
    * To find the actual hovered `Point` instance, use `this.chart.hoverPoint`.
    * For shared or split tooltips, all the hover points are available in
    * `this.chart.hoverPoints`.
    *
    * Since v7, when tooltip.split option is enabled, positioner is called for
    * each of the boxes separately, including xAxis header. xAxis header is not
    * a point, instead `point` argument contains info: `{ plotX: Number, plotY:
    * Number, isHeader: Boolean }`
    *
    * The return should be an object containing x and y values, for example `{
    * x: 100, y: 100 }`.
    */
  var positioner: js.UndefOr[TooltipPositionerCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the tooltip.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
    * the border around the tooltip. Can be one of: `"callout"`, `"circle"` or
    * `"rect"`. When tooltip.split option is enabled, shape is applied to all
    * boxes except header, which is controlled by tooltip.headerShape.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
    * series.marker.symbol.
    */
  var shape: js.UndefOr[TooltipShapeValue] = js.undefined
  
  /**
    * (Highcharts, Highstock) When the tooltip is shared, the entire plot area
    * will capture mouse movement or touch events. Tooltip texts for series
    * types with ordered data (not pie, scatter, flags etc) will be shown in a
    * single bubble. This is recommended for single series charts and for
    * tablet/mobile optimized charts.
    *
    * See also tooltip.split, that is better suited for charts with many
    * series, especially line-type series. The `tooltip.split` option takes
    * precedence over `tooltip.shared`.
    */
  var shared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock) Proximity snap for graphs or single points. It
    * defaults to 10 for mouse-powered devices and 25 for touch devices.
    *
    * Note that in most cases the whole plot area captures the mouse movement,
    * and in these cases `tooltip.snap` doesn't make sense. This applies when
    * stickyTracking is `true` (default) and when the tooltip is shared or
    * split.
    */
  var snap: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) Split the tooltip into one label per series, with
    * the header close to the axis. This is recommended over shared tooltips
    * for charts with multiple line series, generally making them easier to
    * read. This option takes precedence over `tooltip.shared`.
    */
  var split: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Prevents the tooltip from
    * switching or closing when touched or pointed.
    */
  var stickOnContact: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the tooltip. The
    * tooltip can also be styled through the CSS class `.highcharts-tooltip`.
    *
    * Note that the default `pointerEvents` style makes the tooltip ignore
    * mouse events, so in order to use clickable tooltips, this value must be
    * set to `auto`.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Use HTML to render the contents
    * of the tooltip instead of SVG. Using HTML allows advanced formatting like
    * tables and images in the tooltip. It is also recommended for rtl
    * languages as it works around rtl bugs in early Firefox.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How many decimals to show in
    * each series' y value. This is overridable in each series' tooltip options
    * object. The default is to preserve all decimals.
    */
  var valueDecimals: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A string to prepend to each
    * series' y value. Overridable in each series' tooltip options object.
    */
  var valuePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A string to append to each
    * series' y value. Overridable in each series' tooltip options object.
    */
  var valueSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
    * header if the X axis is a datetime axis. The default is a best guess
    * based on the smallest distance between points in the chart.
    */
  var xDateFormat: js.UndefOr[String] = js.undefined
}
object TooltipOptions {
  
  inline def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  extension [Self <: TooltipOptions](x: Self) {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setChangeDecimals(value: Double): Self = StObject.set(x, "changeDecimals", value.asInstanceOf[js.Any])
    
    inline def setChangeDecimalsUndefined: Self = StObject.set(x, "changeDecimals", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClusterFormat(value: String): Self = StObject.set(x, "clusterFormat", value.asInstanceOf[js.Any])
    
    inline def setClusterFormatUndefined: Self = StObject.set(x, "clusterFormat", js.undefined)
    
    inline def setDateTimeLabelFormats(value: Dictionary[String]): Self = StObject.set(x, "dateTimeLabelFormats", value.asInstanceOf[js.Any])
    
    inline def setDateTimeLabelFormatsUndefined: Self = StObject.set(x, "dateTimeLabelFormats", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFollowPointer(value: Boolean): Self = StObject.set(x, "followPointer", value.asInstanceOf[js.Any])
    
    inline def setFollowPointerUndefined: Self = StObject.set(x, "followPointer", js.undefined)
    
    inline def setFollowTouchMove(value: Boolean): Self = StObject.set(x, "followTouchMove", value.asInstanceOf[js.Any])
    
    inline def setFollowTouchMoveUndefined: Self = StObject.set(x, "followTouchMove", js.undefined)
    
    inline def setFooterFormat(value: String): Self = StObject.set(x, "footerFormat", value.asInstanceOf[js.Any])
    
    inline def setFooterFormatUndefined: Self = StObject.set(x, "footerFormat", js.undefined)
    
    inline def setFormatter(value: TooltipFormatterCallbackFunction): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setHeaderFormat(value: String): Self = StObject.set(x, "headerFormat", value.asInstanceOf[js.Any])
    
    inline def setHeaderFormatUndefined: Self = StObject.set(x, "headerFormat", js.undefined)
    
    inline def setHeaderShape(value: OptionsHeaderShapeValue): Self = StObject.set(x, "headerShape", value.asInstanceOf[js.Any])
    
    inline def setHeaderShapeUndefined: Self = StObject.set(x, "headerShape", js.undefined)
    
    inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    inline def setNullFormat(value: String): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    
    inline def setNullFormatUndefined: Self = StObject.set(x, "nullFormat", js.undefined)
    
    inline def setNullFormatter(value: TooltipFormatterCallbackFunction): Self = StObject.set(x, "nullFormatter", value.asInstanceOf[js.Any])
    
    inline def setNullFormatterUndefined: Self = StObject.set(x, "nullFormatter", js.undefined)
    
    inline def setOutside(value: Boolean): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
    
    inline def setOutsideUndefined: Self = StObject.set(x, "outside", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPointFormat(value: String): Self = StObject.set(x, "pointFormat", value.asInstanceOf[js.Any])
    
    inline def setPointFormatUndefined: Self = StObject.set(x, "pointFormat", js.undefined)
    
    inline def setPointFormatter(value: FormatterCallbackFunction[Point]): Self = StObject.set(x, "pointFormatter", value.asInstanceOf[js.Any])
    
    inline def setPointFormatterUndefined: Self = StObject.set(x, "pointFormatter", js.undefined)
    
    inline def setPositioner(value: TooltipPositionerCallbackFunction): Self = StObject.set(x, "positioner", value.asInstanceOf[js.Any])
    
    inline def setPositionerUndefined: Self = StObject.set(x, "positioner", js.undefined)
    
    inline def setShadow(value: Boolean | ShadowOptionsObject): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShape(value: TooltipShapeValue): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setSnap(value: Double): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    inline def setStickOnContact(value: Boolean): Self = StObject.set(x, "stickOnContact", value.asInstanceOf[js.Any])
    
    inline def setStickOnContactUndefined: Self = StObject.set(x, "stickOnContact", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    inline def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    inline def setValueDecimals(value: Double): Self = StObject.set(x, "valueDecimals", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalsUndefined: Self = StObject.set(x, "valueDecimals", js.undefined)
    
    inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
    
    inline def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
    
    inline def setValueSuffixUndefined: Self = StObject.set(x, "valueSuffix", js.undefined)
    
    inline def setXDateFormat(value: String): Self = StObject.set(x, "xDateFormat", value.asInstanceOf[js.Any])
    
    inline def setXDateFormatUndefined: Self = StObject.set(x, "xDateFormat", js.undefined)
  }
}
