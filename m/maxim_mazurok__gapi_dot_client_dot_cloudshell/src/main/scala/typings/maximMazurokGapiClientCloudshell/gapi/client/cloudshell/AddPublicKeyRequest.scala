package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPublicKeyRequest extends js.Object {
  
  /**
    * Key that should be added to the environment. Supported formats are `ssh-dss` (see RFC4253), `ssh-rsa` (see RFC4253), `ecdsa-sha2-nistp256` (see RFC5656), `ecdsa-sha2-nistp384` (see
    * RFC5656) and `ecdsa-sha2-nistp521` (see RFC5656). It should be structured as , where part is encoded with Base64.
    */
  var key: js.UndefOr[String] = js.native
}
object AddPublicKeyRequest {
  
  @scala.inline
  def apply(): AddPublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPublicKeyRequest]
  }
  
  @scala.inline
  implicit class AddPublicKeyRequestOps[Self <: AddPublicKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
