package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Select/Select.SelectClassKey>> */
trait PartialClassNameMapSelectClassKey extends js.Object {
  var disabled: js.UndefOr[String] = js.undefined
  var filled: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var outlined: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[String] = js.undefined
  var selectMenu: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapSelectClassKey {
  @scala.inline
  def apply(
    disabled: String = null,
    filled: String = null,
    icon: String = null,
    outlined: String = null,
    root: String = null,
    select: String = null,
    selectMenu: String = null
  ): PartialClassNameMapSelectClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (outlined != null) __obj.updateDynamic("outlined")(outlined)
    if (root != null) __obj.updateDynamic("root")(root)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectMenu != null) __obj.updateDynamic("selectMenu")(selectMenu)
    __obj.asInstanceOf[PartialClassNameMapSelectClassKey]
  }
}

