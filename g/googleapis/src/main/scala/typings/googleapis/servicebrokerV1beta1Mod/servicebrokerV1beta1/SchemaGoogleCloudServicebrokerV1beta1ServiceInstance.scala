package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message describing inputs to Provision and Update Service instance
  * requests.
  */
trait SchemaGoogleCloudServicebrokerV1beta1ServiceInstance extends StObject {
  
  /**
    * Platform specific contextual information under which the service instance
    * is to be provisioned. This replaces organization_guid and space_guid. But
    * can also contain anything. Currently only used for logging context
    * information.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Output only. Timestamp for when the instance was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. String containing the Deployment Manager deployment name
    * that was created for this instance,
    */
  var deploymentName: js.UndefOr[String] = js.undefined
  
  /**
    * To return errors when GetInstance call is done via HTTP to be unified
    * with other methods.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the service instance. Must be unique within GCP project.
    * Maximum length is 64, GUID recommended. Required.
    */
  var instance_id: js.UndefOr[String] = js.undefined
  
  /**
    * The platform GUID for the organization under which the service is to be
    * provisioned. Required.
    */
  var organization_guid: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration options for the service instance. Parameters is JSON object
    * serialized to string.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.undefined
  
  /**
    * Used only in UpdateServiceInstance request to optionally specify previous
    * fields.
    */
  var previous_values: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Output only. The resource name of the instance, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the project space within the platform organization.
    * Required.
    */
  var space_guid: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1beta1ServiceInstance {
  
  inline def apply(): SchemaGoogleCloudServicebrokerV1beta1ServiceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1ServiceInstance]
  }
  
  extension [Self <: SchemaGoogleCloudServicebrokerV1beta1ServiceInstance](x: Self) {
    
    inline def setContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeploymentName(value: String): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInstance_id(value: String): Self = StObject.set(x, "instance_id", value.asInstanceOf[js.Any])
    
    inline def setInstance_idUndefined: Self = StObject.set(x, "instance_id", js.undefined)
    
    inline def setOrganization_guid(value: String): Self = StObject.set(x, "organization_guid", value.asInstanceOf[js.Any])
    
    inline def setOrganization_guidUndefined: Self = StObject.set(x, "organization_guid", js.undefined)
    
    inline def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
    
    inline def setPlan_idUndefined: Self = StObject.set(x, "plan_id", js.undefined)
    
    inline def setPrevious_values(value: StringDictionary[js.Any]): Self = StObject.set(x, "previous_values", value.asInstanceOf[js.Any])
    
    inline def setPrevious_valuesUndefined: Self = StObject.set(x, "previous_values", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setService_id(value: String): Self = StObject.set(x, "service_id", value.asInstanceOf[js.Any])
    
    inline def setService_idUndefined: Self = StObject.set(x, "service_id", js.undefined)
    
    inline def setSpace_guid(value: String): Self = StObject.set(x, "space_guid", value.asInstanceOf[js.Any])
    
    inline def setSpace_guidUndefined: Self = StObject.set(x, "space_guid", js.undefined)
  }
}
