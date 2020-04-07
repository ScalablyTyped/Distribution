package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate extends StandardParameters {
  /**
    * See CreateServiceInstanceRequest for details.
    */
  var acceptsIncomplete: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id of the binding. Must be unique within GCP project. Maximum length
    * is 64, GUID recommended. Required.
    */
  var binding_id: js.UndefOr[String] = js.native
  /**
    * The service instance to which to bind.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The GCP container. Must match
    * `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudServicebrokerV1alpha1Binding] = js.native
}

object ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    acceptsIncomplete: js.UndefOr[Boolean] = js.undefined,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    binding_id: String = null,
    callback: String = null,
    fields: String = null,
    instanceId: String = null,
    key: String = null,
    oauth_token: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: SchemaGoogleCloudServicebrokerV1alpha1Binding = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsIncomplete)) __obj.updateDynamic("acceptsIncomplete")(acceptsIncomplete.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (binding_id != null) __obj.updateDynamic("binding_id")(binding_id.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate]
  }
}

