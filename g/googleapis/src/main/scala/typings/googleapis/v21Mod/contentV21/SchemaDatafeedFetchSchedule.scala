package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedFetchSchedule extends StObject {
  
  /**
    * The day of the month the feed file should be fetched (1-31).
    */
  var dayOfMonth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The URL where the feed file can be fetched. Google Merchant Center will support automatic scheduled uploads using the HTTP, HTTPS, FTP, or SFTP protocols, so the value will need to be a valid link using one of those four protocols.
    */
  var fetchUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hour of the day the feed file should be fetched (0-23).
    */
  var hour: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minute of the hour the feed file should be fetched (0-59). Read-only.
    */
  var minuteOfHour: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An optional password for fetch_url.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the scheduled fetch is paused or not.
    */
  var paused: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Time zone used for schedule. UTC by default. For example, "America/Los_Angeles".
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional user name for fetch_url.
    */
  var username: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The day of the week the feed file should be fetched. Acceptable values are: - "`monday`" - "`tuesday`" - "`wednesday`" - "`thursday`" - "`friday`" - "`saturday`" - "`sunday`"
    */
  var weekday: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatafeedFetchSchedule {
  
  inline def apply(): SchemaDatafeedFetchSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedFetchSchedule]
  }
  
  extension [Self <: SchemaDatafeedFetchSchedule](x: Self) {
    
    inline def setDayOfMonth(value: Double): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthNull: Self = StObject.set(x, "dayOfMonth", null)
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    inline def setFetchUrl(value: String): Self = StObject.set(x, "fetchUrl", value.asInstanceOf[js.Any])
    
    inline def setFetchUrlNull: Self = StObject.set(x, "fetchUrl", null)
    
    inline def setFetchUrlUndefined: Self = StObject.set(x, "fetchUrl", js.undefined)
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourNull: Self = StObject.set(x, "hour", null)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinuteOfHour(value: Double): Self = StObject.set(x, "minuteOfHour", value.asInstanceOf[js.Any])
    
    inline def setMinuteOfHourNull: Self = StObject.set(x, "minuteOfHour", null)
    
    inline def setMinuteOfHourUndefined: Self = StObject.set(x, "minuteOfHour", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedNull: Self = StObject.set(x, "paused", null)
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayNull: Self = StObject.set(x, "weekday", null)
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
  }
}
