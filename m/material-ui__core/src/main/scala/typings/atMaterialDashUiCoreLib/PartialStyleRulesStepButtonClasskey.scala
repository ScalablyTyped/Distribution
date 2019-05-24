package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepButton.StepButtonClasskey>> */
trait PartialStyleRulesStepButtonClasskey extends js.Object {
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var touchRipple: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var vertical: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesStepButtonClasskey {
  @scala.inline
  def apply(
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    touchRipple: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    vertical: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesStepButtonClasskey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    if (touchRipple != null) __obj.updateDynamic("touchRipple")(touchRipple)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PartialStyleRulesStepButtonClasskey]
  }
}

