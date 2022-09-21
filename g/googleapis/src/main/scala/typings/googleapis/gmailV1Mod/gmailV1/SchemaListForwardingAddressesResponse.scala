package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListForwardingAddressesResponse extends StObject {
  
  /**
    * List of addresses that may be used for forwarding.
    */
  var forwardingAddresses: js.UndefOr[js.Array[SchemaForwardingAddress]] = js.undefined
}
object SchemaListForwardingAddressesResponse {
  
  inline def apply(): SchemaListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListForwardingAddressesResponse]
  }
  
  extension [Self <: SchemaListForwardingAddressesResponse](x: Self) {
    
    inline def setForwardingAddresses(value: js.Array[SchemaForwardingAddress]): Self = StObject.set(x, "forwardingAddresses", value.asInstanceOf[js.Any])
    
    inline def setForwardingAddressesUndefined: Self = StObject.set(x, "forwardingAddresses", js.undefined)
    
    inline def setForwardingAddressesVarargs(value: SchemaForwardingAddress*): Self = StObject.set(x, "forwardingAddresses", js.Array(value*))
  }
}
