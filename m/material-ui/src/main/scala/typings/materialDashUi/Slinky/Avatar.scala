package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.materialDashUi.avatarMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.AvatarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onClick, size, style, color, className, src */
object Avatar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.avatarMod.default].asInstanceOf[String | js.Object]
  def apply(backgroundColor: String = null, icon: ReactElement = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AvatarProps
}

