package typings.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleStyleIcons extends js.Object {
  var sortAscendingIcon: js.UndefOr[js.Any] = js.undefined
  var sortDescendingIcon: js.UndefOr[js.Any] = js.undefined
}

object GriddleStyleIcons {
  @scala.inline
  def apply(sortAscendingIcon: js.Any = null, sortDescendingIcon: js.Any = null): GriddleStyleIcons = {
    val __obj = js.Dynamic.literal()
    if (sortAscendingIcon != null) __obj.updateDynamic("sortAscendingIcon")(sortAscendingIcon.asInstanceOf[js.Any])
    if (sortDescendingIcon != null) __obj.updateDynamic("sortDescendingIcon")(sortDescendingIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddleStyleIcons]
  }
}

