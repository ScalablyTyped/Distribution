package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFunction extends js.Object {
  
  /** The amount of memory in MB available for a function. Defaults to 256MB. */
  var availableMemoryMb: js.UndefOr[Double] = js.native
  
  /** Build environment variables that shall be available during build time. */
  var buildEnvironmentVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The Cloud Build ID of the latest successful deployment of the function. */
  var buildId: js.UndefOr[String] = js.native
  
  /** User-provided description of a function. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the function (as defined in source code) that will be executed. Defaults to the resource name suffix, if not specified. For backward compatibility, if function with
    * given name is not found, then the system will try to use function named "function". For Node.js this is name of a function exported by the module specified in `source_location`.
    */
  var entryPoint: js.UndefOr[String] = js.native
  
  /** Environment variables that shall be available during function execution. */
  var environmentVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction with TopLevel[js.Any]
  ] = js.native
  
  /** A source that fires events in response to a condition in another service. */
  var eventTrigger: js.UndefOr[EventTrigger] = js.native
  
  /** An HTTPS endpoint type of source that can be triggered via URL. */
  var httpsTrigger: js.UndefOr[HttpsTrigger] = js.native
  
  /** The ingress settings for the function, controlling what traffic can reach it. */
  var ingressSettings: js.UndefOr[String] = js.native
  
  /** Labels associated with this Cloud Function. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time,
    * create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max
    * instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  
  /** A user-defined name of the function. Function names must be unique globally and match pattern `projects/∗/locations/∗/functions/ *` */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The VPC Network that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network resource. If the short network name is used, the
    * network must belong to the same project. Otherwise, it must belong to a project within the same organization. The format of this field is either
    * `projects/{project}/global/networks/{network}` or `{network}`, where {project} is a project id where the network is defined, and {network} is the short name of the network. This
    * field is mutually exclusive with `vpc_connector` and will be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on
    * connecting Cloud projects.
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * The runtime in which to run the function. Required when deploying a new function, optional when updating an existing function. For a complete list of possible choices, see the
    * [`gcloud` command reference](/sdk/gcloud/reference/functions/deploy#--runtime).
    */
  var runtime: js.UndefOr[String] = js.native
  
  /** The email of the function's service account. If empty, defaults to `{project_id}@appspot.gserviceaccount.com`. */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /** The Google Cloud Storage URL, starting with gs://, pointing to the zip archive which contains the function. */
  var sourceArchiveUrl: js.UndefOr[String] = js.native
  
  /** **Beta Feature** The source repository where a function is hosted. */
  var sourceRepository: js.UndefOr[SourceRepository] = js.native
  
  /** The Google Cloud Storage signed URL used for source uploading, generated by google.cloud.functions.v1.GenerateUploadUrl */
  var sourceUploadUrl: js.UndefOr[String] = js.native
  
  /** Output only. Status of the function deployment. */
  var status: js.UndefOr[String] = js.native
  
  /** The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds. */
  var timeout: js.UndefOr[String] = js.native
  
  /** Output only. The last update timestamp of a Cloud Function. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** Output only. The version identifier of the Cloud Function. Each deployment attempt results in a new version of a function being created. */
  var versionId: js.UndefOr[String] = js.native
  
  /**
    * The VPC Network Connector that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network connector resource. The format of this
    * field is `projects/∗/locations/∗/connectors/ *` This field is mutually exclusive with `network` field and will eventually replace it. See [the VPC
    * documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
    */
  var vpcConnector: js.UndefOr[String] = js.native
  
  /** The egress settings for the connector, controlling what traffic is diverted through it. */
  var vpcConnectorEgressSettings: js.UndefOr[String] = js.native
}
object CloudFunction {
  
  @scala.inline
  def apply(): CloudFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFunction]
  }
  
  @scala.inline
  implicit class CloudFunctionOps[Self <: CloudFunction] (val x: Self) extends AnyVal {
    
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
    def setAvailableMemoryMb(value: Double): Self = this.set("availableMemoryMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableMemoryMb: Self = this.set("availableMemoryMb", js.undefined)
    
    @scala.inline
    def setBuildEnvironmentVariables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction with TopLevel[js.Any]
    ): Self = this.set("buildEnvironmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildEnvironmentVariables: Self = this.set("buildEnvironmentVariables", js.undefined)
    
    @scala.inline
    def setBuildId(value: String): Self = this.set("buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildId: Self = this.set("buildId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEntryPoint(value: String): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPoint: Self = this.set("entryPoint", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction with TopLevel[js.Any]
    ): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    
    @scala.inline
    def setEventTrigger(value: EventTrigger): Self = this.set("eventTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTrigger: Self = this.set("eventTrigger", js.undefined)
    
    @scala.inline
    def setHttpsTrigger(value: HttpsTrigger): Self = this.set("httpsTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsTrigger: Self = this.set("httpsTrigger", js.undefined)
    
    @scala.inline
    def setIngressSettings(value: String): Self = this.set("ingressSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngressSettings: Self = this.set("ingressSettings", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setSourceArchiveUrl(value: String): Self = this.set("sourceArchiveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceArchiveUrl: Self = this.set("sourceArchiveUrl", js.undefined)
    
    @scala.inline
    def setSourceRepository(value: SourceRepository): Self = this.set("sourceRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRepository: Self = this.set("sourceRepository", js.undefined)
    
    @scala.inline
    def setSourceUploadUrl(value: String): Self = this.set("sourceUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUploadUrl: Self = this.set("sourceUploadUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
    
    @scala.inline
    def setVpcConnector(value: String): Self = this.set("vpcConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConnector: Self = this.set("vpcConnector", js.undefined)
    
    @scala.inline
    def setVpcConnectorEgressSettings(value: String): Self = this.set("vpcConnectorEgressSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConnectorEgressSettings: Self = this.set("vpcConnectorEgressSettings", js.undefined)
  }
}
