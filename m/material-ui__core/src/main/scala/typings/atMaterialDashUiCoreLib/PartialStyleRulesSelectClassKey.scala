package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Select.SelectClassKey>> */
trait PartialStyleRulesSelectClassKey extends js.Object {
  var disabled: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var filled: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var icon: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var outlined: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var select: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var selectMenu: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesSelectClassKey {
  @scala.inline
  def apply(
    disabled: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    filled: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    icon: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    outlined: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    select: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    selectMenu: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesSelectClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (outlined != null) __obj.updateDynamic("outlined")(outlined)
    if (root != null) __obj.updateDynamic("root")(root)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectMenu != null) __obj.updateDynamic("selectMenu")(selectMenu)
    __obj.asInstanceOf[PartialStyleRulesSelectClassKey]
  }
}

