package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Collapsible, 'close'> */
trait PickCollapsibleclose extends js.Object {
  var close: js.UndefOr[js.Any] = js.undefined
}

object PickCollapsibleclose {
  @scala.inline
  def apply(close: js.Any = null): PickCollapsibleclose = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCollapsibleclose]
  }
}

