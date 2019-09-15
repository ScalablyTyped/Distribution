package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.chipMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.ChipProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onClick, style, className */
object Chip
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.chipMod.default].asInstanceOf[String | js.Object]
  def apply(
    backgroundColor: String = null,
    containerElement: TagMod[Any] | String = null,
    deleteIconStyle: CSSProperties = null,
    labelColor: String = null,
    labelStyle: CSSProperties = null,
    onRequestDelete: TouchEvent[typings.materialDashUi.underscoreUnderscoreMaterialUINs.Chip] => Unit = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (deleteIconStyle != null) __obj.updateDynamic("deleteIconStyle")(deleteIconStyle)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (onRequestDelete != null) __obj.updateDynamic("onRequestDelete")(js.Any.fromFunction1(onRequestDelete))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ChipProps
}

