package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepContent.StepContentClasskey>> */
trait PartialStyleRulesStepContentClasskey extends js.Object {
  var last: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var transition: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesStepContentClasskey {
  @scala.inline
  def apply(
    last: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    transition: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesStepContentClasskey = {
    val __obj = js.Dynamic.literal()
    if (last != null) __obj.updateDynamic("last")(last)
    if (root != null) __obj.updateDynamic("root")(root)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[PartialStyleRulesStepContentClasskey]
  }
}

