package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateParameter extends StObject {
  
  /**
    * Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
    */
  var containerSpecGcsPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The runtime environment for the Flex Template job.
    */
  var environment: js.UndefOr[SchemaGoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironment] = js.undefined
  
  /**
    * Required. The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
    */
  var jobName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
    */
  var launchOptions: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The parameters for the Flex Template. Example: `{"num_workers":"5"\}`
    */
  var parameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Use this to pass transform name mappings for streaming update jobs. Example: `{"oldTransformName":"newTransformName",...\}`
    */
  var transformNameMappings: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
    */
  var update: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateParameter {
  
  inline def apply(): SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateParameter]
  }
  
  extension [Self <: SchemaGoogleCloudDatapipelinesV1LaunchFlexTemplateParameter](x: Self) {
    
    inline def setContainerSpecGcsPath(value: String): Self = StObject.set(x, "containerSpecGcsPath", value.asInstanceOf[js.Any])
    
    inline def setContainerSpecGcsPathNull: Self = StObject.set(x, "containerSpecGcsPath", null)
    
    inline def setContainerSpecGcsPathUndefined: Self = StObject.set(x, "containerSpecGcsPath", js.undefined)
    
    inline def setEnvironment(value: SchemaGoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameNull: Self = StObject.set(x, "jobName", null)
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setLaunchOptions(value: StringDictionary[String]): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
    
    inline def setLaunchOptionsNull: Self = StObject.set(x, "launchOptions", null)
    
    inline def setLaunchOptionsUndefined: Self = StObject.set(x, "launchOptions", js.undefined)
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setTransformNameMappings(value: StringDictionary[String]): Self = StObject.set(x, "transformNameMappings", value.asInstanceOf[js.Any])
    
    inline def setTransformNameMappingsNull: Self = StObject.set(x, "transformNameMappings", null)
    
    inline def setTransformNameMappingsUndefined: Self = StObject.set(x, "transformNameMappings", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateNull: Self = StObject.set(x, "update", null)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
