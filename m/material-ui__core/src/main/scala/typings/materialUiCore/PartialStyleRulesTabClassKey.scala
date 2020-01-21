package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tab.TabClassKey>> */
@js.native
trait PartialStyleRulesTabClassKey extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.native
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var labelContainer: js.UndefOr[CSSProperties] = js.native
  var labelIcon: js.UndefOr[CSSProperties] = js.native
  var labelWrapped: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var selected: js.UndefOr[CSSProperties] = js.native
  var textColorInherit: js.UndefOr[CSSProperties] = js.native
  var textColorPrimary: js.UndefOr[CSSProperties] = js.native
  var textColorSecondary: js.UndefOr[CSSProperties] = js.native
  var wrapper: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTabClassKey {
  @scala.inline
  def apply(
    disabled: CSSProperties = null,
    fullWidth: CSSProperties = null,
    label: CSSProperties = null,
    labelContainer: CSSProperties = null,
    labelIcon: CSSProperties = null,
    labelWrapped: CSSProperties = null,
    root: CSSProperties = null,
    selected: CSSProperties = null,
    textColorInherit: CSSProperties = null,
    textColorPrimary: CSSProperties = null,
    textColorSecondary: CSSProperties = null,
    wrapper: CSSProperties = null
  ): PartialStyleRulesTabClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelContainer != null) __obj.updateDynamic("labelContainer")(labelContainer.asInstanceOf[js.Any])
    if (labelIcon != null) __obj.updateDynamic("labelIcon")(labelIcon.asInstanceOf[js.Any])
    if (labelWrapped != null) __obj.updateDynamic("labelWrapped")(labelWrapped.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (textColorInherit != null) __obj.updateDynamic("textColorInherit")(textColorInherit.asInstanceOf[js.Any])
    if (textColorPrimary != null) __obj.updateDynamic("textColorPrimary")(textColorPrimary.asInstanceOf[js.Any])
    if (textColorSecondary != null) __obj.updateDynamic("textColorSecondary")(textColorSecondary.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesTabClassKey]
  }
}

