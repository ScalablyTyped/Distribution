package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Divider.DividerClassKey>> */
trait PartialStyleRulesDividerClassKey extends js.Object {
  var absolute: js.UndefOr[CSSProperties] = js.undefined
  var inset: js.UndefOr[CSSProperties] = js.undefined
  var light: js.UndefOr[CSSProperties] = js.undefined
  var middle: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesDividerClassKey {
  @scala.inline
  def apply(
    absolute: CSSProperties = null,
    inset: CSSProperties = null,
    light: CSSProperties = null,
    middle: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesDividerClassKey = {
    val __obj = js.Dynamic.literal()
    if (absolute != null) __obj.updateDynamic("absolute")(absolute)
    if (inset != null) __obj.updateDynamic("inset")(inset)
    if (light != null) __obj.updateDynamic("light")(light)
    if (middle != null) __obj.updateDynamic("middle")(middle)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesDividerClassKey]
  }
}

