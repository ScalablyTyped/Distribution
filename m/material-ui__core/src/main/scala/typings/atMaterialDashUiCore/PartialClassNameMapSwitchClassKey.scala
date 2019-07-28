package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Switch/Switch.SwitchClassKey>> */
trait PartialClassNameMapSwitchClassKey extends js.Object {
  var bar: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[String] = js.undefined
  var colorPrimary: js.UndefOr[String] = js.undefined
  var colorSecondary: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var iconChecked: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var switchBase: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapSwitchClassKey {
  @scala.inline
  def apply(
    bar: String = null,
    checked: String = null,
    colorPrimary: String = null,
    colorSecondary: String = null,
    disabled: String = null,
    icon: String = null,
    iconChecked: String = null,
    input: String = null,
    root: String = null,
    switchBase: String = null
  ): PartialClassNameMapSwitchClassKey = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconChecked != null) __obj.updateDynamic("iconChecked")(iconChecked)
    if (input != null) __obj.updateDynamic("input")(input)
    if (root != null) __obj.updateDynamic("root")(root)
    if (switchBase != null) __obj.updateDynamic("switchBase")(switchBase)
    __obj.asInstanceOf[PartialClassNameMapSwitchClassKey]
  }
}

