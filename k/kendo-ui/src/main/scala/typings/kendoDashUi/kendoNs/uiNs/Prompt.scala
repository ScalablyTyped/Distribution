package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQueryPromise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Prompt")
@js.native
class Prompt protected () extends Dialog {
  def this(element: Element) = this()
  def this(element: Element, options: PromptOptions) = this()
  @JSName("options")
  var options_Prompt: PromptOptions = js.native
  var result: JQueryPromise[_] = js.native
}

/* static members */
@JSGlobal("kendo.ui.Prompt")
@js.native
object Prompt extends js.Object {
  var fn: Prompt = js.native
  def extend(proto: js.Object): Prompt = js.native
}

