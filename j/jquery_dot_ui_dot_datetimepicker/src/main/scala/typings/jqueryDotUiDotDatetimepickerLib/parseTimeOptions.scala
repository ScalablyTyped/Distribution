package typings
package jqueryDotUiDotDatetimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parseTimeOptions extends js.Object {
  var format: java.lang.String
  var options: js.UndefOr[DateTimePickerOptions] = js.undefined
  var time: java.lang.String
}

object parseTimeOptions {
  @scala.inline
  def apply(format: java.lang.String, time: java.lang.String, options: DateTimePickerOptions = null): parseTimeOptions = {
    val __obj = js.Dynamic.literal(format = format, time = time)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[parseTimeOptions]
  }
}

