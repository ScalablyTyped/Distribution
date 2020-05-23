package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge
  extends typings.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_Badge: BadgeOptions = js.native
  var wrapper: JQuery = js.native
  def hide(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def show(): Unit = js.native
  def value(newValue: String): Unit = js.native
  def value(newValue: Double): Unit = js.native
}

