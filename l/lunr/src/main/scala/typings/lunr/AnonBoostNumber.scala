package typings.lunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoostNumber extends js.Object {
  var boost: js.UndefOr[Double] = js.undefined
}

object AnonBoostNumber {
  @scala.inline
  def apply(boost: Int | Double = null): AnonBoostNumber = {
    val __obj = js.Dynamic.literal()
    if (boost != null) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoostNumber]
  }
}

