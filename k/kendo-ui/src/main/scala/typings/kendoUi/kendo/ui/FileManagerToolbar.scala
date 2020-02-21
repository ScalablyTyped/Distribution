package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerToolbar extends js.Object {
  var items: js.UndefOr[js.Array[FileManagerToolbarItem]] = js.undefined
}

object FileManagerToolbar {
  @scala.inline
  def apply(items: js.Array[FileManagerToolbarItem] = null): FileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerToolbar]
  }
}

