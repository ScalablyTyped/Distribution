package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimited extends js.Object {
  var limited: js.UndefOr[Boolean] = js.undefined
  var results: js.Array[AnonDisplayname]
}

object AnonLimited {
  @scala.inline
  def apply(results: js.Array[AnonDisplayname], limited: js.UndefOr[Boolean] = js.undefined): AnonLimited = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    if (!js.isUndefined(limited)) __obj.updateDynamic("limited")(limited.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimited]
  }
}

