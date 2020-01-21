package typings.httpLinkDataloader.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var cacheResults: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(cacheResults: js.UndefOr[Boolean] = js.undefined): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheResults)) __obj.updateDynamic("cacheResults")(cacheResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

