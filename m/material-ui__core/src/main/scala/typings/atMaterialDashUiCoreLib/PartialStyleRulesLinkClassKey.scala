package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Link.LinkClassKey>> */
trait PartialStyleRulesLinkClassKey extends js.Object {
  var button: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var underlineAlways: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var underlineHover: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var underlineNone: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesLinkClassKey {
  @scala.inline
  def apply(
    button: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    underlineAlways: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    underlineHover: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    underlineNone: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
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

