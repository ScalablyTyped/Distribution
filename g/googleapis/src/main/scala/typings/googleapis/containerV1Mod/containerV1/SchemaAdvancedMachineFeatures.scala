package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvancedMachineFeatures extends StObject {
  
  /**
    * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
    */
  var threadsPerCore: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdvancedMachineFeatures {
  
  inline def apply(): SchemaAdvancedMachineFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvancedMachineFeatures]
  }
  
  extension [Self <: SchemaAdvancedMachineFeatures](x: Self) {
    
    inline def setThreadsPerCore(value: String): Self = StObject.set(x, "threadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreNull: Self = StObject.set(x, "threadsPerCore", null)
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "threadsPerCore", js.undefined)
  }
}
