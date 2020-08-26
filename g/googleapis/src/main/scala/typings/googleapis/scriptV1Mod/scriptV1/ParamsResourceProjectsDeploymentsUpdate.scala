package typings.googleapis.scriptV1Mod.scriptV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDeploymentsUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The deployment ID for this deployment.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateDeploymentRequest] = js.native
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsDeploymentsUpdate {
  @scala.inline
  def apply(): ParamsResourceProjectsDeploymentsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDeploymentsUpdate]
  }
  @scala.inline
  implicit class ParamsResourceProjectsDeploymentsUpdateOps[Self <: ParamsResourceProjectsDeploymentsUpdate] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaUpdateDeploymentRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setScriptId(value: String): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptId: Self = this.set("scriptId", js.undefined)
  }
  
}

