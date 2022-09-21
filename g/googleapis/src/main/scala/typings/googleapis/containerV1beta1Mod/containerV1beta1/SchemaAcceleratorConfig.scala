package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcceleratorConfig extends StObject {
  
  /**
    * The number of the accelerator cards exposed to an instance.
    */
  var acceleratorCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The accelerator type resource name. List of supported accelerators [here](https://cloud.google.com/compute/docs/gpus)
    */
  var acceleratorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Size of partitions to create on the GPU. Valid values are described in the NVIDIA [mig user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
    */
  var gpuPartitionSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The configuration for GPU sharing options.
    */
  var gpuSharingConfig: js.UndefOr[SchemaGPUSharingConfig] = js.undefined
  
  /**
    * The number of time-shared GPU resources to expose for each physical GPU.
    */
  var maxTimeSharedClientsPerGpu: js.UndefOr[String | Null] = js.undefined
}
object SchemaAcceleratorConfig {
  
  inline def apply(): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
  
  extension [Self <: SchemaAcceleratorConfig](x: Self) {
    
    inline def setAcceleratorCount(value: String): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountNull: Self = StObject.set(x, "acceleratorCount", null)
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    inline def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeNull: Self = StObject.set(x, "acceleratorType", null)
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    inline def setGpuPartitionSize(value: String): Self = StObject.set(x, "gpuPartitionSize", value.asInstanceOf[js.Any])
    
    inline def setGpuPartitionSizeNull: Self = StObject.set(x, "gpuPartitionSize", null)
    
    inline def setGpuPartitionSizeUndefined: Self = StObject.set(x, "gpuPartitionSize", js.undefined)
    
    inline def setGpuSharingConfig(value: SchemaGPUSharingConfig): Self = StObject.set(x, "gpuSharingConfig", value.asInstanceOf[js.Any])
    
    inline def setGpuSharingConfigUndefined: Self = StObject.set(x, "gpuSharingConfig", js.undefined)
    
    inline def setMaxTimeSharedClientsPerGpu(value: String): Self = StObject.set(x, "maxTimeSharedClientsPerGpu", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeSharedClientsPerGpuNull: Self = StObject.set(x, "maxTimeSharedClientsPerGpu", null)
    
    inline def setMaxTimeSharedClientsPerGpuUndefined: Self = StObject.set(x, "maxTimeSharedClientsPerGpu", js.undefined)
  }
}
