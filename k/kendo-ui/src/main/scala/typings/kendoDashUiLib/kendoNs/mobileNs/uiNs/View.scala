package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.View")
@js.native
class View protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ViewOptions) = this()
  @JSName("options")
  var options_View: ViewOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def contentElement(): scala.Unit = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.View")
@js.native
object View extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.View = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.View = js.native
}

