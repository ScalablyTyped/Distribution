package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends SeriesTooltipOptions {
  /**
    * Enable or disable animation of the tooltip. In slow legacy IE browsers the animation is disabled by default.
    * @default true
    * @since 2.3.0
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The background color or gradient for the tooltip.
    * @default 'rgba(255, 255, 255, 0.85)'
    */
  var backgroundColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The color of the tooltip border. When null, the border takes the color of the corresponding series or point.
    * @default null
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient | scala.Null] = js.undefined
  /**
    * The radius of the rounded border corners.
    * @default 3
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The pixel width of the tooltip border.
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Display crosshairs to connect the points with their corresponding axis values. The crosshairs can be defined as a
    * boolean, an array of booleans or an object.
    *
    * Boolean
    *   If the crosshairs option is true, a single crosshair relating to the x axis will be shown.
    *
    * Array of booleans
    *   In an array of booleans, the first value turns on the x axis crosshair and the second value to the y axis
    *   crosshair. Use [true, true] to show complete crosshairs.
    *
    * Array of objects
    *   In an array of objects, the first value applies to the x axis crosshair and the second value to the y axis
    *   crosshair. For each dimension, a width, color, dashStyle and zIndex can be given.
    *
    * @default null
    */
  var crosshairs: js.UndefOr[
    scala.Boolean | (js.Tuple2[scala.Boolean, scala.Boolean]) | CrosshairObject | (js.Tuple2[CrosshairObject, CrosshairObject]) | scala.Null
  ] = js.undefined
  /**
    * Enable or disable the tooltip.
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback function to format the text of the tooltip. Return false to disable tooltip for a specific point on
    * series.
    *
    * A subset of HTML is supported. The HTML of the tooltip is parsed and converted to SVG, therefore this isn't a
    * complete HTML renderer. The following tabs are supported: <b>, <strong>, <i>, <em>, <br/>, <span>. Spans can be
    * styled with a style attribute, but only text-related CSS that is shared with SVG is handled.
    *
    * Since version 2.1 the tooltip can be shared between multiple series through the shared option. The available data
    * in the formatter differ a bit depending on whether the tooltip is shared or not. In a shared tooltip, all
    * properties except x, which is common for all points, are kept in an array, this.points.
    *
    * Available data are:
    * this.percentage (not shared) / this.points[i].percentage (shared)
    *   Stacked series and pies only. The point's percentage of the total.
    * this.point (not shared) / this.points[i].point (shared)
    *   The point object. The point name, if defined, is available through this.point.name.
    * this.points
    *   In a shared tooltip, this is an array containing all other properties for each point.
    * this.series (not shared) / this.points[i].series (shared)
    *   The series object. The series name is available through this.series.name.
    * this.total (not shared) / this.points[i].total (shared)
    *   Stacked series only. The total value at this point's x value.
    * this.x
    *   The x value. This property is the same regardless of the tooltip being shared or not.
    * this.y (not shared) / this.points[i].y (shared)
    *   The y value.
    */
  var formatter: js.UndefOr[js.Function0[scala.Boolean | java.lang.String]] = js.undefined
  /**
    * Whether to allow the tooltip to render outside the chart's SVG element box.
    * By default (false), the tooltip is rendered within the chart's SVG element, which results in
    * the tooltip being aligned inside the chart area. For small charts, this may result in
    * clipping or overlapping. When true, a separate SVG element is created and overlaid on the
    * page, allowing the tooltip to be aligned inside the page itself.
    * @default false
    * @since 6.1.1
    */
  var outside: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Padding inside the tooltip, in pixels.
    * @since 5.0.0
    * @default 8
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * A callback function to place the tooltip in a default position. The callback receives three parameters:
    * labelWidth, labelHeight and point, where point contains values for plotX and plotY telling where the reference
    * point is in the plot area. Add chart.plotLeft and chart.plotTop to get the full coordinates.
    *
    * The return should be an object containing x and y values, for example { x: 100, y: 100 }.
    * @since 2.2.4
    */
  var positioner: js.UndefOr[
    js.Function3[
      /* labelWidth */ scala.Double, 
      /* labelHeight */ scala.Double, 
      /* point */ PlotPoint, 
      highchartsLib.Anon_X
    ]
  ] = js.undefined
  /**
    * Whether to apply a drop shadow to the tooltip.
    * @default true
    */
  var shadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of a symbol to use for the border around the tooltip. In Highcharts 3.x and less, the shape was square.
    * @default 'callout'
    * @since 4.0
    */
  var shape: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When the tooltip is shared, the entire plot area will capture mouse movement or touch events. Tooltip texts for
    * series types with ordered data (not pie, scatter, flags etc) will be shown in a single bubble. This is
    * recommended for single series charts and for tablet/mobile optimized charts.
    * @default false
    * @since 2.1
    */
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Proximity snap for graphs or single points. Does not apply to bars, columns and pie slices. It defaults to 10 for
    * mouse-powered devices and 25 for touch devices. Note that since Highcharts 4.1 the whole plot area by default
    * captures pointer events in order to show the tooltip, so for tooltip.snap to make sense, stickyTracking must be
    * false.
    * @since 1.2.0
    */
  var snap: js.UndefOr[scala.Double] = js.undefined
  /**
    * Split the tooltip into one label per series, with the header close to the axis.
    * This is recommended over shared tooltips for charts with multiple line series,
    * generally making them easier to read.
    * @since 5.0.0
    * @default false
    */
  var split: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * CSS styles for the tooltip. The tooltip can also be styled through the CSS class .highcharts-tooltip
    * @default { color: '#333333', fontSize: '12px', padding: '8px' }
    */
  var style: js.UndefOr[js.Object] = js.undefined
  /**
    * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables
    * and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
    * @default false
    * @since 2.2
    */
  var useHTML: js.UndefOr[scala.Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String | Gradient = null,
    borderColor: java.lang.String | Gradient = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    crosshairs: scala.Boolean | (js.Tuple2[scala.Boolean, scala.Boolean]) | CrosshairObject | (js.Tuple2[CrosshairObject, CrosshairObject]) = null,
    dateTimeLabelFormats: DateTimeFormats = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    followPointer: js.UndefOr[scala.Boolean] = js.undefined,
    followTouchMove: js.UndefOr[scala.Boolean] = js.undefined,
    footerFormat: java.lang.String = null,
    formatter: () => scala.Boolean | java.lang.String = null,
    headerFormat: java.lang.String = null,
    hideDelay: scala.Int | scala.Double = null,
    outside: js.UndefOr[scala.Boolean] = js.undefined,
    padding: scala.Int | scala.Double = null,
    pointFormat: java.lang.String = null,
    pointFormatter: () => java.lang.String = null,
    positioner: (/* labelWidth */ scala.Double, /* labelHeight */ scala.Double, /* point */ PlotPoint) => highchartsLib.Anon_X = null,
    shadow: js.UndefOr[scala.Boolean] = js.undefined,
    shape: java.lang.String = null,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    snap: scala.Int | scala.Double = null,
    split: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    valueDecimals: scala.Int | scala.Double = null,
    valuePrefix: java.lang.String = null,
    valueSuffix: java.lang.String = null,
    xDateFormat: java.lang.String = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(followPointer)) __obj.updateDynamic("followPointer")(followPointer)
    if (!js.isUndefined(followTouchMove)) __obj.updateDynamic("followTouchMove")(followTouchMove)
    if (footerFormat != null) __obj.updateDynamic("footerFormat")(footerFormat)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction0(formatter))
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat)
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(outside)) __obj.updateDynamic("outside")(outside)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pointFormat != null) __obj.updateDynamic("pointFormat")(pointFormat)
    if (pointFormatter != null) __obj.updateDynamic("pointFormatter")(js.Any.fromFunction0(pointFormatter))
    if (positioner != null) __obj.updateDynamic("positioner")(js.Any.fromFunction3(positioner))
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (valueDecimals != null) __obj.updateDynamic("valueDecimals")(valueDecimals.asInstanceOf[js.Any])
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix)
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix)
    if (xDateFormat != null) __obj.updateDynamic("xDateFormat")(xDateFormat)
    __obj.asInstanceOf[TooltipOptions]
  }
}

