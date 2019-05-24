package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseClassKey>> */
trait PartialClassNameMapButtonBaseClassKey extends js.Object {
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var focusVisible: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapButtonBaseClassKey {
  @scala.inline
  def apply(
    disabled: java.lang.String = null,
    focusVisible: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapButtonBaseClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapButtonBaseClassKey]
  }
}

