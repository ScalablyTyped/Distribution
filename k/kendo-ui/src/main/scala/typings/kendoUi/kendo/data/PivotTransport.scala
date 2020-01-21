package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTransport extends js.Object {
  var discover: js.UndefOr[js.Any] = js.undefined
  var read: js.UndefOr[js.Any] = js.undefined
}

object PivotTransport {
  @scala.inline
  def apply(discover: js.Any = null, read: js.Any = null): PivotTransport = {
    val __obj = js.Dynamic.literal()
    if (discover != null) __obj.updateDynamic("discover")(discover.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransport]
  }
}

