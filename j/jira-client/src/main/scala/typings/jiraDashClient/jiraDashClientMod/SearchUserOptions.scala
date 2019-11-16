package typings.jiraDashClient.jiraDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUserOptions extends js.Object {
  var includeActive: js.UndefOr[Boolean] = js.undefined
  var includeInactive: js.UndefOr[Boolean] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var startAt: js.UndefOr[Double] = js.undefined
  var username: String
}

object SearchUserOptions {
  @scala.inline
  def apply(
    username: String,
    includeActive: js.UndefOr[Boolean] = js.undefined,
    includeInactive: js.UndefOr[Boolean] = js.undefined,
    maxResults: Int | Double = null,
    startAt: Int | Double = null
  ): SearchUserOptions = {
    val __obj = js.Dynamic.literal(username = username)
    if (!js.isUndefined(includeActive)) __obj.updateDynamic("includeActive")(includeActive)
    if (!js.isUndefined(includeInactive)) __obj.updateDynamic("includeInactive")(includeInactive)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserOptions]
  }
}

