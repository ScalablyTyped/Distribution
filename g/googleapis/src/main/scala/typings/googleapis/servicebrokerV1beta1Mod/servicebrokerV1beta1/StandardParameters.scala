package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardParameters extends js.Object {
  /**
    * V1 error format.
    */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /**
    * OAuth access token.
    */
  var access_token: js.UndefOr[String] = js.native
  /**
    * Data format for response.
    */
  var alt: js.UndefOr[String] = js.native
  /**
    * JSONP
    */
  var callback: js.UndefOr[String] = js.native
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
    * Available to use for quota purposes for server-side applications. Can be
    * any arbitrary string assigned to a user, but should not exceed 40
    * characters.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Legacy upload protocol for media (e.g. "media", "multipart").
    */
  var uploadType: js.UndefOr[String] = js.native
  /**
    * Upload protocol for media (e.g. "raw", "multipart").
    */
  var upload_protocol: js.UndefOr[String] = js.native
}

object StandardParameters {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): StandardParameters = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardParameters]
  }
}

