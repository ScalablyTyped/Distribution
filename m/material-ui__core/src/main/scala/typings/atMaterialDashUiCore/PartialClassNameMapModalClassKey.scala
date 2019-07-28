package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Modal/Modal.ModalClassKey>> */
trait PartialClassNameMapModalClassKey extends js.Object {
  var hidden: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapModalClassKey {
  @scala.inline
  def apply(hidden: String = null, root: String = null): PartialClassNameMapModalClassKey = {
    val __obj = js.Dynamic.literal()
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapModalClassKey]
  }
}

