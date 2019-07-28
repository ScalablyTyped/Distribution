package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Link.LinkClassKey>> */
trait PartialStyleRulesLinkClassKey extends js.Object {
  var button: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var underlineAlways: js.UndefOr[CSSProperties] = js.undefined
  var underlineHover: js.UndefOr[CSSProperties] = js.undefined
  var underlineNone: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesLinkClassKey {
  @scala.inline
  def apply(
    button: CSSProperties = null,
    root: CSSProperties = null,
    underlineAlways: CSSProperties = null,
    underlineHover: CSSProperties = null,
    underlineNone: CSSProperties = null
  ): PartialStyleRulesLinkClassKey = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button)
    if (root != null) __obj.updateDynamic("root")(root)
    if (underlineAlways != null) __obj.updateDynamic("underlineAlways")(underlineAlways)
    if (underlineHover != null) __obj.updateDynamic("underlineHover")(underlineHover)
    if (underlineNone != null) __obj.updateDynamic("underlineNone")(underlineNone)
    __obj.asInstanceOf[PartialStyleRulesLinkClassKey]
  }
}

