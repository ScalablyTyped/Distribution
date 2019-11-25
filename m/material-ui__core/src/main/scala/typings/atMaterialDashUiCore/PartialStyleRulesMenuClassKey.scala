package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Menu.MenuClassKey>> */
trait PartialStyleRulesMenuClassKey extends js.Object {
  var paper: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesMenuClassKey {
  @scala.inline
  def apply(paper: CSSProperties = null): PartialStyleRulesMenuClassKey = {
    val __obj = js.Dynamic.literal()
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesMenuClassKey]
  }
}

