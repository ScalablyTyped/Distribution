package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MenuItem/MenuItem.MenuItemClassKey>> */
trait PartialClassNameMapMenuItemClassKey extends js.Object {
  var gutters: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapMenuItemClassKey {
  @scala.inline
  def apply(gutters: java.lang.String = null, root: java.lang.String = null, selected: java.lang.String = null): PartialClassNameMapMenuItemClassKey = {
    val __obj = js.Dynamic.literal()
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PartialClassNameMapMenuItemClassKey]
  }
}

