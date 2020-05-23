package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownTree extends Widget {
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_DropDownTree: DropDownTreeOptions = js.native
  var popup: Popup = js.native
  var tagList: JQuery = js.native
  var tree: JQuery = js.native
  var treeview: TreeView = js.native
  var wrapper: JQuery = js.native
  def close(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def items(): js.Any = js.native
  def open(): Unit = js.native
  def readonly(readonly: Boolean): Unit = js.native
  def refresh(): Unit = js.native
  def search(word: String): Unit = js.native
  def setDataSource(dataSource: HierarchicalDataSource): Unit = js.native
  def toggle(): Unit = js.native
  def toggle(toggle: Boolean): Unit = js.native
  def value(): js.Any = js.native
  def value(value: String): Unit = js.native
  def value(value: js.Any): Unit = js.native
}

