package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) A custom `Date` class for advanced date
    * handling. For example, JDate can be hooked in to handle Jalali dates.
    */
  var Date: js.UndefOr[Any] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
    * for a given datetime. It takes the timestamp in terms of milliseconds
    * since January 1 1970, and returns the timezone offset in minutes. This
    * provides a hook for drawing time based charts in specific time zones
    * using their local DST crossover dates, with the help of external
    * libraries.
    */
  var getTimezoneOffset: js.UndefOr[TimezoneOffsetCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allows to manually load the
    * `moment.js` library from Highcharts options instead of the `window`. In
    * case of loading the library from a `script` tag, this option is not
    * needed, it will be loaded from there by default.
    */
  var moment: js.UndefOr[js.Function] = js.undefined
  
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
  
  inline def apply(): TimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOptions]
  }
  
  extension [Self <: TimeOptions](x: Self) {
    
    inline def setDate(value: Any): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setGetTimezoneOffset(value: /* timestamp */ Double => Double): Self = StObject.set(x, "getTimezoneOffset", js.Any.fromFunction1(value))
    
    inline def setGetTimezoneOffsetUndefined: Self = StObject.set(x, "getTimezoneOffset", js.undefined)
    
    inline def setMoment(value: js.Function): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    
    inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffset(value: Double): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetUndefined: Self = StObject.set(x, "timezoneOffset", js.undefined)
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
    
    inline def setUseUTCUndefined: Self = StObject.set(x, "useUTC", js.undefined)
  }
}
