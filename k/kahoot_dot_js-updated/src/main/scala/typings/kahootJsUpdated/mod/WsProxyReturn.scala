package typings.kahootJsUpdated.mod

import typings.ws.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returned by wsproxy on KahootOptions */
trait WsProxyReturn extends StObject {
  
  var address: String
  
  var options: js.UndefOr[ClientOptions] = js.undefined
  
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
}
object WsProxyReturn {
  
  inline def apply(address: String): WsProxyReturn = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[WsProxyReturn]
  }
  
  extension [Self <: WsProxyReturn](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ClientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
  }
}
