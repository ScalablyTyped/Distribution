package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalTooltipMod.TooltipProps
import typings.materialDashUi.internalTooltipMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.tooltipHorizontal
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style, className */
object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalTooltipMod.default].asInstanceOf[String | js.Object]
  def apply(
    label: js.Any,
    horizontalPosition: tooltipHorizontal = null,
    show: js.UndefOr[Boolean] = js.undefined,
    touch: js.UndefOr[Boolean] = js.undefined,
    verticalPosition: vertical = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(label = label)
    if (horizontalPosition != null) __obj.updateDynamic("horizontalPosition")(horizontalPosition)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (verticalPosition != null) __obj.updateDynamic("verticalPosition")(verticalPosition)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipProps
}

