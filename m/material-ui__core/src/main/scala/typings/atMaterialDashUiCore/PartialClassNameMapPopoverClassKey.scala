package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Popover/Popover.PopoverClassKey>> */
trait PartialClassNameMapPopoverClassKey extends js.Object {
  var paper: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapPopoverClassKey {
  @scala.inline
  def apply(paper: String = null): PartialClassNameMapPopoverClassKey = {
    val __obj = js.Dynamic.literal()
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapPopoverClassKey]
  }
}

