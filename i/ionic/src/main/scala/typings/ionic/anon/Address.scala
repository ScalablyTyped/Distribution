package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: String
  
  var broadcast: String
}
object Address {
  
  @scala.inline
  def apply(address: String, broadcast: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast(value: String): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
  }
}
