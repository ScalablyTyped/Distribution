package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableRow/TableRow.TableRowClassKey>> */
trait PartialClassNameMapTableRowClassKey extends js.Object {
  var footer: js.UndefOr[String] = js.undefined
  var head: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTableRowClassKey {
  @scala.inline
  def apply(
    footer: String = null,
    head: String = null,
    hover: String = null,
    root: String = null,
    selected: String = null
  ): PartialClassNameMapTableRowClassKey = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTableRowClassKey]
  }
}

