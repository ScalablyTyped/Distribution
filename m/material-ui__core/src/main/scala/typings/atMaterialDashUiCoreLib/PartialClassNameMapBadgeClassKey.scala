package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Badge/Badge.BadgeClassKey>> */
trait PartialClassNameMapBadgeClassKey extends js.Object {
  var badge: js.UndefOr[java.lang.String] = js.undefined
  var colorPrimary: js.UndefOr[java.lang.String] = js.undefined
  var colorSecondary: js.UndefOr[java.lang.String] = js.undefined
  var dot: js.UndefOr[java.lang.String] = js.undefined
  var invisible: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapBadgeClassKey {
  @scala.inline
  def apply(
    badge: java.lang.String = null,
    colorPrimary: java.lang.String = null,
    colorSecondary: java.lang.String = null,
    dot: java.lang.String = null,
    invisible: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapBadgeClassKey = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (dot != null) __obj.updateDynamic("dot")(dot)
    if (invisible != null) __obj.updateDynamic("invisible")(invisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapBadgeClassKey]
  }
}

