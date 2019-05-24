package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Toolbar.ToolbarClassKey>> */
trait PartialStyleRulesToolbarClassKey extends js.Object {
  var dense: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var gutters: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var regular: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesToolbarClassKey {
  @scala.inline
  def apply(
    dense: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    gutters: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    regular: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesToolbarClassKey = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense)
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (regular != null) __obj.updateDynamic("regular")(regular)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesToolbarClassKey]
  }
}

