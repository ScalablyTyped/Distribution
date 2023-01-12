package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorConfig extends StObject {
  
  /** The number of the accelerator cards exposed to an instance. */
  var acceleratorCount: js.UndefOr[String] = js.undefined
  
  /** The accelerator type resource name. List of supported accelerators [here](https://cloud.google.com/compute/docs/gpus) */
  var acceleratorType: js.UndefOr[String] = js.undefined
  
  /** Size of partitions to create on the GPU. Valid values are described in the NVIDIA [mig user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning). */
  var gpuPartitionSize: js.UndefOr[String] = js.undefined
  
  /** The configuration for GPU sharing options. */
  var gpuSharingConfig: js.UndefOr[GPUSharingConfig] = js.undefined
}
object AcceleratorConfig {
  
  inline def apply(): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceleratorConfig] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorCount(value: String): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    inline def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    inline def setGpuPartitionSize(value: String): Self = StObject.set(x, "gpuPartitionSize", value.asInstanceOf[js.Any])
    
    inline def setGpuPartitionSizeUndefined: Self = StObject.set(x, "gpuPartitionSize", js.undefined)
    
    inline def setGpuSharingConfig(value: GPUSharingConfig): Self = StObject.set(x, "gpuSharingConfig", value.asInstanceOf[js.Any])
    
    inline def setGpuSharingConfigUndefined: Self = StObject.set(x, "gpuSharingConfig", js.undefined)
  }
}
