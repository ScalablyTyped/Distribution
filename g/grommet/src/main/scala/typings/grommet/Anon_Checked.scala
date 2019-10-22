package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: js.UndefOr[js.Any] = js.undefined
  var indeterminate: js.UndefOr[js.Any] = js.undefined
}

object Anon_Checked {
  @scala.inline
  def apply(checked: js.Any = null, indeterminate: js.Any = null): Anon_Checked = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (indeterminate != null) __obj.updateDynamic("indeterminate")(indeterminate)
    __obj.asInstanceOf[Anon_Checked]
  }
}

