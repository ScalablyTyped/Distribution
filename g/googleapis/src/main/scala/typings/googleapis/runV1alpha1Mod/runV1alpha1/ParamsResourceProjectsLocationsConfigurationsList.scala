package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsConfigurationsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional encoded string to continue paging.
    */
  var continue: js.UndefOr[String] = js.native
  /**
    * Allows to filter resources based on a specific value for a field name.
    * Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not
    * currently used by Cloud Run.
    */
  var fieldSelector: js.UndefOr[String] = js.native
  /**
    * Not currently used by Cloud Run.
    */
  var includeUninitialized: js.UndefOr[Boolean] = js.native
  /**
    * Allows to filter resources based on a label. Supported operations are =,
    * !=, exists, in, and notIn.
    */
  var labelSelector: js.UndefOr[String] = js.native
  /**
    * The maximum number of records that should be returned.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The project ID or project number from which the configurations should be
    * listed.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The baseline resource version from which the list or watch operation
    * should start. Not currently used by Cloud Run.
    */
  var resourceVersion: js.UndefOr[String] = js.native
  /**
    * Flag that indicates that the client expects to watch this resource as
    * well. Not currently used by Cloud Run.
    */
  var watch: js.UndefOr[Boolean] = js.native
}

object ParamsResourceProjectsLocationsConfigurationsList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    continue: String = null,
    fieldSelector: String = null,
    fields: String = null,
    includeUninitialized: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    labelSelector: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    resourceVersion: String = null,
    uploadType: String = null,
    upload_protocol: String = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): ParamsResourceProjectsLocationsConfigurationsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (continue != null) __obj.updateDynamic("continue")(continue.asInstanceOf[js.Any])
    if (fieldSelector != null) __obj.updateDynamic("fieldSelector")(fieldSelector.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUninitialized)) __obj.updateDynamic("includeUninitialized")(includeUninitialized.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (labelSelector != null) __obj.updateDynamic("labelSelector")(labelSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (resourceVersion != null) __obj.updateDynamic("resourceVersion")(resourceVersion.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConfigurationsList]
  }
}

