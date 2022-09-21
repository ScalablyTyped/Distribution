package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ext extends StObject {
  
  var ext: js.UndefOr[js.Array[SubjectAltName]] = js.undefined
  
  var sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String
  
  var sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String
  
  var sigalg: String
  
  var subject: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer
}
object Ext {
  
  inline def apply(
    sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String,
    sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String,
    sigalg: String,
    subject: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer
  ): Ext = {
    val __obj = js.Dynamic.literal(sbjprvkey = sbjprvkey.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
  
  extension [Self <: Ext](x: Self) {
    
    inline def setExt(value: js.Array[SubjectAltName]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setExtVarargs(value: SubjectAltName*): Self = StObject.set(x, "ext", js.Array(value*))
    
    inline def setSbjprvkey(value: RSAKey | ECDSA | DSA | JsonWebKey | E | String): Self = StObject.set(x, "sbjprvkey", value.asInstanceOf[js.Any])
    
    inline def setSbjpubkey(value: RSAKey | ECDSA | DSA | JsonWebKey | E | String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
