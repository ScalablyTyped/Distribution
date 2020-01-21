package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: js.UndefOr[js.Any] = js.undefined
  var indeterminate: js.UndefOr[js.Any] = js.undefined
}

object AnonChecked {
  @scala.inline
  def apply(checked: js.Any = null, indeterminate: js.Any = null): AnonChecked = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (indeterminate != null) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecked]
  }
}

