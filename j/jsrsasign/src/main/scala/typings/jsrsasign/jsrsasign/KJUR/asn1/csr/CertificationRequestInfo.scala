package typings.jsrsasign.jsrsasign.KJUR.asn1.csr

import typings.jsrsasign.anon.AccessLocation
import typings.jsrsasign.anon.Ca
import typings.jsrsasign.anon.E
import typings.jsrsasign.anon.Kid
import typings.jsrsasign.anon.Name
import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.BinParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 CertificationRequestInfo structure class
  * @param params associative array of parameters (ex. {})
  * @description
  * ```
  * // -- DEFINITION OF ASN.1 SYNTAX --
  * // CertificationRequestInfo ::= SEQUENCE {
  * //   version       INTEGER { v1(0) } (v1,...),
  * //   subject       Name,
  * //   subjectPKInfo SubjectPublicKeyInfo{{ PKInfoAlgorithms }},
  * //   attributes    [0] Attributes{{ CRIAttributes }} }
  * ```
  *
  * @example
  * csri = new KJUR.asn1.csr.CertificationRequestInfo();
  * csri.setSubjectByParam({'str': '/C=US/O=Test/CN=example.com'});
  * csri.setSubjectPublicKeyByGetKey(pubKeyObj);
  */
@js.native
trait CertificationRequestInfo extends ASN1Object {
  
  def _initialize(): Unit = js.native
  
  /**
    * append X.509v3 extension to this object by name and parameters
    * @param name name of X.509v3 Extension object
    * @param extParams parameters as argument of Extension constructor.
    * @see KJUR.asn1.x509.Extension
    * @example
    * var o = new KJUR.asn1.csr.CertificationRequestInfo();
    * o.appendExtensionByName('BasicConstraints', {'cA':true, 'critical': true});
    * o.appendExtensionByName('KeyUsage', {'bin':'11'});
    * o.appendExtensionByName('CRLDistributionPoints', {uri: 'http://aaa.com/a.crl'});
    * o.appendExtensionByName('ExtKeyUsage', {array: [{name: 'clientAuth'}]});
    * o.appendExtensionByName('AuthorityKeyIdentifier', {kid: '1234ab..'});
    * o.appendExtensionByName('AuthorityInfoAccess', {array: [{accessMethod:{oid:...},accessLocation:{uri:...}}]});
    */
  def appendExtensionByName(name: String, extParams: Ca): Unit = js.native
  def appendExtensionByName(name: String, extParams: Kid): Unit = js.native
  def appendExtensionByName(name: String, extParams: ArrayParam[AccessLocation | Name]): Unit = js.native
  def appendExtensionByName(name: String, extParams: BinParam): Unit = js.native
  def appendExtensionByName(name: String, extParams: UriParam): Unit = js.native
  
  /**
    * set subject name field by parameter
    * @param x500NameParam X500Name parameter
    * @description
    * @example
    * csri.setSubjectByParam({'str': '/C=US/CN=b'});
    * @see KJUR.asn1.x509.X500Name
    */
  def setSubjectByParam(x500NameParam: StringParam): Unit = js.native
  
  def setSubjectPublicKeyByGetKey(keyParam: String): Unit = js.native
  def setSubjectPublicKeyByGetKey(keyParam: E): Unit = js.native
  def setSubjectPublicKeyByGetKey(keyParam: DSA): Unit = js.native
  def setSubjectPublicKeyByGetKey(keyParam: ECDSA): Unit = js.native
  def setSubjectPublicKeyByGetKey(keyParam: JsonWebKey): Unit = js.native
  /**
    * set subject public key info by RSA/ECDSA/DSA key parameter
    * @param keyParam public key parameter which passed to `KEYUTIL.getKey` argument
    * @example
    * csri.setSubjectPublicKeyByGetKeyParam(certPEMString); // or
    * csri.setSubjectPublicKeyByGetKeyParam(pkcs8PublicKeyPEMString); // or
    * csir.setSubjectPublicKeyByGetKeyParam(kjurCryptoECDSAKeyObject); // et.al.
    * @see KJUR.asn1.x509.SubjectPublicKeyInfo
    * @see KEYUTIL.getKey
    */
  def setSubjectPublicKeyByGetKey(keyParam: RSAKey): Unit = js.native
}
