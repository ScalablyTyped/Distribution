package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button
  extends typings.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_Button: ButtonOptions = js.native
  var wrapper: JQuery = js.native
  def badge(value: String): String = js.native
  def badge(value: Boolean): String = js.native
  def enable(enable: Boolean): Unit = js.native
}

