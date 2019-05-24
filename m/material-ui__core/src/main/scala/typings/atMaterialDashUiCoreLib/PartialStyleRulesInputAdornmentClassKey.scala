package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/InputAdornment.InputAdornmentClassKey>> */
trait PartialStyleRulesInputAdornmentClassKey extends js.Object {
  var disablePointerEvents: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var filled: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var positionEnd: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var positionStart: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesInputAdornmentClassKey {
  @scala.inline
  def apply(
    disablePointerEvents: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    filled: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    positionEnd: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    positionStart: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesInputAdornmentClassKey = {
    val __obj = js.Dynamic.literal()
    if (disablePointerEvents != null) __obj.updateDynamic("disablePointerEvents")(disablePointerEvents)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (positionEnd != null) __obj.updateDynamic("positionEnd")(positionEnd)
    if (positionStart != null) __obj.updateDynamic("positionStart")(positionStart)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesInputAdornmentClassKey]
  }
}

