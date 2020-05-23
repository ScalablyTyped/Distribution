package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Popover/Popover.PopoverClassKey>> */
@js.native
trait PartialClassNameMapPopove extends js.Object {
  var paper: js.UndefOr[String] = js.native
}

object PartialClassNameMapPopove {
  @scala.inline
  def apply(paper: String = null): PartialClassNameMapPopove = {
    val __obj = js.Dynamic.literal()
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapPopove]
  }
}

