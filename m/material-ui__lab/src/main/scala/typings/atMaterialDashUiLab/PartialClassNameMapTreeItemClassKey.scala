package typings.atMaterialDashUiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TreeItem/TreeItem.TreeItemClassKey>> */
trait PartialClassNameMapTreeItemClassKey extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var expanded: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var iconContainer: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTreeItemClassKey {
  @scala.inline
  def apply(
    content: String = null,
    expanded: String = null,
    group: String = null,
    iconContainer: String = null,
    label: String = null,
    root: String = null
  ): PartialClassNameMapTreeItemClassKey = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (group != null) __obj.updateDynamic("group")(group)
    if (iconContainer != null) __obj.updateDynamic("iconContainer")(iconContainer)
    if (label != null) __obj.updateDynamic("label")(label)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapTreeItemClassKey]
  }
}

