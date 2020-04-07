package typings.googleapis.redisV1beta1Mod.redisV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsInstancesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. Unique name of the resource in this scope including project and
    * location using the form:
    * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
    * Note: Redis instances are managed and addressed at regional level so
    * location_id here refers to a GCP region; however, users may choose which
    * specific zone (or collection of zones for cross-zone instances) an
    * instance should be provisioned in. Refer to [location_id] and
    * [alternative_location_id] fields for more details.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstance] = js.native
  /**
    * Required. Mask of fields to update. At least one path must be supplied in
    * this field. The elements of the repeated paths field may only include
    * these fields from Instance:   *   `displayName`  *   `labels`  *
    * `memorySizeGb`  *   `redisConfig`
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsInstancesPatch {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    name: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: SchemaInstance = null,
    updateMask: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsLocationsInstancesPatch = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesPatch]
  }
}

