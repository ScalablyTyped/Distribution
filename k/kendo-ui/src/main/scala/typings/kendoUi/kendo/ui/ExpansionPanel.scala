package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpansionPanel
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_ExpansionPanel: ExpansionPanelOptions = js.native
  
  def toggle(expand: Boolean, animation: Boolean): Unit = js.native
  
  var wrapper: JQuery = js.native
}
