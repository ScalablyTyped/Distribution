package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashAlg extends StObject {
  
  var hashAlg: String
  
  var sAttr: SignaturePolicyIdentifier
  
  var sigAlg: String
  
  var signerCert: String
  
  var signerPrvKey: String
}
object HashAlg {
  
  inline def apply(
    hashAlg: String,
    sAttr: SignaturePolicyIdentifier,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String
  ): HashAlg = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], sAttr = sAttr.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlg]
  }
  
  extension [Self <: HashAlg](x: Self) {
    
    inline def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setSAttr(value: SignaturePolicyIdentifier): Self = StObject.set(x, "sAttr", value.asInstanceOf[js.Any])
    
    inline def setSigAlg(value: String): Self = StObject.set(x, "sigAlg", value.asInstanceOf[js.Any])
    
    inline def setSignerCert(value: String): Self = StObject.set(x, "signerCert", value.asInstanceOf[js.Any])
    
    inline def setSignerPrvKey(value: String): Self = StObject.set(x, "signerPrvKey", value.asInstanceOf[js.Any])
  }
}
