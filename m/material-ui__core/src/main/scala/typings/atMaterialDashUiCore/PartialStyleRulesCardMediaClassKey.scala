package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardMedia.CardMediaClassKey>> */
trait PartialStyleRulesCardMediaClassKey extends js.Object {
  var media: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesCardMediaClassKey {
  @scala.inline
  def apply(media: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesCardMediaClassKey = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesCardMediaClassKey]
  }
}

