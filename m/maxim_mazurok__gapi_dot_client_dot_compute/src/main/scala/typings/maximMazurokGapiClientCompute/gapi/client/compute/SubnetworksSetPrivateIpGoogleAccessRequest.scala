package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetworksSetPrivateIpGoogleAccessRequest extends js.Object {
  
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
}
object SubnetworksSetPrivateIpGoogleAccessRequest {
  
  @scala.inline
  def apply(): SubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworksSetPrivateIpGoogleAccessRequest]
  }
  
  @scala.inline
  implicit class SubnetworksSetPrivateIpGoogleAccessRequestOps[Self <: SubnetworksSetPrivateIpGoogleAccessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrivateIpGoogleAccess(value: Boolean): Self = this.set("privateIpGoogleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpGoogleAccess: Self = this.set("privateIpGoogleAccess", js.undefined)
  }
}
