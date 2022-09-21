package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeNodePoolAcceleratorConfig extends StObject {
  
  /**
    * The number of accelerator cards exposed to an instance.
    */
  var acceleratorCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The accelerator type resource namename (see GPUs on Compute Engine).
    */
  var acceleratorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig user guide (https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
    */
  var gpuPartitionSize: js.UndefOr[String | Null] = js.undefined
}
object SchemaGkeNodePoolAcceleratorConfig {
  
  inline def apply(): SchemaGkeNodePoolAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeNodePoolAcceleratorConfig]
  }
  
  extension [Self <: SchemaGkeNodePoolAcceleratorConfig](x: Self) {
    
    inline def setAcceleratorCount(value: String): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorCountNull: Self = StObject.set(x, "acceleratorCount", null)
    
    inline def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    inline def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeNull: Self = StObject.set(x, "acceleratorType", null)
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    inline def setGpuPartitionSize(value: String): Self = StObject.set(x, "gpuPartitionSize", value.asInstanceOf[js.Any])
    
    inline def setGpuPartitionSizeNull: Self = StObject.set(x, "gpuPartitionSize", null)
    
    inline def setGpuPartitionSizeUndefined: Self = StObject.set(x, "gpuPartitionSize", js.undefined)
  }
}
