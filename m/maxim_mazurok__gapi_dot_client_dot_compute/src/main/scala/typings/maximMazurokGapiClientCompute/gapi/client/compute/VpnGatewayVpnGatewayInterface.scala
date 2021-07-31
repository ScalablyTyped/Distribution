package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGatewayVpnGatewayInterface extends StObject {
  
  /** The numeric ID of this VPN gateway interface. */
  var id: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] The external IP address for this VPN gateway interface. */
  var ipAddress: js.UndefOr[String] = js.undefined
}
object VpnGatewayVpnGatewayInterface {
  
  @scala.inline
  def apply(): VpnGatewayVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayVpnGatewayInterface]
  }
  
  @scala.inline
  implicit class VpnGatewayVpnGatewayInterfaceMutableBuilder[Self <: VpnGatewayVpnGatewayInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
  }
}
