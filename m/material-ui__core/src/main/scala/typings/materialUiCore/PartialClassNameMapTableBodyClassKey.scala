package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableBody/TableBody.TableBodyClassKey>> */
@js.native
trait PartialClassNameMapTableBodyClassKey extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTableBodyClassKey {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapTableBodyClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTableBodyClassKey]
  }
}

