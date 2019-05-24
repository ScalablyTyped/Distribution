package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanelSummary/ExpansionPanelSummary.ExpansionPanelSummaryClassKey>> */
trait PartialClassNameMapExpansionPanelSummaryClassKey extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var expandIcon: js.UndefOr[java.lang.String] = js.undefined
  var expanded: js.UndefOr[java.lang.String] = js.undefined
  var focused: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapExpansionPanelSummaryClassKey {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    disabled: java.lang.String = null,
    expandIcon: java.lang.String = null,
    expanded: java.lang.String = null,
    focused: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapExpansionPanelSummaryClassKey = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapExpansionPanelSummaryClassKey]
  }
}

