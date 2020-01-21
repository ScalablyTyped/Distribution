package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of primitive values supported by the system. Note that for the purposes
  * of inspection or transformation, the number of bytes considered to comprise
  * a &#39;Value&#39; is based on its representation as a UTF-8 encoded string.
  * For example, if &#39;integer_value&#39; is set to 123456789, the number of
  * bytes would be counted as 9, even though an int64 only holds up to 8 bytes
  * of data.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Value extends js.Object {
  var booleanValue: js.UndefOr[Boolean] = js.native
  var dateValue: js.UndefOr[SchemaGoogleTypeDate] = js.native
  var dayOfWeekValue: js.UndefOr[String] = js.native
  var floatValue: js.UndefOr[Double] = js.native
  var integerValue: js.UndefOr[String] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var timeValue: js.UndefOr[SchemaGoogleTypeTimeOfDay] = js.native
  var timestampValue: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2Value {
  @scala.inline
  def apply(
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    dateValue: SchemaGoogleTypeDate = null,
    dayOfWeekValue: String = null,
    floatValue: Int | Double = null,
    integerValue: String = null,
    stringValue: String = null,
    timeValue: SchemaGoogleTypeTimeOfDay = null,
    timestampValue: String = null
  ): SchemaGooglePrivacyDlpV2Value = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue.asInstanceOf[js.Any])
    if (dateValue != null) __obj.updateDynamic("dateValue")(dateValue.asInstanceOf[js.Any])
    if (dayOfWeekValue != null) __obj.updateDynamic("dayOfWeekValue")(dayOfWeekValue.asInstanceOf[js.Any])
    if (floatValue != null) __obj.updateDynamic("floatValue")(floatValue.asInstanceOf[js.Any])
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (timeValue != null) __obj.updateDynamic("timeValue")(timeValue.asInstanceOf[js.Any])
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Value]
  }
}

