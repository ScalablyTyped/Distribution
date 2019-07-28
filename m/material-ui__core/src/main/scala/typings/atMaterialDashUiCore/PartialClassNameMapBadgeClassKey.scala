package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Badge/Badge.BadgeClassKey>> */
trait PartialClassNameMapBadgeClassKey extends js.Object {
  var badge: js.UndefOr[String] = js.undefined
  var colorPrimary: js.UndefOr[String] = js.undefined
  var colorSecondary: js.UndefOr[String] = js.undefined
  var dot: js.UndefOr[String] = js.undefined
  var invisible: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapBadgeClassKey {
  @scala.inline
  def apply(
    badge: String = null,
    colorPrimary: String = null,
    colorSecondary: String = null,
    dot: String = null,
    invisible: String = null,
    root: String = null
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

