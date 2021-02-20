package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.anon.Keyhash
import typings.jsrsasign.anon.Namehash
import typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.CertificateRequest
import typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.CertificateRequestList
import typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.OCSPUtil.ResponseInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 classes for OCSP protocol
  *
  * This name space provides
  * <a href="https://tools.ietf.org/html/rfc6960">RFC 6960
  * Online Certificate Status Protocol (OCSP)</a> ASN.1 request and response generator.
  *
  * __FEATURES__
  *
  * - easily generate OCSP data
  *
  * __PROVIDED CLASSES__
  *
  * - `KJUR.asn1.ocsp.CertID for ASN.1 class as defined in
  * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
  * - `KJUR.asn1.ocsp.Request for ASN.1 class as defined in
  * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
  * - `KJUR.asn1.ocsp.TBSRequest for ASN.1 class as defined in
  * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
  * - `KJUR.asn1.ocsp.OCSPRequest for ASN.1 class as defined in
  * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
  * - `KJUR.asn1.ocsp.OCSPUtil for static utility methods.
  */
object ocsp {
  
  /**
    * ASN.1 CertID class for OCSP
    * @param params associative array of parameters
    * @description
    * CertID ASN.1 class is defined in
    * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
    * ```
    * CertID ::= SEQUENCE {
    *   hashAlgorithm   AlgorithmIdentifier,
    *   issuerNameHash  OCTET STRING, -- Hash of issuer's DN
    *   issuerKeyHash   OCTET STRING, -- Hash of issuer's public key
    *   serialNumber    CertificateSerialNumber }
    * ```
    * @example
    * // default constructor
    * o = new KJUR.asn1.ocsp.CertID();
    * // constructor with certs (sha1 is used by default)
    * o = new KJUR.asn1.ocsp.CertID({issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN..."});
    * // constructor with certs and sha256
    * o = new KJUR.asn1.ocsp.CertID({issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"});
    * // constructor with values
    * o = new KJUR.asn1.ocsp.CertID({namehash: "1a...", keyhash: "ad...", serial: "1234", alg: "sha256"});
    */
  @JSImport("jsrsasign", "KJUR.asn1.ocsp.CertID")
  @js.native
  class CertID ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.CertID {
    def this(params: Keyhash) = this()
    def this(params: CertificateRequest) = this()
  }
  
  /**
    * ASN.1 OCSPRequest class for OCSP
    * @param params associative array of parameters
    * @description
    * OCSPRequest ASN.1 class is defined in
    * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
    * A signed request is not supported yet in this version.
    * ```
    * OCSPRequest ::= SEQUENCE {
    *   tbsRequest             TBSRequest,
    *   optionalSignature  [0] EXPLICIT Signature OPTIONAL }
    * ```
    * @example
    * // default constructor
    * o = new KJUR.asn1.ocsp.OCSPRequest();
    * // constructor with requestList parameter
    * o = new KJUR.asn1.ocsp.OCSPRequest({reqList:[
    *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg:},
    *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"}
    * ]});
    */
  @JSImport("jsrsasign", "KJUR.asn1.ocsp.OCSPRequest")
  @js.native
  class OCSPRequest ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.OCSPRequest {
    def this(params: CertificateRequestList) = this()
  }
  
  /**
    * Utility class for OCSP
    * @description
    * This class provides utility static methods for OCSP.
    * - `KJUR.asn1.ocsp.OCSPUtil.getRequestHex` - generates hexadecimal string of OCSP request
    *
    */
  object OCSPUtil {
    
    /**
      * parse OCSPResponse
      * @param h hexadecimal string of DER OCSPResponse
      * @return JSON object of parsed OCSPResponse
      * @description
      * This static method parse a hexadecimal string of DER OCSPResponse and
      * returns JSON object of its parsed result.
      * Its result has following properties:
      *
      * - responseStatus - integer of responseStatus
      * - certStatus - string of certStatus (ex. good, revoked or unknown)
      * - thisUpdate - string of thisUpdate in Zulu(ex. 20151231235959Z)
      * - nextUpdate - string of nextUpdate in Zulu(ex. 20151231235959Z)
      *
      * @example
      * info = KJUR.asn1.ocsp.OCSPUtil.getOCSPResponseInfo("3082...");
      */
    @JSImport("jsrsasign", "KJUR.asn1.ocsp.OCSPUtil.getOCSPResponseInfo")
    @js.native
    def getOCSPResponseInfo(h: String): ResponseInfo = js.native
    
    /**
      * generates hexadecimal string of OCSP request
      * @param issuerCert string of PEM issuer certificate
      * @param subjectCert string of PEM subject certificate to be verified by OCSP
      * @param algName hash algorithm name used for above arguments (ex. "sha1") DEFAULT: sha1
      * @return hexadecimal string of generated OCSP request
      * @description
      * This static method generates hexadecimal string of OCSP request.
      * @example
      * // generate OCSP request using sha1 algorithnm by default.
      * hReq = KJUR.asn1.ocsp.OCSPUtil.getRequestHex("-----BEGIN...", "-----BEGIN...");
      */
    @JSImport("jsrsasign", "KJUR.asn1.ocsp.OCSPUtil.getRequestHex")
    @js.native
    def getRequestHex(issuerCert: String, subjectCert: String, alg: String): String = js.native
  }
  
  /**
    * ASN.1 Request class for OCSP
    * @param params associative array of parameters
    * @description
    * Request ASN.1 class is defined in
    * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
    * singleRequestExtensions is not supported yet in this version such as nonce.
    * ```
    * Request ::= SEQUENCE {
    *   reqCert                  CertID,
    *   singleRequestExtensions  [0] EXPLICIT Extensions OPTIONAL }
    * ```
    * @example
    * // default constructor
    * o = new KJUR.asn1.ocsp.Request();
    * // constructor with certs (sha1 is used by default)
    * o = new KJUR.asn1.ocsp.Request({issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN..."});
    * // constructor with certs and sha256
    * o = new KJUR.asn1.ocsp.Request({issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"});
    * // constructor with values
    * o = new KJUR.asn1.ocsp.Request({namehash: "1a...", keyhash: "ad...", serial: "1234", alg: "sha256"});
    */
  @JSImport("jsrsasign", "KJUR.asn1.ocsp.Request")
  @js.native
  class Request ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.Request {
    def this(params: Namehash) = this()
    def this(params: CertificateRequest) = this()
  }
  
  /**
    * ASN.1 TBSRequest class for OCSP
    * @param params associative array of parameters
    * @description
    * TBSRequest ASN.1 class is defined in
    * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
    * ```
    * TBSRequest ::= SEQUENCE {
    *   version            [0] EXPLICIT Version DEFAULT v1,
    *   requestorName      [1] EXPLICIT GeneralName OPTIONAL,
    *   requestList            SEQUENCE OF Request,
    *   requestExtensions  [2] EXPLICIT Extensions OPTIONAL }
    * ```
    * @example
    * // default constructor
    * o = new KJUR.asn1.ocsp.TBSRequest();
    * // constructor with requestList parameter
    * o = new KJUR.asn1.ocsp.TBSRequest({reqList:[
    *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg:},
    *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"}
    * ]});
    */
  @JSImport("jsrsasign", "KJUR.asn1.ocsp.TBSRequest")
  @js.native
  class TBSRequest ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.TBSRequest {
    def this(params: CertificateRequestList) = this()
  }
}
