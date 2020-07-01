package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Collapsible, 'open'> */
trait PickCollapsibleopen extends js.Object {
  var open: js.UndefOr[js.Any] = js.undefined
}

object PickCollapsibleopen {
  @scala.inline
  def apply(open: js.Any = null): PickCollapsibleopen = {
    val __obj = js.Dynamic.literal()
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCollapsibleopen]
  }
}

