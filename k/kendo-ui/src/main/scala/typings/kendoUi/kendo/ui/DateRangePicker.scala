package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DateRangePicker")
@js.native
class DateRangePicker protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DateRangePickerOptions) = this()
  @JSName("options")
  var options_DateRangePicker: DateRangePickerOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def max(): Date = js.native
  def max(value: String): Unit = js.native
  def max(value: Date): Unit = js.native
  def min(): Date = js.native
  def min(value: String): Unit = js.native
  def min(value: Date): Unit = js.native
  def open(): Unit = js.native
  def range(): js.Any = js.native
  def range(range: DateRangePickerRange): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.DateRangePicker")
@js.native
object DateRangePicker extends js.Object {
  var fn: DateRangePicker = js.native
  def extend(proto: js.Object): DateRangePicker = js.native
}

