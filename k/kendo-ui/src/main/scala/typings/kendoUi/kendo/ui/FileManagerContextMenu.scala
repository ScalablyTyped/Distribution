package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerContextMenu extends js.Object {
  var items: js.UndefOr[js.Array[FileManagerContextMenuItem]] = js.undefined
}

object FileManagerContextMenu {
  @scala.inline
  def apply(items: js.Array[FileManagerContextMenuItem] = null): FileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerContextMenu]
  }
}

