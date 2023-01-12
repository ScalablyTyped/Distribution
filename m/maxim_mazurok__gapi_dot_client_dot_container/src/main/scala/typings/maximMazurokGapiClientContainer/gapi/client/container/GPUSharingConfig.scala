package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUSharingConfig extends StObject {
  
  /** The type of GPU sharing strategy to enable on the GPU node. */
  var gpuSharingStrategy: js.UndefOr[String] = js.undefined
  
  /** The max number of containers that can share a physical GPU. */
  var maxSharedClientsPerGpu: js.UndefOr[String] = js.undefined
}
object GPUSharingConfig {
  
  inline def apply(): GPUSharingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUSharingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUSharingConfig] (val x: Self) extends AnyVal {
    
    inline def setGpuSharingStrategy(value: String): Self = StObject.set(x, "gpuSharingStrategy", value.asInstanceOf[js.Any])
    
    inline def setGpuSharingStrategyUndefined: Self = StObject.set(x, "gpuSharingStrategy", js.undefined)
    
    inline def setMaxSharedClientsPerGpu(value: String): Self = StObject.set(x, "maxSharedClientsPerGpu", value.asInstanceOf[js.Any])
    
    inline def setMaxSharedClientsPerGpuUndefined: Self = StObject.set(x, "maxSharedClientsPerGpu", js.undefined)
  }
}
