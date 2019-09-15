package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.popoverPopoverAnimationVerticalMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationVerticalProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: open, style, className */
object PopoverAnimationVertical
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.popoverPopoverAnimationVerticalMod.default].asInstanceOf[String | js.Object]
  def apply(targetOrigin: origin = null, zDepth: Int | Double = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopoverAnimationVerticalProps
}

