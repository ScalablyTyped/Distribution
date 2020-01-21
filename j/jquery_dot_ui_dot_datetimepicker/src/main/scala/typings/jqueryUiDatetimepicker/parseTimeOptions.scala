package typings.jqueryUiDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parseTimeOptions extends js.Object {
  var format: String
  var options: js.UndefOr[DateTimePickerOptions] = js.undefined
  var time: String
}

object parseTimeOptions {
  @scala.inline
  def apply(format: String, time: String, options: DateTimePickerOptions = null): parseTimeOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[parseTimeOptions]
  }
}

