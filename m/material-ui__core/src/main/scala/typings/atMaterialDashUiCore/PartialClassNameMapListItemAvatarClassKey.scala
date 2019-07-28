package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListItemAvatar/ListItemAvatar.ListItemAvatarClassKey>> */
trait PartialClassNameMapListItemAvatarClassKey extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapListItemAvatarClassKey {
  @scala.inline
  def apply(icon: String = null, root: String = null): PartialClassNameMapListItemAvatarClassKey = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapListItemAvatarClassKey]
  }
}

