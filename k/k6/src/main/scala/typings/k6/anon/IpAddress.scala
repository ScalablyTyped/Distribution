package typings.k6.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpAddress extends StObject {
  
  var ipAddress: String
  
  var port: Double
}
object IpAddress {
  
  inline def apply(ipAddress: String, port: Double): IpAddress = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpAddress] (val x: Self) extends AnyVal {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
