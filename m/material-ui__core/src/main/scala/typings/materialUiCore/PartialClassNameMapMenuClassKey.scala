package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Menu/Menu.MenuClassKey>> */
@js.native
trait PartialClassNameMapMenuClassKey extends js.Object {
  var paper: js.UndefOr[String] = js.native
}

object PartialClassNameMapMenuClassKey {
  @scala.inline
  def apply(paper: String = null): PartialClassNameMapMenuClassKey = {
    val __obj = js.Dynamic.literal()
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapMenuClassKey]
  }
}

