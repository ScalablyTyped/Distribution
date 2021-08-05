package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.anon.Keyhash
import typings.jsrsasign.anon.Namehash
import typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.CertificateRequest
import typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.CertificateRequestList
import typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.OCSPUtil.ResponseInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.CertID {
    def this(params: Keyhash) = this()
    def this(params: CertificateRequest) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
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
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.OCSPRequest {
    def this(params: CertificateRequestList) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
  }
  
  /**
    * Utility class for OCSP
    * @description
    * This class provides utility static methods for OCSP.
    * - `KJUR.asn1.ocsp.OCSPUtil.getRequestHex` - generates hexadecimal string of OCSP request
    *
    */
  object OCSPUtil {
    
    @JSImport("jsrsasign", "KJUR.asn1.ocsp.OCSPUtil")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def getOCSPResponseInfo(h: String): ResponseInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getOCSPResponseInfo")(h.asInstanceOf[js.Any]).asInstanceOf[ResponseInfo]
    
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
    inline def getRequestHex(issuerCert: String, subjectCert: String, alg: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestHex")(issuerCert.asInstanceOf[js.Any], subjectCert.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[String]
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
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.Request {
    def this(params: Namehash) = this()
    def this(params: CertificateRequest) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
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
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.TBSRequest {
    def this(params: CertificateRequestList) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getFreshValueHex(): String = js.native
    
    /**
      * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
      * @return hexadecimal string of ASN.1 TLV length(L)
      */
    /* CompleteClass */
    override def getLengthHexFromValue(): String = js.native
    
    /**
      * get hexadecimal string of ASN.1 TLV value(V) bytes
      * @return hexadecimal string of ASN.1 TLV value(V) bytes
      */
    /* CompleteClass */
    override def getValueHex(): String = js.native
    
    /** hexadecimal string of ASN.1 TLV length(L) */
    /* CompleteClass */
    var hL: String = js.native
    
    /** hexadecimal string of ASN.1 TLV tag(T) */
    /* CompleteClass */
    var hT: String = js.native
    
    /** hexadecimal string of ASN.1 TLV */
    /* CompleteClass */
    var hTLV: String = js.native
    
    /** hexadecimal string of ASN.1 TLV value(V) */
    /* CompleteClass */
    var hV: String = js.native
    
    /** flag whether internal data was changed */
    /* CompleteClass */
    var isModified: String = js.native
    
    /**
      * set TBSRequest ASN.1 object by array of parameters.
      * @param aParams array of parameters for Request class
      * @example
      * o = new KJUR.asn1.ocsp.TBSRequest();
      * o.setRequestListByParam([
      *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg:},
      *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"}
      * ]);
      */
    /* CompleteClass */
    override def setRequestListByParam(aParams: js.Array[CertificateRequest]): Unit = js.native
  }
}
