package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerPool extends js.Object {
  
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
  implicit class WorkerPoolOps[Self <: WorkerPool] (val x: Self) extends AnyVal {
    
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
    def setAutoscalingSettings(value: AutoscalingSettings): Self = this.set("autoscalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalingSettings: Self = this.set("autoscalingSettings", js.undefined)
    
    @scala.inline
    def setDataDisksVarargs(value: Disk*): Self = this.set("dataDisks", js.Array(value :_*))
    
    @scala.inline
    def setDataDisks(value: js.Array[Disk]): Self = this.set("dataDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDisks: Self = this.set("dataDisks", js.undefined)
    
    @scala.inline
    def setDefaultPackageSet(value: String): Self = this.set("defaultPackageSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPackageSet: Self = this.set("defaultPackageSet", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: Double): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskSourceImage(value: String): Self = this.set("diskSourceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSourceImage: Self = this.set("diskSourceImage", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = this.set("diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskType: Self = this.set("diskType", js.undefined)
    
    @scala.inline
    def setIpConfiguration(value: String): Self = this.set("ipConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpConfiguration: Self = this.set("ipConfiguration", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerPool with TopLevel[js.Any]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setNumThreadsPerWorker(value: Double): Self = this.set("numThreadsPerWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumThreadsPerWorker: Self = this.set("numThreadsPerWorker", js.undefined)
    
    @scala.inline
    def setNumWorkers(value: Double): Self = this.set("numWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumWorkers: Self = this.set("numWorkers", js.undefined)
    
    @scala.inline
    def setOnHostMaintenance(value: String): Self = this.set("onHostMaintenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHostMaintenance: Self = this.set("onHostMaintenance", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: Package*): Self = this.set("packages", js.Array(value :_*))
    
    @scala.inline
    def setPackages(value: js.Array[Package]): Self = this.set("packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackages: Self = this.set("packages", js.undefined)
    
    @scala.inline
    def setPoolArgs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerPool with TopLevel[js.Any]
    ): Self = this.set("poolArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolArgs: Self = this.set("poolArgs", js.undefined)
    
    @scala.inline
    def setSdkHarnessContainerImagesVarargs(value: SdkHarnessContainerImage*): Self = this.set("sdkHarnessContainerImages", js.Array(value :_*))
    
    @scala.inline
    def setSdkHarnessContainerImages(value: js.Array[SdkHarnessContainerImage]): Self = this.set("sdkHarnessContainerImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkHarnessContainerImages: Self = this.set("sdkHarnessContainerImages", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
    
    @scala.inline
    def setTaskrunnerSettings(value: TaskRunnerSettings): Self = this.set("taskrunnerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskrunnerSettings: Self = this.set("taskrunnerSettings", js.undefined)
    
    @scala.inline
    def setTeardownPolicy(value: String): Self = this.set("teardownPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeardownPolicy: Self = this.set("teardownPolicy", js.undefined)
    
    @scala.inline
    def setWorkerHarnessContainerImage(value: String): Self = this.set("workerHarnessContainerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerHarnessContainerImage: Self = this.set("workerHarnessContainerImage", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
