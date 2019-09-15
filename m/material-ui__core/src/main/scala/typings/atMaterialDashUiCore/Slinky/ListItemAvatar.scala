package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.PartialClassNameMapListItemAvatarClassKey
import typings.atMaterialDashUiCore.listItemAvatarListItemAvatarMod.ListItemAvatarProps
import typings.atMaterialDashUiCore.listItemAvatarMod.default
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, style */
object ListItemAvatar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.listItemAvatarMod.default].asInstanceOf[String | js.Object]
  def apply(classes: PartialClassNameMapListItemAvatarClassKey = null, innerRef: Ref[_] | RefObject[_] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ListItemAvatarProps
}

