package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsJobsMessagesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Return only messages with timestamps < end_time. The default is now (i.e.
    * return up to the latest messages available).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The job to get messages about.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Filter to only get messages with importance >= level
    */
  var minimumImportance: js.UndefOr[String] = js.native
  /**
    * If specified, determines the maximum number of messages to return.  If
    * unspecified, the service may choose an appropriate default, or may return
    * an arbitrarily large number of results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If supplied, this should be the value of next_page_token returned by an
    * earlier call. This will cause the next page of results to be returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A project id.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * If specified, return only messages with timestamps >= start_time. The
    * default is the job creation time (i.e. beginning of messages).
    */
  var startTime: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsJobsMessagesList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    endTime: String = null,
    fields: String = null,
    jobId: String = null,
    key: String = null,
    location: String = null,
    minimumImportance: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projectId: String = null,
    quotaUser: String = null,
    startTime: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsJobsMessagesList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (minimumImportance != null) __obj.updateDynamic("minimumImportance")(minimumImportance.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsJobsMessagesList]
  }
}

