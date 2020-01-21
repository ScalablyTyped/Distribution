package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationClassKey>> */
@js.native
trait PartialClassNameMapTablePaginationClassKey extends js.Object {
  var actions: js.UndefOr[String] = js.native
  var caption: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var menuItem: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var select: js.UndefOr[String] = js.native
  var selectIcon: js.UndefOr[String] = js.native
  var selectRoot: js.UndefOr[String] = js.native
  var spacer: js.UndefOr[String] = js.native
  var toolbar: js.UndefOr[String] = js.native
}

object PartialClassNameMapTablePaginationClassKey {
  @scala.inline
  def apply(
    actions: String = null,
    caption: String = null,
    input: String = null,
    menuItem: String = null,
    root: String = null,
    select: String = null,
    selectIcon: String = null,
    selectRoot: String = null,
    spacer: String = null,
    toolbar: String = null
  ): PartialClassNameMapTablePaginationClassKey = {
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
    __obj.asInstanceOf[PartialClassNameMapTablePaginationClassKey]
  }
}

