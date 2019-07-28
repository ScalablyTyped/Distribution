package typings.jqueryDotUiDotDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parseDateTimeOptions extends js.Object {
  var dateFormat: String
  var dateSettings: String
  var dateTimeString: String
  var timeFormat: String
  var timeSettings: String
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
    val __obj = js.Dynamic.literal(dateFormat = dateFormat, dateSettings = dateSettings, dateTimeString = dateTimeString, timeFormat = timeFormat, timeSettings = timeSettings)
  
    __obj.asInstanceOf[parseDateTimeOptions]
  }
}

