package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.Observable
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Widget
  extends StObject
     with Observable {
  
  def destroy(): Unit = js.native
  
  var element: JQuery = js.native
  
  var events: js.Array[String] = js.native
  
  def init(element: JQuery): Unit = js.native
  def init(element: JQuery, options: js.Object): Unit = js.native
  def init(element: Element): Unit = js.native
  def init(element: Element, options: js.Object): Unit = js.native
  def init(selector: String): Unit = js.native
  def init(selector: String, options: js.Object): Unit = js.native
  
  var options: Any = js.native
  
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  
  def setOptions(options: js.Object): Unit = js.native
}
