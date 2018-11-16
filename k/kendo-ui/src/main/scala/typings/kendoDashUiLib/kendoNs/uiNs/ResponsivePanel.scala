package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ResponsivePanel")
@js.native
class ResponsivePanel protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ResponsivePanelOptions) = this()
  @JSName("options")
  var options_ResponsivePanel: ResponsivePanelOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def open(): scala.Unit = js.native
}

@JSGlobal("kendo.ui.ResponsivePanel")
@js.native
object ResponsivePanel extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.ResponsivePanel = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.ResponsivePanel = js.native
}

