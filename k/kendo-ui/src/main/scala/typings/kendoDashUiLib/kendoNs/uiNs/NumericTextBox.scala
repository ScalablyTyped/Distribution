package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.NumericTextBox")
@js.native
class NumericTextBox protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: NumericTextBoxOptions) = this()
  @JSName("options")
  var options_NumericTextBox: NumericTextBoxOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def max(): scala.Double = js.native
  def max(value: java.lang.String): scala.Unit = js.native
  def max(value: scala.Double): scala.Unit = js.native
  def min(): scala.Double = js.native
  def min(value: java.lang.String): scala.Unit = js.native
  def min(value: scala.Double): scala.Unit = js.native
  def readonly(readonly: scala.Boolean): scala.Unit = js.native
  def step(): scala.Double = js.native
  def step(value: java.lang.String): scala.Unit = js.native
  def step(value: scala.Double): scala.Unit = js.native
  def value(): scala.Double = js.native
  def value(value: java.lang.String): scala.Unit = js.native
  def value(value: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.NumericTextBox")
@js.native
object NumericTextBox extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.NumericTextBox = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.NumericTextBox = js.native
}

