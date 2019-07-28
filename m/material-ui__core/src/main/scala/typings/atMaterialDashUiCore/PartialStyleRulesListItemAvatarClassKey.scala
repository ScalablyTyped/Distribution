package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListItemAvatar.ListItemAvatarClassKey>> */
trait PartialStyleRulesListItemAvatarClassKey extends js.Object {
  var icon: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesListItemAvatarClassKey {
  @scala.inline
  def apply(icon: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesListItemAvatarClassKey = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesListItemAvatarClassKey]
  }
}

