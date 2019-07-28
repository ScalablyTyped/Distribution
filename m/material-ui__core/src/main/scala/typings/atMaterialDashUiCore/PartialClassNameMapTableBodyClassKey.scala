package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyClassKey>> */
trait PartialClassNameMapTableBodyClassKey extends js.Object {
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTableBodyClassKey {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapTableBodyClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapTableBodyClassKey]
  }
}

