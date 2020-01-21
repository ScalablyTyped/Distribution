package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListSubheader.ListSubheaderClassKey>> */
@js.native
trait PartialStyleRulesListSubheaderClassKey extends js.Object {
  var colorInherit: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var gutters: js.UndefOr[CSSProperties] = js.native
  var inset: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var sticky: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesListSubheaderClassKey {
  @scala.inline
  def apply(
    colorInherit: CSSProperties = null,
    colorPrimary: CSSProperties = null,
    gutters: CSSProperties = null,
    inset: CSSProperties = null,
    root: CSSProperties = null,
    sticky: CSSProperties = null
  ): PartialStyleRulesListSubheaderClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorInherit != null) __obj.updateDynamic("colorInherit")(colorInherit.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (sticky != null) __obj.updateDynamic("sticky")(sticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesListSubheaderClassKey]
  }
}

