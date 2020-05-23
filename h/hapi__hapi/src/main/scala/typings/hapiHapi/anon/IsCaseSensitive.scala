package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  var stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
}

object IsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
  ): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripTrailingSlash)) __obj.updateDynamic("stripTrailingSlash")(stripTrailingSlash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsCaseSensitive]
  }
}

