package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.TreeView")
@js.native
class TreeView protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: TreeViewOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_TreeView: TreeViewOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def append(nodeData: js.Any): kendoDashUiLib.JQuery = js.native
  def append(nodeData: js.Any, parentNode: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def append(nodeData: js.Any, parentNode: kendoDashUiLib.JQuery, success: js.Function): kendoDashUiLib.JQuery = js.native
  def append(nodeData: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def append(nodeData: kendoDashUiLib.JQuery, parentNode: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def append(nodeData: kendoDashUiLib.JQuery, parentNode: kendoDashUiLib.JQuery, success: js.Function): kendoDashUiLib.JQuery = js.native
  def collapse(nodes: java.lang.String): scala.Unit = js.native
  def collapse(nodes: kendoDashUiLib.JQuery): scala.Unit = js.native
  def collapse(nodes: stdLib.Element): scala.Unit = js.native
  def dataItem(node: java.lang.String): kendoDashUiLib.kendoNs.dataNs.Node = js.native
  def dataItem(node: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.dataNs.Node = js.native
  def dataItem(node: stdLib.Element): kendoDashUiLib.kendoNs.dataNs.Node = js.native
  def detach(node: java.lang.String): kendoDashUiLib.JQuery = js.native
  def detach(node: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def detach(node: stdLib.Element): kendoDashUiLib.JQuery = js.native
  def enable(nodes: java.lang.String): scala.Unit = js.native
  def enable(nodes: java.lang.String, enable: scala.Boolean): scala.Unit = js.native
  def enable(nodes: kendoDashUiLib.JQuery): scala.Unit = js.native
  def enable(nodes: kendoDashUiLib.JQuery, enable: scala.Boolean): scala.Unit = js.native
  def enable(nodes: scala.Boolean): scala.Unit = js.native
  def enable(nodes: scala.Boolean, enable: scala.Boolean): scala.Unit = js.native
  def enable(nodes: stdLib.Element): scala.Unit = js.native
  def enable(nodes: stdLib.Element, enable: scala.Boolean): scala.Unit = js.native
  def expand(nodes: java.lang.String): scala.Unit = js.native
  def expand(nodes: kendoDashUiLib.JQuery): scala.Unit = js.native
  def expand(nodes: stdLib.Element): scala.Unit = js.native
  def expandPath(path: js.Any, complete: js.Function): scala.Unit = js.native
  def expandTo(targetNode: js.Any): scala.Unit = js.native
  def expandTo(targetNode: kendoDashUiLib.kendoNs.dataNs.Node): scala.Unit = js.native
  def findByText(text: java.lang.String): kendoDashUiLib.JQuery = js.native
  def findByUid(uid: java.lang.String): kendoDashUiLib.JQuery = js.native
  def focus(): scala.Unit = js.native
  def insertAfter(nodeData: js.Any, referenceNode: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def insertBefore(nodeData: js.Any, referenceNode: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def items(): js.Any = js.native
  def parent(node: java.lang.String): kendoDashUiLib.JQuery = js.native
  def parent(node: kendoDashUiLib.JQuery): kendoDashUiLib.JQuery = js.native
  def parent(node: stdLib.Element): kendoDashUiLib.JQuery = js.native
  def remove(node: java.lang.String): scala.Unit = js.native
  def remove(node: kendoDashUiLib.JQuery): scala.Unit = js.native
  def remove(node: stdLib.Element): scala.Unit = js.native
  def select(): scala.Unit = js.native
  def select(node: java.lang.String): scala.Unit = js.native
  def select(node: kendoDashUiLib.JQuery): scala.Unit = js.native
  def select(node: stdLib.Element): scala.Unit = js.native
  @JSName("select")
  def select_JQuery(): kendoDashUiLib.JQuery = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource): scala.Unit = js.native
  def text(node: java.lang.String): java.lang.String = js.native
  def text(node: java.lang.String, newText: java.lang.String): scala.Unit = js.native
  def text(node: kendoDashUiLib.JQuery): java.lang.String = js.native
  def text(node: kendoDashUiLib.JQuery, newText: java.lang.String): scala.Unit = js.native
  def text(node: stdLib.Element): java.lang.String = js.native
  def text(node: stdLib.Element, newText: java.lang.String): scala.Unit = js.native
  def toggle(node: java.lang.String): scala.Unit = js.native
  def toggle(node: kendoDashUiLib.JQuery): scala.Unit = js.native
  def toggle(node: stdLib.Element): scala.Unit = js.native
  def updateIndeterminate(node: kendoDashUiLib.JQuery): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.TreeView")
@js.native
object TreeView extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.TreeView = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.TreeView = js.native
}

