package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControl.FormControlClassKey>> */
trait PartialStyleRulesFormControlClassKey extends js.Object {
  var fullWidth: js.UndefOr[CSSProperties] = js.undefined
  var marginDense: js.UndefOr[CSSProperties] = js.undefined
  var marginNormal: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesFormControlClassKey {
  @scala.inline
  def apply(
    fullWidth: CSSProperties = null,
    marginDense: CSSProperties = null,
    marginNormal: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesFormControlClassKey = {
    val __obj = js.Dynamic.literal()
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth)
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense)
    if (marginNormal != null) __obj.updateDynamic("marginNormal")(marginNormal)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesFormControlClassKey]
  }
}

