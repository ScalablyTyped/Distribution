package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PkixPublicKey extends StObject {
  
  /** A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13 */
  var publicKeyPem: js.UndefOr[String] = js.undefined
  
  /**
    * The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in
    * `public_key_pem` (i.e. this algorithm must match that of the public key).
    */
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
}
object PkixPublicKey {
  
  inline def apply(): PkixPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PkixPublicKey]
  }
  
  extension [Self <: PkixPublicKey](x: Self) {
    
    inline def setPublicKeyPem(value: String): Self = StObject.set(x, "publicKeyPem", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyPemUndefined: Self = StObject.set(x, "publicKeyPem", js.undefined)
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
  }
}
