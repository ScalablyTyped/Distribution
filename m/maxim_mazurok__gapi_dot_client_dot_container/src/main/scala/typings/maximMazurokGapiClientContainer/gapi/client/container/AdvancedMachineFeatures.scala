package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedMachineFeatures extends StObject {
  
  /**
    * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying
    * processor is assumed.
    */
  var threadsPerCore: js.UndefOr[String] = js.undefined
}
object AdvancedMachineFeatures {
  
  inline def apply(): AdvancedMachineFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedMachineFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedMachineFeatures] (val x: Self) extends AnyVal {
    
    inline def setThreadsPerCore(value: String): Self = StObject.set(x, "threadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "threadsPerCore", js.undefined)
  }
}
