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
  def apply(): SchemaGooglePrivacyDlpV2Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Value]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ValueOps[Self <: SchemaGooglePrivacyDlpV2Value] (val x: Self) extends AnyVal {
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
    def setBooleanValue(value: Boolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    @scala.inline
    def setDateValue(value: SchemaGoogleTypeDate): Self = this.set("dateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateValue: Self = this.set("dateValue", js.undefined)
    @scala.inline
    def setDayOfWeekValue(value: String): Self = this.set("dayOfWeekValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeekValue: Self = this.set("dayOfWeekValue", js.undefined)
    @scala.inline
    def setFloatValue(value: Double): Self = this.set("floatValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatValue: Self = this.set("floatValue", js.undefined)
    @scala.inline
    def setIntegerValue(value: String): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    @scala.inline
    def setTimeValue(value: SchemaGoogleTypeTimeOfDay): Self = this.set("timeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeValue: Self = this.set("timeValue", js.undefined)
    @scala.inline
    def setTimestampValue(value: String): Self = this.set("timestampValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampValue: Self = this.set("timestampValue", js.undefined)
  }
  
}

