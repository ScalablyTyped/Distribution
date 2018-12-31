package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTooltipOptions extends js.Object {
  /**
    * For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the
    * closest data points. This member gives the default string representations used for each unit.
    */
  var dateTimeLabelFormats: js.UndefOr[DateTimeFormats] = js.undefined
  /**
    * Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an
    * extent. By default it behaves this way for scatter, bubble and pie series by override in the plotOptions for
    * those series types.
    *
    * For touch moves to behave the same way, followTouchMove must be true also.
    * @default false
    * @since 3.0
    */
  var followPointer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the tooltip should follow the finger as it moves on a touch device. If chart.zoomType is set, it will
    * override followTouchMove.
    * @default true
    * @since 3.0.1
    */
  var followTouchMove: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string to append to the tooltip format.
    * @default 'false'
    * @since 2.2
    */
  var footerFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables are point.key,
    * series.name, series.color and other members from the point and series objects. The point.key variable contains
    * the category name, x value or datetime string depending on the type of axis. For datetime axes, the point.key
    * date format can be set using tooltip.xDateFormat.
    *
    * @default '<span style='font-size: 10px'>{point.key}</span><br/>'
    */
  var headerFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart.
    * @default 500
    * @since 3.0
    */
  var hideDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are
    * point.x, point.y, series.name and series.color and other properties on the same form. Furthermore, point.y can be
    * extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each
    * series, which makes it a good hook for displaying units.
    *
    * @default '<span style='color:{point.color}'>\\u25CF</span> {series.name}: <b>{point.y}</b><br/>'
    * @since 2.2
    */
  var pointFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback function for formatting the HTML output for a single point in the tooltip. Like the pointFormat
    * string, but with more flexibility.
    *
    * The this keyword refers to the Point object.
    * @since 4.1.0
    */
  var pointFormatter: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /**
    * How many decimals to show in each series' y value. This is overridable in each series' tooltip options object.
    * The default is to preserve all decimals.
    * @since 2.2
    */
  var valueDecimals: js.UndefOr[scala.Double] = js.undefined
  /**
    * A string to prepend to each series' y value. Overridable in each series' tooltip options object.
    * @since 2.2
    */
  var valuePrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string to append to each series' y value. Overridable in each series' tooltip options object.
    * @since 2.2
    */
  var valueSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The format for the date in the tooltip header if the X axis is a datetime axis. The default is a best guess based
    * on the smallest distance between points in the chart.
    */
  var xDateFormat: js.UndefOr[java.lang.String] = js.undefined
}

