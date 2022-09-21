package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnection extends StObject {
  
  /**
    * Destination IP address. Not present for sockets that are listening and not connected.
    */
  var destinationIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Destination port. Not present for sockets that are listening and not connected.
    */
  var destinationPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * IANA Internet Protocol Number such as TCP(6) and UDP(17).
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source IP address.
    */
  var sourceIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source port.
    */
  var sourcePort: js.UndefOr[Double | Null] = js.undefined
}
object SchemaConnection {
  
  inline def apply(): SchemaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnection]
  }
  
  extension [Self <: SchemaConnection](x: Self) {
    
    inline def setDestinationIp(value: String): Self = StObject.set(x, "destinationIp", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpNull: Self = StObject.set(x, "destinationIp", null)
    
    inline def setDestinationIpUndefined: Self = StObject.set(x, "destinationIp", js.undefined)
    
    inline def setDestinationPort(value: Double): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortNull: Self = StObject.set(x, "destinationPort", null)
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpNull: Self = StObject.set(x, "sourceIp", null)
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
    
    inline def setSourcePort(value: Double): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    inline def setSourcePortNull: Self = StObject.set(x, "sourcePort", null)
    
    inline def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
  }
}
