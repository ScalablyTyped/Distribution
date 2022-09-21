package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.wizard.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wizard
  extends StObject
     with Widget {
  
  def activeStep(): Step = js.native
  
  def enableStep(index: Double, enable: Boolean): Unit = js.native
  
  def insertAt(index: Double, step: Any): Unit = js.native
  
  def next(): Unit = js.native
  
  @JSName("options")
  var options_Wizard: WizardOptions = js.native
  
  def previous(): Unit = js.native
  
  def removeAt(index: Double): Unit = js.native
  
  def select(index: Double): Unit = js.native
  
  def steps(): js.Array[Step] = js.native
  
  var wrapper: JQuery = js.native
}
