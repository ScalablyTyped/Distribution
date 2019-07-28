package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Modal.ModalClassKey>> */
trait PartialStyleRulesModalClassKey extends js.Object {
  var hidden: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesModalClassKey {
  @scala.inline
  def apply(hidden: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesModalClassKey = {
    val __obj = js.Dynamic.literal()
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesModalClassKey]
  }
}

