package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateParameters extends js.Object {
  
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
  implicit class LaunchTemplateParametersOps[Self <: LaunchTemplateParameters] (val x: Self) extends AnyVal {
    
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
    def setEnvironment(value: RuntimeEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("jobName", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchTemplateParameters with TopLevel[js.Any]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setTransformNameMapping(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LaunchTemplateParameters with TopLevel[js.Any]
    ): Self = this.set("transformNameMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformNameMapping: Self = this.set("transformNameMapping", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
