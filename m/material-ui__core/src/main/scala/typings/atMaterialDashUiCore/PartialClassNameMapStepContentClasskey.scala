package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepContent/StepContent.StepContentClasskey>> */
trait PartialClassNameMapStepContentClasskey extends js.Object {
  var last: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapStepContentClasskey {
  @scala.inline
  def apply(last: String = null, root: String = null, transition: String = null): PartialClassNameMapStepContentClasskey = {
    val __obj = js.Dynamic.literal()
    if (last != null) __obj.updateDynamic("last")(last)
    if (root != null) __obj.updateDynamic("root")(root)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[PartialClassNameMapStepContentClasskey]
  }
}

