package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerViews extends js.Object {
  var grid: js.UndefOr[js.Any] = js.undefined
  var list: js.UndefOr[js.Any] = js.undefined
  var tree: js.UndefOr[js.Any] = js.undefined
}

object FileManagerViews {
  @scala.inline
  def apply(grid: js.Any = null, list: js.Any = null, tree: js.Any = null): FileManagerViews = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (tree != null) __obj.updateDynamic("tree")(tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerViews]
  }
}

