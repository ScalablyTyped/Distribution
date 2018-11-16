package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Pane")
@js.native
class Pane protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: PaneOptions) = this()
  @JSName("options")
  var options_Pane: PaneOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def hideLoading(): scala.Unit = js.native
  def navigate(url: java.lang.String, transition: java.lang.String): scala.Unit = js.native
  def replace(url: java.lang.String, transition: java.lang.String): scala.Unit = js.native
  def showLoading(): scala.Unit = js.native
  def view(): View = js.native
}

@JSGlobal("kendo.mobile.ui.Pane")
@js.native
object Pane extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.Pane = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.Pane = js.native
}

