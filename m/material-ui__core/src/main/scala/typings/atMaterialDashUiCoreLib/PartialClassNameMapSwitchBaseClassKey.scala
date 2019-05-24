package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseClassKey>> */
trait PartialClassNameMapSwitchBaseClassKey extends js.Object {
  var checked: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapSwitchBaseClassKey {
  @scala.inline
  def apply(
    checked: java.lang.String = null,
    disabled: java.lang.String = null,
    input: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapSwitchBaseClassKey = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (input != null) __obj.updateDynamic("input")(input)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapSwitchBaseClassKey]
  }
}

