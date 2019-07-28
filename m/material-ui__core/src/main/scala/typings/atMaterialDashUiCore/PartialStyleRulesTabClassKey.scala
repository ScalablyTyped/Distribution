package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tab.TabClassKey>> */
trait PartialStyleRulesTabClassKey extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var fullWidth: js.UndefOr[CSSProperties] = js.undefined
  var label: js.UndefOr[CSSProperties] = js.undefined
  var labelContainer: js.UndefOr[CSSProperties] = js.undefined
  var labelIcon: js.UndefOr[CSSProperties] = js.undefined
  var labelWrapped: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var selected: js.UndefOr[CSSProperties] = js.undefined
  var textColorInherit: js.UndefOr[CSSProperties] = js.undefined
  var textColorPrimary: js.UndefOr[CSSProperties] = js.undefined
  var textColorSecondary: js.UndefOr[CSSProperties] = js.undefined
  var wrapper: js.UndefOr[CSSProperties] = js.undefined
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
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelContainer != null) __obj.updateDynamic("labelContainer")(labelContainer)
    if (labelIcon != null) __obj.updateDynamic("labelIcon")(labelIcon)
    if (labelWrapped != null) __obj.updateDynamic("labelWrapped")(labelWrapped)
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (textColorInherit != null) __obj.updateDynamic("textColorInherit")(textColorInherit)
    if (textColorPrimary != null) __obj.updateDynamic("textColorPrimary")(textColorPrimary)
    if (textColorSecondary != null) __obj.updateDynamic("textColorSecondary")(textColorSecondary)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[PartialStyleRulesTabClassKey]
  }
}

