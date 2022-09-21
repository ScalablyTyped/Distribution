package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircularProgressBar
  extends StObject
     with Widget {
  
  @JSName("options")
  var options_CircularProgressBar: CircularProgressBarOptions = js.native
  
  def redraw(): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def value(): Double = js.native
  def value(value: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
