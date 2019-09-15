package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.cardCardMediaMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.CardNs.CardMediaProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style */
object CardMedia
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.cardCardMediaMod.default].asInstanceOf[String | js.Object]
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    mediaStyle: CSSProperties = null,
    overlay: TagMod[Any] = null,
    overlayContainerStyle: CSSProperties = null,
    overlayContentStyle: CSSProperties = null,
    overlayStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (mediaStyle != null) __obj.updateDynamic("mediaStyle")(mediaStyle)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle)
    if (overlayContentStyle != null) __obj.updateDynamic("overlayContentStyle")(overlayContentStyle)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardMediaProps
}

