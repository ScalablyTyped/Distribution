package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseClassKey>> */
trait PartialClassNameMapSwitchBaseClassKey extends js.Object {
  var checked: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapSwitchBaseClassKey {
  @scala.inline
  def apply(checked: String = null, disabled: String = null, input: String = null, root: String = null): PartialClassNameMapSwitchBaseClassKey = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (input != null) __obj.updateDynamic("input")(input)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapSwitchBaseClassKey]
  }
}

