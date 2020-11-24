package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.StepOptions
import typings.kendoUi.kendoUiStrings.horizontal
import typings.kendoUi.kendoUiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepperOptions extends js.Object {
  
  var activate: js.UndefOr[js.Function1[/* e */ StepperActivateEvent, Unit]] = js.native
  
  var indicator: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[Boolean] = js.native
  
  var linear: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String | horizontal | vertical] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ StepperSelectEvent, Unit]] = js.native
  
  var selectOnFocus: js.UndefOr[Boolean] = js.native
  
  var steps: js.Array[StepOptions | String] = js.native
}
object StepperOptions {
  
  @scala.inline
  def apply(steps: js.Array[StepOptions | String]): StepperOptions = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOptions]
  }
  
  @scala.inline
  implicit class StepperOptionsOps[Self <: StepperOptions] (val x: Self) extends AnyVal {
    
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
    def setStepsVarargs(value: (StepOptions | String)*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[StepOptions | String]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivate(value: /* e */ StepperActivateEvent => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
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
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String | horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ StepperSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectOnFocus(value: Boolean): Self = this.set("selectOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOnFocus: Self = this.set("selectOnFocus", js.undefined)
  }
}
