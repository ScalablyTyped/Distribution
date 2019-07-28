package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseClassKey>> */
trait PartialClassNameMapButtonBaseClassKey extends js.Object {
  var disabled: js.UndefOr[String] = js.undefined
  var focusVisible: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapButtonBaseClassKey {
  @scala.inline
  def apply(disabled: String = null, focusVisible: String = null, root: String = null): PartialClassNameMapButtonBaseClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapButtonBaseClassKey]
  }
}

