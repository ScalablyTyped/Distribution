package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/NativeSelect/NativeSelect.NativeSelectClassKey>> */
trait PartialClassNameMapNativeSelectClassKey extends js.Object {
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var filled: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var outlined: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[java.lang.String] = js.undefined
  var selectMenu: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapNativeSelectClassKey {
  @scala.inline
  def apply(
    disabled: java.lang.String = null,
    filled: java.lang.String = null,
    icon: java.lang.String = null,
    outlined: java.lang.String = null,
    root: java.lang.String = null,
    select: java.lang.String = null,
    selectMenu: java.lang.String = null
  ): PartialClassNameMapNativeSelectClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (outlined != null) __obj.updateDynamic("outlined")(outlined)
    if (root != null) __obj.updateDynamic("root")(root)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectMenu != null) __obj.updateDynamic("selectMenu")(selectMenu)
    __obj.asInstanceOf[PartialClassNameMapNativeSelectClassKey]
  }
}

