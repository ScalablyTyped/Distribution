package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchFlexTemplateParameter extends StObject {
  
  /** Spec about the container image to launch. */
  var containerSpec: js.UndefOr[ContainerSpec] = js.undefined
  
  /** Gcs path to a file with json serialized ContainerSpec as content. */
  var containerSpecGcsPath: js.UndefOr[String] = js.undefined
  
  /** The runtime environment for the FlexTemplate job */
  var environment: js.UndefOr[FlexTemplateRuntimeEnvironment] = js.undefined
  
  /** Required. The job name to use for the created job. For update job request, job name should be same as the existing running job. */
  var jobName: js.UndefOr[String] = js.undefined
  
  /** Launch options for this flex template job. This is a common set of options across languages and templates. This should not be used to pass job parameters. */
  var launchOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter & TopLevel[js.Any]
  ] = js.undefined
  
  /** The parameters for FlexTemplate. Ex. {"num_workers":"5"} */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter & TopLevel[js.Any]
  ] = js.undefined
  
  /** Users need to set transform_name_mappings Ex:{"oldTransformName":"newTransformName",...}' */
  var transformNameMappings: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter & TopLevel[js.Any]
  ] = js.undefined
  
  /** Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job. */
  var update: js.UndefOr[Boolean] = js.undefined
}
object LaunchFlexTemplateParameter {
  
  @scala.inline
  def apply(): LaunchFlexTemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchFlexTemplateParameter]
  }
  
  @scala.inline
  implicit class LaunchFlexTemplateParameterMutableBuilder[Self <: LaunchFlexTemplateParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerSpec(value: ContainerSpec): Self = StObject.set(x, "containerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerSpecGcsPath(value: String): Self = StObject.set(x, "containerSpecGcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerSpecGcsPathUndefined: Self = StObject.set(x, "containerSpecGcsPath", js.undefined)
    
    @scala.inline
    def setContainerSpecUndefined: Self = StObject.set(x, "containerSpec", js.undefined)
    
    @scala.inline
    def setEnvironment(value: FlexTemplateRuntimeEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    @scala.inline
    def setLaunchOptions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter & TopLevel[js.Any]
    ): Self = StObject.set(x, "launchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchOptionsUndefined: Self = StObject.set(x, "launchOptions", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter & TopLevel[js.Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setTransformNameMappings(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter & TopLevel[js.Any]
    ): Self = StObject.set(x, "transformNameMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformNameMappingsUndefined: Self = StObject.set(x, "transformNameMappings", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
