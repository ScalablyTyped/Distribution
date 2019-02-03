package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Prompt")
@js.native
class Prompt protected () extends Dialog {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: PromptOptions) = this()
  @JSName("options")
  var options_Prompt: PromptOptions = js.native
  var result: kendoDashUiLib.JQueryPromise[_] = js.native
}

/* static members */
@JSGlobal("kendo.ui.Prompt")
@js.native
object Prompt extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Prompt = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Prompt = js.native
}

