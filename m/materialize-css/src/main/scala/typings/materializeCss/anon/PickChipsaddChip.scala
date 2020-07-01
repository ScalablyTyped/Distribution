package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Chips, 'addChip'> */
trait PickChipsaddChip extends js.Object {
  var addChip: js.UndefOr[js.Any] = js.undefined
}

object PickChipsaddChip {
  @scala.inline
  def apply(addChip: js.Any = null): PickChipsaddChip = {
    val __obj = js.Dynamic.literal()
    if (addChip != null) __obj.updateDynamic("addChip")(addChip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickChipsaddChip]
  }
}

