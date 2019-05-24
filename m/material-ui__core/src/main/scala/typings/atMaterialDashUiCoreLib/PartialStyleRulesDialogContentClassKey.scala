package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/DialogContent.DialogContentClassKey>> */
trait PartialStyleRulesDialogContentClassKey extends js.Object {
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesDialogContentClassKey {
  @scala.inline
  def apply(root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null): PartialStyleRulesDialogContentClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesDialogContentClassKey]
  }
}

