package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureInfo extends StObject {
  
  /** The resource name of the customer CryptoKeyVersion used for signing. */
  var customerKmsKeyVersion: js.UndefOr[String] = js.undefined
  
  /** The public key for the Google default signing, encoded in PEM format. The signature was created using a private key which may be verified using this public key. */
  var googlePublicKeyPem: js.UndefOr[String] = js.undefined
  
  /** The digital signature. */
  var signature: js.UndefOr[String] = js.undefined
}
object SignatureInfo {
  
  inline def apply(): SignatureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureInfo]
  }
  
  extension [Self <: SignatureInfo](x: Self) {
    
    inline def setCustomerKmsKeyVersion(value: String): Self = StObject.set(x, "customerKmsKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomerKmsKeyVersionUndefined: Self = StObject.set(x, "customerKmsKeyVersion", js.undefined)
    
    inline def setGooglePublicKeyPem(value: String): Self = StObject.set(x, "googlePublicKeyPem", value.asInstanceOf[js.Any])
    
    inline def setGooglePublicKeyPemUndefined: Self = StObject.set(x, "googlePublicKeyPem", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
