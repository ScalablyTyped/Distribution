package typings.atKeystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTotalResults extends js.Object {
  var maxTotalResults: js.UndefOr[Double] = js.undefined
}

object Anon_MaxTotalResults {
  @scala.inline
  def apply(maxTotalResults: Int | Double = null): Anon_MaxTotalResults = {
    val __obj = js.Dynamic.literal()
    if (maxTotalResults != null) __obj.updateDynamic("maxTotalResults")(maxTotalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxTotalResults]
  }
}

