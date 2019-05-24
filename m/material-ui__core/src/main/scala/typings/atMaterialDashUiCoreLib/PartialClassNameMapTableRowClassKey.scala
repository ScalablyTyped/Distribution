package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableRow/TableRow.TableRowClassKey>> */
trait PartialClassNameMapTableRowClassKey extends js.Object {
  var footer: js.UndefOr[java.lang.String] = js.undefined
  var head: js.UndefOr[java.lang.String] = js.undefined
  var hover: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapTableRowClassKey {
  @scala.inline
  def apply(
    footer: java.lang.String = null,
    head: java.lang.String = null,
    hover: java.lang.String = null,
    root: java.lang.String = null,
    selected: java.lang.String = null
  ): PartialClassNameMapTableRowClassKey = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (head != null) __obj.updateDynamic("head")(head)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PartialClassNameMapTableRowClassKey]
  }
}

