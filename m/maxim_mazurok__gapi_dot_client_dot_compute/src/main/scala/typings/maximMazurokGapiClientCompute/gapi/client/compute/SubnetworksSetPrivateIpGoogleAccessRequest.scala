package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetworksSetPrivateIpGoogleAccessRequest extends StObject {
  
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
}
object SubnetworksSetPrivateIpGoogleAccessRequest {
  
  @scala.inline
  def apply(): SubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworksSetPrivateIpGoogleAccessRequest]
  }
  
  @scala.inline
  implicit class SubnetworksSetPrivateIpGoogleAccessRequestMutableBuilder[Self <: SubnetworksSetPrivateIpGoogleAccessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateIpGoogleAccess(value: Boolean): Self = StObject.set(x, "privateIpGoogleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpGoogleAccessUndefined: Self = StObject.set(x, "privateIpGoogleAccess", js.undefined)
  }
}
