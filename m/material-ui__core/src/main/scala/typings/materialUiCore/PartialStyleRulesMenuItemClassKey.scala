package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/MenuItem.MenuItemClassKey>> */
@js.native
trait PartialStyleRulesMenuItemClassKey extends js.Object {
  var gutters: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var selected: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesMenuItemClassKey {
  @scala.inline
  def apply(gutters: CSSProperties = null, root: CSSProperties = null, selected: CSSProperties = null): PartialStyleRulesMenuItemClassKey = {
    val __obj = js.Dynamic.literal()
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesMenuItemClassKey]
  }
}

