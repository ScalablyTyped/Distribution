package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DateTimePicker")
@js.native
class DateTimePicker protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: DateTimePickerOptions) = this()
  @JSName("options")
  var options_DateTimePicker: DateTimePickerOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(view: java.lang.String): scala.Unit = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def max(): stdLib.Date = js.native
  def max(value: java.lang.String): scala.Unit = js.native
  def max(value: stdLib.Date): scala.Unit = js.native
  def min(): stdLib.Date = js.native
  def min(value: java.lang.String): scala.Unit = js.native
  def min(value: stdLib.Date): scala.Unit = js.native
  def open(view: java.lang.String): scala.Unit = js.native
  def readonly(readonly: scala.Boolean): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def toggle(view: java.lang.String): scala.Unit = js.native
  def value(): stdLib.Date = js.native
  def value(value: java.lang.String): scala.Unit = js.native
  def value(value: stdLib.Date): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.DateTimePicker")
@js.native
object DateTimePicker extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.DateTimePicker = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.DateTimePicker = js.native
}

