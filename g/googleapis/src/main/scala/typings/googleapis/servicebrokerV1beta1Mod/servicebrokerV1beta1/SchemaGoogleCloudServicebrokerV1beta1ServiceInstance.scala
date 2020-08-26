package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message describing inputs to Provision and Update Service instance
  * requests.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1ServiceInstance extends js.Object {
  /**
    * Platform specific contextual information under which the service instance
    * is to be provisioned. This replaces organization_guid and space_guid. But
    * can also contain anything. Currently only used for logging context
    * information.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. Timestamp for when the instance was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. String containing the Deployment Manager deployment name
    * that was created for this instance,
    */
  var deploymentName: js.UndefOr[String] = js.native
  /**
    * To return errors when GetInstance call is done via HTTP to be unified
    * with other methods.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The id of the service instance. Must be unique within GCP project.
    * Maximum length is 64, GUID recommended. Required.
    */
  var instance_id: js.UndefOr[String] = js.native
  /**
    * The platform GUID for the organization under which the service is to be
    * provisioned. Required.
    */
  var organization_guid: js.UndefOr[String] = js.native
  /**
    * Configuration options for the service instance. Parameters is JSON object
    * serialized to string.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.native
  /**
    * Used only in UpdateServiceInstance request to optionally specify previous
    * fields.
    */
  var previous_values: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The resource name of the instance, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.native
  /**
    * The identifier for the project space within the platform organization.
    * Required.
    */
  var space_guid: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1beta1ServiceInstance {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1ServiceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1ServiceInstanceOps[Self <: SchemaGoogleCloudServicebrokerV1beta1ServiceInstance] (val x: Self) extends AnyVal {
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
    def setContext(value: StringDictionary[js.Any]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDeploymentName(value: String): Self = this.set("deploymentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentName: Self = this.set("deploymentName", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setInstance_id(value: String): Self = this.set("instance_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance_id: Self = this.set("instance_id", js.undefined)
    @scala.inline
    def setOrganization_guid(value: String): Self = this.set("organization_guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization_guid: Self = this.set("organization_guid", js.undefined)
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setPlan_id(value: String): Self = this.set("plan_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlan_id: Self = this.set("plan_id", js.undefined)
    @scala.inline
    def setPrevious_values(value: StringDictionary[js.Any]): Self = this.set("previous_values", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevious_values: Self = this.set("previous_values", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setService_id(value: String): Self = this.set("service_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService_id: Self = this.set("service_id", js.undefined)
    @scala.inline
    def setSpace_guid(value: String): Self = this.set("space_guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_guid: Self = this.set("space_guid", js.undefined)
  }
  
}

