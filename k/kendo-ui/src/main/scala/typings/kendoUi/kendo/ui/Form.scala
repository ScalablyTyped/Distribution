package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form
  extends StObject
     with Widget {
  
  def clear(): Unit = js.native
  
  @JSName("options")
  var options_Form: FormOptions = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def validate(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
