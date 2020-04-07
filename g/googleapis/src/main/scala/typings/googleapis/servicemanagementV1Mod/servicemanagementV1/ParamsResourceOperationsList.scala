package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOperationsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A string for filtering Operations.   The following filter fields are
    * supported&#58;    * serviceName&#58; Required. Only `=` operator is
    * allowed.   * startTime&#58; The time this job was started, in ISO 8601
    * format.     Allowed operators are `>=`,  `>`, `<=`, and `<`.   *
    * status&#58; Can be `done`, `in_progress`, or `failed`. Allowed operators
    * are `=`, and `!=`.    Filter expression supports conjunction (AND) and
    * disjunction (OR)   logical operators. However, the serviceName
    * restriction must be at the   top-level and can only be combined with
    * other restrictions via the AND   logical operator.    Examples&#58;    *
    * `serviceName={some-service}.googleapis.com`   *
    * `serviceName={some-service}.googleapis.com AND startTime>="2017-02-01"`
    * * `serviceName={some-service}.googleapis.com AND status=done`   *
    * `serviceName={some-service}.googleapis.com AND (status=done OR
    * startTime>="2017-02-01")`
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Not used.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The maximum number of operations to return. If unspecified, defaults
    * to 50. The maximum value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceOperationsList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    filter: String = null,
    key: String = null,
    name: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceOperationsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceOperationsList]
  }
}

