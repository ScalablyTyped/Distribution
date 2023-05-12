package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chip
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  @JSName("options")
  var options_Chip: ChipOptions = js.native
  
  def select(state: Boolean): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
