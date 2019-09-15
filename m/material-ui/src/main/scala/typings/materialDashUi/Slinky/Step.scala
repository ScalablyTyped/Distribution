package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StepperNs.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: disabled, style */
object Step
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.materialDashUi.stepperMod.Step] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.stepperMod.Step].asInstanceOf[String | js.Object]
  def apply(active: js.UndefOr[Boolean] = js.undefined, completed: js.UndefOr[Boolean] = js.undefined): BuildingComponent[tag.type, typings.materialDashUi.stepperMod.Step] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepProps
}

