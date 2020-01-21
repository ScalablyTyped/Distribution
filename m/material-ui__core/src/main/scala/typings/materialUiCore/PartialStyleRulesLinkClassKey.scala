package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Link.LinkClassKey>> */
@js.native
trait PartialStyleRulesLinkClassKey extends js.Object {
  var button: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var underlineAlways: js.UndefOr[CSSProperties] = js.native
  var underlineHover: js.UndefOr[CSSProperties] = js.native
  var underlineNone: js.UndefOr[CSSProperties] = js.native
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
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (underlineAlways != null) __obj.updateDynamic("underlineAlways")(underlineAlways.asInstanceOf[js.Any])
    if (underlineHover != null) __obj.updateDynamic("underlineHover")(underlineHover.asInstanceOf[js.Any])
    if (underlineNone != null) __obj.updateDynamic("underlineNone")(underlineNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesLinkClassKey]
  }
}

