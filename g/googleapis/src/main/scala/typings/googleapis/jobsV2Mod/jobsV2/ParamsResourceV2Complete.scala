package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceV2Complete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional.  If provided, restricts completion to the specified company.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Required.  The language of the query. This is the BCP-47 language code,
    * such as "en-US" or "sr-Latn". For more information, see [Tags for
    * Identifying Languages](https://tools.ietf.org/html/bcp47).  For
    * CompletionType.JOB_TITLE type, only open jobs with same language_code are
    * returned.  For CompletionType.COMPANY_NAME type, only companies having
    * open jobs with same language_code are returned.  For
    * CompletionType.COMBINED type, only open jobs with same language_code or
    * companies having open jobs with same language_code are returned.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Required.  Completion result count. The maximum allowed page size is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Required.  The query used to generate suggestions.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Optional.  The scope of the completion. The defaults is
    * CompletionScope.PUBLIC.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * Optional.  The completion topic. The default is CompletionType.COMBINED.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ParamsResourceV2Complete {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    companyName: String = null,
    fields: String = null,
    key: String = null,
    languageCode: String = null,
    oauth_token: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    query: String = null,
    quotaUser: String = null,
    scope: String = null,
    `type`: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceV2Complete = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceV2Complete]
  }
}

