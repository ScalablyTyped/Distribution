package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListSubheader/ListSubheader.ListSubheaderClassKey>> */
trait PartialClassNameMapListSubheaderClassKey extends js.Object {
  var colorInherit: js.UndefOr[java.lang.String] = js.undefined
  var colorPrimary: js.UndefOr[java.lang.String] = js.undefined
  var gutters: js.UndefOr[java.lang.String] = js.undefined
  var inset: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var sticky: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapListSubheaderClassKey {
  @scala.inline
  def apply(
    colorInherit: java.lang.String = null,
    colorPrimary: java.lang.String = null,
    gutters: java.lang.String = null,
    inset: java.lang.String = null,
    root: java.lang.String = null,
    sticky: java.lang.String = null
  ): PartialClassNameMapListSubheaderClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorInherit != null) __obj.updateDynamic("colorInherit")(colorInherit)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (inset != null) __obj.updateDynamic("inset")(inset)
    if (root != null) __obj.updateDynamic("root")(root)
    if (sticky != null) __obj.updateDynamic("sticky")(sticky)
    __obj.asInstanceOf[PartialClassNameMapListSubheaderClassKey]
  }
}

