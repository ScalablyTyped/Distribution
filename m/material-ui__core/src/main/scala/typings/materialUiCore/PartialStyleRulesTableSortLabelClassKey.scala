package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableSortLabel.TableSortLabelClassKey>> */
@js.native
trait PartialStyleRulesTableSortLabelClassKey extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.native
  var icon: js.UndefOr[CSSProperties] = js.native
  var iconDirectionAsc: js.UndefOr[CSSProperties] = js.native
  var iconDirectionDesc: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
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
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconDirectionAsc != null) __obj.updateDynamic("iconDirectionAsc")(iconDirectionAsc.asInstanceOf[js.Any])
    if (iconDirectionDesc != null) __obj.updateDynamic("iconDirectionDesc")(iconDirectionDesc.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesTableSortLabelClassKey]
  }
}

