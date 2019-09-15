package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.cardCardHeaderMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.CardNs.CardHeaderProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object CardHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.cardCardHeaderMod.default].asInstanceOf[String | js.Object]
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    avatar: TagMod[Any] = null,
    closeIcon: TagMod[Any] = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    openIcon: TagMod[Any] = null,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    subtitle: TagMod[Any] = null,
    subtitleColor: String = null,
    subtitleStyle: CSSProperties = null,
    textStyle: CSSProperties = null,
    title: TagMod[Any] = null,
    titleColor: String = null,
    titleStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon)
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor)
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardHeaderProps
}

