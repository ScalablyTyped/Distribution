package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Checkbox/Checkbox.CheckboxClassKey>> */
trait PartialClassNameMapCheckboxClassKey extends js.Object {
  var checked: js.UndefOr[String] = js.undefined
  var colorPrimary: js.UndefOr[String] = js.undefined
  var colorSecondary: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var indeterminate: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapCheckboxClassKey {
  @scala.inline
  def apply(
    checked: String = null,
    colorPrimary: String = null,
    colorSecondary: String = null,
    disabled: String = null,
    indeterminate: String = null,
    input: String = null,
    root: String = null
  ): PartialClassNameMapCheckboxClassKey = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (indeterminate != null) __obj.updateDynamic("indeterminate")(indeterminate)
    if (input != null) __obj.updateDynamic("input")(input)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapCheckboxClassKey]
  }
}

