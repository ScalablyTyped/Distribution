package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DateInput")
@js.native
class DateInput protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DateInputOptions) = this()
  @JSName("options")
  var options_DateInput: DateInputOptions = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def max(): Date = js.native
  def max(value: String): Unit = js.native
  def max(value: Date): Unit = js.native
  def min(): Date = js.native
  def min(value: String): Unit = js.native
  def min(value: Date): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def value(): Date = js.native
  def value(value: String): Unit = js.native
  def value(value: Date): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.DateInput")
@js.native
object DateInput extends js.Object {
  var fn: DateInput = js.native
  def extend(proto: js.Object): DateInput = js.native
}

