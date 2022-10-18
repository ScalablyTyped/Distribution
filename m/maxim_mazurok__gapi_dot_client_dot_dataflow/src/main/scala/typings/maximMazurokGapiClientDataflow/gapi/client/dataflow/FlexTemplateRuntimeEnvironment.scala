package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexTemplateRuntimeEnvironment extends StObject {
  
  /** Additional experiment flags for the job. */
  var additionalExperiments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Additional user labels to be specified for the job. Keys and values must follow the restrictions specified in the [labeling
    * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
    * "1kg", "count": "3" }.
    */
  var additionalUserLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The algorithm to use for autoscaling */
  var autoscalingAlgorithm: js.UndefOr[String] = js.undefined
  
  /** Worker disk size, in gigabytes. */
  var diskSizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, when processing time is spent almost entirely on garbage collection (GC), saves a heap dump before ending the thread or process. If false, ends the thread or process
    * without saving a heap dump. Does not save a heap dump when the Java Virtual Machine (JVM) has an out of memory error during processing. The location of the heap file is either
    * echoed back to the user, or the user is given the opportunity to download the heap file.
    */
  var dumpHeapOnOom: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to enable Streaming Engine for the job. */
  var enableStreamingEngine: js.UndefOr[Boolean] = js.undefined
  
  /** Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs */
  var flexrsGoal: js.UndefOr[String] = js.undefined
  
  /** Configuration for VM IPs. */
  var ipConfiguration: js.UndefOr[String] = js.undefined
  
  /** Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/ */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /** The machine type to use for launching the job. The default is n1-standard-1. */
  var launcherMachineType: js.UndefOr[String] = js.undefined
  
  /** The machine type to use for the job. Defaults to the value from the template if not specified. */
  var machineType: js.UndefOr[String] = js.undefined
  
  /** The maximum number of Google Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000. */
  var maxWorkers: js.UndefOr[Double] = js.undefined
  
  /** Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default". */
  var network: js.UndefOr[String] = js.undefined
  
  /** The initial number of Google Compute Engine instances for the job. */
  var numWorkers: js.UndefOr[Double] = js.undefined
  
  /** Cloud Storage bucket (directory) to upload heap dumps to. Enabling this field implies that `dump_heap_on_oom` is set to true. */
  var saveHeapDumpsToGcsPath: js.UndefOr[String] = js.undefined
  
  /**
    * Docker registry location of container image to use for the 'worker harness. Default is the container for the version of the SDK. Note this field is only valid for portable
    * pipelines.
    */
  var sdkContainerImage: js.UndefOr[String] = js.undefined
  
  /** The email address of the service account to run the job as. */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /** The Cloud Storage path for staging local files. Must be a valid Cloud Storage URL, beginning with `gs://`. */
  var stagingLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form
    * "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a
    * Shared VPC network, you must use the complete URL.
    */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  /** The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`. */
  var tempLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with
    * worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
    */
  var workerRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with
    * worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity. If both `worker_zone` and `zone`
    * are set, `worker_zone` takes precedence.
    */
  var workerZone: js.UndefOr[String] = js.undefined
  
  /**
    * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future,
    * worker_zone will take precedence.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object FlexTemplateRuntimeEnvironment {
  
  inline def apply(): FlexTemplateRuntimeEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexTemplateRuntimeEnvironment]
  }
  
  extension [Self <: FlexTemplateRuntimeEnvironment](x: Self) {
    
    inline def setAdditionalExperiments(value: js.Array[String]): Self = StObject.set(x, "additionalExperiments", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExperimentsUndefined: Self = StObject.set(x, "additionalExperiments", js.undefined)
    
    inline def setAdditionalExperimentsVarargs(value: String*): Self = StObject.set(x, "additionalExperiments", js.Array(value*))
    
    inline def setAdditionalUserLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "additionalUserLabels", value.asInstanceOf[js.Any])
    
    inline def setAdditionalUserLabelsUndefined: Self = StObject.set(x, "additionalUserLabels", js.undefined)
    
    inline def setAutoscalingAlgorithm(value: String): Self = StObject.set(x, "autoscalingAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingAlgorithmUndefined: Self = StObject.set(x, "autoscalingAlgorithm", js.undefined)
    
    inline def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDumpHeapOnOom(value: Boolean): Self = StObject.set(x, "dumpHeapOnOom", value.asInstanceOf[js.Any])
    
    inline def setDumpHeapOnOomUndefined: Self = StObject.set(x, "dumpHeapOnOom", js.undefined)
    
    inline def setEnableStreamingEngine(value: Boolean): Self = StObject.set(x, "enableStreamingEngine", value.asInstanceOf[js.Any])
    
    inline def setEnableStreamingEngineUndefined: Self = StObject.set(x, "enableStreamingEngine", js.undefined)
    
    inline def setFlexrsGoal(value: String): Self = StObject.set(x, "flexrsGoal", value.asInstanceOf[js.Any])
    
    inline def setFlexrsGoalUndefined: Self = StObject.set(x, "flexrsGoal", js.undefined)
    
    inline def setIpConfiguration(value: String): Self = StObject.set(x, "ipConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIpConfigurationUndefined: Self = StObject.set(x, "ipConfiguration", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLauncherMachineType(value: String): Self = StObject.set(x, "launcherMachineType", value.asInstanceOf[js.Any])
    
    inline def setLauncherMachineTypeUndefined: Self = StObject.set(x, "launcherMachineType", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    inline def setSaveHeapDumpsToGcsPath(value: String): Self = StObject.set(x, "saveHeapDumpsToGcsPath", value.asInstanceOf[js.Any])
    
    inline def setSaveHeapDumpsToGcsPathUndefined: Self = StObject.set(x, "saveHeapDumpsToGcsPath", js.undefined)
    
    inline def setSdkContainerImage(value: String): Self = StObject.set(x, "sdkContainerImage", value.asInstanceOf[js.Any])
    
    inline def setSdkContainerImageUndefined: Self = StObject.set(x, "sdkContainerImage", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setStagingLocation(value: String): Self = StObject.set(x, "stagingLocation", value.asInstanceOf[js.Any])
    
    inline def setStagingLocationUndefined: Self = StObject.set(x, "stagingLocation", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTempLocation(value: String): Self = StObject.set(x, "tempLocation", value.asInstanceOf[js.Any])
    
    inline def setTempLocationUndefined: Self = StObject.set(x, "tempLocation", js.undefined)
    
    inline def setWorkerRegion(value: String): Self = StObject.set(x, "workerRegion", value.asInstanceOf[js.Any])
    
    inline def setWorkerRegionUndefined: Self = StObject.set(x, "workerRegion", js.undefined)
    
    inline def setWorkerZone(value: String): Self = StObject.set(x, "workerZone", value.asInstanceOf[js.Any])
    
    inline def setWorkerZoneUndefined: Self = StObject.set(x, "workerZone", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
