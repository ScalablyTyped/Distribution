package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Backdrop/Backdrop.BackdropClassKey>> */
trait PartialClassNameMapBackdropClassKey extends js.Object {
  var invisible: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapBackdropClassKey {
  @scala.inline
  def apply(invisible: java.lang.String = null, root: java.lang.String = null): PartialClassNameMapBackdropClassKey = {
    val __obj = js.Dynamic.literal()
    if (invisible != null) __obj.updateDynamic("invisible")(invisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapBackdropClassKey]
  }
}

