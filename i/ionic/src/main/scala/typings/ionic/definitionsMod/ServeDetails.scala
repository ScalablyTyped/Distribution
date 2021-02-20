package typings.ionic.definitionsMod

import typings.ionicUtilsNetwork.mod.NetworkInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServeDetails extends StObject {
  
  var custom: Boolean = js.native
  
  var externalAddress: String = js.native
  
  var externalNetworkInterfaces: js.Array[NetworkInterface] = js.native
  
  var externallyAccessible: Boolean = js.native
  
  var localAddress: String = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
}
object ServeDetails {
  
  @scala.inline
  def apply(
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
  implicit class ServeDetailsMutableBuilder[Self <: ServeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAddress(value: String): Self = StObject.set(x, "externalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalNetworkInterfaces(value: js.Array[NetworkInterface]): Self = StObject.set(x, "externalNetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "externalNetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setExternallyAccessible(value: Boolean): Self = StObject.set(x, "externallyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
