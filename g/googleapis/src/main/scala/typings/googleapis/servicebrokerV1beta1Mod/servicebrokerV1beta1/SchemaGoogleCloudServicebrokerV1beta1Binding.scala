package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the binding.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1Binding extends js.Object {
  
  /**
    * A JSON object that contains data for platform resources associated with
    * the binding to be created.
    */
  var bind_resource: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The id of the binding. Must be unique within GCP project. Maximum length
    * is 64, GUID recommended. Required.
    */
  var binding_id: js.UndefOr[String] = js.native
  
  /**
    * Output only. Timestamp for when the binding was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. String containing the Deployment Manager deployment name
    * that was created for this binding,
    */
  var deploymentName: js.UndefOr[String] = js.native
  
  /**
    * Configuration options for the service binding.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resource name of the binding, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id/bindings/binding_id.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudServicebrokerV1beta1Binding {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Binding]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1BindingOps[Self <: SchemaGoogleCloudServicebrokerV1beta1Binding] (val x: Self) extends AnyVal {
    
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
    def setBind_resource(value: StringDictionary[js.Any]): Self = this.set("bind_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBind_resource: Self = this.set("bind_resource", js.undefined)
    
    @scala.inline
    def setBinding_id(value: String): Self = this.set("binding_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinding_id: Self = this.set("binding_id", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDeploymentName(value: String): Self = this.set("deploymentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentName: Self = this.set("deploymentName", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPlan_id(value: String): Self = this.set("plan_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan_id: Self = this.set("plan_id", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setService_id(value: String): Self = this.set("service_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService_id: Self = this.set("service_id", js.undefined)
  }
}
