package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Tabs, 'select'> */
trait PickTabsselect extends js.Object {
  var select: js.UndefOr[js.Any] = js.undefined
}

object PickTabsselect {
  @scala.inline
  def apply(select: js.Any = null): PickTabsselect = {
    val __obj = js.Dynamic.literal()
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTabsselect]
  }
}

