package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button
  extends StObject
     with Widget {
  
  def enable(toggle: Boolean): Unit = js.native
  
  @JSName("options")
  var options_Button: ButtonOptions = js.native
  
  var wrapper: JQuery = js.native
}
