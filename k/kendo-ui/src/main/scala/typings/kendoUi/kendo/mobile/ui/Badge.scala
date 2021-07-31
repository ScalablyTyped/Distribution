package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Badge
  extends StObject
     with typings.kendoUi.kendo.ui.Widget {
  
  def hide(): Unit = js.native
  
  @JSName("options")
  var options_Badge: BadgeOptions = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def show(): Unit = js.native
  
  def value(newValue: String): Unit = js.native
  def value(newValue: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
