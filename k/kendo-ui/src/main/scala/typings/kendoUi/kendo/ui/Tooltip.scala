package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip extends Widget {
  @JSName("options")
  var options_Tooltip: TooltipOptions = js.native
  var popup: Popup = js.native
  var wrapper: JQuery = js.native
  def hide(): Unit = js.native
  def refresh(): Unit = js.native
  def show(element: JQuery): Unit = js.native
  def target(): JQuery = js.native
}

