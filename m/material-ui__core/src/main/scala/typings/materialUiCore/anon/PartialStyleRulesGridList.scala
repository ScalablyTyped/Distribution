package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridList.GridListClassKey>> */
@js.native
trait PartialStyleRulesGridList extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesGridList {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesGridList = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesGridList]
  }
}

