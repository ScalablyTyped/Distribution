package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Chips, 'deleteChip'> */
trait PickChipsdeleteChip extends js.Object {
  var deleteChip: js.UndefOr[js.Any] = js.undefined
}

object PickChipsdeleteChip {
  @scala.inline
  def apply(deleteChip: js.Any = null): PickChipsdeleteChip = {
    val __obj = js.Dynamic.literal()
    if (deleteChip != null) __obj.updateDynamic("deleteChip")(deleteChip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickChipsdeleteChip]
  }
}

