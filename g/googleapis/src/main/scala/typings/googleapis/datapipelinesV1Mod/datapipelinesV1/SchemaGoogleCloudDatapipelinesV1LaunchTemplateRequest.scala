package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1LaunchTemplateRequest extends StObject {
  
  /**
    * A Cloud Storage path to the template from which to create the job. Must be a valid Cloud Storage URL, beginning with 'gs://'.
    */
  var gcsPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The parameters of the template to launch. This should be part of the body of the POST request.
    */
  var launchParameters: js.UndefOr[SchemaGoogleCloudDatapipelinesV1LaunchTemplateParameters] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
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
object SchemaGoogleCloudDatapipelinesV1LaunchTemplateRequest {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1LaunchTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1LaunchTemplateRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1LaunchTemplateRequest](x: Self) {
    
    inline def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    inline def setGcsPathNull: Self = StObject.set(x, "gcsPath", null)
    
    inline def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
    
    inline def setLaunchParameters(value: SchemaGoogleCloudDatapipelinesV1LaunchTemplateParameters): Self = StObject.set(x, "launchParameters", value.asInstanceOf[js.Any])
    
    inline def setLaunchParametersUndefined: Self = StObject.set(x, "launchParameters", js.undefined)
    
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
