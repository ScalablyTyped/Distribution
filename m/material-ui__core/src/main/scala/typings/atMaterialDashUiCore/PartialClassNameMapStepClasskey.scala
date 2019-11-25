package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Step/Step.StepClasskey>> */
trait PartialClassNameMapStepClasskey extends js.Object {
  var alternativeLabel: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapStepClasskey {
  @scala.inline
  def apply(
    alternativeLabel: String = null,
    horizontal: String = null,
    root: String = null,
    vertical: String = null
  ): PartialClassNameMapStepClasskey = {
    val __obj = js.Dynamic.literal()
    if (alternativeLabel != null) __obj.updateDynamic("alternativeLabel")(alternativeLabel.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapStepClasskey]
  }
}

