package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableCell.TableCellClassKey>> */
trait PartialStyleRulesTableCellClassKey extends js.Object {
  var body: js.UndefOr[CSSProperties] = js.undefined
  var footer: js.UndefOr[CSSProperties] = js.undefined
  var head: js.UndefOr[CSSProperties] = js.undefined
  var numeric: js.UndefOr[CSSProperties] = js.undefined
  var paddingCheckbox: js.UndefOr[CSSProperties] = js.undefined
  var paddingDense: js.UndefOr[CSSProperties] = js.undefined
  var paddingNone: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesTableCellClassKey {
  @scala.inline
  def apply(
    body: CSSProperties = null,
    footer: CSSProperties = null,
    head: CSSProperties = null,
    numeric: CSSProperties = null,
    paddingCheckbox: CSSProperties = null,
    paddingDense: CSSProperties = null,
    paddingNone: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesTableCellClassKey = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (head != null) __obj.updateDynamic("head")(head)
    if (numeric != null) __obj.updateDynamic("numeric")(numeric)
    if (paddingCheckbox != null) __obj.updateDynamic("paddingCheckbox")(paddingCheckbox)
    if (paddingDense != null) __obj.updateDynamic("paddingDense")(paddingDense)
    if (paddingNone != null) __obj.updateDynamic("paddingNone")(paddingNone)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesTableCellClassKey]
  }
}

