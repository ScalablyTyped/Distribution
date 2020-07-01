package typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardParameters extends js.Object {
  /**
    * Data format for the response.
    */
  var alt: js.UndefOr[String] = js.native
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * API key. Your API key identifies your project and provides you with API
    * access, quota, and reports. Required unless you provide an OAuth 2.0
    * token.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * OAuth 2.0 token for the current user.
    */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Returns response with indentations and line breaks.
    */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * An opaque string that represents a user for quota purposes. Must not
    * exceed 40 characters.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use quotaUser instead.
    */
  var userIp: js.UndefOr[String] = js.native
}

object StandardParameters {
  @scala.inline
  def apply(
    alt: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): StandardParameters = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardParameters]
  }
}

