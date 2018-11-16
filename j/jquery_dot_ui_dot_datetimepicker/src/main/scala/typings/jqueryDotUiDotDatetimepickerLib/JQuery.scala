package typings
package jqueryDotUiDotDatetimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def datetimepicker(): JQuery = js.native
  def datetimepicker(method: java.lang.String, methodParameter: js.Any): js.Any = js.native
  def datetimepicker(options: DateTimePickerOptions): JQuery = js.native
  @JSName("datetimepicker")
  def datetimepicker_formatTime(
    method: jqueryDotUiDotDatetimepickerLib.jqueryDotUiDotDatetimepickerLibStrings.formatTime,
    methodParameter: formatTimeOptions
  ): java.lang.String = js.native
  @JSName("datetimepicker")
  def datetimepicker_parseDateTime(
    method: jqueryDotUiDotDatetimepickerLib.jqueryDotUiDotDatetimepickerLibStrings.parseDateTime,
    methodParameter: parseDateTimeOptions
  ): stdLib.Date = js.native
  @JSName("datetimepicker")
  def datetimepicker_parseTime(
    method: jqueryDotUiDotDatetimepickerLib.jqueryDotUiDotDatetimepickerLibStrings.parseTime,
    methodParameter: parseTimeOptions
  ): Time = js.native
}

