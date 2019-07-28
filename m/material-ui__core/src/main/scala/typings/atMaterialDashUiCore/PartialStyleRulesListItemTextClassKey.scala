package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListItemText.ListItemTextClassKey>> */
trait PartialStyleRulesListItemTextClassKey extends js.Object {
  var dense: js.UndefOr[CSSProperties] = js.undefined
  var inset: js.UndefOr[CSSProperties] = js.undefined
  var primary: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var secondary: js.UndefOr[CSSProperties] = js.undefined
  var textDense: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesListItemTextClassKey {
  @scala.inline
  def apply(
    dense: CSSProperties = null,
    inset: CSSProperties = null,
    primary: CSSProperties = null,
    root: CSSProperties = null,
    secondary: CSSProperties = null,
    textDense: CSSProperties = null
  ): PartialStyleRulesListItemTextClassKey = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense)
    if (inset != null) __obj.updateDynamic("inset")(inset)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (root != null) __obj.updateDynamic("root")(root)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    if (textDense != null) __obj.updateDynamic("textDense")(textDense)
    __obj.asInstanceOf[PartialStyleRulesListItemTextClassKey]
  }
}

