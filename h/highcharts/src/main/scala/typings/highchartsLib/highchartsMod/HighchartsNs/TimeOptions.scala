package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOptions extends js.Object {
  /**
    * A custom Date class for advanced date handling. For example, JDate can be hooked in to handle Jalali dates.
    * @default undefined
    * @since 4.0.4
    */
  var Date: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * A callback to return the time zone offset for a given datetime. It takes the timestamp in terms of milliseconds since
    * January 1 1970, and returns the timezone offset in minutes. This provides a hook for drawing time based charts in
    * specific time zones using their local DST crossover dates, with the help of external libraries.
    * @default undefined
    * @since 4.1.0
    */
  var getTimezoneOffset: js.UndefOr[js.Function1[/* timestamp */ stdLib.Date, scala.Double]] = js.undefined
  /**
    * Requires moment.js. If the timezone option is specified, it creates a default getTimezoneOffset function that looks
    * up the specified timezone in moment.js. If moment.js is not included, this throws a Highcharts error in the console,
    * but does not crash the chart.
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
    * Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are required.
    * @default undefined
    * @since 6.0.5
    */
  var useUTC: js.UndefOr[scala.Boolean] = js.undefined
}

object TimeOptions {
  @scala.inline
  def apply(
    Date: stdLib.Date = null,
    getTimezoneOffset: js.Function1[/* timestamp */ stdLib.Date, scala.Double] = null,
    timezone: java.lang.String = null,
    timezoneOffset: scala.Int | scala.Double = null,
    useUTC: js.UndefOr[scala.Boolean] = js.undefined
  ): TimeOptions = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (getTimezoneOffset != null) __obj.updateDynamic("getTimezoneOffset")(getTimezoneOffset)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (timezoneOffset != null) __obj.updateDynamic("timezoneOffset")(timezoneOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC)
    __obj.asInstanceOf[TimeOptions]
  }
}

