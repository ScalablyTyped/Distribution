package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControlLabel.FormControlLabelClassKey>> */
@js.native
trait PartialStyleRulesFormControlLabelClassKey extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var start: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesFormControlLabelClassKey {
  @scala.inline
  def apply(
    disabled: CSSProperties = null,
    label: CSSProperties = null,
    root: CSSProperties = null,
    start: CSSProperties = null
  ): PartialStyleRulesFormControlLabelClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesFormControlLabelClassKey]
  }
}

