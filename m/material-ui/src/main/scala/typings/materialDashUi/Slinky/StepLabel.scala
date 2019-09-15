package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StepperNs.StepLabelProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, disabled */
object StepLabel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.materialDashUi.stepperMod.StepLabel] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.stepperMod.StepLabel].asInstanceOf[String | js.Object]
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    icon: TagMod[Any] | String | Double = null,
    iconContainerStyle: CSSProperties = null
  ): BuildingComponent[tag.type, typings.materialDashUi.stepperMod.StepLabel] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepLabelProps
}

