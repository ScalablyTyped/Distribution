package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Modal/Modal.ModalClassKey>> */
trait PartialClassNameMapModalClassKey extends js.Object {
  var hidden: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapModalClassKey {
  @scala.inline
  def apply(hidden: java.lang.String = null, root: java.lang.String = null): PartialClassNameMapModalClassKey = {
    val __obj = js.Dynamic.literal()
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapModalClassKey]
  }
}

