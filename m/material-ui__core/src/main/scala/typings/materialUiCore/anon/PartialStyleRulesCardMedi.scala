package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardMedia.CardMediaClassKey>> */
@js.native
trait PartialStyleRulesCardMedi extends js.Object {
  var media: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCardMedi {
  @scala.inline
  def apply(media: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesCardMedi = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCardMedi]
  }
}

