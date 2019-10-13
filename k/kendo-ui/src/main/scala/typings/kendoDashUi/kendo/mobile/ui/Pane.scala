package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Pane")
@js.native
class Pane protected ()
  extends typings.kendoDashUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PaneOptions) = this()
  @JSName("options")
  var options_Pane: PaneOptions = js.native
  var wrapper: JQuery = js.native
  def hideLoading(): Unit = js.native
  def navigate(url: String, transition: String): Unit = js.native
  def replace(url: String, transition: String): Unit = js.native
  def showLoading(): Unit = js.native
  def view(): typings.kendoDashUi.kendo.mobile.ui.View = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Pane")
@js.native
object Pane extends js.Object {
  var fn: Pane = js.native
  def extend(proto: js.Object): Pane = js.native
}

