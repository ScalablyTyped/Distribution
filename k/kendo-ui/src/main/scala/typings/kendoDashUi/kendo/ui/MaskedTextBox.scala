package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.MaskedTextBox")
@js.native
class MaskedTextBox protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: MaskedTextBoxOptions) = this()
  @JSName("options")
  var options_MaskedTextBox: MaskedTextBoxOptions = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def raw(): String = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def value(): String = js.native
  def value(value: String): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.MaskedTextBox")
@js.native
object MaskedTextBox extends js.Object {
  var fn: MaskedTextBox = js.native
  def extend(proto: js.Object): MaskedTextBox = js.native
}

