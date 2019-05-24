package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControl.FormControlClassKey>> */
trait PartialStyleRulesFormControlClassKey extends js.Object {
  var fullWidth: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var marginDense: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var marginNormal: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesFormControlClassKey {
  @scala.inline
  def apply(
    fullWidth: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    marginDense: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    marginNormal: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesFormControlClassKey = {
    val __obj = js.Dynamic.literal()
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth)
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense)
    if (marginNormal != null) __obj.updateDynamic("marginNormal")(marginNormal)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesFormControlClassKey]
  }
}

