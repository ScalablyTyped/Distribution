package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Stepper.StepperClasskey>> */
@js.native
trait PartialStyleRulesStepperC extends js.Object {
  var alternativeLabel: js.UndefOr[CSSProperties] = js.native
  var horizontal: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var vertical: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesStepperC {
  @scala.inline
  def apply(
    alternativeLabel: CSSProperties = null,
    horizontal: CSSProperties = null,
    root: CSSProperties = null,
    vertical: CSSProperties = null
  ): PartialStyleRulesStepperC = {
    val __obj = js.Dynamic.literal()
    if (alternativeLabel != null) __obj.updateDynamic("alternativeLabel")(alternativeLabel.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesStepperC]
  }
}

