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
  def apply(): SchemaGoogleCloudMlV1GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1GetConfigResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1GetConfigResponseOps[Self <: SchemaGoogleCloudMlV1GetConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: SchemaGoogleCloudMlV1Config): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    @scala.inline
    def setServiceAccountProject(value: String): Self = this.set("serviceAccountProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountProject: Self = this.set("serviceAccountProject", js.undefined)
  }
  
}

