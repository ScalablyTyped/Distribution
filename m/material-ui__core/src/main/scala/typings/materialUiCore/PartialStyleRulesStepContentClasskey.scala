package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepContent.StepContentClasskey>> */
@js.native
trait PartialStyleRulesStepContentClasskey extends js.Object {
  var last: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var transition: js.UndefOr[CSSProperties] = js.native
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

