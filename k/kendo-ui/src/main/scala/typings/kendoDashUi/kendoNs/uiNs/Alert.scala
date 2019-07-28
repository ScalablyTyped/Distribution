package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Alert")
@js.native
class Alert protected () extends Dialog {
  def this(element: Element) = this()
  def this(element: Element, options: AlertOptions) = this()
  @JSName("options")
  var options_Alert: AlertOptions = js.native
}

/* static members */
@JSGlobal("kendo.ui.Alert")
@js.native
object Alert extends js.Object {
  var fn: Alert = js.native
  def extend(proto: js.Object): Alert = js.native
}

