package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistryCredential extends js.Object {
  
  /** A public key certificate used to verify the device credentials. */
  var publicKeyCertificate: js.UndefOr[PublicKeyCertificate] = js.native
}
object RegistryCredential {
  
  @scala.inline
  def apply(): RegistryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryCredential]
  }
  
  @scala.inline
  implicit class RegistryCredentialOps[Self <: RegistryCredential] (val x: Self) extends AnyVal {
    
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
    def setPublicKeyCertificate(value: PublicKeyCertificate): Self = this.set("publicKeyCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyCertificate: Self = this.set("publicKeyCertificate", js.undefined)
  }
}
