package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningKey extends StObject {
  
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
  implicit class SigningKeyMutableBuilder[Self <: SigningKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setKeyScheme(value: String): Self = StObject.set(x, "keyScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySchemeUndefined: Self = StObject.set(x, "keyScheme", js.undefined)
    
    @scala.inline
    def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    @scala.inline
    def setPublicKeyValue(value: String): Self = StObject.set(x, "publicKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyValueUndefined: Self = StObject.set(x, "publicKeyValue", js.undefined)
  }
}
