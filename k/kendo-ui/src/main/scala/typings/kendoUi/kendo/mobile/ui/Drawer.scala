package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drawer
  extends typings.kendoUi.kendo.ui.Widget {
  
  def hide(): Unit = js.native
  
  @JSName("options")
  var options_Drawer: DrawerOptions = js.native
  
  def show(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
