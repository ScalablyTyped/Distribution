package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StepperNs.StepContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style */
object StepContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.materialDashUi.stepperMod.StepContent] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.stepperMod.StepContent].asInstanceOf[String | js.Object]
  def apply(active: js.UndefOr[Boolean] = js.undefined, last: js.UndefOr[Boolean] = js.undefined): BuildingComponent[tag.type, typings.materialDashUi.stepperMod.StepContent] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepContentProps
}

