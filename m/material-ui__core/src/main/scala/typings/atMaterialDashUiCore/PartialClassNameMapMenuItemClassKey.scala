package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MenuItem/MenuItem.MenuItemClassKey>> */
trait PartialClassNameMapMenuItemClassKey extends js.Object {
  var gutters: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapMenuItemClassKey {
  @scala.inline
  def apply(gutters: String = null, root: String = null, selected: String = null): PartialClassNameMapMenuItemClassKey = {
    val __obj = js.Dynamic.literal()
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapMenuItemClassKey]
  }
}

