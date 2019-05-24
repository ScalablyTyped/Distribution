package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MenuList/MenuList.MenuListClassKey>> */
trait PartialClassNameMapMenuListClassKey extends js.Object {
  var dense: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var subheader: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapMenuListClassKey {
  @scala.inline
  def apply(
    dense: java.lang.String = null,
    padding: java.lang.String = null,
    root: java.lang.String = null,
    subheader: java.lang.String = null
  ): PartialClassNameMapMenuListClassKey = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (root != null) __obj.updateDynamic("root")(root)
    if (subheader != null) __obj.updateDynamic("subheader")(subheader)
    __obj.asInstanceOf[PartialClassNameMapMenuListClassKey]
  }
}

