package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetworksSetPrivateIpGoogleAccessRequest extends StObject {
  
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.undefined
}
object SubnetworksSetPrivateIpGoogleAccessRequest {
  
  inline def apply(): SubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworksSetPrivateIpGoogleAccessRequest]
  }
  
  extension [Self <: SubnetworksSetPrivateIpGoogleAccessRequest](x: Self) {
    
    inline def setPrivateIpGoogleAccess(value: Boolean): Self = StObject.set(x, "privateIpGoogleAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpGoogleAccessUndefined: Self = StObject.set(x, "privateIpGoogleAccess", js.undefined)
  }
}
