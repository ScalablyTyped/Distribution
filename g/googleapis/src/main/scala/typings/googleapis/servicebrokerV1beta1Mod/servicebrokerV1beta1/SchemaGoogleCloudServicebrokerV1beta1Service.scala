package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The resource model mostly follows the Open Service Broker API, as described
  * here:
  * https://github.com/openservicebrokerapi/servicebroker/blob/master/_spec.md
  * Though due to Google Specifics it has additional optional fields.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1Service extends StObject {
  
  /**
    * Specifies whether instances of the service can be bound to applications.
    * Required.
    */
  var bindable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the service provides an endpoint to get service bindings.
    */
  var binding_retrievable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the service provides an endpoint to get service bindings.
    */
  var bindings_retrievable: js.UndefOr[Boolean] = js.native
  
  /**
    * Information to activate Dashboard SSO feature.
    */
  var dashboard_client: js.UndefOr[SchemaGoogleCloudServicebrokerV1beta1DashboardClient] = js.native
  
  /**
    * Textual description of the service. Required.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * ID is a globally unique identifier used to uniquely identify the service.
    * ID is an opaque string.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether the service provides an endpoint to get service instances.
    */
  var instances_retrievable: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of metadata for a service offering. Metadata is an arbitrary JSON
    * object.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * User friendly service name. Name must match [a-z0-9]+ regexp. The name
    * must be globally unique within GCP project. Note, which is different from
    * (&quot;This must be globally unique within a platform marketplace&quot;).
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whether the service supports upgrade/downgrade for some plans.
    */
  var plan_updateable: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of plans for this service. At least one plan is required.
    */
  var plans: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1beta1Plan]] = js.native
  
  /**
    * Tags provide a flexible mechanism to expose a classification, attribute,
    * or base technology of a service.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleCloudServicebrokerV1beta1Service {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Service]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1ServiceMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1beta1Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindable(value: Boolean): Self = StObject.set(x, "bindable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindableUndefined: Self = StObject.set(x, "bindable", js.undefined)
    
    @scala.inline
    def setBinding_retrievable(value: Boolean): Self = StObject.set(x, "binding_retrievable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinding_retrievableUndefined: Self = StObject.set(x, "binding_retrievable", js.undefined)
    
    @scala.inline
    def setBindings_retrievable(value: Boolean): Self = StObject.set(x, "bindings_retrievable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindings_retrievableUndefined: Self = StObject.set(x, "bindings_retrievable", js.undefined)
    
    @scala.inline
    def setDashboard_client(value: SchemaGoogleCloudServicebrokerV1beta1DashboardClient): Self = StObject.set(x, "dashboard_client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboard_clientUndefined: Self = StObject.set(x, "dashboard_client", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstances_retrievable(value: Boolean): Self = StObject.set(x, "instances_retrievable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances_retrievableUndefined: Self = StObject.set(x, "instances_retrievable", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlan_updateable(value: Boolean): Self = StObject.set(x, "plan_updateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan_updateableUndefined: Self = StObject.set(x, "plan_updateable", js.undefined)
    
    @scala.inline
    def setPlans(value: js.Array[SchemaGoogleCloudServicebrokerV1beta1Plan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlansUndefined: Self = StObject.set(x, "plans", js.undefined)
    
    @scala.inline
    def setPlansVarargs(value: SchemaGoogleCloudServicebrokerV1beta1Plan*): Self = StObject.set(x, "plans", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
