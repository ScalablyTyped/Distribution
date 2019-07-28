package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepButton/StepButton.StepButtonClasskey>> */
trait PartialClassNameMapStepButtonClasskey extends js.Object {
  var root: js.UndefOr[String] = js.undefined
  var touchRipple: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapStepButtonClasskey {
  @scala.inline
  def apply(root: String = null, touchRipple: String = null, vertical: String = null): PartialClassNameMapStepButtonClasskey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    if (touchRipple != null) __obj.updateDynamic("touchRipple")(touchRipple)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PartialClassNameMapStepButtonClasskey]
  }
}

