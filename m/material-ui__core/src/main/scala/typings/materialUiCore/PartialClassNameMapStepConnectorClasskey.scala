package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/StepConnector/StepConnector.StepConnectorClasskey>> */
@js.native
trait PartialClassNameMapStepConnectorClasskey extends js.Object {
  var active: js.UndefOr[String] = js.native
  var alternativeLabel: js.UndefOr[String] = js.native
  var completed: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var horizontal: js.UndefOr[String] = js.native
  var line: js.UndefOr[String] = js.native
  var lineHorizontal: js.UndefOr[String] = js.native
  var lineVertical: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var vertical: js.UndefOr[String] = js.native
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
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alternativeLabel != null) __obj.updateDynamic("alternativeLabel")(alternativeLabel.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineHorizontal != null) __obj.updateDynamic("lineHorizontal")(lineHorizontal.asInstanceOf[js.Any])
    if (lineVertical != null) __obj.updateDynamic("lineVertical")(lineVertical.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapStepConnectorClasskey]
  }
}

