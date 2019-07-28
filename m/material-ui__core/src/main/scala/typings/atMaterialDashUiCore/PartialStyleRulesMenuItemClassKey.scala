package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/MenuItem.MenuItemClassKey>> */
trait PartialStyleRulesMenuItemClassKey extends js.Object {
  var gutters: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var selected: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesMenuItemClassKey {
  @scala.inline
  def apply(gutters: CSSProperties = null, root: CSSProperties = null, selected: CSSProperties = null): PartialStyleRulesMenuItemClassKey = {
    val __obj = js.Dynamic.literal()
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PartialStyleRulesMenuItemClassKey]
  }
}

