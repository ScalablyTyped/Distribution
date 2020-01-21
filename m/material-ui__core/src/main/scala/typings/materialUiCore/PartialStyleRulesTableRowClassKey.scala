package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableRow.TableRowClassKey>> */
@js.native
trait PartialStyleRulesTableRowClassKey extends js.Object {
  var footer: js.UndefOr[CSSProperties] = js.native
  var head: js.UndefOr[CSSProperties] = js.native
  var hover: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var selected: js.UndefOr[CSSProperties] = js.native
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
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesTableRowClassKey]
  }
}

