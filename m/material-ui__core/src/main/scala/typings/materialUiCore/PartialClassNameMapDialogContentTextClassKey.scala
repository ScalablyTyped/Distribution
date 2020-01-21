package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogContentText/DialogContentText.DialogContentTextClassKey>> */
@js.native
trait PartialClassNameMapDialogContentTextClassKey extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapDialogContentTextClassKey {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapDialogContentTextClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapDialogContentTextClassKey]
  }
}

