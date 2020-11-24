package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.anon.E
import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 TBSCertificate structure class
  * @param params associative array of parameters (ex. {})
  * @example
  *  var o = new KJUR.asn1.x509.TBSCertificate();
  *  o.setSerialNumberByParam({'int': 4});
  *  o.setSignatureAlgByParam({'name': 'SHA1withRSA'});
  *  o.setIssuerByParam({'str': '/C=US/O=a'});
  *  o.setNotBeforeByParam({'str': '130504235959Z'});
  *  o.setNotAfterByParam({'str': '140504235959Z'});
  *  o.setSubjectByParam({'str': '/C=US/CN=b'});
  *  o.setSubjectPublicKey(rsaPubKey);
  *  o.appendExtension(new KJUR.asn1.x509.BasicConstraints({'cA':true}));
  *  o.appendExtension(new KJUR.asn1.x509.KeyUsage({'bin':'11'}));
  */
@js.native
trait TBSCertificate extends ASN1Object {
  
  /* private */ def _initialize(): Unit = js.native
  
  /**
    * append X.509v3 extension to this object
    * @param extObj X.509v3 Extension object
    * @example
    * tbsc.appendExtension(new KJUR.asn1.x509.BasicConstraints({'cA':true, 'critical': true}));
    * tbsc.appendExtension(new KJUR.asn1.x509.KeyUsage({'bin':'11'}));
    * @see KJUR.asn1.x509.Extension
    */
  def appendExtension(extObj: Extension): Unit = js.native
  
  /**
    * append X.509v3 extension to this object by name and parameters
    * @param name name of X.509v3 Extension object
    * @param extParams parameters as argument of Extension constructor.
    * @example
    * var o = new KJUR.asn1.x509.TBSCertificate();
    * o.appendExtensionByName('BasicConstraints', {'cA':true, 'critical': true});
    * o.appendExtensionByName('KeyUsage', {'bin':'11'});
    * o.appendExtensionByName('CRLDistributionPoints', {uri: 'http://aaa.com/a.crl'});
    * o.appendExtensionByName('ExtKeyUsage', {array: [{name: 'clientAuth'}]});
    * o.appendExtensionByName('AuthorityKeyIdentifier', {kid: '1234ab..'});
    * o.appendExtensionByName('AuthorityInfoAccess', {array: [{accessMethod:{oid:...},accessLocation:{uri:...}}]});
    * @see KJUR.asn1.x509.Extension
    */
  def appendExtensionByName(name: String, extParams: Extension): Unit = js.native
  
  /**
    * set issuer name field by parameter
    * @param x500NameParam X500Name parameter
    * @example
    * tbsc.setIssuerParam({'str': '/C=US/CN=b'});
    * @see KJUR.asn1.x509.X500Name
    */
  def setIssuerByParam(x500NameParam: StringParam): Unit = js.native
  
  /**
    * set notAfter field by parameter
    * @param timeParam Time parameter
    * @example
    * tbsc.setNotAfterByParam({'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def setNotAfterByParam(timeParam: StringParam): Unit = js.native
  
  /**
    * set notBefore field by parameter
    * @param timeParam Time parameter
    * @example
    * tbsc.setNotBeforeByParam({'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def setNotBeforeByParam(timeParam: StringParam): Unit = js.native
  
  /**
    * set serial number field by parameter
    * @param intParam DERInteger param
    * @example
    * tbsc.setSerialNumberByParam({'int': 3});
    */
  def setSerialNumberByParam(intParam: IntegerParam): Unit = js.native
  
  /**
    * set signature algorithm field by parameter
    * @param algIdParam AlgorithmIdentifier parameter
    * @example
    * tbsc.setSignatureAlgByParam({'name': 'SHA1withRSA'});
    */
  def setSignatureAlgByParam(algIdParam: NameParam): Unit = js.native
  
  /**
    * set subject name field by parameter
    * @param x500NameParam X500Name parameter
    * @example
    * tbsc.setSubjectParam({'str': '/C=US/CN=b'});
    * @see KJUR.asn1.x509.X500Name
    */
  def setSubjectByParam(x500NameParam: StringParam): Unit = js.native
  
  /**
    * set subject public key info field by key object
    * @param param `KJUR.asn1.x509.SubjectPublicKeyInfo` class constructor parameter
    * @example
    * tbsc.setSubjectPublicKey(keyobj);
    * @see KJUR.asn1.x509.SubjectPublicKeyInfo
    */
  def setSubjectPublicKey(): Unit = js.native
  def setSubjectPublicKey(param: DSA): Unit = js.native
  def setSubjectPublicKey(param: ECDSA): Unit = js.native
  def setSubjectPublicKey(param: RSAKey): Unit = js.native
  
  def setSubjectPublicKeyByGetKey(keyParam: String): Unit = js.native
  def setSubjectPublicKeyByGetKey(keyParam: E): Unit = js.native
  def setSubjectPublicKeyByGetKey(keyParam: DSA): Unit = js.native
  def setSubjectPublicKeyByGetKey(keyParam: ECDSA): Unit = js.native
  def setSubjectPublicKeyByGetKey(keyParam: JsonWebKey): Unit = js.native
  /**
    * set subject public key info by RSA/ECDSA/DSA key parameter
    * @param keyParam public key parameter which passed to `KEYUTIL.getKey` argument
    * @example
    * tbsc.setSubjectPublicKeyByGetKeyParam(certPEMString); // or
    * tbsc.setSubjectPublicKeyByGetKeyParam(pkcs8PublicKeyPEMString); // or
    * tbsc.setSubjectPublicKeyByGetKeyParam(kjurCryptoECDSAKeyObject); // et.al.
    * @see KJUR.asn1.x509.SubjectPublicKeyInfo
    * @see KEYUTIL.getKey
    */
  def setSubjectPublicKeyByGetKey(keyParam: RSAKey): Unit = js.native
}
