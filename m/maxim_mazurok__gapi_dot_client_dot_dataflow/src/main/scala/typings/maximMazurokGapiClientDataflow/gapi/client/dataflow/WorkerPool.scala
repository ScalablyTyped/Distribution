package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerPool extends StObject {
  
  /** Settings for autoscaling of this WorkerPool. */
  var autoscalingSettings: js.UndefOr[AutoscalingSettings] = js.native
  
  /** Data disks that are used by a VM in this workflow. */
  var dataDisks: js.UndefOr[js.Array[Disk]] = js.native
  
  /** The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language. */
  var defaultPackageSet: js.UndefOr[String] = js.native
  
  /** Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default. */
  var diskSizeGb: js.UndefOr[Double] = js.native
  
  /** Fully qualified source image for disks. */
  var diskSourceImage: js.UndefOr[String] = js.native
  
  /** Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default. */
  var diskType: js.UndefOr[String] = js.native
  
  /** Configuration for VM IPs. */
  var ipConfiguration: js.UndefOr[String] = js.native
  
  /** The kind of the worker pool; currently only `harness` and `shuffle` are supported. */
  var kind: js.UndefOr[String] = js.native
  
  /** Machine type (e.g. "n1-standard-1"). If empty or unspecified, the service will attempt to choose a reasonable default. */
  var machineType: js.UndefOr[String] = js.native
  
  /** Metadata to set on the Google Compute Engine VMs. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerPool with TopLevel[js.Any]
  ] = js.native
  
  /** Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default". */
  var network: js.UndefOr[String] = js.native
  
  /**
    * The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for
    * batch, or 1 by convention for streaming).
    */
  var numThreadsPerWorker: js.UndefOr[Double] = js.native
  
  /** Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default. */
  var numWorkers: js.UndefOr[Double] = js.native
  
  /** The action to take on host maintenance, as defined by the Google Compute Engine API. */
  var onHostMaintenance: js.UndefOr[String] = js.native
  
  /** Packages to be installed on workers. */
  var packages: js.UndefOr[js.Array[Package]] = js.native
  
  /** Extra arguments for this worker pool. */
  var poolArgs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerPool with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry.
    * Cross-language pipelines will have two or more entries.
    */
  var sdkHarnessContainerImages: js.UndefOr[js.Array[SdkHarnessContainerImage]] = js.native
  
  /** Subnetwork to which VMs will be assigned, if desired. Expected to be of the form "regions/REGION/subnetworks/SUBNETWORK". */
  var subnetwork: js.UndefOr[String] = js.native
  
  /** Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field. */
  var taskrunnerSettings: js.UndefOr[TaskRunnerSettings] = js.native
  
  /**
    * Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are
    * always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn
    * down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user's project until they are explicitly
    * terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service
    * will attempt to choose a reasonable default.
    */
  var teardownPolicy: js.UndefOr[String] = js.native
  
  /**
    * Required. Docker container image that executes the Cloud Dataflow worker harness, residing in Google Container Registry. Deprecated for the Fn API path. Use
    * sdk_harness_container_images instead.
    */
  var workerHarnessContainerImage: js.UndefOr[String] = js.native
  
  /** Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default. */
  var zone: js.UndefOr[String] = js.native
}
object WorkerPool {
  
  @scala.inline
  def apply(): WorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerPool]
  }
  
  @scala.inline
  implicit class WorkerPoolMutableBuilder[Self <: WorkerPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingSettings(value: AutoscalingSettings): Self = StObject.set(x, "autoscalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingSettingsUndefined: Self = StObject.set(x, "autoscalingSettings", js.undefined)
    
    @scala.inline
    def setDataDisks(value: js.Array[Disk]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    @scala.inline
    def setDataDisksVarargs(value: Disk*): Self = StObject.set(x, "dataDisks", js.Array(value :_*))
    
    @scala.inline
    def setDefaultPackageSet(value: String): Self = StObject.set(x, "defaultPackageSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPackageSetUndefined: Self = StObject.set(x, "defaultPackageSet", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskSourceImage(value: String): Self = StObject.set(x, "diskSourceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSourceImageUndefined: Self = StObject.set(x, "diskSourceImage", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    @scala.inline
    def setIpConfiguration(value: String): Self = StObject.set(x, "ipConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpConfigurationUndefined: Self = StObject.set(x, "ipConfiguration", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerPool with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setNumThreadsPerWorker(value: Double): Self = StObject.set(x, "numThreadsPerWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumThreadsPerWorkerUndefined: Self = StObject.set(x, "numThreadsPerWorker", js.undefined)
    
    @scala.inline
    def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    @scala.inline
    def setOnHostMaintenance(value: String): Self = StObject.set(x, "onHostMaintenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHostMaintenanceUndefined: Self = StObject.set(x, "onHostMaintenance", js.undefined)
    
    @scala.inline
    def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value :_*))
    
    @scala.inline
    def setPoolArgs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerPool with TopLevel[js.Any]
    ): Self = StObject.set(x, "poolArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolArgsUndefined: Self = StObject.set(x, "poolArgs", js.undefined)
    
    @scala.inline
    def setSdkHarnessContainerImages(value: js.Array[SdkHarnessContainerImage]): Self = StObject.set(x, "sdkHarnessContainerImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkHarnessContainerImagesUndefined: Self = StObject.set(x, "sdkHarnessContainerImages", js.undefined)
    
    @scala.inline
    def setSdkHarnessContainerImagesVarargs(value: SdkHarnessContainerImage*): Self = StObject.set(x, "sdkHarnessContainerImages", js.Array(value :_*))
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    @scala.inline
    def setTaskrunnerSettings(value: TaskRunnerSettings): Self = StObject.set(x, "taskrunnerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskrunnerSettingsUndefined: Self = StObject.set(x, "taskrunnerSettings", js.undefined)
    
    @scala.inline
    def setTeardownPolicy(value: String): Self = StObject.set(x, "teardownPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeardownPolicyUndefined: Self = StObject.set(x, "teardownPolicy", js.undefined)
    
    @scala.inline
    def setWorkerHarnessContainerImage(value: String): Self = StObject.set(x, "workerHarnessContainerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerHarnessContainerImageUndefined: Self = StObject.set(x, "workerHarnessContainerImage", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
