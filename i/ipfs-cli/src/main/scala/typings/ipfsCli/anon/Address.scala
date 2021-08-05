package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: js.Any
  
  var ctx: IpfsIsDaemon
  
  var timeout: js.Any
}
object Address {
  
  inline def apply(address: js.Any, ctx: IpfsIsDaemon, timeout: js.Any): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: js.Any): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: IpfsIsDaemon): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
