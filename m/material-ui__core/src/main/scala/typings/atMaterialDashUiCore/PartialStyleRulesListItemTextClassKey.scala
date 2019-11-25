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
    if (dense != null) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (textDense != null) __obj.updateDynamic("textDense")(textDense.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesListItemTextClassKey]
  }
}

