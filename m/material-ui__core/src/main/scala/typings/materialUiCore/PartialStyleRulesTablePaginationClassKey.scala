package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TablePagination.TablePaginationClassKey>> */
@js.native
trait PartialStyleRulesTablePaginationClassKey extends js.Object {
  var actions: js.UndefOr[CSSProperties] = js.native
  var caption: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var menuItem: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var select: js.UndefOr[CSSProperties] = js.native
  var selectIcon: js.UndefOr[CSSProperties] = js.native
  var selectRoot: js.UndefOr[CSSProperties] = js.native
  var spacer: js.UndefOr[CSSProperties] = js.native
  var toolbar: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTablePaginationClassKey {
  @scala.inline
  def apply(
    actions: CSSProperties = null,
    caption: CSSProperties = null,
    input: CSSProperties = null,
    menuItem: CSSProperties = null,
    root: CSSProperties = null,
    select: CSSProperties = null,
    selectIcon: CSSProperties = null,
    selectRoot: CSSProperties = null,
    spacer: CSSProperties = null,
    toolbar: CSSProperties = null
  ): PartialStyleRulesTablePaginationClassKey = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (selectIcon != null) __obj.updateDynamic("selectIcon")(selectIcon.asInstanceOf[js.Any])
    if (selectRoot != null) __obj.updateDynamic("selectRoot")(selectRoot.asInstanceOf[js.Any])
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesTablePaginationClassKey]
  }
}

