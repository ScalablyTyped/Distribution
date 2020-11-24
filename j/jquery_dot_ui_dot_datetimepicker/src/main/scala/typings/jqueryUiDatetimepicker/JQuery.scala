package typings.jqueryUiDatetimepicker

import typings.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.formatTime
import typings.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.parseDateTime
import typings.jqueryUiDatetimepicker.jqueryUiDatetimepickerStrings.parseTime
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def datetimepicker(): JQuery = js.native
  def datetimepicker(method: String, methodParameter: js.Any): js.Any = js.native
  def datetimepicker(options: DateTimePickerOptions): JQuery = js.native
  @JSName("datetimepicker")
  def datetimepicker_formatTime(method: formatTime, methodParameter: formatTimeOptions): String = js.native
  @JSName("datetimepicker")
  def datetimepicker_parseDateTime(method: parseDateTime, methodParameter: parseDateTimeOptions): Date = js.native
  @JSName("datetimepicker")
  def datetimepicker_parseTime(method: parseTime, methodParameter: parseTimeOptions): Time = js.native
}
