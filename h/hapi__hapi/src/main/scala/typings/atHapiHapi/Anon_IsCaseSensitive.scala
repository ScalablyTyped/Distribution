package typings.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  var stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
  ): Anon_IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(stripTrailingSlash)) __obj.updateDynamic("stripTrailingSlash")(stripTrailingSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsCaseSensitive]
  }
}

