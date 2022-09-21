package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloatingActionButton
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  def hide(): Unit = js.native
  
  def icon(icon: String): Unit = js.native
  
  @JSName("options")
  var options_FloatingActionButton: FloatingActionButtonOptions = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def shape(shape: String): Unit = js.native
  
  def show(): Unit = js.native
  
  def text(text: String): Unit = js.native
  
  def themeColor(themeColor: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
