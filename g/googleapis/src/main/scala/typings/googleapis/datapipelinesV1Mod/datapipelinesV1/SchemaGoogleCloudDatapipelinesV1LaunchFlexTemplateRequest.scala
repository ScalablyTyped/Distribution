package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateRequest extends StObject {
  
  /**
    * Required. Parameter to launch a job from a Flex Template.
    */
  var launchParameter: js.UndefOr[SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateParameter] = js.undefined
  
  /**
    * Required. The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the request is validated but not actually executed. Defaults to false.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateRequest {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateRequest](x: Self) {
    
    inline def setLaunchParameter(value: SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateParameter): Self = StObject.set(x, "launchParameter", value.asInstanceOf[js.Any])
    
    inline def setLaunchParameterUndefined: Self = StObject.set(x, "launchParameter", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
