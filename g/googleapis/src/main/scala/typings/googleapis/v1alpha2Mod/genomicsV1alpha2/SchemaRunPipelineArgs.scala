package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pipeline run arguments.
  */
@js.native
trait SchemaRunPipelineArgs extends StObject {
  
  /**
    * This field is deprecated. Use `labels` instead. Client-specified pipeline
    * operation identifier.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * Pipeline input arguments; keys are defined in the pipeline documentation.
    * All input parameters that do not have default values  must be specified.
    * If parameters with defaults are specified here, the defaults will be
    * overridden.
    */
  var inputs: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * How long to keep the VM up after a failure (for example docker command
    * failed, copying input or output files failed, etc). While the VM is up,
    * one can ssh into the VM to debug. Default is 0; maximum allowed value is
    * 1 day.
    */
  var keepVmAliveOnFailureDuration: js.UndefOr[String] = js.native
  
  /**
    * Labels to apply to this pipeline run. Labels will also be applied to
    * compute resources (VM, disks) created by this pipeline run. When listing
    * operations, operations can filtered by labels. Label keys may not be
    * empty; label values may be empty. Non-empty labels must be 1-63
    * characters long, and comply with [RFC1035]
    * (https://www.ietf.org/rfc/rfc1035.txt). Specifically, the name must be
    * 1-63 characters long and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a
    * lowercase letter, and all following characters must be a dash, lowercase
    * letter, or digit, except the last character, which cannot be a dash.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Required. Logging options. Used by the service to communicate results to
    * the user.
    */
  var logging: js.UndefOr[SchemaLoggingOptions] = js.native
  
  /**
    * Pipeline output arguments; keys are defined in the pipeline
    * documentation.  All output parameters of without default values must be
    * specified.  If parameters with defaults are specified here, the defaults
    * will be overridden.
    */
  var outputs: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Required. The project in which to run the pipeline. The caller must have
    * WRITER access to all Google Cloud services and resources (e.g. Google
    * Compute Engine) will be used.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Specifies resource requirements/overrides for the pipeline run.
    */
  var resources: js.UndefOr[SchemaPipelineResources] = js.native
  
  /**
    * The Google Cloud Service Account that will be used to access data and
    * services. By default, the compute service account associated with
    * `projectId` is used.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
}
object SchemaRunPipelineArgs {
  
  @scala.inline
  def apply(): SchemaRunPipelineArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPipelineArgs]
  }
  
  @scala.inline
  implicit class SchemaRunPipelineArgsMutableBuilder[Self <: SchemaRunPipelineArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setKeepVmAliveOnFailureDuration(value: String): Self = StObject.set(x, "keepVmAliveOnFailureDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepVmAliveOnFailureDurationUndefined: Self = StObject.set(x, "keepVmAliveOnFailureDuration", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLogging(value: SchemaLoggingOptions): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setResources(value: SchemaPipelineResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
