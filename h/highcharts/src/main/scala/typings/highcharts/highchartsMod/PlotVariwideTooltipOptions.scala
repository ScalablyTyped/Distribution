package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVariwideTooltipOptions extends js.Object {
  /**
    * (Highstock) How many decimals to show for the `point.change` value when
    * the `series.compare` option is set. This is overridable in each series'
    * tooltip options object. The default is to preserve all decimals.
    */
  var changeDecimals: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) A CSS class name to apply to the tooltip's container div,
    * allowing unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
    * format in the tooltip's header will by default be guessed based on the
    * closest data points. This member gives the default string representations
    * used for each unit. For an overview of the replacement codes, see
    * dateFormat.
    */
  var dateTimeLabelFormats: js.UndefOr[PlotVariwideTooltipDateTimeLabelFormatsOptions | Dictionary[String]] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Whether the tooltip should follow the mouse as it moves
    * across columns, pie slices and other point types with an extent. By
    * default it behaves this way for pie, polygon, map, sankey and wordcloud
    * series by override in the `plotOptions` for those series types.
    *
    * For touch moves to behave the same way, followTouchMove must be `true`
    * also.
    */
  var followPointer: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether the tooltip should update as the finger moves on a
    * touch device. If this is `true` and chart.panning is
    * set,`followTouchMove` will take over one-finger touches, so the user
    * needs to use two fingers for zooming and panning.
    *
    * Note the difference to followPointer that only defines the _position_ of
    * the tooltip. If `followPointer` is false in for example a column series,
    * the tooltip will show above or below the column, but as `followTouchMove`
    * is true, the tooltip will jump from column to column as the user swipes
    * across the plot area.
    */
  var followTouchMove: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) A string to append to the tooltip format.
    */
  var footerFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The HTML of the tooltip header line. Variables are enclosed
    * by curly brackets. Available variables are `point.key`, `series.name`,
    * `series.color` and other members from the `point` and `series` objects.
    * The `point.key` variable contains the category name, x value or datetime
    * string depending on the type of axis. For datetime axes, the `point.key`
    * date format can be set using `tooltip.xDateFormat`.
    */
  var headerFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The name of a symbol to use for the border around the
    * tooltip header. Applies only when tooltip.split is enabled.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
    * series.marker.symbol.
    */
  var headerShape: js.UndefOr[OptionsHeaderShapeValue] = js.undefined
  /**
    * (Highcharts) The number of milliseconds to wait until the tooltip is
    * hidden when mouse out from a point or chart.
    */
  var hideDelay: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The HTML of the null point's line in the tooltip. Works
    * analogously to pointFormat.
    */
  var nullFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Callback function to format the text of the tooltip for
    * visible null points. Works analogously to formatter.
    */
  var nullFormatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.undefined
  /**
    * (Highcharts) Whether to allow the tooltip to render outside the chart's
    * SVG element box. By default (`false`), the tooltip is rendered within the
    * chart's SVG element, which results in the tooltip being aligned inside
    * the chart area. For small charts, this may result in clipping or
    * overlapping. When `true`, a separate SVG element is created and overlaid
    * on the page, allowing the tooltip to be aligned inside the page itself.
    *
    * Defaults to `true` if `chart.scrollablePlotArea` is activated, otherwise
    * `false`.
    */
  var outside: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Padding inside the tooltip, in pixels.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The HTML of the point's line in the tooltip. Variables are
    * enclosed by curly brackets. Available variables are point.x, point.y,
    * series. name and series.color and other properties on the same form.
    * Furthermore, `point.y` can be extended by the `tooltip.valuePrefix` and
    * `tooltip.valueSuffix` variables. This can also be overridden for each
    * series, which makes it a good hook for displaying units.
    *
    * In styled mode, the dot is colored by a class name rather than the point
    * color.
    */
  var pointFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) A callback function for formatting the HTML output for a
    * single point in the tooltip. Like the `pointFormat` string, but with more
    * flexibility.
    */
  var pointFormatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.undefined
  /**
    * (Highcharts, Highstock) Split the tooltip into one label per series, with
    * the header close to the axis. This is recommended over shared tooltips
    * for charts with multiple line series, generally making them easier to
    * read. This option takes precedence over `tooltip.shared`.
    */
  var split: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) How many decimals to show in each series' y value. This is
    * overridable in each series' tooltip options object. The default is to
    * preserve all decimals.
    */
  var valueDecimals: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) A string to prepend to each series' y value. Overridable in
    * each series' tooltip options object.
    */
  var valuePrefix: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) A string to append to each series' y value. Overridable in
    * each series' tooltip options object.
    */
  var valueSuffix: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
    * header if the X axis is a datetime axis. The default is a best guess
    * based on the smallest distance between points in the chart.
    */
  var xDateFormat: js.UndefOr[String] = js.undefined
}

object PlotVariwideTooltipOptions {
  @scala.inline
  def apply(
    changeDecimals: Int | Double = null,
    className: String = null,
    dateTimeLabelFormats: PlotVariwideTooltipDateTimeLabelFormatsOptions | Dictionary[String] = null,
    distance: Int | Double = null,
    followPointer: js.UndefOr[Boolean] = js.undefined,
    followTouchMove: js.UndefOr[Boolean] = js.undefined,
    footerFormat: String = null,
    headerFormat: String = null,
    headerShape: OptionsHeaderShapeValue = null,
    hideDelay: Int | Double = null,
    nullFormat: String = null,
    nullFormatter: TooltipFormatterCallbackFunction = null,
    outside: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    pointFormat: String = null,
    pointFormatter: FormatterCallbackFunction[Point] = null,
    split: js.UndefOr[Boolean] = js.undefined,
    valueDecimals: Int | Double = null,
    valuePrefix: String = null,
    valueSuffix: String = null,
    xDateFormat: String = null
  ): PlotVariwideTooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (changeDecimals != null) __obj.updateDynamic("changeDecimals")(changeDecimals.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(followPointer)) __obj.updateDynamic("followPointer")(followPointer)
    if (!js.isUndefined(followTouchMove)) __obj.updateDynamic("followTouchMove")(followTouchMove)
    if (footerFormat != null) __obj.updateDynamic("footerFormat")(footerFormat)
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat)
    if (headerShape != null) __obj.updateDynamic("headerShape")(headerShape)
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat)
    if (nullFormatter != null) __obj.updateDynamic("nullFormatter")(nullFormatter)
    if (!js.isUndefined(outside)) __obj.updateDynamic("outside")(outside)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pointFormat != null) __obj.updateDynamic("pointFormat")(pointFormat)
    if (pointFormatter != null) __obj.updateDynamic("pointFormatter")(pointFormatter)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    if (valueDecimals != null) __obj.updateDynamic("valueDecimals")(valueDecimals.asInstanceOf[js.Any])
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix)
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix)
    if (xDateFormat != null) __obj.updateDynamic("xDateFormat")(xDateFormat)
    __obj.asInstanceOf[PlotVariwideTooltipOptions]
  }
}

