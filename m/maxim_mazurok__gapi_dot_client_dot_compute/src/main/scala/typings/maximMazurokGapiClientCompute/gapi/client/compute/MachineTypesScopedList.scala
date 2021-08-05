package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineTypesScopedList extends StObject {
  
  /** [Output Only] A list of machine types contained in this scope. */
  var machineTypes: js.UndefOr[js.Array[MachineType]] = js.undefined
  
  /** [Output Only] An informational warning that appears when the machine types list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object MachineTypesScopedList {
  
  inline def apply(): MachineTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineTypesScopedList]
  }
  
  extension [Self <: MachineTypesScopedList](x: Self) {
    
    inline def setMachineTypes(value: js.Array[MachineType]): Self = StObject.set(x, "machineTypes", value.asInstanceOf[js.Any])
    
    inline def setMachineTypesUndefined: Self = StObject.set(x, "machineTypes", js.undefined)
    
    inline def setMachineTypesVarargs(value: MachineType*): Self = StObject.set(x, "machineTypes", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
