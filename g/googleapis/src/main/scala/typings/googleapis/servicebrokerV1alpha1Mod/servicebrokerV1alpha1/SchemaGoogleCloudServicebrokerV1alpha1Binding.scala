package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the binding.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1Binding extends js.Object {
  
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
    * Configuration options for the service binding.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.native
  
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudServicebrokerV1alpha1Binding {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1Binding]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1BindingOps[Self <: SchemaGoogleCloudServicebrokerV1alpha1Binding] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: StringDictionary[js.Any]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPlan_id(value: String): Self = this.set("plan_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan_id: Self = this.set("plan_id", js.undefined)
    
    @scala.inline
    def setService_id(value: String): Self = this.set("service_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService_id: Self = this.set("service_id", js.undefined)
  }
}
