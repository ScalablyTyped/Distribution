package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Table/Table.TableClassKey>> */
trait PartialClassNameMapTableClassKey extends js.Object {
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTableClassKey {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapTableClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapTableClassKey]
  }
}

