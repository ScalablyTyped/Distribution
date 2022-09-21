package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLaunchFlexTemplateParameter extends StObject {
  
  /**
    * Spec about the container image to launch.
    */
  var containerSpec: js.UndefOr[SchemaContainerSpec] = js.undefined
  
  /**
    * Cloud Storage path to a file with json serialized ContainerSpec as content.
    */
  var containerSpecGcsPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The runtime environment for the FlexTemplate job
    */
  var environment: js.UndefOr[SchemaFlexTemplateRuntimeEnvironment] = js.undefined
  
  /**
    * Required. The job name to use for the created job. For update job request, job name should be same as the existing running job.
    */
  var jobName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Launch options for this flex template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
    */
  var launchOptions: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The parameters for FlexTemplate. Ex. {"num_workers":"5"\}
    */
  var parameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Use this to pass transform_name_mappings for streaming update jobs. Ex:{"oldTransformName":"newTransformName",...\}'
    */
  var transformNameMappings: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
    */
  var update: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLaunchFlexTemplateParameter {
  
  inline def apply(): SchemaLaunchFlexTemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchFlexTemplateParameter]
  }
  
  extension [Self <: SchemaLaunchFlexTemplateParameter](x: Self) {
    
    inline def setContainerSpec(value: SchemaContainerSpec): Self = StObject.set(x, "containerSpec", value.asInstanceOf[js.Any])
    
    inline def setContainerSpecGcsPath(value: String): Self = StObject.set(x, "containerSpecGcsPath", value.asInstanceOf[js.Any])
    
    inline def setContainerSpecGcsPathNull: Self = StObject.set(x, "containerSpecGcsPath", null)
    
    inline def setContainerSpecGcsPathUndefined: Self = StObject.set(x, "containerSpecGcsPath", js.undefined)
    
    inline def setContainerSpecUndefined: Self = StObject.set(x, "containerSpec", js.undefined)
    
    inline def setEnvironment(value: SchemaFlexTemplateRuntimeEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
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
