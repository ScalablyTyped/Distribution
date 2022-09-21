package typings.kendoUi.kendo

import typings.kendoUi.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View
  extends StObject
     with Observable {
  
  var content: Any = js.native
  
  def destroy(): Unit = js.native
  
  var element: JQuery = js.native
  
  def init(element: String): Unit = js.native
  def init(element: String, options: ViewOptions): Unit = js.native
  def init(element: Element): Unit = js.native
  def init(element: Element, options: ViewOptions): Unit = js.native
  
  var model: js.Object = js.native
  
  def render(): JQuery = js.native
  def render(container: Any): JQuery = js.native
  
  var tagName: String = js.native
}
