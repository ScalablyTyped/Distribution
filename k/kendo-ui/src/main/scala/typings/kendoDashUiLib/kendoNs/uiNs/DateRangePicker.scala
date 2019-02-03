package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DateRangePicker")
@js.native
class DateRangePicker protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: DateRangePickerOptions) = this()
  @JSName("options")
  var options_DateRangePicker: DateRangePickerOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def max(): stdLib.Date = js.native
  def max(value: java.lang.String): scala.Unit = js.native
  def max(value: stdLib.Date): scala.Unit = js.native
  def min(): stdLib.Date = js.native
  def min(value: java.lang.String): scala.Unit = js.native
  def min(value: stdLib.Date): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def range(): js.Any = js.native
  def range(range: DateRangePickerRange): scala.Unit = js.native
  def readonly(readonly: scala.Boolean): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.DateRangePicker")
@js.native
object DateRangePicker extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.DateRangePicker = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.DateRangePicker = js.native
}

