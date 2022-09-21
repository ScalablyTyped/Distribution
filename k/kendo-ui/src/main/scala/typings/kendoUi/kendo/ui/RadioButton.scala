package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButton
  extends StObject
     with Widget {
  
  def check(): Boolean = js.native
  def check(check: Boolean): Unit = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_RadioButton: RadioButtonOptions = js.native
  
  def toggle(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
