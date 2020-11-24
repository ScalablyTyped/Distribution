package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Gantt) A custom `Date` class for advanced date
    * handling. For example, JDate can be hooked in to handle Jalali dates.
    */
  var Date: js.UndefOr[js.Any] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
    * for a given datetime. It takes the timestamp in terms of milliseconds
    * since January 1 1970, and returns the timezone offset in minutes. This
    * provides a hook for drawing time based charts in specific time zones
    * using their local DST crossover dates, with the help of external
    * libraries.
    */
  var getTimezoneOffset: js.UndefOr[TimezoneOffsetCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allows to manually load the
    * `moment.js` library from Highcharts options instead of the `window`. In
    * case of loading the library from a `script` tag, this option is not
    * needed, it will be loaded from there by default.
    */
  var moment: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
    * is specified, it creates a default getTimezoneOffset function that looks
    * up the specified timezone in moment.js. If moment.js is not included,
    * this throws a Highcharts error in the console, but does not crash the
    * chart.
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
    * values are west, negative values are east of UTC, as in the ECMAScript
    * getTimezoneOffset method. Use this to display UTC based data in a
    * predefined time zone.
    */
  var timezoneOffset: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use UTC time for axis
    * scaling, tickmark placement and time display in `Highcharts.dateFormat`.
    * Advantages of using UTC is that the time displays equally regardless of
    * the user agent's time zone settings. Local time can be used when the data
    * is loaded in real time or when correct Daylight Saving Time transitions
    * are required.
    */
  var useUTC: js.UndefOr[Boolean] = js.native
}
object TimeOptions {
  
  @scala.inline
  def apply(): TimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOptions]
  }
  
  @scala.inline
  implicit class TimeOptionsOps[Self <: TimeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: js.Any): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("Date", js.undefined)
    
    @scala.inline
    def setGetTimezoneOffset(value: /* timestamp */ Double => Double): Self = this.set("getTimezoneOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetTimezoneOffset: Self = this.set("getTimezoneOffset", js.undefined)
    
    @scala.inline
    def setMoment(value: js.Function): Self = this.set("moment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoment: Self = this.set("moment", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setTimezoneOffset(value: Double): Self = this.set("timezoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneOffset: Self = this.set("timezoneOffset", js.undefined)
    
    @scala.inline
    def setUseUTC(value: Boolean): Self = this.set("useUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUTC: Self = this.set("useUTC", js.undefined)
  }
}
