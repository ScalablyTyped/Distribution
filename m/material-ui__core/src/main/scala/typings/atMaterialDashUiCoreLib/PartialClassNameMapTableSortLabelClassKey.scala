package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableSortLabel/TableSortLabel.TableSortLabelClassKey>> */
trait PartialClassNameMapTableSortLabelClassKey extends js.Object {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iconDirectionAsc: js.UndefOr[java.lang.String] = js.undefined
  var iconDirectionDesc: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapTableSortLabelClassKey {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    icon: java.lang.String = null,
    iconDirectionAsc: java.lang.String = null,
    iconDirectionDesc: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapTableSortLabelClassKey = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconDirectionAsc != null) __obj.updateDynamic("iconDirectionAsc")(iconDirectionAsc)
    if (iconDirectionDesc != null) __obj.updateDynamic("iconDirectionDesc")(iconDirectionDesc)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapTableSortLabelClassKey]
  }
}

