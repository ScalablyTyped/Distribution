package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/BottomNavigation/BottomNavigation.BottomNavigationClassKey>> */
trait PartialClassNameMapBottomNavigationClassKey extends js.Object {
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapBottomNavigationClassKey {
  @scala.inline
  def apply(root: java.lang.String = null): PartialClassNameMapBottomNavigationClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapBottomNavigationClassKey]
  }
}

