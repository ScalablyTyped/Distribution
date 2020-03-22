package typings.jupyterlabUiComponents.labiconMod.LabIcon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolverProps extends js.Object {
  var fallback: js.UndefOr[typings.jupyterlabUiComponents.labiconMod.LabIcon] = js.undefined
  var icon: js.UndefOr[IMaybeResolvable] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
}

object IResolverProps {
  @scala.inline
  def apply(
    fallback: typings.jupyterlabUiComponents.labiconMod.LabIcon = null,
    icon: IMaybeResolvable = null,
    iconClass: String = null
  ): IResolverProps = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolverProps]
  }
}

