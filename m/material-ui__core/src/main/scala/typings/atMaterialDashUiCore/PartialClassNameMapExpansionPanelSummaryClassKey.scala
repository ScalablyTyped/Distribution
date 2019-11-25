package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanelSummary/ExpansionPanelSummary.ExpansionPanelSummaryClassKey>> */
trait PartialClassNameMapExpansionPanelSummaryClassKey extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var expandIcon: js.UndefOr[String] = js.undefined
  var expanded: js.UndefOr[String] = js.undefined
  var focused: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapExpansionPanelSummaryClassKey {
  @scala.inline
  def apply(
    content: String = null,
    disabled: String = null,
    expandIcon: String = null,
    expanded: String = null,
    focused: String = null,
    root: String = null
  ): PartialClassNameMapExpansionPanelSummaryClassKey = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapExpansionPanelSummaryClassKey]
  }
}

