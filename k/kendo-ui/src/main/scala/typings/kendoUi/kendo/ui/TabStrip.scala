package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.std.Element
import typings.std.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStrip
  extends StObject
     with Widget {
  
  def activateTab(item: JQuery): Unit = js.native
  
  def append(tab: Any): TabStrip = js.native
  
  def contentElement(itemIndex: Double): Element = js.native
  
  def contentHolder(itemIndex: Double): Element = js.native
  
  var dataSource: DataSource = js.native
  
  def deactivateTab(item: JQuery): Unit = js.native
  
  def disable(element: String): TabStrip = js.native
  def disable(element: JQuery): TabStrip = js.native
  def disable(element: Element): TabStrip = js.native
  
  def enable(element: String): TabStrip = js.native
  def enable(element: String, enable: Boolean): TabStrip = js.native
  def enable(element: JQuery): TabStrip = js.native
  def enable(element: JQuery, enable: Boolean): TabStrip = js.native
  def enable(element: Element): TabStrip = js.native
  def enable(element: Element, enable: Boolean): TabStrip = js.native
  
  def insertAfter(item: String, referenceTab: String): TabStrip = js.native
  def insertAfter(item: String, referenceTab: JQuery): TabStrip = js.native
  def insertAfter(item: String, referenceTab: Element): TabStrip = js.native
  def insertAfter(item: Any, referenceTab: String): TabStrip = js.native
  def insertAfter(item: Any, referenceTab: JQuery): TabStrip = js.native
  def insertAfter(item: Any, referenceTab: Element): TabStrip = js.native
  def insertAfter(item: JQuery, referenceTab: String): TabStrip = js.native
  def insertAfter(item: JQuery, referenceTab: JQuery): TabStrip = js.native
  def insertAfter(item: JQuery, referenceTab: Element): TabStrip = js.native
  def insertAfter(item: Element, referenceTab: String): TabStrip = js.native
  def insertAfter(item: Element, referenceTab: JQuery): TabStrip = js.native
  def insertAfter(item: Element, referenceTab: Element): TabStrip = js.native
  
  def insertBefore(item: String, referenceTab: String): TabStrip = js.native
  def insertBefore(item: String, referenceTab: JQuery): TabStrip = js.native
  def insertBefore(item: String, referenceTab: Element): TabStrip = js.native
  def insertBefore(item: Any, referenceTab: String): TabStrip = js.native
  def insertBefore(item: Any, referenceTab: JQuery): TabStrip = js.native
  def insertBefore(item: Any, referenceTab: Element): TabStrip = js.native
  def insertBefore(item: JQuery, referenceTab: String): TabStrip = js.native
  def insertBefore(item: JQuery, referenceTab: JQuery): TabStrip = js.native
  def insertBefore(item: JQuery, referenceTab: Element): TabStrip = js.native
  def insertBefore(item: Element, referenceTab: String): TabStrip = js.native
  def insertBefore(item: Element, referenceTab: JQuery): TabStrip = js.native
  def insertBefore(item: Element, referenceTab: Element): TabStrip = js.native
  
  def items(): HTMLCollection = js.native
  
  @JSName("options")
  var options_TabStrip: TabStripOptions = js.native
  
  def reload(element: String): TabStrip = js.native
  def reload(element: JQuery): TabStrip = js.native
  def reload(element: Element): TabStrip = js.native
  
  def remove(element: String): TabStrip = js.native
  def remove(element: Double): TabStrip = js.native
  def remove(element: JQuery): TabStrip = js.native
  
  def select(): JQuery = js.native
  def select(element: String): Unit = js.native
  def select(element: Double): Unit = js.native
  def select(element: JQuery): Unit = js.native
  def select(element: Element): Unit = js.native
  
  def setDataSource(dataSource: Any): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var tabGroup: JQuery = js.native
  
  var wrapper: JQuery = js.native
}
