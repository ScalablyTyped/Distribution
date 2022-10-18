package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchFlexTemplateParameter extends StObject {
  
  /** Spec about the container image to launch. */
  var containerSpec: js.UndefOr[ContainerSpec] = js.undefined
  
  /** Cloud Storage path to a file with json serialized ContainerSpec as content. */
  var containerSpecGcsPath: js.UndefOr[String] = js.undefined
  
  /** The runtime environment for the FlexTemplate job */
  var environment: js.UndefOr[FlexTemplateRuntimeEnvironment] = js.undefined
  
  /** Required. The job name to use for the created job. For update job request, job name should be same as the existing running job. */
  var jobName: js.UndefOr[String] = js.undefined
  
  /** Launch options for this flex template job. This is a common set of options across languages and templates. This should not be used to pass job parameters. */
  var launchOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The parameters for FlexTemplate. Ex. {"num_workers":"5"} */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Use this to pass transform_name_mappings for streaming update jobs. Ex:{"oldTransformName":"newTransformName",...}' */
  var transformNameMappings: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job. */
  var update: js.UndefOr[Boolean] = js.undefined
}
object LaunchFlexTemplateParameter {
  
  inline def apply(): LaunchFlexTemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchFlexTemplateParameter]
  }
  
  extension [Self <: LaunchFlexTemplateParameter](x: Self) {
    
    inline def setContainerSpec(value: ContainerSpec): Self = StObject.set(x, "containerSpec", value.asInstanceOf[js.Any])
    
    inline def setContainerSpecGcsPath(value: String): Self = StObject.set(x, "containerSpecGcsPath", value.asInstanceOf[js.Any])
    
    inline def setContainerSpecGcsPathUndefined: Self = StObject.set(x, "containerSpecGcsPath", js.undefined)
    
    inline def setContainerSpecUndefined: Self = StObject.set(x, "containerSpec", js.undefined)
    
    inline def setEnvironment(value: FlexTemplateRuntimeEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setLaunchOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
    
    inline def setLaunchOptionsUndefined: Self = StObject.set(x, "launchOptions", js.undefined)
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setTransformNameMappings(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "transformNameMappings", value.asInstanceOf[js.Any])
    
    inline def setTransformNameMappingsUndefined: Self = StObject.set(x, "transformNameMappings", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
