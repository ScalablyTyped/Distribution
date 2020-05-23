package typings.jiraClient.mod

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
    maxResults: js.UndefOr[Double] = js.undefined,
    startAt: js.UndefOr[Double] = js.undefined
  ): SearchUserOptions = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(includeActive)) __obj.updateDynamic("includeActive")(includeActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInactive)) __obj.updateDynamic("includeInactive")(includeInactive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAt)) __obj.updateDynamic("startAt")(startAt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserOptions]
  }
}

