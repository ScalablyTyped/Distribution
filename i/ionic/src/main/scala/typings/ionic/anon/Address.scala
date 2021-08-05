package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: String
  
  var broadcast: String
}
object Address {
  
  inline def apply(address: String, broadcast: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBroadcast(value: String): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
  }
}
