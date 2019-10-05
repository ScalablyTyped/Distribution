package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Validator")
@js.native
class Validator protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ValidatorOptions) = this()
  @JSName("options")
  var options_Validator: ValidatorOptions = js.native
  var wrapper: JQuery = js.native
  def errors(): js.Any = js.native
  def hideMessages(): Unit = js.native
  def validate(): Boolean = js.native
  def validateInput(input: JQuery): Boolean = js.native
  def validateInput(input: Element): Boolean = js.native
}

/* static members */
@JSGlobal("kendo.ui.Validator")
@js.native
object Validator extends js.Object {
  var fn: Validator = js.native
  def extend(proto: js.Object): Validator = js.native
}

