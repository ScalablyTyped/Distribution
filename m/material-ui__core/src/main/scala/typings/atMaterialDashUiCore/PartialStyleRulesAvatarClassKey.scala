package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Avatar.AvatarClassKey>> */
trait PartialStyleRulesAvatarClassKey extends js.Object {
  var colorDefault: js.UndefOr[CSSProperties] = js.undefined
  var img: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesAvatarClassKey {
  @scala.inline
  def apply(colorDefault: CSSProperties = null, img: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesAvatarClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorDefault != null) __obj.updateDynamic("colorDefault")(colorDefault)
    if (img != null) __obj.updateDynamic("img")(img)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesAvatarClassKey]
  }
}

