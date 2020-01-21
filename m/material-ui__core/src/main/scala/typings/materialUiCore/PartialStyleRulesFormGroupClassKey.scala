package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormGroup.FormGroupClassKey>> */
@js.native
trait PartialStyleRulesFormGroupClassKey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
  var row: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesFormGroupClassKey {
  @scala.inline
  def apply(root: CSSProperties = null, row: CSSProperties = null): PartialStyleRulesFormGroupClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesFormGroupClassKey]
  }
}

