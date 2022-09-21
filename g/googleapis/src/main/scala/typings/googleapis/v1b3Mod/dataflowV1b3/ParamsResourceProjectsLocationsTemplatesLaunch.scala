package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTemplatesLaunch
  extends StObject
     with StandardParameters {
  
  /**
    * Path to dynamic template spec file on Cloud Storage. The file must be a Json serialized DynamicTemplateFieSpec object.
    */
  @JSName("dynamicTemplate.gcsPath")
  var dynamicTemplateDotgcsPath: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud Storage path for staging dependencies. Must be a valid Cloud Storage URL, beginning with `gs://`.
    */
  @JSName("dynamicTemplate.stagingLocation")
  var dynamicTemplateDotstagingLocation: js.UndefOr[String] = js.undefined
  
  /**
    * A Cloud Storage path to the template from which to create the job. Must be valid Cloud Storage URL, beginning with 'gs://'.
    */
  var gcsPath: js.UndefOr[String] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLaunchTemplateParameters] = js.undefined
  
  /**
    * If true, the request is validated but not actually executed. Defaults to false.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsTemplatesLaunch {
  
  inline def apply(): ParamsResourceProjectsLocationsTemplatesLaunch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTemplatesLaunch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTemplatesLaunch](x: Self) {
    
    inline def setDynamicTemplateDotgcsPath(value: String): Self = StObject.set(x, "dynamicTemplate.gcsPath", value.asInstanceOf[js.Any])
    
    inline def setDynamicTemplateDotgcsPathUndefined: Self = StObject.set(x, "dynamicTemplate.gcsPath", js.undefined)
    
    inline def setDynamicTemplateDotstagingLocation(value: String): Self = StObject.set(x, "dynamicTemplate.stagingLocation", value.asInstanceOf[js.Any])
    
    inline def setDynamicTemplateDotstagingLocationUndefined: Self = StObject.set(x, "dynamicTemplate.stagingLocation", js.undefined)
    
    inline def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    inline def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaLaunchTemplateParameters): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
