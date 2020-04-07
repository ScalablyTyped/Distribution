package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

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
    * A string for filtering Operations. In v2alpha1, the following filter
    * fields are supported&#58;  * createTime&#58; The time this job was
    * created * events&#58; The set of event (names) that have occurred while
    * running   the pipeline.  The &#58; operator can be used to determine if a
    * particular event has occurred. * error&#58; If the pipeline is running,
    * this value is NULL.  Once the   pipeline finishes, the value is the
    * standard Google error code. * labels.key or labels."key with space" where
    * key is a label key. * done&#58; If the pipeline is running, this value is
    * false. Once the   pipeline finishes, the value is true.  In v1 and
    * v1alpha2, the following filter fields are supported&#58;  *
    * projectId&#58; Required. Corresponds to   OperationMetadata.projectId. *
    * createTime&#58; The time this job was created, in seconds from the
    * [epoch](http://en.wikipedia.org/wiki/Unix_time). Can use `>=` and/or `<=`
    * operators. * status&#58; Can be `RUNNING`, `SUCCESS`, `FAILURE`, or
    * `CANCELED`. Only   one status may be specified. * labels.key where key is
    * a label key.  Examples&#58;  * `projectId = my-project AND createTime >=
    * 1432140000` * `projectId = my-project AND createTime >= 1432140000 AND
    * createTime <= 1432150000 AND status = RUNNING` * `projectId = my-project
    * AND labels.color = *` * `projectId = my-project AND labels.color = red`
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The name of the operation's parent resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return. The maximum value is 256.
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

