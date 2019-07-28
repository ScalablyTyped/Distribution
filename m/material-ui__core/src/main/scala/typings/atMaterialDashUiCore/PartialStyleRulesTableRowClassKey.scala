package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableRow.TableRowClassKey>> */
trait PartialStyleRulesTableRowClassKey extends js.Object {
  var footer: js.UndefOr[CSSProperties] = js.undefined
  var head: js.UndefOr[CSSProperties] = js.undefined
  var hover: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var selected: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesTableRowClassKey {
  @scala.inline
  def apply(
    footer: CSSProperties = null,
    head: CSSProperties = null,
    hover: CSSProperties = null,
    root: CSSProperties = null,
    selected: CSSProperties = null
  ): PartialStyleRulesTableRowClassKey = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (head != null) __obj.updateDynamic("head")(head)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PartialStyleRulesTableRowClassKey]
  }
}

