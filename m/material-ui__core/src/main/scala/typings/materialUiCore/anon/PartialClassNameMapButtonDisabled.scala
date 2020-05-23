package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseClassKey>> */
@js.native
trait PartialClassNameMapButtonDisabled extends js.Object {
  var disabled: js.UndefOr[String] = js.native
  var focusVisible: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapButtonDisabled {
  @scala.inline
  def apply(disabled: String = null, focusVisible: String = null, root: String = null): PartialClassNameMapButtonDisabled = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapButtonDisabled]
  }
}

