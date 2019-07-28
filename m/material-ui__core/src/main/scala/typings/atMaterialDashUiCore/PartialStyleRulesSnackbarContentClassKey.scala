package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/SnackbarContent.SnackbarContentClassKey>> */
trait PartialStyleRulesSnackbarContentClassKey extends js.Object {
  var action: js.UndefOr[CSSProperties] = js.undefined
  var message: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesSnackbarContentClassKey {
  @scala.inline
  def apply(action: CSSProperties = null, message: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesSnackbarContentClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (message != null) __obj.updateDynamic("message")(message)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesSnackbarContentClassKey]
  }
}

