package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListSubheader/ListSubheader.ListSubheaderClassKey>> */
trait PartialClassNameMapListSubheaderClassKey extends js.Object {
  var colorInherit: js.UndefOr[String] = js.undefined
  var colorPrimary: js.UndefOr[String] = js.undefined
  var gutters: js.UndefOr[String] = js.undefined
  var inset: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var sticky: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapListSubheaderClassKey {
  @scala.inline
  def apply(
    colorInherit: String = null,
    colorPrimary: String = null,
    gutters: String = null,
    inset: String = null,
    root: String = null,
    sticky: String = null
  ): PartialClassNameMapListSubheaderClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorInherit != null) __obj.updateDynamic("colorInherit")(colorInherit.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (sticky != null) __obj.updateDynamic("sticky")(sticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapListSubheaderClassKey]
  }
}

