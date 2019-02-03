package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.DropDownTree")
@js.native
class DropDownTree protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: DropDownTreeOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_DropDownTree: DropDownTreeOptions = js.native
  var tagList: kendoDashUiLib.JQuery = js.native
  var tree: kendoDashUiLib.JQuery = js.native
  var treeview: TreeView = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def items(): js.Any = js.native
  def open(): scala.Unit = js.native
  def readonly(readonly: scala.Boolean): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def search(word: java.lang.String): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
  def toggle(toggle: scala.Boolean): scala.Unit = js.native
  def value(): js.Any = js.native
  def value(value: java.lang.String): scala.Unit = js.native
  def value(value: js.Any): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.DropDownTree")
@js.native
object DropDownTree extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.DropDownTree = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.DropDownTree = js.native
}

