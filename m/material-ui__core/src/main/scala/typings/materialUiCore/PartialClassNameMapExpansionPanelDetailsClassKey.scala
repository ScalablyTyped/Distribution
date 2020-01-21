package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanelDetails/ExpansionPanelDetails.ExpansionPanelDetailsClassKey>> */
@js.native
trait PartialClassNameMapExpansionPanelDetailsClassKey extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapExpansionPanelDetailsClassKey {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapExpansionPanelDetailsClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapExpansionPanelDetailsClassKey]
  }
}

