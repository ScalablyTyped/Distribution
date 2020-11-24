package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexTemplateRuntimeEnvironment extends js.Object {
  
  /** Additional experiment flags for the job. */
  var additionalExperiments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling
    * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
    * "1kg", "count": "3" }.
    */
  var additionalUserLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.FlexTemplateRuntimeEnvironment with TopLevel[js.Any]
  ] = js.native
  
  /** Whether to enable Streaming Engine for the job. */
  var enableStreamingEngine: js.UndefOr[Boolean] = js.native
  
  /** Configuration for VM IPs. */
  var ipConfiguration: js.UndefOr[String] = js.native
  
  /** Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/ */
  var kmsKeyName: js.UndefOr[String] = js.native
  
  /** The machine type to use for the job. Defaults to the value from the template if not specified. */
  var machineType: js.UndefOr[String] = js.native
  
  /** The maximum number of Google Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000. */
  var maxWorkers: js.UndefOr[Double] = js.native
  
  /** Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default". */
  var network: js.UndefOr[String] = js.native
  
  /** The initial number of Google Compute Engine instances for the job. */
  var numWorkers: js.UndefOr[Double] = js.native
  
  /** The email address of the service account to run the job as. */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /**
    * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form
    * "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a
    * Shared VPC network, you must use the complete URL.
    */
  var subnetwork: js.UndefOr[String] = js.native
  
  /** The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`. */
  var tempLocation: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with
    * worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
    */
  var workerRegion: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with
    * worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity. If both `worker_zone` and `zone`
    * are set, `worker_zone` takes precedence.
    */
  var workerZone: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future,
    * worker_zone will take precedence.
    */
  var zone: js.UndefOr[String] = js.native
}
object FlexTemplateRuntimeEnvironment {
  
  @scala.inline
  def apply(): FlexTemplateRuntimeEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexTemplateRuntimeEnvironment]
  }
  
  @scala.inline
  implicit class FlexTemplateRuntimeEnvironmentOps[Self <: FlexTemplateRuntimeEnvironment] (val x: Self) extends AnyVal {
    
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
    def setAdditionalExperimentsVarargs(value: String*): Self = this.set("additionalExperiments", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalExperiments(value: js.Array[String]): Self = this.set("additionalExperiments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalExperiments: Self = this.set("additionalExperiments", js.undefined)
    
    @scala.inline
    def setAdditionalUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.FlexTemplateRuntimeEnvironment with TopLevel[js.Any]
    ): Self = this.set("additionalUserLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalUserLabels: Self = this.set("additionalUserLabels", js.undefined)
    
    @scala.inline
    def setEnableStreamingEngine(value: Boolean): Self = this.set("enableStreamingEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableStreamingEngine: Self = this.set("enableStreamingEngine", js.undefined)
    
    @scala.inline
    def setIpConfiguration(value: String): Self = this.set("ipConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpConfiguration: Self = this.set("ipConfiguration", js.undefined)
    
    @scala.inline
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWorkers: Self = this.set("maxWorkers", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setNumWorkers(value: Double): Self = this.set("numWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumWorkers: Self = this.set("numWorkers", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
    
    @scala.inline
    def setTempLocation(value: String): Self = this.set("tempLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempLocation: Self = this.set("tempLocation", js.undefined)
    
    @scala.inline
    def setWorkerRegion(value: String): Self = this.set("workerRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerRegion: Self = this.set("workerRegion", js.undefined)
    
    @scala.inline
    def setWorkerZone(value: String): Self = this.set("workerZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerZone: Self = this.set("workerZone", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
