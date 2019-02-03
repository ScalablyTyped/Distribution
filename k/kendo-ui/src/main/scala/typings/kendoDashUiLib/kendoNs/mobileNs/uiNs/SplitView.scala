package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.SplitView")
@js.native
class SplitView protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: SplitViewOptions) = this()
  @JSName("options")
  var options_SplitView: SplitViewOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def collapsePanes(): scala.Unit = js.native
  def expandPanes(): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.SplitView")
@js.native
object SplitView extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.SplitView = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.SplitView = js.native
}

