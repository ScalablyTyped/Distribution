package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridList.GridListClassKey>> */
trait PartialStyleRulesGridListClassKey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesGridListClassKey {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesGridListClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesGridListClassKey]
  }
}

