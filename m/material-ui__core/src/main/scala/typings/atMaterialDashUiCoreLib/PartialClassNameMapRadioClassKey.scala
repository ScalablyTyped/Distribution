package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Radio/Radio.RadioClassKey>> */
trait PartialClassNameMapRadioClassKey extends js.Object {
  var checked: js.UndefOr[java.lang.String] = js.undefined
  var colorPrimary: js.UndefOr[java.lang.String] = js.undefined
  var colorSecondary: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapRadioClassKey {
  @scala.inline
  def apply(
    checked: java.lang.String = null,
    colorPrimary: java.lang.String = null,
    colorSecondary: java.lang.String = null,
    disabled: java.lang.String = null,
    input: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapRadioClassKey = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (input != null) __obj.updateDynamic("input")(input)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapRadioClassKey]
  }
}

