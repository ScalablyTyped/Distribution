package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.cardCardTitleMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.CardNs.CardTitleProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style */
object CardTitle
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.cardCardTitleMod.default].asInstanceOf[String | js.Object]
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    subtitle: TagMod[Any] = null,
    subtitleColor: String = null,
    subtitleStyle: CSSProperties = null,
    title: TagMod[Any] = null,
    titleColor: String = null,
    titleStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor)
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardTitleProps
}

