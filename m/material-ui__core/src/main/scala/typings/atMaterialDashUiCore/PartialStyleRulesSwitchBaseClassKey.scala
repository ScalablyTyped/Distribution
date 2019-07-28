package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseClassKey>> */
trait PartialStyleRulesSwitchBaseClassKey extends js.Object {
  var checked: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var input: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesSwitchBaseClassKey {
  @scala.inline
  def apply(
    checked: CSSProperties = null,
    disabled: CSSProperties = null,
    input: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesSwitchBaseClassKey = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (input != null) __obj.updateDynamic("input")(input)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesSwitchBaseClassKey]
  }
}

