package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseClassKey>> */
@js.native
trait PartialClassNameMapSwitchBaseClassKey extends js.Object {
  var checked: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapSwitchBaseClassKey {
  @scala.inline
  def apply(checked: String = null, disabled: String = null, input: String = null, root: String = null): PartialClassNameMapSwitchBaseClassKey = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapSwitchBaseClassKey]
  }
}

