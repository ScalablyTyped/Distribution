package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogContent/DialogContent.DialogContentClassKey>> */
@js.native
trait PartialClassNameMapDialogContentClassKey extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapDialogContentClassKey {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapDialogContentClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapDialogContentClassKey]
  }
}

