package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ModalView")
@js.native
class ModalView protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ModalViewOptions) = this()
  @JSName("options")
  var options_ModalView: ModalViewOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def open(target: kendoDashUiLib.JQuery): scala.Unit = js.native
}

@JSGlobal("kendo.mobile.ui.ModalView")
@js.native
object ModalView extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.ModalView = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.ModalView = js.native
}

