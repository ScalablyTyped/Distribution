package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepConnector/StepConnector.StepConnectorClasskey>> */
trait PartialClassNameMapStepConnectorClasskey extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var alternativeLabel: js.UndefOr[String] = js.undefined
  var completed: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[String] = js.undefined
  var lineHorizontal: js.UndefOr[String] = js.undefined
  var lineVertical: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapStepConnectorClasskey {
  @scala.inline
  def apply(
    active: String = null,
    alternativeLabel: String = null,
    completed: String = null,
    disabled: String = null,
    horizontal: String = null,
    line: String = null,
    lineHorizontal: String = null,
    lineVertical: String = null,
    root: String = null,
    vertical: String = null
  ): PartialClassNameMapStepConnectorClasskey = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (alternativeLabel != null) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (completed != null) __obj.updateDynamic("completed")(completed)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (line != null) __obj.updateDynamic("line")(line)
    if (lineHorizontal != null) __obj.updateDynamic("lineHorizontal")(lineHorizontal)
    if (lineVertical != null) __obj.updateDynamic("lineVertical")(lineVertical)
    if (root != null) __obj.updateDynamic("root")(root)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PartialClassNameMapStepConnectorClasskey]
  }
}

