package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Plan message describes a Service Plan.
  */
trait SchemaGoogleCloudServicebrokerV1alpha1Plan extends StObject {
  
  /**
    * Specifies whether instances of the service can be bound to applications.
    * If not specified, `Service.bindable` will be presumed.
    */
  var bindable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Textual description of the plan. Optional.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the service is free.
    */
  var free: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID is a globally unique identifier used to uniquely identify the plan.
    * User must make no presumption about the format of this field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A list of metadata for a service offering. Metadata is an arbitrary JSON
    * object.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * User friendly name of the plan. The name must be globally unique within
    * GCP project. Note, which is different from (&quot;This must be globally
    * unique within a platform marketplace&quot;).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Schema definitions for service instances and bindings for the plan.
    */
  var schemas: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1alpha1Plan {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1Plan]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1PlanMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1alpha1Plan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindable(value: Boolean): Self = StObject.set(x, "bindable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindableUndefined: Self = StObject.set(x, "bindable", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFree(value: Boolean): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeUndefined: Self = StObject.set(x, "free", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSchemas(value: StringDictionary[js.Any]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
  }
}
