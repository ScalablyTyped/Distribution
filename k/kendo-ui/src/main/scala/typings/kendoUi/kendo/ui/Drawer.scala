package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drawer
  extends StObject
     with Widget {
  
  def hide(): Unit = js.native
  
  @JSName("options")
  var options_Drawer: DrawerOptions = js.native
  
  def show(): Unit = js.native
  
  var visible: Boolean = js.native
  
  var wrapper: JQuery = js.native
}
