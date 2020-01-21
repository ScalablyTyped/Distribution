package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for a date time object. e.g. 2018-01-01, 5th August.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DateTime extends js.Object {
  /**
    * One or more of the following must be set. All fields are optional, but
    * when set must be valid date or time values.
    */
  var date: js.UndefOr[SchemaGoogleTypeDate] = js.native
  var dayOfWeek: js.UndefOr[String] = js.native
  var time: js.UndefOr[SchemaGoogleTypeTimeOfDay] = js.native
  var timeZone: js.UndefOr[SchemaGooglePrivacyDlpV2TimeZone] = js.native
}

object SchemaGooglePrivacyDlpV2DateTime {
  @scala.inline
  def apply(
    date: SchemaGoogleTypeDate = null,
    dayOfWeek: String = null,
    time: SchemaGoogleTypeTimeOfDay = null,
    timeZone: SchemaGooglePrivacyDlpV2TimeZone = null
  ): SchemaGooglePrivacyDlpV2DateTime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DateTime]
  }
}

