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
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[formatTimeOptions]
  }
}

