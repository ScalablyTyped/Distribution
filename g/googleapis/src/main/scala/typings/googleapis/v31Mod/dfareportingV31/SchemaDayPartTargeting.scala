package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Day Part Targeting.
  */
@js.native
trait SchemaDayPartTargeting extends js.Object {
  /**
    * Days of the week when the ad will serve.  Acceptable values are: -
    * &quot;SUNDAY&quot; - &quot;MONDAY&quot; - &quot;TUESDAY&quot; -
    * &quot;WEDNESDAY&quot; - &quot;THURSDAY&quot; - &quot;FRIDAY&quot; -
    * &quot;SATURDAY&quot;
    */
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
  /**
    * Hours of the day when the ad will serve, where 0 is midnight to 1 AM and
    * 23 is 11 PM to midnight. Can be specified with days of week, in which
    * case the ad would serve during these hours on the specified days. For
    * example if Monday, Wednesday, Friday are the days of week specified and
    * 9-10am, 3-5pm (hours 9, 15, and 16) is specified, the ad would serve
    * Monday, Wednesdays, and Fridays at 9-10am and 3-5pm. Acceptable values
    * are 0 to 23, inclusive.
    */
  var hoursOfDay: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Whether or not to use the user&#39;s local time. If false, the
    * America/New York time zone applies.
    */
  var userLocalTime: js.UndefOr[Boolean] = js.native
}

object SchemaDayPartTargeting {
  @scala.inline
  def apply(
    daysOfWeek: js.Array[String] = null,
    hoursOfDay: js.Array[Double] = null,
    userLocalTime: js.UndefOr[Boolean] = js.undefined
  ): SchemaDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (daysOfWeek != null) __obj.updateDynamic("daysOfWeek")(daysOfWeek.asInstanceOf[js.Any])
    if (hoursOfDay != null) __obj.updateDynamic("hoursOfDay")(hoursOfDay.asInstanceOf[js.Any])
    if (!js.isUndefined(userLocalTime)) __obj.updateDynamic("userLocalTime")(userLocalTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDayPartTargeting]
  }
}

