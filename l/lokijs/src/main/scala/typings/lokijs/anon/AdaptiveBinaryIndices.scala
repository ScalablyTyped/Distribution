package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdaptiveBinaryIndices extends js.Object {
  var adaptiveBinaryIndices: js.UndefOr[Boolean] = js.undefined
}

object AdaptiveBinaryIndices {
  @scala.inline
  def apply(adaptiveBinaryIndices: js.UndefOr[Boolean] = js.undefined): AdaptiveBinaryIndices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptiveBinaryIndices)) __obj.updateDynamic("adaptiveBinaryIndices")(adaptiveBinaryIndices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveBinaryIndices]
  }
}

