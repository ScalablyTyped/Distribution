package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MobileStepper/MobileStepper.MobileStepperClassKey>> */
trait PartialClassNameMapMobileStepperClassKey extends js.Object {
  var dot: js.UndefOr[String] = js.undefined
  var dotActive: js.UndefOr[String] = js.undefined
  var dots: js.UndefOr[String] = js.undefined
  var positionBottom: js.UndefOr[String] = js.undefined
  var positionStatic: js.UndefOr[String] = js.undefined
  var positionTop: js.UndefOr[String] = js.undefined
  var progress: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapMobileStepperClassKey {
  @scala.inline
  def apply(
    dot: String = null,
    dotActive: String = null,
    dots: String = null,
    positionBottom: String = null,
    positionStatic: String = null,
    positionTop: String = null,
    progress: String = null,
    root: String = null
  ): PartialClassNameMapMobileStepperClassKey = {
    val __obj = js.Dynamic.literal()
    if (dot != null) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (dotActive != null) __obj.updateDynamic("dotActive")(dotActive.asInstanceOf[js.Any])
    if (dots != null) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (positionBottom != null) __obj.updateDynamic("positionBottom")(positionBottom.asInstanceOf[js.Any])
    if (positionStatic != null) __obj.updateDynamic("positionStatic")(positionStatic.asInstanceOf[js.Any])
    if (positionTop != null) __obj.updateDynamic("positionTop")(positionTop.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapMobileStepperClassKey]
  }
}

