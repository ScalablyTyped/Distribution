package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/BottomNavigationAction/BottomNavigationAction.BottomNavigationActionClassKey>> */
trait PartialClassNameMapBottomNavigationActionClassKey extends js.Object {
  var iconOnly: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[java.lang.String] = js.undefined
  var wrapper: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapBottomNavigationActionClassKey {
  @scala.inline
  def apply(
    iconOnly: java.lang.String = null,
    label: java.lang.String = null,
    root: java.lang.String = null,
    selected: java.lang.String = null,
    wrapper: java.lang.String = null
  ): PartialClassNameMapBottomNavigationActionClassKey = {
    val __obj = js.Dynamic.literal()
    if (iconOnly != null) __obj.updateDynamic("iconOnly")(iconOnly)
    if (label != null) __obj.updateDynamic("label")(label)
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[PartialClassNameMapBottomNavigationActionClassKey]
  }
}

