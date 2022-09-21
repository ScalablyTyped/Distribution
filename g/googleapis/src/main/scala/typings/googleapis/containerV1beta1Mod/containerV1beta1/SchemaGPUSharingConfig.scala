package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGPUSharingConfig extends StObject {
  
  /**
    * The type of GPU sharing strategy to enable on the GPU node.
    */
  var gpuSharingStrategy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The max number of containers that can share a physical GPU.
    */
  var maxSharedClientsPerGpu: js.UndefOr[String | Null] = js.undefined
}
object SchemaGPUSharingConfig {
  
  inline def apply(): SchemaGPUSharingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGPUSharingConfig]
  }
  
  extension [Self <: SchemaGPUSharingConfig](x: Self) {
    
    inline def setGpuSharingStrategy(value: String): Self = StObject.set(x, "gpuSharingStrategy", value.asInstanceOf[js.Any])
    
    inline def setGpuSharingStrategyNull: Self = StObject.set(x, "gpuSharingStrategy", null)
    
    inline def setGpuSharingStrategyUndefined: Self = StObject.set(x, "gpuSharingStrategy", js.undefined)
    
    inline def setMaxSharedClientsPerGpu(value: String): Self = StObject.set(x, "maxSharedClientsPerGpu", value.asInstanceOf[js.Any])
    
    inline def setMaxSharedClientsPerGpuNull: Self = StObject.set(x, "maxSharedClientsPerGpu", null)
    
    inline def setMaxSharedClientsPerGpuUndefined: Self = StObject.set(x, "maxSharedClientsPerGpu", js.undefined)
  }
}
