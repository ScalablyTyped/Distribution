package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global options that don't apply to each chart. These options, like the lang options, must be set using the
  * Highcharts.setOptions method.
  */
trait GlobalObject extends js.Object {
  /**
    * A custom Date class for advanced date handling. For example, JDate can be hooked in to handle Jalali dates.
    * @since 4.0.4
    */
  var Date: js.UndefOr[js.Any] = js.undefined
  /**
    * Path to the pattern image required by VML browsers in order to draw radial gradients.
    * @default 'http://code.highcharts.com/{version}/gfx/vml-radial-gradient.png'
    * @since 2.3.0
    */
  var VMLRadialGradientURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL to the additional file to lazy load for Android 2.x devices. These devices don't support SVG, so we
    * download a helper file that contains canvg, its dependency rbcolor, and our own CanVG Renderer class. To avoid
    * hotlinking to our site, you can install canvas-tools.js on your own server and change this option accordingly.
    * @default 'http://code.highcharts.com/{version}/modules/canvas-tools.js'
    */
  var canvasToolsURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback to return the time zone offset for a given datetime. It takes the timestamp in terms of milliseconds
    * since January 1 1970, and returns the timezone offset in minutes. This provides a hook for drawing time based
    * charts in specific time zones using their local DST crossover dates, with the help of external libraries.
    * @since 4.1.0
    */
  var getTimezoneOffset: js.UndefOr[js.Function1[/* timestamp */ scala.Double, scala.Double]] = js.undefined
  /**
    * Requires moment.js. If the timezone option is specified, it creates a default getTimezoneOffset function that
    * looks up the specified timezone in moment.js. If moment.js is not included, this throws a Highcharts error in
    * the console, but does not crash the chart.
    * @default undefined
    * @since 5.0.7
    */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The timezone offset in minutes. Positive values are west, negative values are east of UTC, as in the ECMAScript
    * getTimezoneOffset method. Use this to display UTC based data in a predefined time zone.
    * @default 0
    * @since 3.0.8
    */
  var timezoneOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to use UTC time for axis scaling, tickmark placement and time display in Highcharts.dateFormat.
    * Advantages of using UTC is that the time displays equally regardless of the user agent's time zone settings.
    * Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are
    * required.
    * @default true
    */
  var useUTC: js.UndefOr[scala.Boolean] = js.undefined
}

object GlobalObject {
  @scala.inline
  def apply(
    Date: js.Any = null,
    VMLRadialGradientURL: java.lang.String = null,
    canvasToolsURL: java.lang.String = null,
    getTimezoneOffset: /* timestamp */ scala.Double => scala.Double = null,
    timezone: java.lang.String = null,
    timezoneOffset: scala.Int | scala.Double = null,
    useUTC: js.UndefOr[scala.Boolean] = js.undefined
  ): GlobalObject = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (VMLRadialGradientURL != null) __obj.updateDynamic("VMLRadialGradientURL")(VMLRadialGradientURL)
    if (canvasToolsURL != null) __obj.updateDynamic("canvasToolsURL")(canvasToolsURL)
    if (getTimezoneOffset != null) __obj.updateDynamic("getTimezoneOffset")(js.Any.fromFunction1(getTimezoneOffset))
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (timezoneOffset != null) __obj.updateDynamic("timezoneOffset")(timezoneOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC)
    __obj.asInstanceOf[GlobalObject]
  }
}

