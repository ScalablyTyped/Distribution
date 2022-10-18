package typings.libp2p.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NatManagerConfig extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var enabled: Boolean
  
  var externalAddress: js.UndefOr[String] = js.undefined
  
  var gateway: js.UndefOr[String] = js.undefined
  
  var keepAlive: Boolean
  
  var localAddress: js.UndefOr[String] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object NatManagerConfig {
  
  inline def apply(enabled: Boolean, keepAlive: Boolean): NatManagerConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any])
    __obj.asInstanceOf[NatManagerConfig]
  }
  
  extension [Self <: NatManagerConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExternalAddress(value: String): Self = StObject.set(x, "externalAddress", value.asInstanceOf[js.Any])
    
    inline def setExternalAddressUndefined: Self = StObject.set(x, "externalAddress", js.undefined)
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
