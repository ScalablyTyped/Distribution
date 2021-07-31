package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gateway extends StObject {
  
  var gateway: String
  
  var port: Double
}
object Gateway {
  
  @scala.inline
  def apply(gateway: String, port: Double): Gateway = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gateway]
  }
  
  @scala.inline
  implicit class GatewayMutableBuilder[Self <: Gateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
