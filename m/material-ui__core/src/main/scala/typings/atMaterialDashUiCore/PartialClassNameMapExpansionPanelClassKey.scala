package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanel/ExpansionPanel.ExpansionPanelClassKey>> */
trait PartialClassNameMapExpansionPanelClassKey extends js.Object {
  var disabled: js.UndefOr[String] = js.undefined
  var expanded: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var rounded: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapExpansionPanelClassKey {
  @scala.inline
  def apply(disabled: String = null, expanded: String = null, root: String = null, rounded: String = null): PartialClassNameMapExpansionPanelClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (root != null) __obj.updateDynamic("root")(root)
    if (rounded != null) __obj.updateDynamic("rounded")(rounded)
    __obj.asInstanceOf[PartialClassNameMapExpansionPanelClassKey]
  }
}

