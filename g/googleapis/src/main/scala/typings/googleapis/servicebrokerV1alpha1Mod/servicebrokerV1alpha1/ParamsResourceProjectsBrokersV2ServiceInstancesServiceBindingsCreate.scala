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
  def apply(): ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate]
  }
  @scala.inline
  implicit class ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreateOps[Self <: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsCreate] (val x: Self) extends AnyVal {
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
    def setAcceptsIncomplete(value: Boolean): Self = this.set("acceptsIncomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptsIncomplete: Self = this.set("acceptsIncomplete", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBinding_id(value: String): Self = this.set("binding_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinding_id: Self = this.set("binding_id", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudServicebrokerV1alpha1Binding): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

