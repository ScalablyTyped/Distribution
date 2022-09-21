package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.ObservableArray
import typings.kendoUi.kendo.data.ObservableObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListView
  extends StObject
     with Widget {
  
  def add(): Unit = js.native
  
  def cancel(): Unit = js.native
  
  def clearSelection(): Unit = js.native
  
  var content: JQuery = js.native
  
  def dataItem(row: String): ObservableObject = js.native
  def dataItem(row: JQuery): ObservableObject = js.native
  def dataItem(row: Element): ObservableObject = js.native
  
  def dataItems(): ObservableArray = js.native
  
  var dataSource: DataSource = js.native
  
  def edit(item: JQuery): Unit = js.native
  
  def items(): Any = js.native
  
  @JSName("options")
  var options_ListView: ListViewOptions = js.native
  
  def refresh(): Unit = js.native
  
  def remove(item: Any): Unit = js.native
  
  def save(): Unit = js.native
  
  def select(): JQuery = js.native
  def select(items: Any): Unit = js.native
  def select(items: JQuery): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
