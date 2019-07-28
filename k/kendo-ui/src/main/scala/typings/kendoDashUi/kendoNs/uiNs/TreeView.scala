package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.dataNs.DataSource
import typings.kendoDashUi.kendoNs.dataNs.HierarchicalDataSource
import typings.kendoDashUi.kendoNs.dataNs.Node
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.TreeView")
@js.native
class TreeView protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TreeViewOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_TreeView: TreeViewOptions = js.native
  var wrapper: JQuery = js.native
  def append(nodeData: js.Any): JQuery = js.native
  def append(nodeData: js.Any, parentNode: JQuery): JQuery = js.native
  def append(nodeData: js.Any, parentNode: JQuery, success: js.Function): JQuery = js.native
  def append(nodeData: JQuery): JQuery = js.native
  def append(nodeData: JQuery, parentNode: JQuery): JQuery = js.native
  def append(nodeData: JQuery, parentNode: JQuery, success: js.Function): JQuery = js.native
  def collapse(nodes: String): Unit = js.native
  def collapse(nodes: JQuery): Unit = js.native
  def collapse(nodes: Element): Unit = js.native
  def dataItem(node: String): Node = js.native
  def dataItem(node: JQuery): Node = js.native
  def dataItem(node: Element): Node = js.native
  def detach(node: String): JQuery = js.native
  def detach(node: JQuery): JQuery = js.native
  def detach(node: Element): JQuery = js.native
  def enable(nodes: String): Unit = js.native
  def enable(nodes: String, enable: Boolean): Unit = js.native
  def enable(nodes: Boolean): Unit = js.native
  def enable(nodes: Boolean, enable: Boolean): Unit = js.native
  def enable(nodes: JQuery): Unit = js.native
  def enable(nodes: JQuery, enable: Boolean): Unit = js.native
  def enable(nodes: Element): Unit = js.native
  def enable(nodes: Element, enable: Boolean): Unit = js.native
  def expand(nodes: String): Unit = js.native
  def expand(nodes: JQuery): Unit = js.native
  def expand(nodes: Element): Unit = js.native
  def expandPath(path: js.Any, complete: js.Function): Unit = js.native
  def expandTo(targetNode: js.Any): Unit = js.native
  def expandTo(targetNode: Node): Unit = js.native
  def findByText(text: String): JQuery = js.native
  def findByUid(uid: String): JQuery = js.native
  def focus(): Unit = js.native
  def insertAfter(nodeData: js.Any, referenceNode: JQuery): JQuery = js.native
  def insertBefore(nodeData: js.Any, referenceNode: JQuery): JQuery = js.native
  def items(): js.Any = js.native
  def parent(node: String): JQuery = js.native
  def parent(node: JQuery): JQuery = js.native
  def parent(node: Element): JQuery = js.native
  def remove(node: String): Unit = js.native
  def remove(node: JQuery): Unit = js.native
  def remove(node: Element): Unit = js.native
  def select(): JQuery = js.native
  def select(node: String): Unit = js.native
  def select(node: JQuery): Unit = js.native
  def select(node: Element): Unit = js.native
  @JSName("select")
  def select_Unit(): Unit = js.native
  def setDataSource(dataSource: HierarchicalDataSource): Unit = js.native
  def text(node: String): String = js.native
  def text(node: String, newText: String): Unit = js.native
  def text(node: JQuery): String = js.native
  def text(node: JQuery, newText: String): Unit = js.native
  def text(node: Element): String = js.native
  def text(node: Element, newText: String): Unit = js.native
  def toggle(node: String): Unit = js.native
  def toggle(node: JQuery): Unit = js.native
  def toggle(node: Element): Unit = js.native
  def updateIndeterminate(node: JQuery): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.TreeView")
@js.native
object TreeView extends js.Object {
  var fn: TreeView = js.native
  def extend(proto: js.Object): TreeView = js.native
}

