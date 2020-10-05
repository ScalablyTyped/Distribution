package typings.materialUi.MaterialUI.Stepper

import typings.materialUi.materialUiStrings.horizontal
import typings.materialUi.materialUiStrings.vertical
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepperProps extends js.Object {
  var activeStep: js.UndefOr[Double] = js.native
  var linear: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object StepperProps {
  @scala.inline
  def apply(): StepperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepperProps]
  }
  @scala.inline
  implicit class StepperPropsOps[Self <: StepperProps] (val x: Self) extends AnyVal {
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
    def setActiveStep(value: Double): Self = this.set("activeStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveStep: Self = this.set("activeStep", js.undefined)
    @scala.inline
    def setLinear(value: Boolean): Self = this.set("linear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinear: Self = this.set("linear", js.undefined)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

