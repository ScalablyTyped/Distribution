package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepButton/StepButton.StepButtonClasskey>> */
trait PartialClassNameMapStepButtonClasskey extends js.Object {
  var root: js.UndefOr[java.lang.String] = js.undefined
  var touchRipple: js.UndefOr[java.lang.String] = js.undefined
  var vertical: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapStepButtonClasskey {
  @scala.inline
  def apply(
    root: java.lang.String = null,
    touchRipple: java.lang.String = null,
    vertical: java.lang.String = null
  ): PartialClassNameMapStepButtonClasskey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    if (touchRipple != null) __obj.updateDynamic("touchRipple")(touchRipple)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PartialClassNameMapStepButtonClasskey]
  }
}

