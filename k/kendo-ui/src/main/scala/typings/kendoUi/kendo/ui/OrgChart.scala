package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.OrgChartDataSource
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgChart
  extends StObject
     with Widget {
  
  def append(item: Any, parent: String): Unit = js.native
  def append(item: Any, parent: JQuery): Unit = js.native
  def append(item: Any, parent: Element): Unit = js.native
  
  def cancelChanges(): Unit = js.native
  
  def collapse(node: String): Unit = js.native
  def collapse(node: JQuery): Unit = js.native
  def collapse(node: Element): Unit = js.native
  
  def dataItem(node: String): Unit = js.native
  def dataItem(node: JQuery): Unit = js.native
  def dataItem(node: Element): Unit = js.native
  
  var dataSource: OrgChartDataSource = js.native
  
  def delete(node: String): Unit = js.native
  def delete(node: JQuery): Unit = js.native
  def delete(node: Element): Unit = js.native
  
  def edit(node: String): Unit = js.native
  def edit(node: JQuery): Unit = js.native
  def edit(node: Element): Unit = js.native
  
  def expand(node: String): Unit = js.native
  def expand(node: JQuery): Unit = js.native
  def expand(node: Element): Unit = js.native
  
  def getCollapsedNodes(): Unit = js.native
  
  def items(): Unit = js.native
  
  @JSName("options")
  var options_OrgChart: OrgChartOptions = js.native
  
  def parent(node: String): Unit = js.native
  def parent(node: JQuery): Unit = js.native
  def parent(node: Element): Unit = js.native
  
  def saveChanges(): Unit = js.native
  
  def select(node: String): Unit = js.native
  def select(node: JQuery): Unit = js.native
  def select(node: Element): Unit = js.native
  
  var wrapper: JQuery = js.native
}
