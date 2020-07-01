package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAboutGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether to count changes outside the My Drive hierarchy. When set to
    * false, changes to files such as those in the Application Data folder or
    * shared files which have not been added to My Drive will be omitted from
    * the maxChangeIdCount.
    */
  var includeSubscribed: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of remaining change IDs to count
    */
  var maxChangeIdCount: js.UndefOr[String] = js.native
  /**
    * Change ID to start counting from when calculating number of remaining
    * change IDs
    */
  var startChangeId: js.UndefOr[String] = js.native
}

object ParamsResourceAboutGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    includeSubscribed: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxChangeIdCount: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startChangeId: String = null,
    userIp: String = null
  ): ParamsResourceAboutGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSubscribed)) __obj.updateDynamic("includeSubscribed")(includeSubscribed.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxChangeIdCount != null) __obj.updateDynamic("maxChangeIdCount")(maxChangeIdCount.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startChangeId != null) __obj.updateDynamic("startChangeId")(startChangeId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceAboutGet]
  }
}

