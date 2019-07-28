package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableBody.TableBodyClassKey>> */
trait PartialStyleRulesTableBodyClassKey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesTableBodyClassKey {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesTableBodyClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesTableBodyClassKey]
  }
}

