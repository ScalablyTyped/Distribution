package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Step/Step.StepClasskey>> */
trait PartialClassNameMapStepClasskey extends js.Object {
  var alternativeLabel: js.UndefOr[java.lang.String] = js.undefined
  var horizontal: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var vertical: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapStepClasskey {
  @scala.inline
  def apply(
    alternativeLabel: java.lang.String = null,
    horizontal: java.lang.String = null,
    root: java.lang.String = null,
    vertical: java.lang.String = null
  ): PartialClassNameMapStepClasskey = {
    val __obj = js.Dynamic.literal()
    if (alternativeLabel != null) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (root != null) __obj.updateDynamic("root")(root)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PartialClassNameMapStepClasskey]
  }
}

