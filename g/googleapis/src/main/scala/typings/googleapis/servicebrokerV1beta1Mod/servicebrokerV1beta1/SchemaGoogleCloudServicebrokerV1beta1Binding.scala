package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the binding.
  */
trait SchemaGoogleCloudServicebrokerV1beta1Binding extends StObject {
  
  /**
    * A JSON object that contains data for platform resources associated with
    * the binding to be created.
    */
  var bind_resource: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The id of the binding. Must be unique within GCP project. Maximum length
    * is 64, GUID recommended. Required.
    */
  var binding_id: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Timestamp for when the binding was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. String containing the Deployment Manager deployment name
    * that was created for this binding,
    */
  var deploymentName: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration options for the service binding.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The resource name of the binding, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id/bindings/binding_id.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1beta1Binding {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Binding]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1BindingMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1beta1Binding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind_resource(value: StringDictionary[js.Any]): Self = StObject.set(x, "bind_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBind_resourceUndefined: Self = StObject.set(x, "bind_resource", js.undefined)
    
    @scala.inline
    def setBinding_id(value: String): Self = StObject.set(x, "binding_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinding_idUndefined: Self = StObject.set(x, "binding_id", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeploymentName(value: String): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan_idUndefined: Self = StObject.set(x, "plan_id", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setService_id(value: String): Self = StObject.set(x, "service_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService_idUndefined: Self = StObject.set(x, "service_id", js.undefined)
  }
}
