package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/BottomNavigationAction.BottomNavigationActionClassKey>> */
trait PartialStyleRulesBottomNavigationActionClassKey extends js.Object {
  var iconOnly: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var label: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var selected: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var wrapper: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesBottomNavigationActionClassKey {
  @scala.inline
  def apply(
    iconOnly: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    label: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    selected: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    wrapper: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesBottomNavigationActionClassKey = {
    val __obj = js.Dynamic.literal()
    if (iconOnly != null) __obj.updateDynamic("iconOnly")(iconOnly)
    if (label != null) __obj.updateDynamic("label")(label)
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[PartialStyleRulesBottomNavigationActionClassKey]
  }
}

