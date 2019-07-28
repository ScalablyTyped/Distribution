package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.NumericTextBox")
@js.native
class NumericTextBox protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: NumericTextBoxOptions) = this()
  @JSName("options")
  var options_NumericTextBox: NumericTextBoxOptions = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def max(): Double = js.native
  def max(value: String): Unit = js.native
  def max(value: Double): Unit = js.native
  def min(): Double = js.native
  def min(value: String): Unit = js.native
  def min(value: Double): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def step(): Double = js.native
  def step(value: String): Unit = js.native
  def step(value: Double): Unit = js.native
  def value(): Double = js.native
  def value(value: String): Unit = js.native
  def value(value: Double): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.NumericTextBox")
@js.native
object NumericTextBox extends js.Object {
  var fn: NumericTextBox = js.native
  def extend(proto: js.Object): NumericTextBox = js.native
}

