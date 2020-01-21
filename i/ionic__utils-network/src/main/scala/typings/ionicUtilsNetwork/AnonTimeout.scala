package typings.ionicUtilsNetwork

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeout extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonTimeout {
  @scala.inline
  def apply(timeout: Int | Double = null): AnonTimeout = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimeout]
  }
}

