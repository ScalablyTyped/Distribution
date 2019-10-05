package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryPromise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Confirm")
@js.native
class Confirm protected () extends Dialog {
  def this(element: Element) = this()
  def this(element: Element, options: ConfirmOptions) = this()
  @JSName("options")
  var options_Confirm: ConfirmOptions = js.native
  var result: JQueryPromise[_] = js.native
}

/* static members */
@JSGlobal("kendo.ui.Confirm")
@js.native
object Confirm extends js.Object {
  var fn: Confirm = js.native
  def extend(proto: js.Object): Confirm = js.native
}

