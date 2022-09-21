package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.anon.ArrayIdentityArray
import typings.jsrsasign.anon.Bigint
import typings.jsrsasign.anon.Dictx
import typings.jsrsasign.anon.E
import typings.jsrsasign.anon.IntNumber
import typings.jsrsasign.anon.Str
import typings.jsrsasign.anon.StrString
import typings.jsrsasign.jsrsasign.ECCPrivateKey
import typings.jsrsasign.jsrsasign.Hex
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateParamsSigned
  - typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateParamsUnsigned
  - typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateTBSParamsSigned
  - typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateTBSParamsUnsigned
*/
trait X509CertificateParams extends StObject
object X509CertificateParams {
  
  inline def X509CertificateParamsSigned(
    ext: js.Array[Dictx],
    issuer: ArrayIdentityArray | Str | StrString,
    notafter: String,
    notbefore: String,
    sbjpubkey: RSAKey | ECCPrivateKey | ECDSA | DSA | JsonWebKey | E | String,
    serial: Hex | IntNumber | Bigint | Double,
    sighex: String,
    subject: ArrayIdentityArray | Str | StrString
  ): typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateParamsSigned = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], notbefore = notbefore.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateParamsSigned]
  }
  
  inline def X509CertificateParamsUnsigned(
    cakey: String | RSAKey | DSA | ECDSA,
    ext: js.Array[Dictx],
    issuer: ArrayIdentityArray | Str | StrString,
    notafter: String,
    notbefore: String,
    sbjpubkey: RSAKey | ECCPrivateKey | ECDSA | DSA | JsonWebKey | E | String,
    serial: Hex | IntNumber | Bigint | Double,
    sigalg: String,
    subject: ArrayIdentityArray | Str | StrString
  ): typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateParamsUnsigned = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], notbefore = notbefore.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateParamsUnsigned]
  }
  
  inline def X509CertificateTBSParamsSigned(sighex: String, tbsobj: TBSCertificate): typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateTBSParamsSigned = {
    val __obj = js.Dynamic.literal(sighex = sighex.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateTBSParamsSigned]
  }
  
  inline def X509CertificateTBSParamsUnsigned(cakey: String | RSAKey | DSA | ECDSA, sigalg: String, tbsobj: TBSCertificate): typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateTBSParamsUnsigned = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateTBSParamsUnsigned]
  }
}
