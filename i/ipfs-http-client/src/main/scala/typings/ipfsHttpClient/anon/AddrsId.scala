package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddrsId extends StObject {
  
  var addrs: js.Any
  
  var id: String
}
object AddrsId {
  
  inline def apply(addrs: js.Any, id: String): AddrsId = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddrsId]
  }
  
  extension [Self <: AddrsId](x: Self) {
    
    inline def setAddrs(value: js.Any): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
