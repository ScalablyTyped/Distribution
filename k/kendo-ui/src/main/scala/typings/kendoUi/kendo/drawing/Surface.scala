package typings.kendoUi.kendo.drawing

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Surface extends Observable {
  
  def clear(): Unit = js.native
  
  def draw(element: Element): Unit = js.native
  
  var element: JQuery = js.native
  
  def eventTarget(e: js.Any): Element = js.native
  
  def hideTooltip(): Unit = js.native
  
  var options: SurfaceOptions = js.native
  
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  
  def showTooltip(element: Element): Unit = js.native
  def showTooltip(element: Element, options: js.Any): Unit = js.native
}
