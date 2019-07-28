package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tabs/TabIndicator.TabIndicatorClassKey>> */
trait PartialClassNameMapTabIndicatorClassKey extends js.Object {
  var colorPrimary: js.UndefOr[String] = js.undefined
  var colorSecondary: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTabIndicatorClassKey {
  @scala.inline
  def apply(colorPrimary: String = null, colorSecondary: String = null, root: String = null): PartialClassNameMapTabIndicatorClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapTabIndicatorClassKey]
  }
}

