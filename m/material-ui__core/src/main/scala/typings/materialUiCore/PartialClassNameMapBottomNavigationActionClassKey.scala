package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/BottomNavigationAction/BottomNavigationAction.BottomNavigationActionClassKey>> */
@js.native
trait PartialClassNameMapBottomNavigationActionClassKey extends js.Object {
  var iconOnly: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
  var wrapper: js.UndefOr[String] = js.native
}

object PartialClassNameMapBottomNavigationActionClassKey {
  @scala.inline
  def apply(
    iconOnly: String = null,
    label: String = null,
    root: String = null,
    selected: String = null,
    wrapper: String = null
  ): PartialClassNameMapBottomNavigationActionClassKey = {
    val __obj = js.Dynamic.literal()
    if (iconOnly != null) __obj.updateDynamic("iconOnly")(iconOnly.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapBottomNavigationActionClassKey]
  }
}

