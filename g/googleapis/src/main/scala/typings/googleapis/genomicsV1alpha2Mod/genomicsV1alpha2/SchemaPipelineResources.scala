package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPipelineResources extends StObject {
  
  /**
    * Optional. The number of accelerators of the specified type to attach. By specifying this parameter, you will download and install the following third-party software onto your managed Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit.
    */
  var acceleratorCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The Compute Engine defined accelerator type. By specifying this parameter, you will download and install the following third-party software onto your managed Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit. Please see https://cloud.google.com/compute/docs/gpus/ for a list of available accelerator types.
    */
  var acceleratorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the boot disk. Defaults to 10 (GB).
    */
  var bootDiskSizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Disks to attach.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.undefined
  
  /**
    * The minimum number of cores to use. Defaults to 1.
    */
  var minimumCpuCores: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum amount of RAM to use. Defaults to 3.75 (GB)
    */
  var minimumRamGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether to assign an external IP to the instance. This is an experimental feature that may go away. Defaults to false. Corresponds to `--no_address` flag for [gcloud compute instances create] (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create). In order to use this, must be true for both create time and run time. Cannot be true at run time if false at create time. If you need to ssh into a private IP VM for debugging, you can ssh to a public VM and then ssh into the private VM's Internal IP. If noAddress is set, this pipeline run may only load docker images from Google Container Registry and not Docker Hub. Before using this, you must [configure access to Google services from internal IPs](https://cloud.google.com/compute/docs/configure-private-google-access#configuring_access_to_google_services_from_internal_ips).
    */
  var noAddress: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to use preemptible VMs. Defaults to `false`. In order to use this, must be true for both create time and run time. Cannot be true at run time if false at create time.
    */
  var preemptible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of Google Compute Engine availability zones to which resource creation will restricted. If empty, any zone may be chosen.
    */
  var zones: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPipelineResources {
  
  inline def apply(): SchemaPipelineResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineResources]
  }
  
  extension [Self <: SchemaPipelineResources](x: Self) {
    
    inline def setAcceleratorCount(value: String): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountNull: Self = StObject.set(x, "acceleratorCount", null)
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    inline def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeNull: Self = StObject.set(x, "acceleratorType", null)
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    inline def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setBootDiskSizeGbNull: Self = StObject.set(x, "bootDiskSizeGb", null)
    
    inline def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    inline def setDisks(value: js.Array[SchemaDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setMinimumCpuCores(value: Double): Self = StObject.set(x, "minimumCpuCores", value.asInstanceOf[js.Any])
    
    inline def setMinimumCpuCoresNull: Self = StObject.set(x, "minimumCpuCores", null)
    
    inline def setMinimumCpuCoresUndefined: Self = StObject.set(x, "minimumCpuCores", js.undefined)
    
    inline def setMinimumRamGb(value: Double): Self = StObject.set(x, "minimumRamGb", value.asInstanceOf[js.Any])
    
    inline def setMinimumRamGbNull: Self = StObject.set(x, "minimumRamGb", null)
    
    inline def setMinimumRamGbUndefined: Self = StObject.set(x, "minimumRamGb", js.undefined)
    
    inline def setNoAddress(value: Boolean): Self = StObject.set(x, "noAddress", value.asInstanceOf[js.Any])
    
    inline def setNoAddressNull: Self = StObject.set(x, "noAddress", null)
    
    inline def setNoAddressUndefined: Self = StObject.set(x, "noAddress", js.undefined)
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleNull: Self = StObject.set(x, "preemptible", null)
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesNull: Self = StObject.set(x, "zones", null)
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
