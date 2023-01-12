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

trait X509CertificateParamsUnsigned
  extends StObject
     with CertificateTBSParams
     with X509CertificateParams {
  
  var cakey: String | RSAKey | DSA | ECDSA
  
  @JSName("sigalg")
  var sigalg_X509CertificateParamsUnsigned: String
}
object X509CertificateParamsUnsigned {
  
  inline def apply(
    cakey: String | RSAKey | DSA | ECDSA,
    ext: js.Array[Dictx],
    issuer: ArrayIdentityArray | Str | StrString,
    notafter: String,
    notbefore: String,
    sbjpubkey: RSAKey | ECCPrivateKey | ECDSA | DSA | JsonWebKey | E | String,
    serial: Hex | IntNumber | Bigint | Double,
    sigalg: String,
    subject: ArrayIdentityArray | Str | StrString
  ): X509CertificateParamsUnsigned = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], notbefore = notbefore.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CertificateParamsUnsigned]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509CertificateParamsUnsigned] (val x: Self) extends AnyVal {
    
    inline def setCakey(value: String | RSAKey | DSA | ECDSA): Self = StObject.set(x, "cakey", value.asInstanceOf[js.Any])
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
  }
}
