package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.BackButton")
@js.native
class BackButton protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: BackButtonOptions) = this()
  @JSName("options")
  var options_BackButton: BackButtonOptions = js.native
  var wrapper: JQuery = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.BackButton")
@js.native
object BackButton extends js.Object {
  var fn: BackButton = js.native
  def extend(proto: js.Object): BackButton = js.native
}

