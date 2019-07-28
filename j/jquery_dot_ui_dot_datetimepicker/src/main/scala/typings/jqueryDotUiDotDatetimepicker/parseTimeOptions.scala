package typings.jqueryDotUiDotDatetimepicker

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
    val __obj = js.Dynamic.literal(format = format, time = time)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[parseTimeOptions]
  }
}

