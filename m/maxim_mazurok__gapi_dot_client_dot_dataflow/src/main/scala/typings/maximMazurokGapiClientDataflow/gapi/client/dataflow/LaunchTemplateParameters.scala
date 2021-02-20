package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateParameters extends StObject {
  
  /** The runtime environment for the job. */
  var environment: js.UndefOr[RuntimeEnvironment] = js.native
  
  /** Required. The job name to use for the created job. */
  var jobName: js.UndefOr[String] = js.native
  
  /** The runtime parameters to pass to the job. */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchTemplateParameters with TopLevel[js.Any]
  ] = js.native
  
  /** Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job. */
  var transformNameMapping: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchTemplateParameters with TopLevel[js.Any]
  ] = js.native
  
  /** If set, replace the existing pipeline with the name specified by jobName with this pipeline, preserving state. */
  var update: js.UndefOr[Boolean] = js.native
}
object LaunchTemplateParameters {
  
  @scala.inline
  def apply(): LaunchTemplateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateParameters]
  }
  
  @scala.inline
  implicit class LaunchTemplateParametersMutableBuilder[Self <: LaunchTemplateParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: RuntimeEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchTemplateParameters with TopLevel[js.Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setTransformNameMapping(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchTemplateParameters with TopLevel[js.Any]
    ): Self = StObject.set(x, "transformNameMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformNameMappingUndefined: Self = StObject.set(x, "transformNameMapping", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
