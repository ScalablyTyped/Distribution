package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/OutlinedInput/NotchedOutline.NotchedOutlineClassKey>> */
@js.native
trait PartialClassNameMapNotchedOutlineClassKey extends js.Object {
  var disabled: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var legend: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapNotchedOutlineClassKey {
  @scala.inline
  def apply(
    disabled: String = null,
    error: String = null,
    focused: String = null,
    legend: String = null,
    root: String = null
  ): PartialClassNameMapNotchedOutlineClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapNotchedOutlineClassKey]
  }
}

