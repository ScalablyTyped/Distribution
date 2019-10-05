package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.TimePicker")
@js.native
class TimePicker protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TimePickerOptions) = this()
  @JSName("options")
  var options_TimePicker: TimePickerOptions = js.native
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
  def readonly(readonly: Boolean): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def value(): Date = js.native
  def value(value: String): Unit = js.native
  def value(value: Date): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.TimePicker")
@js.native
object TimePicker extends js.Object {
  var fn: TimePicker = js.native
  def extend(proto: js.Object): TimePicker = js.native
}

