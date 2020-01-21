package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdaptiveBinaryIndices extends js.Object {
  var adaptiveBinaryIndices: js.UndefOr[Boolean] = js.undefined
}

object AnonAdaptiveBinaryIndices {
  @scala.inline
  def apply(adaptiveBinaryIndices: js.UndefOr[Boolean] = js.undefined): AnonAdaptiveBinaryIndices = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptiveBinaryIndices)) __obj.updateDynamic("adaptiveBinaryIndices")(adaptiveBinaryIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdaptiveBinaryIndices]
  }
}

