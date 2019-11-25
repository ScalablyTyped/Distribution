package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Card/Card.CardClassKey>> */
trait PartialClassNameMapCardClassKey extends js.Object {
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapCardClassKey {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapCardClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapCardClassKey]
  }
}

