package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardActionArea.CardActionAreaClassKey>> */
trait PartialStyleRulesCardActionAreaClassKey extends js.Object {
  var focusHighlight: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var focusVisible: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesCardActionAreaClassKey {
  @scala.inline
  def apply(
    focusHighlight: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    focusVisible: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesCardActionAreaClassKey = {
    val __obj = js.Dynamic.literal()
    if (focusHighlight != null) __obj.updateDynamic("focusHighlight")(focusHighlight)
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesCardActionAreaClassKey]
  }
}

