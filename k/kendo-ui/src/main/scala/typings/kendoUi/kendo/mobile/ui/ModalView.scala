package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ModalView")
@js.native
class ModalView protected ()
  extends typings.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ModalViewOptions) = this()
  @JSName("options")
  var options_ModalView: ModalViewOptions = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def open(): Unit = js.native
  def open(target: JQuery): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.ModalView")
@js.native
object ModalView extends js.Object {
  var fn: ModalView = js.native
  def extend(proto: js.Object): ModalView = js.native
}

