package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepConnector.StepConnectorClasskey>> */
trait PartialStyleRulesStepConnectorClasskey extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.undefined
  var alternativeLabel: js.UndefOr[CSSProperties] = js.undefined
  var completed: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var horizontal: js.UndefOr[CSSProperties] = js.undefined
  var line: js.UndefOr[CSSProperties] = js.undefined
  var lineHorizontal: js.UndefOr[CSSProperties] = js.undefined
  var lineVertical: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var vertical: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesStepConnectorClasskey {
  @scala.inline
  def apply(
    active: CSSProperties = null,
    alternativeLabel: CSSProperties = null,
    completed: CSSProperties = null,
    disabled: CSSProperties = null,
    horizontal: CSSProperties = null,
    line: CSSProperties = null,
    lineHorizontal: CSSProperties = null,
    lineVertical: CSSProperties = null,
    root: CSSProperties = null,
    vertical: CSSProperties = null
  ): PartialStyleRulesStepConnectorClasskey = {
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
    __obj.asInstanceOf[PartialStyleRulesStepConnectorClasskey]
  }
}

