package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchFlexTemplateParameter extends js.Object {
  
  /** Spec about the container image to launch. */
  var containerSpec: js.UndefOr[ContainerSpec] = js.native
  
  /** Gcs path to a file with json serialized ContainerSpec as content. */
  var containerSpecGcsPath: js.UndefOr[String] = js.native
  
  /** The runtime environment for the FlexTemplate job */
  var environment: js.UndefOr[FlexTemplateRuntimeEnvironment] = js.native
  
  /** Required. The job name to use for the created job. For update job request, job name should be same as the existing running job. */
  var jobName: js.UndefOr[String] = js.native
  
  /** Launch options for this flex template job. This is a common set of options across languages and templates. This should not be used to pass job parameters. */
  var launchOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter with TopLevel[js.Any]
  ] = js.native
  
  /** The parameters for FlexTemplate. Ex. {"num_workers":"5"} */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter with TopLevel[js.Any]
  ] = js.native
  
  /** Users need to set transform_name_mappings Ex:{"oldTransformName":"newTransformName",...}' */
  var transformNameMappings: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter with TopLevel[js.Any]
  ] = js.native
  
  /** Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job. */
  var update: js.UndefOr[Boolean] = js.native
}
object LaunchFlexTemplateParameter {
  
  @scala.inline
  def apply(): LaunchFlexTemplateParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchFlexTemplateParameter]
  }
  
  @scala.inline
  implicit class LaunchFlexTemplateParameterOps[Self <: LaunchFlexTemplateParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerSpec(value: ContainerSpec): Self = this.set("containerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerSpec: Self = this.set("containerSpec", js.undefined)
    
    @scala.inline
    def setContainerSpecGcsPath(value: String): Self = this.set("containerSpecGcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerSpecGcsPath: Self = this.set("containerSpecGcsPath", js.undefined)
    
    @scala.inline
    def setEnvironment(value: FlexTemplateRuntimeEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("jobName", js.undefined)
    
    @scala.inline
    def setLaunchOptions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter with TopLevel[js.Any]
    ): Self = this.set("launchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchOptions: Self = this.set("launchOptions", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter with TopLevel[js.Any]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setTransformNameMappings(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchFlexTemplateParameter with TopLevel[js.Any]
    ): Self = this.set("transformNameMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformNameMappings: Self = this.set("transformNameMappings", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
