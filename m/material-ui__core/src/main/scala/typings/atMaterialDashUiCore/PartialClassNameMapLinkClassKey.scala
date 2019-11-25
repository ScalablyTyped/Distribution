package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Link/Link.LinkClassKey>> */
trait PartialClassNameMapLinkClassKey extends js.Object {
  var button: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var underlineAlways: js.UndefOr[String] = js.undefined
  var underlineHover: js.UndefOr[String] = js.undefined
  var underlineNone: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapLinkClassKey {
  @scala.inline
  def apply(
    button: String = null,
    root: String = null,
    underlineAlways: String = null,
    underlineHover: String = null,
    underlineNone: String = null
  ): PartialClassNameMapLinkClassKey = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (underlineAlways != null) __obj.updateDynamic("underlineAlways")(underlineAlways.asInstanceOf[js.Any])
    if (underlineHover != null) __obj.updateDynamic("underlineHover")(underlineHover.asInstanceOf[js.Any])
    if (underlineNone != null) __obj.updateDynamic("underlineNone")(underlineNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapLinkClassKey]
  }
}

