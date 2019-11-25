package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepContent.StepContentClasskey>> */
trait PartialStyleRulesStepContentClasskey extends js.Object {
  var last: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var transition: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesStepContentClasskey {
  @scala.inline
  def apply(last: CSSProperties = null, root: CSSProperties = null, transition: CSSProperties = null): PartialStyleRulesStepContentClasskey = {
    val __obj = js.Dynamic.literal()
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesStepContentClasskey]
  }
}

