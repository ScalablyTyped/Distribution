package typings.googleapis.scriptV1Mod.scriptV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProcessesListscriptprocesses extends StandardParameters {
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
    * The script ID of the project whose processes are listed.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with a specific deployment ID.
    */
  @JSName("scriptProcessFilter.deploymentId")
  var scriptProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that completed
    * on or before the given timestamp.
    */
  @JSName("scriptProcessFilter.endTime")
  var scriptProcessFilterDotendTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * a script function with the given function name.
    */
  @JSName("scriptProcessFilter.functionName")
  var scriptProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that were
    * started on or after the given timestamp.
    */
  @JSName("scriptProcessFilter.startTime")
  var scriptProcessFilterDotstartTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process statuses.
    */
  @JSName("scriptProcessFilter.statuses")
  var scriptProcessFilterDotstatuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process types.
    */
  @JSName("scriptProcessFilter.types")
  var scriptProcessFilterDottypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified user access levels.
    */
  @JSName("scriptProcessFilter.userAccessLevels")
  var scriptProcessFilterDotuserAccessLevels: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceProcessesListscriptprocesses {
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
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    scriptId: String = null,
    scriptProcessFilterDotdeploymentId: String = null,
    scriptProcessFilterDotendTime: String = null,
    scriptProcessFilterDotfunctionName: String = null,
    scriptProcessFilterDotstartTime: String = null,
    scriptProcessFilterDotstatuses: js.Array[String] = null,
    scriptProcessFilterDottypes: js.Array[String] = null,
    scriptProcessFilterDotuserAccessLevels: js.Array[String] = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProcessesListscriptprocesses = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (scriptId != null) __obj.updateDynamic("scriptId")(scriptId.asInstanceOf[js.Any])
    if (scriptProcessFilterDotdeploymentId != null) __obj.updateDynamic("scriptProcessFilter.deploymentId")(scriptProcessFilterDotdeploymentId.asInstanceOf[js.Any])
    if (scriptProcessFilterDotendTime != null) __obj.updateDynamic("scriptProcessFilter.endTime")(scriptProcessFilterDotendTime.asInstanceOf[js.Any])
    if (scriptProcessFilterDotfunctionName != null) __obj.updateDynamic("scriptProcessFilter.functionName")(scriptProcessFilterDotfunctionName.asInstanceOf[js.Any])
    if (scriptProcessFilterDotstartTime != null) __obj.updateDynamic("scriptProcessFilter.startTime")(scriptProcessFilterDotstartTime.asInstanceOf[js.Any])
    if (scriptProcessFilterDotstatuses != null) __obj.updateDynamic("scriptProcessFilter.statuses")(scriptProcessFilterDotstatuses.asInstanceOf[js.Any])
    if (scriptProcessFilterDottypes != null) __obj.updateDynamic("scriptProcessFilter.types")(scriptProcessFilterDottypes.asInstanceOf[js.Any])
    if (scriptProcessFilterDotuserAccessLevels != null) __obj.updateDynamic("scriptProcessFilter.userAccessLevels")(scriptProcessFilterDotuserAccessLevels.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProcessesListscriptprocesses]
  }
}

