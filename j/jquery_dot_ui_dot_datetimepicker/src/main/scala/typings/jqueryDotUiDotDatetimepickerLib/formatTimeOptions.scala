package typings
package jqueryDotUiDotDatetimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formatTimeOptions extends js.Object {
  var format: java.lang.String
  var options: js.UndefOr[DateTimePickerOptions] = js.undefined
  var time: Time
}

object formatTimeOptions {
  @scala.inline
  def apply(format: java.lang.String, time: Time, options: DateTimePickerOptions = null): formatTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("time")(time)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[formatTimeOptions]
  }
}

