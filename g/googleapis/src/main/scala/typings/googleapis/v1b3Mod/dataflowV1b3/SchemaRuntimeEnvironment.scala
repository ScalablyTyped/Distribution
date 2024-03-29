package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeEnvironment extends StObject {
  
  /**
    * Additional experiment flags for the job, specified with the `--experiments` option.
    */
  var additionalExperiments: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Additional user labels to be specified for the job. Keys and values should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1kg", "count": "3" \}.
    */
  var additionalUserLabels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Whether to bypass the safety checks for the job's temporary directory. Use with caution.
    */
  var bypassTempDirValidation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to enable Streaming Engine for the job.
    */
  var enableStreamingEngine: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configuration for VM IPs.
    */
  var ipConfiguration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The machine type to use for the job. Defaults to the value from the template if not specified.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of Google Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
    */
  var maxWorkers: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The initial number of Google Compute Engine instances for the job.
    */
  var numWorkers: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The email address of the service account to run the job as.
    */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a Shared VPC network, you must use the complete URL.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`.
    */
  var tempLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
    */
  var workerRegion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity. If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
    */
  var workerZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future, worker_zone will take precedence.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaRuntimeEnvironment {
  
  inline def apply(): SchemaRuntimeEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeEnvironment]
  }
  
  extension [Self <: SchemaRuntimeEnvironment](x: Self) {
    
    inline def setAdditionalExperiments(value: js.Array[String]): Self = StObject.set(x, "additionalExperiments", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExperimentsNull: Self = StObject.set(x, "additionalExperiments", null)
    
    inline def setAdditionalExperimentsUndefined: Self = StObject.set(x, "additionalExperiments", js.undefined)
    
    inline def setAdditionalExperimentsVarargs(value: String*): Self = StObject.set(x, "additionalExperiments", js.Array(value*))
    
    inline def setAdditionalUserLabels(value: StringDictionary[String]): Self = StObject.set(x, "additionalUserLabels", value.asInstanceOf[js.Any])
    
    inline def setAdditionalUserLabelsNull: Self = StObject.set(x, "additionalUserLabels", null)
    
    inline def setAdditionalUserLabelsUndefined: Self = StObject.set(x, "additionalUserLabels", js.undefined)
    
    inline def setBypassTempDirValidation(value: Boolean): Self = StObject.set(x, "bypassTempDirValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassTempDirValidationNull: Self = StObject.set(x, "bypassTempDirValidation", null)
    
    inline def setBypassTempDirValidationUndefined: Self = StObject.set(x, "bypassTempDirValidation", js.undefined)
    
    inline def setEnableStreamingEngine(value: Boolean): Self = StObject.set(x, "enableStreamingEngine", value.asInstanceOf[js.Any])
    
    inline def setEnableStreamingEngineNull: Self = StObject.set(x, "enableStreamingEngine", null)
    
    inline def setEnableStreamingEngineUndefined: Self = StObject.set(x, "enableStreamingEngine", js.undefined)
    
    inline def setIpConfiguration(value: String): Self = StObject.set(x, "ipConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIpConfigurationNull: Self = StObject.set(x, "ipConfiguration", null)
    
    inline def setIpConfigurationUndefined: Self = StObject.set(x, "ipConfiguration", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersNull: Self = StObject.set(x, "maxWorkers", null)
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumWorkersNull: Self = StObject.set(x, "numWorkers", null)
    
    inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailNull: Self = StObject.set(x, "serviceAccountEmail", null)
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTempLocation(value: String): Self = StObject.set(x, "tempLocation", value.asInstanceOf[js.Any])
    
    inline def setTempLocationNull: Self = StObject.set(x, "tempLocation", null)
    
    inline def setTempLocationUndefined: Self = StObject.set(x, "tempLocation", js.undefined)
    
    inline def setWorkerRegion(value: String): Self = StObject.set(x, "workerRegion", value.asInstanceOf[js.Any])
    
    inline def setWorkerRegionNull: Self = StObject.set(x, "workerRegion", null)
    
    inline def setWorkerRegionUndefined: Self = StObject.set(x, "workerRegion", js.undefined)
    
    inline def setWorkerZone(value: String): Self = StObject.set(x, "workerZone", value.asInstanceOf[js.Any])
    
    inline def setWorkerZoneNull: Self = StObject.set(x, "workerZone", null)
    
    inline def setWorkerZoneUndefined: Self = StObject.set(x, "workerZone", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
