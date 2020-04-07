package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsJobtriggersList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. Allows filtering.  Supported syntax:  * Filter expressions are
    * made up of one or more restrictions. * Restrictions can be combined by
    * `AND` or `OR` logical operators. A sequence of restrictions implicitly
    * uses `AND`. * A restriction has the form of `<field> <operator> <value>`.
    * * Supported fields/values for inspect jobs:     - `status` -
    * HEALTHY|PAUSED|CANCELLED     - `inspected_storage` -
    * DATASTORE|CLOUD_STORAGE|BIGQUERY     - 'last_run_time` - RFC 3339
    * formatted timestamp, surrounded by     quotation marks. Nanoseconds are
    * ignored.     - 'error_count' - Number of errors that have occurred while
    * running. * The operator must be `=` or `!=` for status and
    * inspected_storage.  Examples:  * inspected_storage = cloud_storage AND
    * status = HEALTHY * inspected_storage = cloud_storage OR inspected_storage
    * = bigquery * inspected_storage = cloud_storage AND (state = PAUSED OR
    * state = HEALTHY) * last_run_time > \"2017-12-12T00:00:00+00:00\"  The
    * length of this field should be no more than 500 characters.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional comma separated list of triggeredJob fields to order by,
    * followed by `asc` or `desc` postfix. This list is case-insensitive,
    * default sorting order is ascending, redundant space characters are
    * insignificant.  Example: `name asc,update_time, create_time desc`
    * Supported fields are:  - `create_time`: corresponds to time the
    * JobTrigger was created. - `update_time`: corresponds to time the
    * JobTrigger was last updated. - `last_run_time`: corresponds to the last
    * time the JobTrigger ran. - `name`: corresponds to JobTrigger's name. -
    * `display_name`: corresponds to JobTrigger's display name. - `status`:
    * corresponds to JobTrigger's status.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional size of the page, can be limited by a server.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional page token to continue retrieval. Comes from previous call to
    * ListJobTriggers. `order_by` field must not change for subsequent calls.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name, for example `projects/my-project-id`.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsJobtriggersList {
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
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsJobtriggersList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsJobtriggersList]
  }
}

