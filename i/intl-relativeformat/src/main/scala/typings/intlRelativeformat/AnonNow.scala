package typings.intlRelativeformat

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNow extends js.Object {
  var now: js.UndefOr[Date | Double | Null] = js.undefined
}

object AnonNow {
  @scala.inline
  def apply(now: Date | Double = null): AnonNow = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNow]
  }
}

