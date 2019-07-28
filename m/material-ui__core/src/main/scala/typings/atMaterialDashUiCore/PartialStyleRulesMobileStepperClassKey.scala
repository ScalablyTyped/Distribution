package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/MobileStepper.MobileStepperClassKey>> */
trait PartialStyleRulesMobileStepperClassKey extends js.Object {
  var dot: js.UndefOr[CSSProperties] = js.undefined
  var dotActive: js.UndefOr[CSSProperties] = js.undefined
  var dots: js.UndefOr[CSSProperties] = js.undefined
  var positionBottom: js.UndefOr[CSSProperties] = js.undefined
  var positionStatic: js.UndefOr[CSSProperties] = js.undefined
  var positionTop: js.UndefOr[CSSProperties] = js.undefined
  var progress: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesMobileStepperClassKey {
  @scala.inline
  def apply(
    dot: CSSProperties = null,
    dotActive: CSSProperties = null,
    dots: CSSProperties = null,
    positionBottom: CSSProperties = null,
    positionStatic: CSSProperties = null,
    positionTop: CSSProperties = null,
    progress: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesMobileStepperClassKey = {
    val __obj = js.Dynamic.literal()
    if (dot != null) __obj.updateDynamic("dot")(dot)
    if (dotActive != null) __obj.updateDynamic("dotActive")(dotActive)
    if (dots != null) __obj.updateDynamic("dots")(dots)
    if (positionBottom != null) __obj.updateDynamic("positionBottom")(positionBottom)
    if (positionStatic != null) __obj.updateDynamic("positionStatic")(positionStatic)
    if (positionTop != null) __obj.updateDynamic("positionTop")(positionTop)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesMobileStepperClassKey]
  }
}

