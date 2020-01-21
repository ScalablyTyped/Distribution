package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tab/Tab.TabClassKey>> */
@js.native
trait PartialClassNameMapTabClassKey extends js.Object {
  var disabled: js.UndefOr[String] = js.native
  var fullWidth: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var labelContainer: js.UndefOr[String] = js.native
  var labelIcon: js.UndefOr[String] = js.native
  var labelWrapped: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
  var textColorInherit: js.UndefOr[String] = js.native
  var textColorPrimary: js.UndefOr[String] = js.native
  var textColorSecondary: js.UndefOr[String] = js.native
  var wrapper: js.UndefOr[String] = js.native
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
    __obj.asInstanceOf[PartialClassNameMapTabClassKey]
  }
}

