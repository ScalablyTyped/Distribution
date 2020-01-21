package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Toolbar.ToolbarClassKey>> */
@js.native
trait PartialStyleRulesToolbarClassKey extends js.Object {
  var dense: js.UndefOr[CSSProperties] = js.native
  var gutters: js.UndefOr[CSSProperties] = js.native
  var regular: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesToolbarClassKey {
  @scala.inline
  def apply(
    dense: CSSProperties = null,
    gutters: CSSProperties = null,
    regular: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesToolbarClassKey = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (regular != null) __obj.updateDynamic("regular")(regular.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesToolbarClassKey]
  }
}

