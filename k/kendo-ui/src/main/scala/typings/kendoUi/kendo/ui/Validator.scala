package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator extends Widget {
  @JSName("options")
  var options_Validator: ValidatorOptions = js.native
  var wrapper: JQuery = js.native
  def errors(): js.Any = js.native
  def hideMessages(): Unit = js.native
  def hideValidationSummary(): Unit = js.native
  def showValidationSummary(): Unit = js.native
  def validate(): Boolean = js.native
  def validateInput(input: JQuery): Boolean = js.native
  def validateInput(input: Element): Boolean = js.native
}

