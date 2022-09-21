package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomNavigation
  extends StObject
     with Widget {
  
  def add(item: Any): Unit = js.native
  def add(item: Any, beforeElement: HTMLElement): Unit = js.native
  def add(item: Any, beforeElement: JQuery): Unit = js.native
  
  def enable(element: HTMLElement): Unit = js.native
  def enable(element: HTMLElement, state: Boolean): Unit = js.native
  def enable(element: JQuery): Unit = js.native
  def enable(element: JQuery, state: Boolean): Unit = js.native
  
  def item(index: String): JQuery = js.native
  def item(index: Double): JQuery = js.native
  
  def itemById(id: String): JQuery = js.native
  
  def items(): JQuery = js.native
  
  @JSName("options")
  var options_BottomNavigation: BottomNavigationOptions = js.native
  
  def remove(element: HTMLElement): Unit = js.native
  def remove(element: JQuery): Unit = js.native
  
  def select(element: HTMLElement): JQuery = js.native
  def select(element: HTMLElement, state: Boolean): JQuery = js.native
  def select(element: JQuery): JQuery = js.native
  def select(element: JQuery, state: Boolean): JQuery = js.native
  
  def showText(show: Boolean): Unit = js.native
  
  var wrapper: JQuery = js.native
}
