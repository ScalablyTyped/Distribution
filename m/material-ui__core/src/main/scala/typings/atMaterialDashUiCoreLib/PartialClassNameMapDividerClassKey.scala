package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Divider/Divider.DividerClassKey>> */
trait PartialClassNameMapDividerClassKey extends js.Object {
  var absolute: js.UndefOr[java.lang.String] = js.undefined
  var inset: js.UndefOr[java.lang.String] = js.undefined
  var light: js.UndefOr[java.lang.String] = js.undefined
  var middle: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapDividerClassKey {
  @scala.inline
  def apply(
    absolute: java.lang.String = null,
    inset: java.lang.String = null,
    light: java.lang.String = null,
    middle: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapDividerClassKey = {
    val __obj = js.Dynamic.literal()
    if (absolute != null) __obj.updateDynamic("absolute")(absolute)
    if (inset != null) __obj.updateDynamic("inset")(inset)
    if (light != null) __obj.updateDynamic("light")(light)
    if (middle != null) __obj.updateDynamic("middle")(middle)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapDividerClassKey]
  }
}

