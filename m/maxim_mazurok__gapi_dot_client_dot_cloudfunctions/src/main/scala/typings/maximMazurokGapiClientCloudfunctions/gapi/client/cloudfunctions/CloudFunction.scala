package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFunction extends StObject {
  
  /** The amount of memory in MB available for a function. Defaults to 256MB. */
  var availableMemoryMb: js.UndefOr[Double] = js.undefined
  
  /** Build environment variables that shall be available during build time. */
  var buildEnvironmentVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The Cloud Build ID of the latest successful deployment of the function. */
  var buildId: js.UndefOr[String] = js.undefined
  
  /** User-provided description of a function. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the function (as defined in source code) that will be executed. Defaults to the resource name suffix, if not specified. For backward compatibility, if function with
    * given name is not found, then the system will try to use function named "function". For Node.js this is name of a function exported by the module specified in `source_location`.
    */
  var entryPoint: js.UndefOr[String] = js.undefined
  
  /** Environment variables that shall be available during function execution. */
  var environmentVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction & TopLevel[js.Any]
  ] = js.undefined
  
  /** A source that fires events in response to a condition in another service. */
  var eventTrigger: js.UndefOr[EventTrigger] = js.undefined
  
  /** An HTTPS endpoint type of source that can be triggered via URL. */
  var httpsTrigger: js.UndefOr[HttpsTrigger] = js.undefined
  
  /** The ingress settings for the function, controlling what traffic can reach it. */
  var ingressSettings: js.UndefOr[String] = js.undefined
  
  /** Labels associated with this Cloud Function. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The limit on the maximum number of function instances that may coexist at a given time. In some cases, such as rapid traffic surges, Cloud Functions may, for a short period of time,
    * create more instances than the specified max instances limit. If your function cannot tolerate this temporary behavior, you may want to factor in a safety margin and set a lower max
    * instances value than your function can tolerate. See the [Max Instances](https://cloud.google.com/functions/docs/max-instances) Guide for more details.
    */
  var maxInstances: js.UndefOr[Double] = js.undefined
  
  /** A user-defined name of the function. Function names must be unique globally and match pattern `projects/∗/locations/∗/functions/ *` */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC Network that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network resource. If the short network name is used, the
    * network must belong to the same project. Otherwise, it must belong to a project within the same organization. The format of this field is either
    * `projects/{project}/global/networks/{network}` or `{network}`, where {project} is a project id where the network is defined, and {network} is the short name of the network. This
    * field is mutually exclusive with `vpc_connector` and will be replaced by it. See [the VPC documentation](https://cloud.google.com/compute/docs/vpc) for more information on
    * connecting Cloud projects.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The runtime in which to run the function. Required when deploying a new function, optional when updating an existing function. For a complete list of possible choices, see the
    * [`gcloud` command reference](/sdk/gcloud/reference/functions/deploy#--runtime).
    */
  var runtime: js.UndefOr[String] = js.undefined
  
  /** The email of the function's service account. If empty, defaults to `{project_id}@appspot.gserviceaccount.com`. */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /** The Google Cloud Storage URL, starting with gs://, pointing to the zip archive which contains the function. */
  var sourceArchiveUrl: js.UndefOr[String] = js.undefined
  
  /** **Beta Feature** The source repository where a function is hosted. */
  var sourceRepository: js.UndefOr[SourceRepository] = js.undefined
  
  /** The Google Cloud Storage signed URL used for source uploading, generated by google.cloud.functions.v1.GenerateUploadUrl */
  var sourceUploadUrl: js.UndefOr[String] = js.undefined
  
  /** Output only. Status of the function deployment. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The function execution timeout. Execution is considered failed and can be terminated if the function is not completed at the end of the timeout period. Defaults to 60 seconds. */
  var timeout: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update timestamp of a Cloud Function. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The version identifier of the Cloud Function. Each deployment attempt results in a new version of a function being created. */
  var versionId: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC Network Connector that this cloud function can connect to. It can be either the fully-qualified URI, or the short name of the network connector resource. The format of this
    * field is `projects/∗/locations/∗/connectors/ *` This field is mutually exclusive with `network` field and will eventually replace it. See [the VPC
    * documentation](https://cloud.google.com/compute/docs/vpc) for more information on connecting Cloud projects.
    */
  var vpcConnector: js.UndefOr[String] = js.undefined
  
  /** The egress settings for the connector, controlling what traffic is diverted through it. */
  var vpcConnectorEgressSettings: js.UndefOr[String] = js.undefined
}
object CloudFunction {
  
  @scala.inline
  def apply(): CloudFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFunction]
  }
  
  @scala.inline
  implicit class CloudFunctionMutableBuilder[Self <: CloudFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableMemoryMb(value: Double): Self = StObject.set(x, "availableMemoryMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableMemoryMbUndefined: Self = StObject.set(x, "availableMemoryMb", js.undefined)
    
    @scala.inline
    def setBuildEnvironmentVariables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction & TopLevel[js.Any]
    ): Self = StObject.set(x, "buildEnvironmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildEnvironmentVariablesUndefined: Self = StObject.set(x, "buildEnvironmentVariables", js.undefined)
    
    @scala.inline
    def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction & TopLevel[js.Any]
    ): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setEventTrigger(value: EventTrigger): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTriggerUndefined: Self = StObject.set(x, "eventTrigger", js.undefined)
    
    @scala.inline
    def setHttpsTrigger(value: HttpsTrigger): Self = StObject.set(x, "httpsTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsTriggerUndefined: Self = StObject.set(x, "httpsTrigger", js.undefined)
    
    @scala.inline
    def setIngressSettings(value: String): Self = StObject.set(x, "ingressSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressSettingsUndefined: Self = StObject.set(x, "ingressSettings", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.CloudFunction & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setSourceArchiveUrl(value: String): Self = StObject.set(x, "sourceArchiveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArchiveUrlUndefined: Self = StObject.set(x, "sourceArchiveUrl", js.undefined)
    
    @scala.inline
    def setSourceRepository(value: SourceRepository): Self = StObject.set(x, "sourceRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepositoryUndefined: Self = StObject.set(x, "sourceRepository", js.undefined)
    
    @scala.inline
    def setSourceUploadUrl(value: String): Self = StObject.set(x, "sourceUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUploadUrlUndefined: Self = StObject.set(x, "sourceUploadUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    
    @scala.inline
    def setVpcConnector(value: String): Self = StObject.set(x, "vpcConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConnectorEgressSettings(value: String): Self = StObject.set(x, "vpcConnectorEgressSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConnectorEgressSettingsUndefined: Self = StObject.set(x, "vpcConnectorEgressSettings", js.undefined)
    
    @scala.inline
    def setVpcConnectorUndefined: Self = StObject.set(x, "vpcConnector", js.undefined)
  }
}
