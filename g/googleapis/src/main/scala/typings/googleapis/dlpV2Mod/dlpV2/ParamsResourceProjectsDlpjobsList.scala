package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDlpjobsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. Allows filtering.  Supported syntax:  * Filter expressions are
    * made up of one or more restrictions. * Restrictions can be combined by
    * `AND` or `OR` logical operators. A sequence of restrictions implicitly
    * uses `AND`. * A restriction has the form of `<field> <operator> <value>`.
    * * Supported fields/values for inspect jobs:     - `state` -
    * PENDING|RUNNING|CANCELED|FINISHED|FAILED     - `inspected_storage` -
    * DATASTORE|CLOUD_STORAGE|BIGQUERY     - `trigger_name` - The resource name
    * of the trigger that created job. * Supported fields for risk analysis
    * jobs:     - `state` - RUNNING|CANCELED|FINISHED|FAILED * The operator
    * must be `=` or `!=`.  Examples:  * inspected_storage = cloud_storage AND
    * state = done * inspected_storage = cloud_storage OR inspected_storage =
    * bigquery * inspected_storage = cloud_storage AND (state = done OR state =
    * canceled)  The length of this field should be no more than 500
    * characters.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional comma separated list of fields to order by, followed by `asc` or
    * `desc` postfix. This list is case-insensitive, default sorting order is
    * ascending, redundant space characters are insignificant.  Example: `name
    * asc, end_time asc, create_time desc`  Supported fields are:  -
    * `create_time`: corresponds to time the job was created. - `end_time`:
    * corresponds to time the job ended. - `name`: corresponds to job's name. -
    * `state`: corresponds to `state`
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The standard list page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name, for example projects/my-project-id.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The type of job. Defaults to `DlpJobType.INSPECT`
    */
  var `type`: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsDlpjobsList {
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
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    `type`: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsDlpjobsList = {
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
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsDlpjobsList]
  }
}

