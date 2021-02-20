package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message describing inputs to Provision and Update Service instance
  * requests.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance extends StObject {
  
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
    * Output only. Name of the Deployment Manager deployment used for
    * provisioning of this service instance.
    */
  var deploymentName: js.UndefOr[String] = js.native
  
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
object SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1ServiceInstanceMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeploymentName(value: String): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    @scala.inline
    def setInstance_id(value: String): Self = StObject.set(x, "instance_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance_idUndefined: Self = StObject.set(x, "instance_id", js.undefined)
    
    @scala.inline
    def setOrganization_guid(value: String): Self = StObject.set(x, "organization_guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_guidUndefined: Self = StObject.set(x, "organization_guid", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan_idUndefined: Self = StObject.set(x, "plan_id", js.undefined)
    
    @scala.inline
    def setPrevious_values(value: StringDictionary[js.Any]): Self = StObject.set(x, "previous_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious_valuesUndefined: Self = StObject.set(x, "previous_values", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setService_id(value: String): Self = StObject.set(x, "service_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService_idUndefined: Self = StObject.set(x, "service_id", js.undefined)
    
    @scala.inline
    def setSpace_guid(value: String): Self = StObject.set(x, "space_guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace_guidUndefined: Self = StObject.set(x, "space_guid", js.undefined)
  }
}
