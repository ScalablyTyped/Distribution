package typings.ionic.definitionsMod

import typings.ionicUtilsNetwork.mod.NetworkInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeDetails extends StObject {
  
  var custom: Boolean
  
  var externalAddress: String
  
  var externalNetworkInterfaces: js.Array[NetworkInterface]
  
  var externallyAccessible: Boolean
  
  var localAddress: String
  
  var port: Double
  
  var protocol: String
}
object ServeDetails {
  
  inline def apply(
    custom: Boolean,
    externalAddress: String,
    externalNetworkInterfaces: js.Array[NetworkInterface],
    externallyAccessible: Boolean,
    localAddress: String,
    port: Double,
    protocol: String
  ): ServeDetails = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], externalAddress = externalAddress.asInstanceOf[js.Any], externalNetworkInterfaces = externalNetworkInterfaces.asInstanceOf[js.Any], externallyAccessible = externallyAccessible.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServeDetails] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setExternalAddress(value: String): Self = StObject.set(x, "externalAddress", value.asInstanceOf[js.Any])
    
    inline def setExternalNetworkInterfaces(value: js.Array[NetworkInterface]): Self = StObject.set(x, "externalNetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setExternalNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "externalNetworkInterfaces", js.Array(value*))
    
    inline def setExternallyAccessible(value: Boolean): Self = StObject.set(x, "externallyAccessible", value.asInstanceOf[js.Any])
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
