package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningKey extends js.Object {
  
  /** key_id is an identifier for the signing key. */
  var keyId: js.UndefOr[String] = js.native
  
  /** This field contains the corresponding signature scheme. Eg: "rsassa-pss-sha256". */
  var keyScheme: js.UndefOr[String] = js.native
  
  /** This field identifies the specific signing method. Eg: "rsa", "ed25519", and "ecdsa". */
  var keyType: js.UndefOr[String] = js.native
  
  /** This field contains the actual public key. */
  var publicKeyValue: js.UndefOr[String] = js.native
}
object SigningKey {
  
  @scala.inline
  def apply(): SigningKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningKey]
  }
  
  @scala.inline
  implicit class SigningKeyOps[Self <: SigningKey] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    
    @scala.inline
    def setKeyScheme(value: String): Self = this.set("keyScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyScheme: Self = this.set("keyScheme", js.undefined)
    
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    
    @scala.inline
    def setPublicKeyValue(value: String): Self = this.set("publicKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyValue: Self = this.set("publicKeyValue", js.undefined)
  }
}
