package typings.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxTotalResults extends js.Object {
  var maxTotalResults: js.UndefOr[Double] = js.undefined
}

object AnonMaxTotalResults {
  @scala.inline
  def apply(maxTotalResults: Int | Double = null): AnonMaxTotalResults = {
    val __obj = js.Dynamic.literal()
    if (maxTotalResults != null) __obj.updateDynamic("maxTotalResults")(maxTotalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxTotalResults]
  }
}

