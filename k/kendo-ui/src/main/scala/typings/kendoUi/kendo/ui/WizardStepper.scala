package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardStepper extends js.Object {
  
  var indicator: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[Boolean] = js.native
  
  var linear: js.UndefOr[Boolean] = js.native
}
object WizardStepper {
  
  @scala.inline
  def apply(): WizardStepper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardStepper]
  }
  
  @scala.inline
  implicit class WizardStepperOps[Self <: WizardStepper] (val x: Self) extends AnyVal {
    
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
    def setIndicator(value: Boolean): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def setLabel(value: Boolean): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLinear(value: Boolean): Self = this.set("linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinear: Self = this.set("linear", js.undefined)
  }
}
