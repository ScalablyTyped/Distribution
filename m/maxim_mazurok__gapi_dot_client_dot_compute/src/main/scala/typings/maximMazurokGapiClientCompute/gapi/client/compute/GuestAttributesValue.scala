package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuestAttributesValue extends StObject {
  
  var items: js.UndefOr[js.Array[GuestAttributesEntry]] = js.undefined
}
object GuestAttributesValue {
  
  inline def apply(): GuestAttributesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestAttributesValue]
  }
  
  extension [Self <: GuestAttributesValue](x: Self) {
    
    inline def setItems(value: js.Array[GuestAttributesEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GuestAttributesEntry*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
