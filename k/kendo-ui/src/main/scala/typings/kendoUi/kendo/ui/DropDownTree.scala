package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.HierarchicalDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownTree
  extends StObject
     with Widget {
  
  def close(): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  def items(): Any = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_DropDownTree: DropDownTreeOptions = js.native
  
  var popup: Popup = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def search(word: String): Unit = js.native
  
  def setDataSource(dataSource: HierarchicalDataSource): Unit = js.native
  
  var tagList: JQuery = js.native
  
  def toggle(): Unit = js.native
  def toggle(toggle: Boolean): Unit = js.native
  
  var tree: JQuery = js.native
  
  var treeview: TreeView = js.native
  
  def value(): Any = js.native
  def value(value: String): Unit = js.native
  def value(value: Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
