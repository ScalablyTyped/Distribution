package typings.jqueryTimepicker

import typings.jqueryTimepicker.jqueryTimepickerStrings.getHour
import typings.jqueryTimepicker.jqueryTimepickerStrings.getMinute
import typings.jqueryTimepicker.jqueryTimepickerStrings.getTime
import typings.jqueryTimepicker.jqueryTimepickerStrings.getTimeAsDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def timepicker(): JQuery = js.native
  def timepicker(methodName: String): Any = js.native
  def timepicker(methodName: String, methodParameter: Any): Any = js.native
  def timepicker(optionLiteral: String, optionName: String): Any = js.native
  def timepicker(options: TimePickerOptions): JQuery = js.native
  @JSName("timepicker")
  def timepicker_getHour(methodName: getHour): Double = js.native
  @JSName("timepicker")
  def timepicker_getMinute(methodName: getMinute): Double = js.native
  @JSName("timepicker")
  def timepicker_getTime(methodName: getTime): String = js.native
  @JSName("timepicker")
  def timepicker_getTimeAsDate(methodName: getTimeAsDate): js.Date = js.native
}
