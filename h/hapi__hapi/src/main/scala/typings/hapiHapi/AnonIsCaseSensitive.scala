package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  var stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
}

object AnonIsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
  ): AnonIsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(stripTrailingSlash)) __obj.updateDynamic("stripTrailingSlash")(stripTrailingSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsCaseSensitive]
  }
}

