package typings.atMaterialDashUiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/AvatarGroup/AvatarGroup.AvatarGroupClassKey>> */
trait PartialClassNameMapAvatarGroupClassKey extends js.Object {
  var avatar: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapAvatarGroupClassKey {
  @scala.inline
  def apply(avatar: String = null, root: String = null): PartialClassNameMapAvatarGroupClassKey = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapAvatarGroupClassKey]
  }
}

