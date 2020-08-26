package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete extends StandardParameters {
  /**
    * See CreateServiceInstanceRequest for details.
    */
  var acceptsIncomplete: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id of the binding to delete.
    */
  var bindingId: js.UndefOr[String] = js.native
  /**
    * The service instance id that deleted binding is bound to.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The plan id of the service instance.
    */
  var planId: js.UndefOr[String] = js.native
  /**
    * Additional query parameter hints. The service id of the service instance.
    */
  var serviceId: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete {
  @scala.inline
  def apply(): ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete]
  }
  @scala.inline
  implicit class ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDeleteOps[Self <: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete] (val x: Self) extends AnyVal {
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
    def setBindingId(value: String): Self = this.set("bindingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindingId: Self = this.set("bindingId", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanId: Self = this.set("planId", js.undefined)
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
  }
  
}

