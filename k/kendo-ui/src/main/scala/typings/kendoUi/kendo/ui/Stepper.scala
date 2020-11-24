package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.Step
import typings.kendoUi.kendo.stepper.StepOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stepper extends Widget {
  
  def enable(value: Boolean): Unit = js.native
  
  def insertAt(index: Double, step: StepOptions): Unit = js.native
  
  def next(): Unit = js.native
  
  @JSName("options")
  var options_Stepper: StepperOptions = js.native
  
  def previous(): Unit = js.native
  
  def removeAt(index: Double): Unit = js.native
  
  def select(): Step = js.native
  def select(index: Double): Unit = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def steps(): js.Array[Step] = js.native
  def steps(steps: js.Array[StepOptions]): Unit = js.native
}
