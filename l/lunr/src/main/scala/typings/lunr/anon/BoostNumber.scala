package typings.lunr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoostNumber extends js.Object {
  var boost: js.UndefOr[Double] = js.undefined
}

object BoostNumber {
  @scala.inline
  def apply(boost: js.UndefOr[Double] = js.undefined): BoostNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boost)) __obj.updateDynamic("boost")(boost.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoostNumber]
  }
}

