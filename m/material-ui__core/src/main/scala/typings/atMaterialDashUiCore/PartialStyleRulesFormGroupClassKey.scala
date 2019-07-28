package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormGroup.FormGroupClassKey>> */
trait PartialStyleRulesFormGroupClassKey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.undefined
  var row: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesFormGroupClassKey {
  @scala.inline
  def apply(root: CSSProperties = null, row: CSSProperties = null): PartialStyleRulesFormGroupClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[PartialStyleRulesFormGroupClassKey]
  }
}

