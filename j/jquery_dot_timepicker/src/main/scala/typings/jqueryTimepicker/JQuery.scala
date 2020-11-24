package typings.jqueryTimepicker

import typings.jqueryTimepicker.jqueryTimepickerStrings.getHour
import typings.jqueryTimepicker.jqueryTimepickerStrings.getMinute
import typings.jqueryTimepicker.jqueryTimepickerStrings.getTime
import typings.jqueryTimepicker.jqueryTimepickerStrings.getTimeAsDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
