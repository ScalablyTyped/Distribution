package typings.jqueryDotUiDotDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formatTimeOptions extends js.Object {
  var format: String
  var options: js.UndefOr[DateTimePickerOptions] = js.undefined
  var time: Time
}

object formatTimeOptions {
  @scala.inline
  def apply(format: String, time: Time, options: DateTimePickerOptions = null): formatTimeOptions = {
    val __obj = js.Dynamic.literal(format = format, time = time)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[formatTimeOptions]
  }
}

