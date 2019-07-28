package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/BottomNavigation.BottomNavigationClassKey>> */
trait PartialStyleRulesBottomNavigationClassKey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesBottomNavigationClassKey {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesBottomNavigationClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesBottomNavigationClassKey]
  }
}

