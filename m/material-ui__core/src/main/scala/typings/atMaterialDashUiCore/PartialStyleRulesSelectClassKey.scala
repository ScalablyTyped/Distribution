package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Select.SelectClassKey>> */
trait PartialStyleRulesSelectClassKey extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var filled: js.UndefOr[CSSProperties] = js.undefined
  var icon: js.UndefOr[CSSProperties] = js.undefined
  var outlined: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var select: js.UndefOr[CSSProperties] = js.undefined
  var selectMenu: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesSelectClassKey {
  @scala.inline
  def apply(
    disabled: CSSProperties = null,
    filled: CSSProperties = null,
    icon: CSSProperties = null,
    outlined: CSSProperties = null,
    root: CSSProperties = null,
    select: CSSProperties = null,
    selectMenu: CSSProperties = null
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

