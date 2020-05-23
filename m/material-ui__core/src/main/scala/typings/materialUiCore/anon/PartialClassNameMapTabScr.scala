package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tabs/TabScrollButton.TabScrollButtonClassKey>> */
@js.native
trait PartialClassNameMapTabScr extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTabScr {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapTabScr = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTabScr]
  }
}

