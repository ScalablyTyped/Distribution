package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.anon.Ext
import typings.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequestInfoParams
import typings.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequestParams
import typings.jsrsasign.jsrsasign.KJUR.asn1.csr.PEMInfo
import typings.jsrsasign.jsrsasign.KJUR.asn1.csr.ParamResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSGlobal("jsrsasign.KJUR.asn1.csr.CSRUtil")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def getInfo(sPEM: String): PEMInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(sPEM.asInstanceOf[js.Any]).asInstanceOf[PEMInfo]
    
    /**
      * get field values from CSR/PKCS#10 PEM string
      * @param sPEM PEM string of CSR/PKCS#10
      * @returns JSON object with parsed parameters such as name or public key
      * @description
      * This method parses PEM CSR/PKCS#1 string and retrieves
      * fields such as subject name and public key.
      * Following parameters are available in the
      * resulted JSON object.
      *
      * - {X500Name}subject - subject name parameters
      * - {String}sbjpubkey - PEM string of subject public key
      * - {Array}extreq - array of extensionRequest parameters
      * - {String}sigalg - name of signature algorithm field
      * - {String}sighex - hexadecimal string of signature value
      *
      * Returned JSON object can be passed to
      * {@link KJUR.asn1.csr.CertificationRequest} class constructor.
      *
      * CAUTION:
      * Returned JSON value format have been changed without
      * backward compatibility since jsrsasign 9.0.0 asn1csr 2.0.0.
      *
      * @example
      * KJUR.asn1.csr.CSRUtil.getParam("-----BEGIN CERTIFICATE REQUEST...") &rarr;
      * {
      *   subject: { array:[[{type:"C",value:"JP",ds:"prn"}],...],
      *              str: "/C=JP/O=Test"},
      *   sbjpubkey: "-----BEGIN PUBLIC KEY...",
      *   extreq: [{extname:"subjectAltName",array:[{dns:"example.com"}]}]
      *   sigalg: "SHA256withRSA",
      *   sighex: "1ab3df.."
      * }
      */
    inline def getParam(sPEM: String): ParamResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("getParam")(sPEM.asInstanceOf[js.Any]).asInstanceOf[ParamResponse]
    
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
    inline def newCSRPEM(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newCSRPEM")().asInstanceOf[String]
    inline def newCSRPEM(param: Ext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newCSRPEM")(param.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /**
    * ASN.1 CertificationRequest structure class
    * @param params associative array of parameters
    *
    * @description
    * This class provides CertificateRequestInfo ASN.1 structure
    * defined in * {@link https://tools.ietf.org/html/rfc2986#page-5 RFC 2986 4.2}.
    *
    * <pre>
    * CertificationRequest ::= SEQUENCE {
    *   certificationRequestInfo CertificationRequestInfo,
    *   signatureAlgorithm       AlgorithmIdentifier{{ SignatureAlgorithms }},
    *   signature                BIT STRING }
    * CertificationRequestInfo ::= SEQUENCE {
    *   version       INTEGER { v1(0) } (v1,...),
    *   subject       Name,
    *   subjectPKInfo SubjectPublicKeyInfo{{ PKInfoAlgorithms }},
    *   attributes    [0] Attributes{{ CRIAttributes }} }
    * </pre>
    *
    *
    * Argument "params" JSON object can have following keys:
    *
    * - {Array}subject - parameter to be passed to {@link KJUR.asn1.x509.X500Name}
    * - {Object}sbjpubkey - PEM string or key object to be passed to {@link KEYUTIL.getKey}
    * - {Array}extreq - array of certificate extension parameters
    * - {String}sigalg - signature algorithm name (ex. SHA256withRSA)
    * - {Object}sbjprvkey - PEM string or key object to be passed to {@link KEYUTIL.getKey}
    * (OPTION)
    * - {String}sighex - hexadecimal string of signature value. When this is not defined and
    * sbjprvkey is specified, sighex will be set automatically
    * during getEncodedHex() is called. (OPTION)
    *
    *
    * CAUTION:
    * Argument "params" JSON value format have been changed without
    * backward compatibility since jsrsasign 9.0.0 asn1csr 2.0.0.
    *
    * @example
    * // sign by private key
    * csr = new KJUR.asn1.csr.CertificationRequest({
    *   subject: {str:"/C=US/O=Test"},
    *   sbjpubkey: "-----BEGIN PUBLIC KEY...",
    *   extreq: [{extname:"subjectAltName",array:[{dns:"example.com"}]}]
    *   sigalg: "SHA256withRSA",
    *   sbjprvkey: "-----BEGIN PRIVATE KEY..."
    * });
    * pem = csr.getPEM(); // signed with sbjprvkey automatically
    *
    * // or specifying signature value
    * csr = new KJUR.asn1.csr.CertificationRequest({
    *   subject: {str:"/C=US/O=Test"},
    *   sbjpubkey: "-----BEGIN PUBLIC KEY...",
    *   extreq: [{extname:"subjectAltName",array:[{dns:"example.com"}]}]
    *   sigalg: "SHA256withRSA",
    *   sighex: "1234abcd..."
    * });
    * pem = csr.getPEM();
    */
  @JSGlobal("jsrsasign.KJUR.asn1.csr.CertificationRequest")
  @js.native
  open class CertificationRequest ()
    extends typings.jsrsasign.mod.KJUR.asn1.csr.CertificationRequest {
    def this(params: CertificationRequestParams) = this()
  }
  
  /**
    * ASN.1 CertificationRequestInfo structure class
    * @param params associative array of parameters (ex. {})
    * @description
    * This class provides CertificateRequestInfo ASN.1 structure
    * defined in
    * {@link https://tools.ietf.org/html/rfc2986#page-5" RFC 2986 4.1}.
    *
    * <pre>
    * CertificationRequestInfo ::= SEQUENCE {
    *   version       INTEGER { v1(0) } (v1,...),
    *   subject       Name,
    *   subjectPKInfo SubjectPublicKeyInfo{{ PKInfoAlgorithms }},
    *   attributes    [0] Attributes{{ CRIAttributes }} }
    * </pre>
    *
    *
    * CAUTION:
    * Argument "params" JSON value format have been changed without
    * backward compatibility since jsrsasign 9.0.0 asn1csr 2.0.0.
    *
    * @example
    * csri = new KJUR.asn1.csr.CertificationRequestInfo({
    *   subject: {str: '/C=US/CN=b'},
    *   sbjpubkey: <<PUBLIC KEY PEM>>,
    *   extreq: [
    *     {extname:"subjectAltName", array:[{dns:"example.com"}]}
    *   ]});
    * csri.getEncodedHex() &rarr; "30..."
    */
  @JSGlobal("jsrsasign.KJUR.asn1.csr.CertificationRequestInfo")
  @js.native
  open class CertificationRequestInfo ()
    extends typings.jsrsasign.mod.KJUR.asn1.csr.CertificationRequestInfo {
    def this(params: CertificationRequestInfoParams) = this()
  }
}
