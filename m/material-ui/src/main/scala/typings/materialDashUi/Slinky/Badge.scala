package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.badgeMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.BadgeProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Badge
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.badgeMod.default].asInstanceOf[String | js.Object]
  def apply(
    badgeContent: TagMod[Any],
    badgeStyle: CSSProperties = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(badgeContent = badgeContent)
    if (badgeStyle != null) __obj.updateDynamic("badgeStyle")(badgeStyle)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BadgeProps
}

