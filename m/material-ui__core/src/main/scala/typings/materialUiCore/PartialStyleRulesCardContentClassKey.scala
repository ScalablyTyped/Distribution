package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardContent.CardContentClassKey>> */
@js.native
trait PartialStyleRulesCardContentClassKey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCardContentClassKey {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesCardContentClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCardContentClassKey]
  }
}

