package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.anon.ArrayIdentityArray
import typings.jsrsasign.anon.Bigint
import typings.jsrsasign.anon.Dictx
import typings.jsrsasign.anon.E
import typings.jsrsasign.anon.IntNumber
import typings.jsrsasign.anon.Str
import typings.jsrsasign.anon.StrString
import typings.jsrsasign.jsrsasign.CertificateTBSParams
import typings.jsrsasign.jsrsasign.ECCPrivateKey
import typings.jsrsasign.jsrsasign.Hex
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateParamsSigned
  extends StObject
     with CertificateTBSParams
     with X509CertificateParams {
  
  var sighex: String
}
object X509CertificateParamsSigned {
  
  inline def apply(
    ext: js.Array[Dictx],
    issuer: ArrayIdentityArray | Str | StrString,
    notafter: String,
    notbefore: String,
    sbjpubkey: RSAKey | ECCPrivateKey | ECDSA | DSA | JsonWebKey | E | String,
    serial: Hex | IntNumber | Bigint | Double,
    sighex: String,
    subject: ArrayIdentityArray | Str | StrString
  ): X509CertificateParamsSigned = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], notbefore = notbefore.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CertificateParamsSigned]
  }
  
  extension [Self <: X509CertificateParamsSigned](x: Self) {
    
    inline def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
  }
}
