package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxTotalResults extends js.Object {
  var maxTotalResults: js.UndefOr[Double] = js.undefined
}

object MaxTotalResults {
  @scala.inline
  def apply(maxTotalResults: js.UndefOr[Double] = js.undefined): MaxTotalResults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxTotalResults)) __obj.updateDynamic("maxTotalResults")(maxTotalResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxTotalResults]
  }
}

