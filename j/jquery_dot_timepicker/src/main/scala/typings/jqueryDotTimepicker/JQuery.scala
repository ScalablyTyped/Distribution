package typings.jqueryDotTimepicker

import typings.jqueryDotTimepicker.jqueryDotTimepickerStrings.getHour
import typings.jqueryDotTimepicker.jqueryDotTimepickerStrings.getMinute
import typings.jqueryDotTimepicker.jqueryDotTimepickerStrings.getTime
import typings.jqueryDotTimepicker.jqueryDotTimepickerStrings.getTimeAsDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def timepicker(): JQuery = js.native
  def timepicker(methodName: String): js.Any = js.native
  def timepicker(methodName: String, methodParameter: js.Any): js.Any = js.native
  def timepicker(optionLiteral: String, optionName: String): js.Any = js.native
  def timepicker(options: TimePickerOptions): JQuery = js.native
  @JSName("timepicker")
  def timepicker_getHour(methodName: getHour): Double = js.native
  @JSName("timepicker")
  def timepicker_getMinute(methodName: getMinute): Double = js.native
  @JSName("timepicker")
  def timepicker_getTime(methodName: getTime): String = js.native
  @JSName("timepicker")
  def timepicker_getTimeAsDate(methodName: getTimeAsDate): Date = js.native
}

