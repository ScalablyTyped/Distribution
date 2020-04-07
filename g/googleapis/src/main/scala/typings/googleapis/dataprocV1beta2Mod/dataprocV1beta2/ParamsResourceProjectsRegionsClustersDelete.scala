package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsRegionsClustersDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The cluster name.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Optional. Specifying the cluster_uuid means the RPC should fail (with
    * error NOT_FOUND) if cluster with specified UUID does not exist.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Google Cloud Platform project that the cluster
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. A unique id used to identify the request. If the server
    * receives two DeleteClusterRequest requests with the same id, then the
    * second request will be ignored and the first google.longrunning.Operation
    * created and stored in the backend is returned.It is recommended to always
    * set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must
    * contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and
    * hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsRegionsClustersDelete {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    clusterName: String = null,
    clusterUuid: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projectId: String = null,
    quotaUser: String = null,
    region: String = null,
    requestId: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsRegionsClustersDelete = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (clusterUuid != null) __obj.updateDynamic("clusterUuid")(clusterUuid.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsRegionsClustersDelete]
  }
}

