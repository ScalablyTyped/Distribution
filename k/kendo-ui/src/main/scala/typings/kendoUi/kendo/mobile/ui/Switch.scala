package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Switch
  extends typings.kendoUi.kendo.ui.Widget {
  
  def check(): Boolean = js.native
  def check(check: Boolean): Unit = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_Switch: SwitchOptions = js.native
  
  def refresh(): Unit = js.native
  
  def toggle(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
