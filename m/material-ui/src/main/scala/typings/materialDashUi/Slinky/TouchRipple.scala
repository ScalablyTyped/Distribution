package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalTouchRippleMod.TouchRippleProps
import typings.materialDashUi.internalTouchRippleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style, color */
object TouchRipple
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalTouchRippleMod.default].asInstanceOf[String | js.Object]
  def apply(
    abortOnScroll: js.UndefOr[Boolean] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnScroll)) __obj.updateDynamic("abortOnScroll")(abortOnScroll)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TouchRippleProps
}

