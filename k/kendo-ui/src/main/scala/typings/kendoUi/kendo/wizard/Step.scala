package typings.kendoUi.kendo.wizard

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends Class {
  
  def buttons(): js.Array[_] = js.native
  
  def load(): Unit = js.native
  
  var options: WizardStepOptions = js.native
  
  def resetButtons(): Unit = js.native
}
object Step {
  
  @scala.inline
  def apply(buttons: () => js.Array[_], load: () => Unit, options: WizardStepOptions, resetButtons: () => Unit): Step = {
    val __obj = js.Dynamic.literal(buttons = js.Any.fromFunction0(buttons), load = js.Any.fromFunction0(load), options = options.asInstanceOf[js.Any], resetButtons = js.Any.fromFunction0(resetButtons))
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtons(value: () => js.Array[_]): Self = this.set("buttons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: () => Unit): Self = this.set("load", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: WizardStepOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetButtons(value: () => Unit): Self = this.set("resetButtons", js.Any.fromFunction0(value))
  }
}
