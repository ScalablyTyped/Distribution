package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepLabel/StepLabel.StepLabelClasskey>> */
trait PartialClassNameMapStepLabelClasskey extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var alternativeLabel: js.UndefOr[String] = js.undefined
  var completed: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var iconContainer: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelContainer: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapStepLabelClasskey {
  @scala.inline
  def apply(
    active: String = null,
    alternativeLabel: String = null,
    completed: String = null,
    disabled: String = null,
    error: String = null,
    horizontal: String = null,
    iconContainer: String = null,
    label: String = null,
    labelContainer: String = null,
    root: String = null,
    vertical: String = null
  ): PartialClassNameMapStepLabelClasskey = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (alternativeLabel != null) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (completed != null) __obj.updateDynamic("completed")(completed)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (iconContainer != null) __obj.updateDynamic("iconContainer")(iconContainer)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelContainer != null) __obj.updateDynamic("labelContainer")(labelContainer)
    if (root != null) __obj.updateDynamic("root")(root)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PartialClassNameMapStepLabelClasskey]
  }
}

