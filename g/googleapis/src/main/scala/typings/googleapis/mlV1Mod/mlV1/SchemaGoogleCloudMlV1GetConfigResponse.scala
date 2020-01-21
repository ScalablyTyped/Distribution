package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns service account information associated with a project.
  */
@js.native
trait SchemaGoogleCloudMlV1GetConfigResponse extends js.Object {
  var config: js.UndefOr[SchemaGoogleCloudMlV1Config] = js.native
  /**
    * The service account Cloud ML uses to access resources in the project.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  /**
    * The project number for `service_account`.
    */
  var serviceAccountProject: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1GetConfigResponse {
  @scala.inline
  def apply(
    config: SchemaGoogleCloudMlV1Config = null,
    serviceAccount: String = null,
    serviceAccountProject: String = null
  ): SchemaGoogleCloudMlV1GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (serviceAccountProject != null) __obj.updateDynamic("serviceAccountProject")(serviceAccountProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1GetConfigResponse]
  }
}

