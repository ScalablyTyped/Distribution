package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalFocusRippleMod.FocusRippleProps
import typings.materialDashUi.internalFocusRippleMod.default
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style, color */
object FocusRipple
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalFocusRippleMod.default].asInstanceOf[String | js.Object]
  def apply(
    innerStyle: CSSProperties = null,
    opacity: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FocusRippleProps
}

