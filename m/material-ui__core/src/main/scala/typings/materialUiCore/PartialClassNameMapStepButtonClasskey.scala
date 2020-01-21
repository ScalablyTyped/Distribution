package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepButton/StepButton.StepButtonClasskey>> */
@js.native
trait PartialClassNameMapStepButtonClasskey extends js.Object {
  var root: js.UndefOr[String] = js.native
  var touchRipple: js.UndefOr[String] = js.native
  var vertical: js.UndefOr[String] = js.native
}

object PartialClassNameMapStepButtonClasskey {
  @scala.inline
  def apply(root: String = null, touchRipple: String = null, vertical: String = null): PartialClassNameMapStepButtonClasskey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (touchRipple != null) __obj.updateDynamic("touchRipple")(touchRipple.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapStepButtonClasskey]
  }
}

