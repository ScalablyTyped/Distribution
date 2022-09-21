package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVirtualMachine extends StObject {
  
  /**
    * The list of accelerators to attach to the VM.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAccelerator]] = js.undefined
  
  /**
    * The size of the boot disk, in GB. The boot disk must be large enough to accommodate all of the Docker images from each action in the pipeline at the same time. If not specified, a small but reasonable default value is used.
    */
  var bootDiskSizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The host operating system image to use. Currently, only Container-Optimized OS images can be used. The default value is `projects/cos-cloud/global/images/family/cos-stable`, which selects the latest stable release of Container-Optimized OS. This option is provided to allow testing against the beta release of the operating system to ensure that the new version does not interact negatively with production pipelines. To test a pipeline against the beta release of Container-Optimized OS, use the value `projects/cos-cloud/global/images/family/cos-beta`.
    */
  var bootImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The CPU platform to request. An instance based on a newer platform can be allocated, but never one with fewer capabilities. The value of this parameter must be a valid Compute Engine CPU platform name (such as "Intel Skylake"). This parameter is only useful for carefully optimized work loads where the CPU platform has a significant impact. For more information about the effect of this parameter, see https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform.
    */
  var cpuPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of disks to create and attach to the VM. Specify either the `volumes[]` field or the `disks[]` field, but not both.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.undefined
  
  /**
    * The Compute Engine Disk Images to use as a Docker cache. The disks will be mounted into the Docker folder in a way that the images present in the cache will not need to be pulled. The digests of the cached images must match those of the tags used or the latest version will still be pulled. The root directory of the ext4 image must contain `image` and `overlay2` directories copied from the Docker directory of a VM where the desired Docker images have already been pulled. Any images pulled that are not cached will be stored on the first cache disk instead of the boot disk. Only a single image is supported.
    */
  var dockerCacheImages: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether Stackdriver monitoring should be enabled on the VM.
    */
  var enableStackdriverMonitoring: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional set of labels to apply to the VM and any attached disk resources. These labels must adhere to the [name and value restrictions](https://cloud.google.com/compute/docs/labeling-resources) on VM labels imposed by Compute Engine. Labels keys with the prefix 'google-' are reserved for use by Google. Labels applied at creation time to the VM. Applied on a best-effort basis to attached disk resources shortly after VM creation.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The machine type of the virtual machine to create. Must be the short name of a standard machine type (such as "n1-standard-1") or a custom machine type (such as "custom-1-4096", where "1" indicates the number of vCPUs and "4096" indicates the memory in MB). See [Creating an instance with a custom machine type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) for more specifications on creating a custom machine type.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VM network configuration.
    */
  var network: js.UndefOr[SchemaNetwork] = js.undefined
  
  /**
    * The NVIDIA driver version to use when attaching an NVIDIA GPU accelerator. The version specified here must be compatible with the GPU libraries contained in the container being executed, and must be one of the drivers hosted in the `nvidia-drivers-us-public` bucket on Google Cloud Storage.
    */
  var nvidiaDriverVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, allocate a preemptible VM.
    */
  var preemptible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If specified, the VM will only be allocated inside the matching reservation. It will fail if the VM parameters don't match the reservation.
    */
  var reservation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The service account to install on the VM. This account does not need any permissions other than those required by the pipeline.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.undefined
  
  /**
    * The list of disks and other storage to create or attach to the VM. Specify either the `volumes[]` field or the `disks[]` field, but not both.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
}
object SchemaVirtualMachine {
  
  inline def apply(): SchemaVirtualMachine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVirtualMachine]
  }
  
  extension [Self <: SchemaVirtualMachine](x: Self) {
    
    inline def setAccelerators(value: js.Array[SchemaAccelerator]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: SchemaAccelerator*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setBootDiskSizeGbNull: Self = StObject.set(x, "bootDiskSizeGb", null)
    
    inline def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    inline def setBootImage(value: String): Self = StObject.set(x, "bootImage", value.asInstanceOf[js.Any])
    
    inline def setBootImageNull: Self = StObject.set(x, "bootImage", null)
    
    inline def setBootImageUndefined: Self = StObject.set(x, "bootImage", js.undefined)
    
    inline def setCpuPlatform(value: String): Self = StObject.set(x, "cpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setCpuPlatformNull: Self = StObject.set(x, "cpuPlatform", null)
    
    inline def setCpuPlatformUndefined: Self = StObject.set(x, "cpuPlatform", js.undefined)
    
    inline def setDisks(value: js.Array[SchemaDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setDockerCacheImages(value: js.Array[String]): Self = StObject.set(x, "dockerCacheImages", value.asInstanceOf[js.Any])
    
    inline def setDockerCacheImagesNull: Self = StObject.set(x, "dockerCacheImages", null)
    
    inline def setDockerCacheImagesUndefined: Self = StObject.set(x, "dockerCacheImages", js.undefined)
    
    inline def setDockerCacheImagesVarargs(value: String*): Self = StObject.set(x, "dockerCacheImages", js.Array(value*))
    
    inline def setEnableStackdriverMonitoring(value: Boolean): Self = StObject.set(x, "enableStackdriverMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnableStackdriverMonitoringNull: Self = StObject.set(x, "enableStackdriverMonitoring", null)
    
    inline def setEnableStackdriverMonitoringUndefined: Self = StObject.set(x, "enableStackdriverMonitoring", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setNetwork(value: SchemaNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNvidiaDriverVersion(value: String): Self = StObject.set(x, "nvidiaDriverVersion", value.asInstanceOf[js.Any])
    
    inline def setNvidiaDriverVersionNull: Self = StObject.set(x, "nvidiaDriverVersion", null)
    
    inline def setNvidiaDriverVersionUndefined: Self = StObject.set(x, "nvidiaDriverVersion", js.undefined)
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleNull: Self = StObject.set(x, "preemptible", null)
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setReservation(value: String): Self = StObject.set(x, "reservation", value.asInstanceOf[js.Any])
    
    inline def setReservationNull: Self = StObject.set(x, "reservation", null)
    
    inline def setReservationUndefined: Self = StObject.set(x, "reservation", js.undefined)
    
    inline def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaVolume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaVolume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
