package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Validator")
@js.native
class Validator protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ValidatorOptions) = this()
  @JSName("options")
  var options_Validator: ValidatorOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def errors(): js.Any = js.native
  def hideMessages(): scala.Unit = js.native
  def validate(): scala.Boolean = js.native
  def validateInput(input: kendoDashUiLib.JQuery): scala.Boolean = js.native
  def validateInput(input: stdLib.Element): scala.Boolean = js.native
}

@JSGlobal("kendo.ui.Validator")
@js.native
object Validator extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Validator = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Validator = js.native
}

