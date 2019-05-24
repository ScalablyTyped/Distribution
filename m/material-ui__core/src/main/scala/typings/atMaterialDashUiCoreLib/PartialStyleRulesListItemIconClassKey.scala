package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListItemIcon.ListItemIconClassKey>> */
trait PartialStyleRulesListItemIconClassKey extends js.Object {
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesListItemIconClassKey {
  @scala.inline
  def apply(root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null): PartialStyleRulesListItemIconClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesListItemIconClassKey]
  }
}

