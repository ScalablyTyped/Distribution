package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetInstanceMachineTypeRequest extends StObject {
  
  /**
    * Required. The [Compute Engine machine type](https://cloud.google.com/compute/docs/machine-types).
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
}
object SchemaSetInstanceMachineTypeRequest {
  
  inline def apply(): SchemaSetInstanceMachineTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetInstanceMachineTypeRequest]
  }
  
  extension [Self <: SchemaSetInstanceMachineTypeRequest](x: Self) {
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
  }
}
