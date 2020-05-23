package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBox extends Widget {
  @JSName("options")
  var options_TextBox: TextBoxOptions = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def value(): String = js.native
  def value(value: String): Unit = js.native
}

