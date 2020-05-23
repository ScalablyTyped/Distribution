package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pane
  extends typings.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_Pane: PaneOptions = js.native
  var wrapper: JQuery = js.native
  def hideLoading(): Unit = js.native
  def navigate(url: String, transition: String): Unit = js.native
  def replace(url: String, transition: String): Unit = js.native
  def showLoading(): Unit = js.native
  def view(): View = js.native
}

