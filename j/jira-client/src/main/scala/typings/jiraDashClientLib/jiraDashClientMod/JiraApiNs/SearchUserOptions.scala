package typings
package jiraDashClientLib.jiraDashClientMod.JiraApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUserOptions extends js.Object {
  var includeActive: js.UndefOr[scala.Boolean] = js.undefined
  var includeInactive: js.UndefOr[scala.Boolean] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var startAt: js.UndefOr[scala.Double] = js.undefined
  var username: java.lang.String
}

object SearchUserOptions {
  @scala.inline
  def apply(
    username: java.lang.String,
    includeActive: js.UndefOr[scala.Boolean] = js.undefined,
    includeInactive: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: scala.Int | scala.Double = null,
    startAt: scala.Int | scala.Double = null
  ): SearchUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("username")(username)
    if (!js.isUndefined(includeActive)) __obj.updateDynamic("includeActive")(includeActive)
    if (!js.isUndefined(includeInactive)) __obj.updateDynamic("includeInactive")(includeInactive)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserOptions]
  }
}

