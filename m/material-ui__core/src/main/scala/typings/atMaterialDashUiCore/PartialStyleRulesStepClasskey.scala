package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Step.StepClasskey>> */
trait PartialStyleRulesStepClasskey extends js.Object {
  var alternativeLabel: js.UndefOr[CSSProperties] = js.undefined
  var horizontal: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var vertical: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesStepClasskey {
  @scala.inline
  def apply(
    alternativeLabel: CSSProperties = null,
    horizontal: CSSProperties = null,
    root: CSSProperties = null,
    vertical: CSSProperties = null
  ): PartialStyleRulesStepClasskey = {
    val __obj = js.Dynamic.literal()
    if (alternativeLabel != null) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (root != null) __obj.updateDynamic("root")(root)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PartialStyleRulesStepClasskey]
  }
}

