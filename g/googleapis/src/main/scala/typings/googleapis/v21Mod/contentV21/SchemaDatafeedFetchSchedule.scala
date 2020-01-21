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
  def apply(
    dayOfMonth: Int | Double = null,
    fetchUrl: String = null,
    hour: Int | Double = null,
    minuteOfHour: Int | Double = null,
    password: String = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    timeZone: String = null,
    username: String = null,
    weekday: String = null
  ): SchemaDatafeedFetchSchedule = {
    val __obj = js.Dynamic.literal()
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth.asInstanceOf[js.Any])
    if (fetchUrl != null) __obj.updateDynamic("fetchUrl")(fetchUrl.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minuteOfHour != null) __obj.updateDynamic("minuteOfHour")(minuteOfHour.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatafeedFetchSchedule]
  }
}

