package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Avatar/Avatar.AvatarClassKey>> */
trait PartialClassNameMapAvatarClassKey extends js.Object {
  var colorDefault: js.UndefOr[String] = js.undefined
  var img: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapAvatarClassKey {
  @scala.inline
  def apply(colorDefault: String = null, img: String = null, root: String = null): PartialClassNameMapAvatarClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorDefault != null) __obj.updateDynamic("colorDefault")(colorDefault)
    if (img != null) __obj.updateDynamic("img")(img)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapAvatarClassKey]
  }
}

