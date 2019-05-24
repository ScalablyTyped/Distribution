package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tabs/TabIndicator.TabIndicatorClassKey>> */
trait PartialClassNameMapTabIndicatorClassKey extends js.Object {
  var colorPrimary: js.UndefOr[java.lang.String] = js.undefined
  var colorSecondary: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapTabIndicatorClassKey {
  @scala.inline
  def apply(
    colorPrimary: java.lang.String = null,
    colorSecondary: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapTabIndicatorClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapTabIndicatorClassKey]
  }
}

