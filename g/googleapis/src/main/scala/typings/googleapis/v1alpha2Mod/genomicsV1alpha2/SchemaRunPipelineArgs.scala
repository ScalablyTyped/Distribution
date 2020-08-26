package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pipeline run arguments.
  */
@js.native
trait SchemaRunPipelineArgs extends js.Object {
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
  implicit class SchemaRunPipelineArgsOps[Self <: SchemaRunPipelineArgs] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setKeepVmAliveOnFailureDuration(value: String): Self = this.set("keepVmAliveOnFailureDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepVmAliveOnFailureDuration: Self = this.set("keepVmAliveOnFailureDuration", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLogging(value: SchemaLoggingOptions): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setOutputs(value: StringDictionary[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setResources(value: SchemaPipelineResources): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setServiceAccount(value: SchemaServiceAccount): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
  }
  
}

