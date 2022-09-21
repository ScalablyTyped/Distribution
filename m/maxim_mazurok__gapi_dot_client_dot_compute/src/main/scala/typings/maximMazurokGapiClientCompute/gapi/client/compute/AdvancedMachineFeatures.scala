package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedMachineFeatures extends StObject {
  
  /** Whether to enable nested virtualization or not (default is false). */
  var enableNestedVirtualization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying
    * processor is assumed.
    */
  var threadsPerCore: js.UndefOr[Double] = js.undefined
}
object AdvancedMachineFeatures {
  
  inline def apply(): AdvancedMachineFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedMachineFeatures]
  }
  
  extension [Self <: AdvancedMachineFeatures](x: Self) {
    
    inline def setEnableNestedVirtualization(value: Boolean): Self = StObject.set(x, "enableNestedVirtualization", value.asInstanceOf[js.Any])
    
    inline def setEnableNestedVirtualizationUndefined: Self = StObject.set(x, "enableNestedVirtualization", js.undefined)
    
    inline def setThreadsPerCore(value: Double): Self = StObject.set(x, "threadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "threadsPerCore", js.undefined)
  }
}
