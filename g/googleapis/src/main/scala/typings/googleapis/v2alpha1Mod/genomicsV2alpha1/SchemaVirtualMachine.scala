package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about a Compute Engine VM resource.
  */
trait SchemaVirtualMachine extends StObject {
  
  /**
    * The list of accelerators to attach to the VM.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAccelerator]] = js.undefined
  
  /**
    * The size of the boot disk, in GB. The boot disk must be large enough to
    * accommodate all of the Docker images from each action in the pipeline at
    * the same time. If not specified, a small but reasonable default value is
    * used.
    */
  var bootDiskSizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * The host operating system image to use.  Currently, only
    * Container-Optimized OS images can be used.  The default value is
    * `projects/cos-cloud/global/images/family/cos-stable`, which selects the
    * latest stable release of Container-Optimized OS.  This option is provided
    * to allow testing against the beta release of the operating system to
    * ensure that the new version does not interact negatively with production
    * pipelines.  To test a pipeline against the beta release of
    * Container-Optimized OS, use the value
    * `projects/cos-cloud/global/images/family/cos-beta`.
    */
  var bootImage: js.UndefOr[String] = js.undefined
  
  /**
    * The CPU platform to request. An instance based on a newer platform can be
    * allocated, but never one with fewer capabilities. The value of this
    * parameter must be a valid Compute Engine CPU platform name (such as
    * &quot;Intel Skylake&quot;). This parameter is only useful for carefully
    * optimized work loads where the CPU platform has a significant impact. For
    * more information about the effect of this parameter, see
    * https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform.
    */
  var cpuPlatform: js.UndefOr[String] = js.undefined
  
  /**
    * The list of disks to create and attach to the VM.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.undefined
  
  /**
    * Optional set of labels to apply to the VM and any attached disk
    * resources. These labels must adhere to the name and value restrictions on
    * VM labels imposed by Compute Engine.  Labels applied at creation time to
    * the VM. Applied on a best-effort basis to attached disk resources shortly
    * after VM creation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The machine type of the virtual machine to create. Must be the short name
    * of a standard machine type (such as &quot;n1-standard-1&quot;) or a
    * custom machine type (such as &quot;custom-1-4096&quot;, where
    * &quot;1&quot; indicates the number of vCPUs and &quot;4096&quot;
    * indicates the memory in MB). See [Creating an instance with a custom
    * machine
    * type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create)
    * for more specifications on creating a custom machine type.
    */
  var machineType: js.UndefOr[String] = js.undefined
  
  /**
    * The VM network configuration.
    */
  var network: js.UndefOr[SchemaNetwork] = js.undefined
  
  /**
    * The NVIDIA driver version to use when attaching an NVIDIA GPU
    * accelerator. The version specified here must be compatible with the GPU
    * libraries contained in the container being executed, and must be one of
    * the drivers hosted in the `nvidia-drivers-us-public` bucket on Google
    * Cloud Storage.
    */
  var nvidiaDriverVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If true, allocate a preemptible VM.
    */
  var preemptible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The service account to install on the VM. This account does not need any
    * permissions other than those required by the pipeline.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.undefined
}
object SchemaVirtualMachine {
  
  inline def apply(): SchemaVirtualMachine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVirtualMachine]
  }
  
  extension [Self <: SchemaVirtualMachine](x: Self) {
    
    inline def setAccelerators(value: js.Array[SchemaAccelerator]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: SchemaAccelerator*): Self = StObject.set(x, "accelerators", js.Array(value :_*))
    
    inline def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    inline def setBootImage(value: String): Self = StObject.set(x, "bootImage", value.asInstanceOf[js.Any])
    
    inline def setBootImageUndefined: Self = StObject.set(x, "bootImage", js.undefined)
    
    inline def setCpuPlatform(value: String): Self = StObject.set(x, "cpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setCpuPlatformUndefined: Self = StObject.set(x, "cpuPlatform", js.undefined)
    
    inline def setDisks(value: js.Array[SchemaDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaDisk*): Self = StObject.set(x, "disks", js.Array(value :_*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setNetwork(value: SchemaNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNvidiaDriverVersion(value: String): Self = StObject.set(x, "nvidiaDriverVersion", value.asInstanceOf[js.Any])
    
    inline def setNvidiaDriverVersionUndefined: Self = StObject.set(x, "nvidiaDriverVersion", js.undefined)
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
