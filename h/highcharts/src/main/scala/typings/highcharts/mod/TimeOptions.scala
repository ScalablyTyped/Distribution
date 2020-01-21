package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) A custom `Date` class for advanced date
    * handling. For example, JDate can be hooked in to handle Jalali dates.
    */
  var Date: js.UndefOr[js.Any] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
    * for a given datetime. It takes the timestamp in terms of milliseconds
    * since January 1 1970, and returns the timezone offset in minutes. This
    * provides a hook for drawing time based charts in specific time zones
    * using their local DST crossover dates, with the help of external
    * libraries.
    */
  var getTimezoneOffset: js.UndefOr[js.Any] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
    * is specified, it creates a default getTimezoneOffset function that looks
    * up the specified timezone in moment.js. If moment.js is not included,
    * this throws a Highcharts error in the console, but does not crash the
    * chart.
    */
  var timezone: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
    * values are west, negative values are east of UTC, as in the ECMAScript
    * getTimezoneOffset method. Use this to display UTC based data in a
    * predefined time zone.
    */
  var timezoneOffset: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use UTC time for axis
    * scaling, tickmark placement and time display in `Highcharts.dateFormat`.
    * Advantages of using UTC is that the time displays equally regardless of
    * the user agent's time zone settings. Local time can be used when the data
    * is loaded in real time or when correct Daylight Saving Time transitions
    * are required.
    */
  var useUTC: js.UndefOr[Boolean] = js.undefined
}

object TimeOptions {
  @scala.inline
  def apply(
    Date: js.Any = null,
    getTimezoneOffset: js.Any = null,
    timezone: String = null,
    timezoneOffset: Int | Double = null,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): TimeOptions = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (getTimezoneOffset != null) __obj.updateDynamic("getTimezoneOffset")(getTimezoneOffset.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (timezoneOffset != null) __obj.updateDynamic("timezoneOffset")(timezoneOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOptions]
  }
}

