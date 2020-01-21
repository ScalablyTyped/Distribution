package typings.jestJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNow extends js.Object {
  var now: js.UndefOr[js.Function0[Double]] = js.undefined
}

object AnonNow {
  @scala.inline
  def apply(now: () => Double = null): AnonNow = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(js.Any.fromFunction0(now))
    __obj.asInstanceOf[AnonNow]
  }
}

