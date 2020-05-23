package typings.kendoUi.global.kendo.ui

import typings.kendoUi.kendo.ui.DropTargetOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DropTarget")
@js.native
class DropTarget protected ()
  extends typings.kendoUi.kendo.ui.DropTarget {
  def this(element: Element) = this()
  def this(element: Element, options: DropTargetOptions) = this()
}

/* static members */
@JSGlobal("kendo.ui.DropTarget")
@js.native
object DropTarget extends js.Object {
  def destroyGroup(groupName: String): Unit = js.native
}

