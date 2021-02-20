package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.anon.Csrinfo
import typings.jsrsasign.anon.Ext
import typings.jsrsasign.jsrsasign.KJUR.asn1.csr.PEMInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's ASN.1 class for CSR/PKCS#10 name space
  *
  * This name space is a sub name space for `KJUR.asn1`.
  * This name space contains classes for
  * [RFC 2986](https://tools.ietf.org/html/rfc2986)
  * certificate signing request (CSR/PKCS#10) and its utilities
  * to be issued your certificate from certification authorities.
  *
  * __PROVIDING ASN.1 STRUCTURES__
  *
  * - `KJUR.asn1.csr.CertificationRequest`
  * - `KJUR.asn1.csr.CertificationRequestInfo`
  *
  * __PROVIDING UTILITY CLASSES__
  *
  * - `KJUR.asn1.csr.CSRUtil`
  *
  * `KJUR.asn1.csr.CSRUtil.newCSRPEM` method is very useful to
  * get your certificate signing request (CSR/PKCS#10) file.
  */
object csr {
  
  /**
    * Certification Request (CSR/PKCS#10) utilities class
    * @description
    * This class provides utility static methods for CSR/PKCS#10.
    * Here is a list of methods:
    *
    * - `KJUR.asn1.csr.CSRUtil.newCSRPEM`
    * - `KJUR.asn1.csr.CSRUtil.getInfo`
    */
  object CSRUtil {
    
    /**
      * get field values from CSR/PKCS#10 PEM string
      * @param sPEM PEM string of CSR/PKCS#10
      * @returns JSON object with parsed parameters such as name or public key
      * @description
      * This method parses PEM CSR/PKCS#1 string and retrieves
      * subject name and public key. Following parameters are available in the
      * resulted JSON object.
      *
      * - subject.name - subject name string (ex. /C=US/O=Test)
      * - subject.hex - hexadecimal string of X.500 Name of subject
      * - pubkey.obj - subject public key object such as RSAKey, KJUR.crypto.{ECDSA,DSA}
      * - pubkey.hex - hexadecimal string of subject public key
      *
      *
      * @example
      * o = KJUR.asn1.csr.CSRUtil.getInfo("-----BEGIN CERTIFICATE REQUEST...");
      * console.log(o.subject.name) → "/C=US/O=Test"
      */
    @JSImport("jsrsasign", "KJUR.asn1.csr.CSRUtil.getInfo")
    @js.native
    def getInfo(sPEM: String): PEMInfo = js.native
    
    /**
      * generate a PEM format of CSR/PKCS#10 certificate signing request
      * @param param parameter to generate CSR
      * @description
      * This method can generate a CSR certificate signing
      * request by a simple JSON object which has following parameters:
      *
      * - subject - parameter to be passed to `KJUR.asn1.x509.X500Name`
      * - sbjpubkey - parameter to be passed to `KEYUTIL.getKey`
      * - sigalg - signature algorithm name (ex. SHA256withRSA)
      * - sbjprvkey - parameter to be passed to `KEYUTIL.getKey`
      *
      *
      * @example
      * // 1) by key object
      * pem = KJUR.asn1.csr.CSRUtil.newCSRPEM({
      *   subject: {str: '/C=US/O=Test/CN=example.com'},
      *   sbjpubkey: pubKeyObj,
      *   sigalg: "SHA256withRSA",
      *   sbjprvkey: prvKeyObj
      * });
      *
      * // 2) by private/public key PEM
      * pem = KJUR.asn1.csr.CSRUtil.newCSRPEM({
      *   subject: {str: '/C=US/O=Test/CN=example.com'},
      *   sbjpubkey: pubKeyPEM,
      *   sigalg: "SHA256withRSA",
      *   sbjprvkey: prvKeyPEM
      * });
      *
      * // 3) with generateKeypair
      * kp = KEYUTIL.generateKeypair("RSA", 2048);
      * pem = KJUR.asn1.csr.CSRUtil.newCSRPEM({
      *   subject: {str: '/C=US/O=Test/CN=example.com'},
      *   sbjpubkey: kp.pubKeyObj,
      *   sigalg: "SHA256withRSA",
      *   sbjprvkey: kp.prvKeyObj
      * });
      *
      * // 4) by private/public key PEM with extension
      * pem = KJUR.asn1.csr.CSRUtil.newCSRPEM({
      *   subject: {str: '/C=US/O=Test/CN=example.com'},
      *   ext: [
      *     {subjectAltName: {array: [{dns: 'example.net'}]}
      *   ],
      *   sbjpubkey: pubKeyPEM,
      *   sigalg: "SHA256withRSA",
      *   sbjprvkey: prvKeyPEM
      * });
      */
    @JSImport("jsrsasign", "KJUR.asn1.csr.CSRUtil.newCSRPEM")
    @js.native
    def newCSRPEM(): String = js.native
    @JSImport("jsrsasign", "KJUR.asn1.csr.CSRUtil.newCSRPEM")
    @js.native
    def newCSRPEM(param: Ext): String = js.native
  }
  
  /**
    * ASN.1 CertificationRequest structure class
    * @param params associative array of parameters (ex. {})
    * @example
    * csri = new KJUR.asn1.csr.CertificationRequestInfo();
    * csri.setSubjectByParam({'str': '/C=US/O=Test/CN=example.com'});
    * csri.setSubjectPublicKeyByGetKey(pubKeyObj);
    * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
    * csr.sign("SHA256withRSA", prvKeyObj);
    * pem = csr.getPEMString();
    *
    * // -- DEFINITION OF ASN.1 SYNTAX --
    * // CertificationRequest ::= SEQUENCE {
    * //   certificationRequestInfo CertificationRequestInfo,
    * //   signatureAlgorithm       AlgorithmIdentifier{{ SignatureAlgorithms }},
    * //   signature                BIT STRING }
    * //
    * // CertificationRequestInfo ::= SEQUENCE {
    * //   version       INTEGER { v1(0) } (v1,...),
    * //   subject       Name,
    * //   subjectPKInfo SubjectPublicKeyInfo{{ PKInfoAlgorithms }},
    * //   attributes    [0] Attributes{{ CRIAttributes }} }
    */
  @JSImport("jsrsasign", "KJUR.asn1.csr.CertificationRequest")
  @js.native
  class CertificationRequest ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequest {
    def this(params: Csrinfo) = this()
  }
  
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
  @JSImport("jsrsasign", "KJUR.asn1.csr.CertificationRequestInfo")
  @js.native
  class CertificationRequestInfo ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequestInfo
}
