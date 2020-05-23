package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/BottomNavigation/BottomNavigation.BottomNavigationClassKey>> */
@js.native
trait PartialClassNameMapBottom extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapBottom {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapBottom = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapBottom]
  }
}

