package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetInstanceAcceleratorRequest extends StObject {
  
  /**
    * Required. Count of cores of this accelerator. Note that not all combinations of `type` and `core_count` are valid. Check [GPUs on Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to find a valid combination. TPUs are not supported.
    */
  var coreCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Type of this accelerator.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSetInstanceAcceleratorRequest {
  
  inline def apply(): SchemaSetInstanceAcceleratorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetInstanceAcceleratorRequest]
  }
  
  extension [Self <: SchemaSetInstanceAcceleratorRequest](x: Self) {
    
    inline def setCoreCount(value: String): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountNull: Self = StObject.set(x, "coreCount", null)
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
