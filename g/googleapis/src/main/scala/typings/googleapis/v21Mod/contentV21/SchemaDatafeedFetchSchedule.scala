package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The required fields vary based on the frequency of fetching. For a monthly
  * fetch schedule, day_of_month and hour are required. For a weekly fetch
  * schedule, weekday and hour are required. For a daily fetch schedule, only
  * hour is required.
  */
@js.native
trait SchemaDatafeedFetchSchedule extends js.Object {
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
  implicit class SchemaDatafeedFetchScheduleOps[Self <: SchemaDatafeedFetchSchedule] (val x: Self) extends AnyVal {
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
    def setDayOfMonth(value: Double): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfMonth: Self = this.set("dayOfMonth", js.undefined)
    @scala.inline
    def setFetchUrl(value: String): Self = this.set("fetchUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchUrl: Self = this.set("fetchUrl", js.undefined)
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setMinuteOfHour(value: Double): Self = this.set("minuteOfHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteOfHour: Self = this.set("minuteOfHour", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setWeekday(value: String): Self = this.set("weekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
  }
  
}

