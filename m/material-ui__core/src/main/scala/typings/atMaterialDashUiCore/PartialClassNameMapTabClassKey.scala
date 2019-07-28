package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tab/Tab.TabClassKey>> */
trait PartialClassNameMapTabClassKey extends js.Object {
  var disabled: js.UndefOr[String] = js.undefined
  var fullWidth: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelContainer: js.UndefOr[String] = js.undefined
  var labelIcon: js.UndefOr[String] = js.undefined
  var labelWrapped: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
  var textColorInherit: js.UndefOr[String] = js.undefined
  var textColorPrimary: js.UndefOr[String] = js.undefined
  var textColorSecondary: js.UndefOr[String] = js.undefined
  var wrapper: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTabClassKey {
  @scala.inline
  def apply(
    disabled: String = null,
    fullWidth: String = null,
    label: String = null,
    labelContainer: String = null,
    labelIcon: String = null,
    labelWrapped: String = null,
    root: String = null,
    selected: String = null,
    textColorInherit: String = null,
    textColorPrimary: String = null,
    textColorSecondary: String = null,
    wrapper: String = null
  ): PartialClassNameMapTabClassKey = {
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
    __obj.asInstanceOf[PartialClassNameMapTabClassKey]
  }
}

