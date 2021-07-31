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
trait ListBox
  extends StObject
     with Widget {
  
  def clearSelection(): Unit = js.native
  
  def dataItem(element: String): ObservableObject = js.native
  def dataItem(element: JQuery): ObservableObject = js.native
  def dataItem(element: Element): ObservableObject = js.native
  
  def dataItems(): ObservableArray = js.native
  
  var dataSource: DataSource = js.native
  
  def enable(element: String): Unit = js.native
  def enable(element: String, enable: Boolean): Unit = js.native
  def enable(element: JQuery): Unit = js.native
  def enable(element: JQuery, enable: Boolean): Unit = js.native
  def enable(element: Element): Unit = js.native
  def enable(element: Element, enable: Boolean): Unit = js.native
  
  def items(): js.Any = js.native
  
  @JSName("options")
  var options_ListBox: ListBoxOptions = js.native
  
  def refresh(): Unit = js.native
  
  def remove(element: String): Unit = js.native
  def remove(element: js.Any): Unit = js.native
  def remove(element: JQuery): Unit = js.native
  def remove(element: Element): Unit = js.native
  
  def reorder(element: String, index: Double): Unit = js.native
  def reorder(element: JQuery, index: Double): Unit = js.native
  def reorder(element: Element, index: Double): Unit = js.native
  
  def select(): JQuery = js.native
  def select(items: js.Any): Unit = js.native
  def select(items: JQuery): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
