package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Radio.RadioClassKey>> */
trait PartialStyleRulesRadioClassKey extends js.Object {
  var checked: js.UndefOr[CSSProperties] = js.undefined
  var colorPrimary: js.UndefOr[CSSProperties] = js.undefined
  var colorSecondary: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var input: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesRadioClassKey {
  @scala.inline
  def apply(
    checked: CSSProperties = null,
    colorPrimary: CSSProperties = null,
    colorSecondary: CSSProperties = null,
    disabled: CSSProperties = null,
    input: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesRadioClassKey = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (input != null) __obj.updateDynamic("input")(input)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesRadioClassKey]
  }
}

