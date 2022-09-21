package typings.jsrsasign.jsrsasign

import typings.jsrsasign.anon.Nextupdate
import typings.jsrsasign.anon.Revcert
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X509CRL extends StObject {
  
  /*
    * set field position of SignatureAlgorithm and revokedCertificates<br/>
    * @description
    * This method will set "posSigAlg" and "posRevCert" properties.
    */
  def _setPos(): Unit = js.native
  
  /**
    * get revokedCertificate associative array for checking certificate<br/>
    * name findRevCert
    * memberOf X509CRL#
    *
    * @param PEM or hexadecimal string of certificate to be revocation-checked
    * @return Object JSON object for revokedCertificate or null
    * @see X509CRL#getParam
    * @see X509CRL#findRevCertBySN
    * @since jsrsasign 10.5.5 x509crl 1.0.3
    *
    * @description
    * This method will find revokedCertificate entry as JSON object
    * for a specified certificate. <br/>
    * When the serial number is not found in the entry, this returns null.<br/>
    * Before finding, {@link X509CRL#getParam} is called internally
    * to parse CRL.<br/>
    * NOTE: This method will just find an entry for a serial number.
    * You need to check whether CRL is proper one or not
    * for checking certificate such as signature validation or
    * name checking.
    *
    * @example
    * crl = new X509CRL(PEMCRL);
    *
    * crl.findRevCert(PEMCERT-REVOKED) &rarr;
    * {sn:"123a", date:"208025235959Z", ext: [{extname:"cRLReason",code:3}]}
    *
    * crl.findRevCert(PEMCERT-NOTREVOKED) &rarr; null
    *
    * crl.findRevCert(CERT-HEX) &rarr; null or {sn:...}
    */
  def findRevCert(sCert: String): RevokedCertificate | Null = js.native
  
  /**
    * get revokedCertificate associative array for serial number<br/>
    * name findRevCertBySN
    * memberOf X509CRL#
    *
    * @param hexadecimal string of checking certificate serial number
    * @return object JSON object for revokedCertificate or null
    * @see X509CRL#getParam
    * @see X509CRL#findRevCert
    * @since jsrsasign 10.5.5 x509crl 1.0.3
    *
    * @description
    * This method will find revokedCertificate entry as JSON object
    * for a specified serial number. <br/>
    * When the serial number is not found in the entry, this returns null.<br/>
    * Before finding, {@link X509CRL#getParam} is called internally
    * to parse CRL.<br/>
    * NOTE: This method will just find an entry for a serial number.
    * You need to check whether CRL is proper one or not
    * for checking certificate such as signature validation or
    * name checking.
    *
    * @example
    * crl = new X509CRL(PEMCRL);
    * crl.findRevCertBySN("123a") &rarr; // revoked
    * {sn:"123a", date:"208025235959Z", ext: [{extname:"cRLReason",code:3}]}
    *
    * crl.findRevCertBySN("0000") &rarr; null // not revoked
    */
  def findRevCertBySN(hSN: String): RevokedCertificate | Null = js.native
  
  /**
    * get JSON object of issuer field<br/>
    * name getIssuer
    * memberOf X509CRL#
    *
    * @return Array JSON object of issuer field
    * @see X509#getIssuer
    * @see X509#getX500Name
    * @see KJUR.asn1.x509.X500Name
    *
    * @description
    * This method returns parsed issuer field value as
    * JSON object.
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * x.getIssuer() &rarr;
    * { array: [[{type:'C',value:'JP',ds:'prn'}],...],
    *   str: "/C=JP/..." }
    */
  def getIssuer(): X500Name = js.native
  
  /**
    * get hexadecimal string of issuer field TLV of certificate.<br/>
    * name getIssuerHex
    * memberOf X509CRL#
    *
    * @return string hexadecial string of issuer DN ASN.1
    * @see X509CRL#getIssuer
    * @since jsrsasign 10.5.5 x509crl 1.0.3
    *
    * @description
    * This method returns ASN.1 DER hexadecimal string of
    * issuer field.
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * x.getIssuerHex() &rarr; "30..."
    */
  def getIssuerHex(): String = js.native
  
  /**
    * get JSON object of nextUpdate field<br/>
    * name getNextUpdate
    * memberOf X509CRL#
    *
    * @return String string of nextUpdate field or null
    * @see X509#getNotBefore
    * @see X509CRL#getThisUpdate
    * @see KJUR.asn1.x509.Time
    *
    * @description
    * This method returns parsed nextUpdate field value as
    * string. "nextUpdate" is OPTIONAL field so
    * when nextUpdate field doesn't exists, this returns null.
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * crl.getNextUpdate() &rarr; "200825235959Z"
    */
  def getNextUpdate(): String | Null = js.native
  
  /**
    * get JSON object for CRL parameters<br/>
    * name getParam
    * memberOf X509CRL#
    *
    * @return Array JSON object for CRL parameters
    * @see KJUR.asn1.x509.CRL
    *
    * @description
    * This method returns a JSON object of the CRL
    * parameters.
    * Return value can be passed to
    * {@link KJUR.asn1.x509.CRL} constructor.
    * <br/>
    * NOTE1: From jsrsasign 10.5.16, optional argument can be applied.
    * It can have following members:
    * <ul>
    * <li>tbshex - if this is true, tbshex member with hex value of
    * tbsCertList will be added</li>
    * <li>nodnarray - if this is true, array member for subject and
    * issuer will be deleted to simplify it<li>
    * </ul>
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * crl.getParam() &rarr;
    * {version: 2,
    *  sigalg: "SHA256withRSA",
    *  issuer: {array:
    *    [[{type:"C",value:"JP",ds:"prn"}],[{type:"O",value:"T1",ds:"prn"}]]},
    *  thisupdate: "200820212434Z",
    *  nextupdate: "200910212434Z",
    *  revcert: [
    *   {sn:{hex:"123d..."},
    *    date:"061110000000Z",
    *    ext:[{extname:"cRLReason",code:4}]}],
    *  ext: [
    *   {extname:"authorityKeyIdentifier",kid:{hex: "03de..."}},
    *   {extname:"cRLNumber",num:{hex:"0211"}}],
    *  sighex: "3c5e..."}
    *
    * crl.getParam({tbshex: true}) &rarr; { ... , tbshex: "30..." }
    * crl.getParam({nodnarray: true}) &rarr; {issuer: {str: "/C=JP"}, ...}
    */
  def getParam(): Revcert = js.native
  
  /**
    * get revokedCertificate JSON parameter<br/>
    * name getRevCert
    * memberOf X509CRL#
    *
    * @return Array JSON object for revokedCertificate parameter
    * @see X509CRL#getRevCertArray
    *
    * @description
    * This method returns parsed revokedCertificate parameter
    * as JSON object.
    *
    * @example
    * crl = new X509CRL();
    * crl.getRevCertArray("30...") &rarr;
    * {sn:"123a", date:"208025235959Z", ext: [{extname:"cRLReason",code:3}]}
    */
  def getRevCert(): RevokedCertificate = js.native
  
  /**
    * get array for revokedCertificates field<br/>
    * name getRevCertArray
    * memberOf X509CRL#
    *
    * @return Array array of revokedCertificate parameter or null
    * @see X509CRL#getRevCert
    *
    * @description
    * This method returns parsed revokedCertificates field value as
    * array of revokedCertificate parameter.
    * If the field doesn't exists, it returns null.
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * crl.getRevCertArray() &rarr;
    * [{sn:"123a", date:"208025235959Z", ext: [{extname:"cRLReason",code:3}]},
    *  {sn:"123b", date:"208026235959Z", ext: [{extname:"cRLReason",code:0}]}]
    */
  def getRevCertArray(): js.Array[RevokedCertificate] = js.native
  
  /**
    * get signature algorithm name in basic field
    * name getSignatureAlgorithmField
    * memberOf X509CRL#
    *
    * @return String signature algorithm name (ex. SHA1withRSA, SHA256withECDSA, SHA512withRSAandMGF1)
    * @see X509#getSignatureAlgorithmField
    * @see KJUR.asn1.x509.AlgirithmIdentifier
    *
    * @description
    * This method will get a name of signature algorithm in CRL.
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * crl.getSignatureAlgorithmField() &rarr; "SHA256withRSAandMGF1"
    */
  def getSignatureAlgorithmField(): String = js.native
  
  /**
    * get signature value as hexadecimal string<br/>
    * name getSignatureValueHex
    * memberOf X509CRL#
    *
    * @return String signature value hexadecimal string without BitString unused bits
    *
    * @description
    * This method will get signature value of CRL.
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * crl.getSignatureValueHex() &rarr "8a4c47913..."
    */
  def getSignatureValueHex(): String = js.native
  
  /**
    * get JSON object of thisUpdate field<br/>
    * name getThisUpdate
    * memberOf X509CRL#
    *
    * @return String string of thisUpdate field (ex. "YYMMDDHHmmSSZ")
    * @see X509#getNotBefore
    * @see X509CRL#getNextUpdate
    * @see KJUR.asn1.x509.Time
    *
    * @description
    * This method returns parsed thisUpdate field value as
    * string.
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * x.getThisUpdate() &rarr; "200825235959Z"
    */
  def getThisUpdate(): String = js.native
  
  /**
    * get X.509 CRL format version<br/>
    * name getVersion
    * memberOf X509CRL#
    *
    * @return Number version field value (generally 2) or null
    * @description
    * This method returns a version field value TBSCertList.
    * This returns null if there is no such field.
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * crl.getVersion() &rarr; 2
    */
  def getVersion(): Double | Null = js.native
  
  /**
    * hexadecimal string of X.509 CRL ASN.1 data.
    */
  var hex: String = js.native
  
  var parsed: Null | Nextupdate = js.native
  
  /**
    * index of revokedCertificates field in TBSCertList depends on CRL version and nextUpdate field.
    */
  var posRevCert: Double = js.native
  
  /**
    * index of SignatureAlgorithm field in TBSCertList position depends on CRL version field.
    */
  var posSigAlg: Double = js.native
  
  /**
    * verifies signature value by public key<br/>
    * name verifySignature
    * memberOf X509CRL#
    *
    * @param pubKey public key object, pubkey PEM or PEM issuer cert
    * @return Boolean true if signature value is valid otherwise false
    * @see X509#verifySignature
    * @see KJUR.crypto.Signature
    *
    * @description
    * This method verifies signature value of hexadecimal string of
    * X.509 CRL by specified public key.
    * The signature algorithm used to verify will refer
    * signatureAlgorithm field.
    * (See {@link X509CRL#getSignatureAlgorithmField})
    *
    * @example
    * crl = new X509CRL("-----BEGIN X509 CRL...");
    * x.verifySignature(pubKey) &rarr; true, false or raising exception
    */
  def verifySignature(pubKey: String): Boolean = js.native
  def verifySignature(pubKey: ECCPrivateKey): Boolean = js.native
  def verifySignature(pubKey: DSA): Boolean = js.native
  def verifySignature(pubKey: ECDSA): Boolean = js.native
  def verifySignature(pubKey: RSAKey): Boolean = js.native
}
