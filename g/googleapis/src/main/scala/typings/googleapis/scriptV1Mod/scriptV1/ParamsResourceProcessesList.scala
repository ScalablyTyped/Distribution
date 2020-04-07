package typings.googleapis.scriptV1Mod.scriptV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProcessesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of returned processes per page of results. Defaults
    * to 50.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of `nextPageToken` from a previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with a specific deployment ID.
    */
  @JSName("userProcessFilter.deploymentId")
  var userProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that completed
    * on or before the given timestamp.
    */
  @JSName("userProcessFilter.endTime")
  var userProcessFilterDotendTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * a script function with the given function name.
    */
  @JSName("userProcessFilter.functionName")
  var userProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with project names containing a specific string.
    */
  @JSName("userProcessFilter.projectName")
  var userProcessFilterDotprojectName: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with a specific script ID.
    */
  @JSName("userProcessFilter.scriptId")
  var userProcessFilterDotscriptId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that were
    * started on or after the given timestamp.
    */
  @JSName("userProcessFilter.startTime")
  var userProcessFilterDotstartTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process statuses.
    */
  @JSName("userProcessFilter.statuses")
  var userProcessFilterDotstatuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process types.
    */
  @JSName("userProcessFilter.types")
  var userProcessFilterDottypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified user access levels.
    */
  @JSName("userProcessFilter.userAccessLevels")
  var userProcessFilterDotuserAccessLevels: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceProcessesList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null,
    userProcessFilterDotdeploymentId: String = null,
    userProcessFilterDotendTime: String = null,
    userProcessFilterDotfunctionName: String = null,
    userProcessFilterDotprojectName: String = null,
    userProcessFilterDotscriptId: String = null,
    userProcessFilterDotstartTime: String = null,
    userProcessFilterDotstatuses: js.Array[String] = null,
    userProcessFilterDottypes: js.Array[String] = null,
    userProcessFilterDotuserAccessLevels: js.Array[String] = null
  ): ParamsResourceProcessesList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    if (userProcessFilterDotdeploymentId != null) __obj.updateDynamic("userProcessFilter.deploymentId")(userProcessFilterDotdeploymentId.asInstanceOf[js.Any])
    if (userProcessFilterDotendTime != null) __obj.updateDynamic("userProcessFilter.endTime")(userProcessFilterDotendTime.asInstanceOf[js.Any])
    if (userProcessFilterDotfunctionName != null) __obj.updateDynamic("userProcessFilter.functionName")(userProcessFilterDotfunctionName.asInstanceOf[js.Any])
    if (userProcessFilterDotprojectName != null) __obj.updateDynamic("userProcessFilter.projectName")(userProcessFilterDotprojectName.asInstanceOf[js.Any])
    if (userProcessFilterDotscriptId != null) __obj.updateDynamic("userProcessFilter.scriptId")(userProcessFilterDotscriptId.asInstanceOf[js.Any])
    if (userProcessFilterDotstartTime != null) __obj.updateDynamic("userProcessFilter.startTime")(userProcessFilterDotstartTime.asInstanceOf[js.Any])
    if (userProcessFilterDotstatuses != null) __obj.updateDynamic("userProcessFilter.statuses")(userProcessFilterDotstatuses.asInstanceOf[js.Any])
    if (userProcessFilterDottypes != null) __obj.updateDynamic("userProcessFilter.types")(userProcessFilterDottypes.asInstanceOf[js.Any])
    if (userProcessFilterDotuserAccessLevels != null) __obj.updateDynamic("userProcessFilter.userAccessLevels")(userProcessFilterDotuserAccessLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProcessesList]
  }
}

