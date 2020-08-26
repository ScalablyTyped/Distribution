package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsBrokersV2ServiceInstancesCreate extends StandardParameters {
  /**
    * Value indicating that API client supports asynchronous operations. If
    * Broker cannot execute the request synchronously HTTP 422 code will be
    * returned to HTTP clients along with FAILED_PRECONDITION error. If true
    * and broker will execute request asynchronously 202 HTTP code will be
    * returned. This broker always requires this to be true as all mutator
    * operations are asynchronous.
    */
  var acceptsIncomplete: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id of the service instance. Must be unique within GCP project.
    * Maximum length is 64, GUID recommended. Required.
    */
  var instance_id: js.UndefOr[String] = js.native
  /**
    * Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] = js.native
}

object ParamsResourceProjectsBrokersV2ServiceInstancesCreate {
  @scala.inline
  def apply(): ParamsResourceProjectsBrokersV2ServiceInstancesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrokersV2ServiceInstancesCreate]
  }
  @scala.inline
  implicit class ParamsResourceProjectsBrokersV2ServiceInstancesCreateOps[Self <: ParamsResourceProjectsBrokersV2ServiceInstancesCreate] (val x: Self) extends AnyVal {
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
    def setInstance_id(value: String): Self = this.set("instance_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance_id: Self = this.set("instance_id", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

