package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Chips, 'selectChip'> */
trait PickChipsselectChip extends js.Object {
  var selectChip: js.UndefOr[js.Any] = js.undefined
}

object PickChipsselectChip {
  @scala.inline
  def apply(selectChip: js.Any = null): PickChipsselectChip = {
    val __obj = js.Dynamic.literal()
    if (selectChip != null) __obj.updateDynamic("selectChip")(selectChip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickChipsselectChip]
  }
}

