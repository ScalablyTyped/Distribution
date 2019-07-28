package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepLabel.StepLabelClasskey>> */
trait PartialStyleRulesStepLabelClasskey extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.undefined
  var alternativeLabel: js.UndefOr[CSSProperties] = js.undefined
  var completed: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var horizontal: js.UndefOr[CSSProperties] = js.undefined
  var iconContainer: js.UndefOr[CSSProperties] = js.undefined
  var label: js.UndefOr[CSSProperties] = js.undefined
  var labelContainer: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var vertical: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesStepLabelClasskey {
  @scala.inline
  def apply(
    active: CSSProperties = null,
    alternativeLabel: CSSProperties = null,
    completed: CSSProperties = null,
    disabled: CSSProperties = null,
    error: CSSProperties = null,
    horizontal: CSSProperties = null,
    iconContainer: CSSProperties = null,
    label: CSSProperties = null,
    labelContainer: CSSProperties = null,
    root: CSSProperties = null,
    vertical: CSSProperties = null
  ): PartialStyleRulesStepLabelClasskey = {
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
    __obj.asInstanceOf[PartialStyleRulesStepLabelClasskey]
  }
}

