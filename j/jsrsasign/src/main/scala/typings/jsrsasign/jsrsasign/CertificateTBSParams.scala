package typings.jsrsasign.jsrsasign

import typings.jsrsasign.anon.ArrayIdentityArray
import typings.jsrsasign.anon.Bigint
import typings.jsrsasign.anon.Dictx
import typings.jsrsasign.anon.E
import typings.jsrsasign.anon.IntNumber
import typings.jsrsasign.anon.Str
import typings.jsrsasign.anon.StrString
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateTBSParams extends StObject {
  
  // KEYUTIL.getKey pubkey parameter
  var ext: js.Array[Dictx]
  
  // DERInteger parameter
  var issuer: ArrayIdentityArray | Str | StrString
  
  // string, passed to Time
  var notafter: String
  
  var notbefore: String
  
  // X500Name parameter
  var sbjpubkey: RSAKey | ECCPrivateKey | ECDSA | DSA | JsonWebKey | E | String
  
  // this can be omitted, the default is 3.
  var serial: Hex | IntNumber | Bigint | Double
  
  // X500Name parameter
  var sigalg: js.UndefOr[String] = js.undefined
  
  // string, passed to Time
  var subject: ArrayIdentityArray | Str | StrString
  
  var version: js.UndefOr[Double] = js.undefined
}
object CertificateTBSParams {
  
  inline def apply(
    ext: js.Array[Dictx],
    issuer: ArrayIdentityArray | Str | StrString,
    notafter: String,
    notbefore: String,
    sbjpubkey: RSAKey | ECCPrivateKey | ECDSA | DSA | JsonWebKey | E | String,
    serial: Hex | IntNumber | Bigint | Double,
    subject: ArrayIdentityArray | Str | StrString
  ): CertificateTBSParams = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], notbefore = notbefore.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateTBSParams]
  }
  
  extension [Self <: CertificateTBSParams](x: Self) {
    
    inline def setExt(value: js.Array[Dictx]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtVarargs(value: Dictx*): Self = StObject.set(x, "ext", js.Array(value*))
    
    inline def setIssuer(value: ArrayIdentityArray | Str | StrString): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setNotafter(value: String): Self = StObject.set(x, "notafter", value.asInstanceOf[js.Any])
    
    inline def setNotbefore(value: String): Self = StObject.set(x, "notbefore", value.asInstanceOf[js.Any])
    
    inline def setSbjpubkey(value: RSAKey | ECCPrivateKey | ECDSA | DSA | JsonWebKey | E | String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: Hex | IntNumber | Bigint | Double): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    inline def setSigalgUndefined: Self = StObject.set(x, "sigalg", js.undefined)
    
    inline def setSubject(value: ArrayIdentityArray | Str | StrString): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
