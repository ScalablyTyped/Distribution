package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DropTarget")
@js.native
class DropTarget protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DropTargetOptions) = this()
  @JSName("options")
  var options_DropTarget: DropTargetOptions = js.native
}

/* static members */
@JSGlobal("kendo.ui.DropTarget")
@js.native
object DropTarget extends js.Object {
  def destroyGroup(groupName: String): Unit = js.native
}

