package typings.jqueryUiDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait parseDateTimeOptions extends js.Object {
  var dateFormat: String = js.native
  var dateSettings: String = js.native
  var dateTimeString: String = js.native
  var timeFormat: String = js.native
  var timeSettings: String = js.native
}

object parseDateTimeOptions {
  @scala.inline
  def apply(
    dateFormat: String,
    dateSettings: String,
    dateTimeString: String,
    timeFormat: String,
    timeSettings: String
  ): parseDateTimeOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], dateSettings = dateSettings.asInstanceOf[js.Any], dateTimeString = dateTimeString.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any], timeSettings = timeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[parseDateTimeOptions]
  }
  @scala.inline
  implicit class parseDateTimeOptionsOps[Self <: parseDateTimeOptions] (val x: Self) extends AnyVal {
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
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateSettings(value: String): Self = this.set("dateSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTimeString(value: String): Self = this.set("dateTimeString", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeSettings(value: String): Self = this.set("timeSettings", value.asInstanceOf[js.Any])
  }
  
}

