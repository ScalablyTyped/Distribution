package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableSortLabel.TableSortLabelClassKey>> */
trait PartialStyleRulesTableSortLabelClassKey extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.undefined
  var icon: js.UndefOr[CSSProperties] = js.undefined
  var iconDirectionAsc: js.UndefOr[CSSProperties] = js.undefined
  var iconDirectionDesc: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesTableSortLabelClassKey {
  @scala.inline
  def apply(
    active: CSSProperties = null,
    icon: CSSProperties = null,
    iconDirectionAsc: CSSProperties = null,
    iconDirectionDesc: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesTableSortLabelClassKey = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconDirectionAsc != null) __obj.updateDynamic("iconDirectionAsc")(iconDirectionAsc)
    if (iconDirectionDesc != null) __obj.updateDynamic("iconDirectionDesc")(iconDirectionDesc)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesTableSortLabelClassKey]
  }
}

