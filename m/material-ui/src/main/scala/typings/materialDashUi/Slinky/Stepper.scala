package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StepperNs.StepperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: orientation, style */
object Stepper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.materialDashUi.stepperMod.Stepper] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.stepperMod.Stepper].asInstanceOf[String | js.Object]
  def apply(activeStep: Int | Double = null, linear: js.UndefOr[Boolean] = js.undefined): BuildingComponent[tag.type, typings.materialDashUi.stepperMod.Stepper] = {
    val __obj = js.Dynamic.literal()
    if (activeStep != null) __obj.updateDynamic("activeStep")(activeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepperProps
}

