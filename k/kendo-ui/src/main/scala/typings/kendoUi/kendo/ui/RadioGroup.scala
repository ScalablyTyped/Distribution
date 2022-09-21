package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioGroup
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  def enableItem(enable: Boolean, index: Double): Unit = js.native
  
  def item(index: Double): JQuery = js.native
  
  def items(): JQuery = js.native
  
  @JSName("options")
  var options_RadioGroup: RadioGroupOptions = js.native
  
  def value(): String = js.native
  def value(value: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
