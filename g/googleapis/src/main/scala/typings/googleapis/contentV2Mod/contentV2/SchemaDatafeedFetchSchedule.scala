package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The required fields vary based on the frequency of fetching. For a monthly
  * fetch schedule, day_of_month and hour are required. For a weekly fetch
  * schedule, weekday and hour are required. For a daily fetch schedule, only
  * hour is required.
  */
@js.native
trait SchemaDatafeedFetchSchedule extends StObject {
  
  /**
    * The day of the month the feed file should be fetched (1-31).
    */
  var dayOfMonth: js.UndefOr[Double] = js.native
  
  /**
    * The URL where the feed file can be fetched. Google Merchant Center will
    * support automatic scheduled uploads using the HTTP, HTTPS, FTP, or SFTP
    * protocols, so the value will need to be a valid link using one of those
    * four protocols.
    */
  var fetchUrl: js.UndefOr[String] = js.native
  
  /**
    * The hour of the day the feed file should be fetched (0-23).
    */
  var hour: js.UndefOr[Double] = js.native
  
  /**
    * The minute of the hour the feed file should be fetched (0-59). Read-only.
    */
  var minuteOfHour: js.UndefOr[Double] = js.native
  
  /**
    * An optional password for fetch_url.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Whether the scheduled fetch is paused or not.
    */
  var paused: js.UndefOr[Boolean] = js.native
  
  /**
    * Time zone used for schedule. UTC by default. E.g.,
    * &quot;America/Los_Angeles&quot;.
    */
  var timeZone: js.UndefOr[String] = js.native
  
  /**
    * An optional user name for fetch_url.
    */
  var username: js.UndefOr[String] = js.native
  
  /**
    * The day of the week the feed file should be fetched.
    */
  var weekday: js.UndefOr[String] = js.native
}
object SchemaDatafeedFetchSchedule {
  
  @scala.inline
  def apply(): SchemaDatafeedFetchSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedFetchSchedule]
  }
  
  @scala.inline
  implicit class SchemaDatafeedFetchScheduleMutableBuilder[Self <: SchemaDatafeedFetchSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfMonth(value: Double): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    @scala.inline
    def setFetchUrl(value: String): Self = StObject.set(x, "fetchUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchUrlUndefined: Self = StObject.set(x, "fetchUrl", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setMinuteOfHour(value: Double): Self = StObject.set(x, "minuteOfHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteOfHourUndefined: Self = StObject.set(x, "minuteOfHour", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
  }
}
