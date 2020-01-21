package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/DialogContentText.DialogContentTextClassKey>> */
@js.native
trait PartialStyleRulesDialogContentTextClassKey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesDialogContentTextClassKey {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesDialogContentTextClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesDialogContentTextClassKey]
  }
}

