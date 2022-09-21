package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressesScopedList extends StObject {
  
  /** [Output Only] A list of addresses contained in this scope. */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object AddressesScopedList {
  
  inline def apply(): AddressesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressesScopedList]
  }
  
  extension [Self <: AddressesScopedList](x: Self) {
    
    inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
