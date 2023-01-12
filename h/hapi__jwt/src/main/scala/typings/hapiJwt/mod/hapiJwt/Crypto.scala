package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Crypto definitions
trait Crypto extends StObject {
  
  /**
    * Function to convert RSA public key to PEM format.
    *
    * @param modulusB64 string that represents the modulus (product of two large primes) in base64.
    * @param exponentB64 string that represents the encryption exponent in base64.
    */
  def rsaPublicKeyToPEM(modulusB64: String, exponentB64: String): String
}
object Crypto {
  
  inline def apply(rsaPublicKeyToPEM: (String, String) => String): Crypto = {
    val __obj = js.Dynamic.literal(rsaPublicKeyToPEM = js.Any.fromFunction2(rsaPublicKeyToPEM))
    __obj.asInstanceOf[Crypto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Crypto] (val x: Self) extends AnyVal {
    
    inline def setRsaPublicKeyToPEM(value: (String, String) => String): Self = StObject.set(x, "rsaPublicKeyToPEM", js.Any.fromFunction2(value))
  }
}
