package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Modal/Modal.ModalClassKey>> */
@js.native
trait PartialClassNameMapModalC extends js.Object {
  var hidden: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapModalC {
  @scala.inline
  def apply(hidden: String = null, root: String = null): PartialClassNameMapModalC = {
    val __obj = js.Dynamic.literal()
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapModalC]
  }
}

