package typings.gtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTokenOptions extends js.Object {
  var forceRefresh: js.UndefOr[Boolean] = js.undefined
}

object GetTokenOptions {
  @scala.inline
  def apply(forceRefresh: js.UndefOr[Boolean] = js.undefined): GetTokenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTokenOptions]
  }
}

