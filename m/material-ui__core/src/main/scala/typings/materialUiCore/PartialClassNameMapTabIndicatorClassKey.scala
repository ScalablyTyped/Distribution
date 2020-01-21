package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tabs/TabIndicator.TabIndicatorClassKey>> */
@js.native
trait PartialClassNameMapTabIndicatorClassKey extends js.Object {
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTabIndicatorClassKey {
  @scala.inline
  def apply(colorPrimary: String = null, colorSecondary: String = null, root: String = null): PartialClassNameMapTabIndicatorClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTabIndicatorClassKey]
  }
}

