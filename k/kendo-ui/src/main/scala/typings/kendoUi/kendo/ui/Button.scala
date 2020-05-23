package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends Widget {
  @JSName("options")
  var options_Button: ButtonOptions = js.native
  var wrapper: JQuery = js.native
  def enable(toggle: Boolean): Unit = js.native
}

