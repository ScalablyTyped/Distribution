package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.MaskedTextBox")
@js.native
class MaskedTextBox protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: MaskedTextBoxOptions) = this()
  @JSName("options")
  var options_MaskedTextBox: MaskedTextBoxOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def raw(): java.lang.String = js.native
  def readonly(readonly: scala.Boolean): scala.Unit = js.native
  def value(): java.lang.String = js.native
  def value(value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("kendo.ui.MaskedTextBox")
@js.native
object MaskedTextBox extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.MaskedTextBox = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.MaskedTextBox = js.native
}

