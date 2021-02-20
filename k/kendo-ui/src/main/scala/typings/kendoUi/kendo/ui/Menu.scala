package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends Widget {
  
  def append(item: js.Any): Menu = js.native
  def append(item: js.Any, referenceItem: String): Menu = js.native
  def append(item: js.Any, referenceItem: JQuery): Menu = js.native
  
  def close(element: String): Menu = js.native
  def close(element: JQuery): Menu = js.native
  def close(element: Element): Menu = js.native
  
  var dataSource: DataSource = js.native
  
  def enable(element: String, enable: Boolean): Menu = js.native
  def enable(element: JQuery, enable: Boolean): Menu = js.native
  def enable(element: Element, enable: Boolean): Menu = js.native
  
  def findByUid(uid: String): JQuery = js.native
  
  def insertAfter(item: js.Any, referenceItem: String): Menu = js.native
  def insertAfter(item: js.Any, referenceItem: JQuery): Menu = js.native
  def insertAfter(item: js.Any, referenceItem: Element): Menu = js.native
  
  def insertBefore(item: js.Any, referenceItem: String): Menu = js.native
  def insertBefore(item: js.Any, referenceItem: JQuery): Menu = js.native
  def insertBefore(item: js.Any, referenceItem: Element): Menu = js.native
  
  def open(element: String): Menu = js.native
  def open(element: JQuery): Menu = js.native
  def open(element: Element): Menu = js.native
  
  @JSName("options")
  var options_Menu: MenuOptions = js.native
  
  def remove(element: String): Menu = js.native
  def remove(element: JQuery): Menu = js.native
  def remove(element: Element): Menu = js.native
  
  var wrapper: JQuery = js.native
}
