package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanel/ExpansionPanel.ExpansionPanelClassKey>> */
trait PartialClassNameMapExpansionPanelClassKey extends js.Object {
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var expanded: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var rounded: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapExpansionPanelClassKey {
  @scala.inline
  def apply(
    disabled: java.lang.String = null,
    expanded: java.lang.String = null,
    root: java.lang.String = null,
    rounded: java.lang.String = null
  ): PartialClassNameMapExpansionPanelClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (root != null) __obj.updateDynamic("root")(root)
    if (rounded != null) __obj.updateDynamic("rounded")(rounded)
    __obj.asInstanceOf[PartialClassNameMapExpansionPanelClassKey]
  }
}

