package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceActionresultsUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The hash. In the case of SHA-256, it will always be a lowercase hex
    * string exactly 64 characters long.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * The instance of the execution system to operate against. A server may
    * support multiple instances of the execution system (with their own
    * workers, storage, caches, etc.). The server MAY require use of this field
    * to select between them in an implementation-defined fashion, otherwise it
    * can be omitted.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  /**
    * The priority (relative importance) of this content in the overall cache.
    * Generally, a lower value means a longer retention time or other
    * advantage, but the interpretation of a given value is server-dependent. A
    * priority of 0 means a *default* value, decided by the server.  The
    * particular semantics of this field is up to the server. In particular,
    * every server will have their own supported range of priorities, and will
    * decide how these map into retention/eviction policy.
    */
  @JSName("resultsCachePolicy.priority")
  var resultsCachePolicyDotpriority: js.UndefOr[Double] = js.native
  /**
    * The size of the blob, in bytes.
    */
  var sizeBytes: js.UndefOr[String] = js.native
}

object ParamsResourceActionresultsUpdate {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    hash: String = null,
    instanceName: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: SchemaBuildBazelRemoteExecutionV2ActionResult = null,
    resultsCachePolicyDotpriority: js.UndefOr[Double] = js.undefined,
    sizeBytes: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceActionresultsUpdate = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(resultsCachePolicyDotpriority)) __obj.updateDynamic("resultsCachePolicy.priority")(resultsCachePolicyDotpriority.get.asInstanceOf[js.Any])
    if (sizeBytes != null) __obj.updateDynamic("sizeBytes")(sizeBytes.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceActionresultsUpdate]
  }
}

