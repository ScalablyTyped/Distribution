package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddressesScopedList extends StObject {
  
  /**
    * [Output Only] A list of addresses contained in this scope.
    */
  var addresses: js.UndefOr[js.Array[SchemaAddress]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of addresses when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaAddressesScopedList {
  
  inline def apply(): SchemaAddressesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddressesScopedList]
  }
  
  extension [Self <: SchemaAddressesScopedList](x: Self) {
    
    inline def setAddresses(value: js.Array[SchemaAddress]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: SchemaAddress*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
