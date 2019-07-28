package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.View")
@js.native
class View protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: typings.kendoDashUi.kendoNs.mobileNs.uiNs.ViewOptions) = this()
  @JSName("options")
  var options_View: typings.kendoDashUi.kendoNs.mobileNs.uiNs.ViewOptions = js.native
  var wrapper: JQuery = js.native
  def contentElement(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.View")
@js.native
object View extends js.Object {
  var fn: typings.kendoDashUi.kendoNs.mobileNs.uiNs.View = js.native
  def extend(proto: js.Object): typings.kendoDashUi.kendoNs.mobileNs.uiNs.View = js.native
}

