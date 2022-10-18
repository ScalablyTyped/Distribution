package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerPool extends StObject {
  
  /** Settings for autoscaling of this WorkerPool. */
  var autoscalingSettings: js.UndefOr[AutoscalingSettings] = js.undefined
  
  /** Data disks that are used by a VM in this workflow. */
  var dataDisks: js.UndefOr[js.Array[Disk]] = js.undefined
  
  /** The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language. */
  var defaultPackageSet: js.UndefOr[String] = js.undefined
  
  /** Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default. */
  var diskSizeGb: js.UndefOr[Double] = js.undefined
  
  /** Fully qualified source image for disks. */
  var diskSourceImage: js.UndefOr[String] = js.undefined
  
  /** Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default. */
  var diskType: js.UndefOr[String] = js.undefined
  
  /** Configuration for VM IPs. */
  var ipConfiguration: js.UndefOr[String] = js.undefined
  
  /** The kind of the worker pool; currently only `harness` and `shuffle` are supported. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Machine type (e.g. "n1-standard-1"). If empty or unspecified, the service will attempt to choose a reasonable default. */
  var machineType: js.UndefOr[String] = js.undefined
  
  /** Metadata to set on the Google Compute Engine VMs. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default". */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for
    * batch, or 1 by convention for streaming).
    */
  var numThreadsPerWorker: js.UndefOr[Double] = js.undefined
  
  /** Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default. */
  var numWorkers: js.UndefOr[Double] = js.undefined
  
  /** The action to take on host maintenance, as defined by the Google Compute Engine API. */
  var onHostMaintenance: js.UndefOr[String] = js.undefined
  
  /** Packages to be installed on workers. */
  var packages: js.UndefOr[js.Array[Package]] = js.undefined
  
  /** Extra arguments for this worker pool. */
  var poolArgs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry.
    * Cross-language pipelines will have two or more entries.
    */
  var sdkHarnessContainerImages: js.UndefOr[js.Array[SdkHarnessContainerImage]] = js.undefined
  
  /** Subnetwork to which VMs will be assigned, if desired. Expected to be of the form "regions/REGION/subnetworks/SUBNETWORK". */
  var subnetwork: js.UndefOr[String] = js.undefined
  
  /** Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field. */
  var taskrunnerSettings: js.UndefOr[TaskRunnerSettings] = js.undefined
  
  /**
    * Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are
    * always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn
    * down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user's project until they are explicitly
    * terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service
    * will attempt to choose a reasonable default.
    */
  var teardownPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use
    * sdk_harness_container_images instead.
    */
  var workerHarnessContainerImage: js.UndefOr[String] = js.undefined
  
  /** Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default. */
  var zone: js.UndefOr[String] = js.undefined
}
object WorkerPool {
  
  inline def apply(): WorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerPool]
  }
  
  extension [Self <: WorkerPool](x: Self) {
    
    inline def setAutoscalingSettings(value: AutoscalingSettings): Self = StObject.set(x, "autoscalingSettings", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingSettingsUndefined: Self = StObject.set(x, "autoscalingSettings", js.undefined)
    
    inline def setDataDisks(value: js.Array[Disk]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    inline def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    inline def setDataDisksVarargs(value: Disk*): Self = StObject.set(x, "dataDisks", js.Array(value*))
    
    inline def setDefaultPackageSet(value: String): Self = StObject.set(x, "defaultPackageSet", value.asInstanceOf[js.Any])
    
    inline def setDefaultPackageSetUndefined: Self = StObject.set(x, "defaultPackageSet", js.undefined)
    
    inline def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskSourceImage(value: String): Self = StObject.set(x, "diskSourceImage", value.asInstanceOf[js.Any])
    
    inline def setDiskSourceImageUndefined: Self = StObject.set(x, "diskSourceImage", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setIpConfiguration(value: String): Self = StObject.set(x, "ipConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIpConfigurationUndefined: Self = StObject.set(x, "ipConfiguration", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNumThreadsPerWorker(value: Double): Self = StObject.set(x, "numThreadsPerWorker", value.asInstanceOf[js.Any])
    
    inline def setNumThreadsPerWorkerUndefined: Self = StObject.set(x, "numThreadsPerWorker", js.undefined)
    
    inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    inline def setOnHostMaintenance(value: String): Self = StObject.set(x, "onHostMaintenance", value.asInstanceOf[js.Any])
    
    inline def setOnHostMaintenanceUndefined: Self = StObject.set(x, "onHostMaintenance", js.undefined)
    
    inline def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setPoolArgs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "poolArgs", value.asInstanceOf[js.Any])
    
    inline def setPoolArgsUndefined: Self = StObject.set(x, "poolArgs", js.undefined)
    
    inline def setSdkHarnessContainerImages(value: js.Array[SdkHarnessContainerImage]): Self = StObject.set(x, "sdkHarnessContainerImages", value.asInstanceOf[js.Any])
    
    inline def setSdkHarnessContainerImagesUndefined: Self = StObject.set(x, "sdkHarnessContainerImages", js.undefined)
    
    inline def setSdkHarnessContainerImagesVarargs(value: SdkHarnessContainerImage*): Self = StObject.set(x, "sdkHarnessContainerImages", js.Array(value*))
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setTaskrunnerSettings(value: TaskRunnerSettings): Self = StObject.set(x, "taskrunnerSettings", value.asInstanceOf[js.Any])
    
    inline def setTaskrunnerSettingsUndefined: Self = StObject.set(x, "taskrunnerSettings", js.undefined)
    
    inline def setTeardownPolicy(value: String): Self = StObject.set(x, "teardownPolicy", value.asInstanceOf[js.Any])
    
    inline def setTeardownPolicyUndefined: Self = StObject.set(x, "teardownPolicy", js.undefined)
    
    inline def setWorkerHarnessContainerImage(value: String): Self = StObject.set(x, "workerHarnessContainerImage", value.asInstanceOf[js.Any])
    
    inline def setWorkerHarnessContainerImageUndefined: Self = StObject.set(x, "workerHarnessContainerImage", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
