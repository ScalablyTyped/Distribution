package typings.jsrsasign.jsrsasign.KJUR.asn1

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
  @js.native
  trait CertID
    extends StObject
       with ASN1Object {
    
    /**
      * set CertID ASN.1 object by PEM certificates.
      * @param issuerCert string of PEM issuer certificate
      * @param subjectCert string of PEM subject certificate to be verified by OCSP
      * @param algName hash algorithm name used for above arguments (ex. "sha1") DEFAULT: sha1
      * @example
      * o = new KJUR.asn1.ocsp.CertID();
      * o.setByCert("-----BEGIN...", "-----BEGIN..."); // sha1 is used by default
      * o.setByCert("-----BEGIN...", "-----BEGIN...", "sha256");
      */
    def setByCert(issuerCert: String, subjectCert: String): Unit = js.native
    def setByCert(issuerCert: String, subjectCert: String, algName: String): Unit = js.native
    
    /**
      * set CertID ASN.1 object by values.
      * @param issuerNameHashHex hexadecimal string of hash value of issuer name
      * @param issuerKeyHashHex hexadecimal string of hash value of issuer public key
      * @param serialNumberHex hexadecimal string of certificate serial number to be verified
      * @param algName hash algorithm name used for above arguments (ex. "sha1") DEFAULT: sha1
      * @example
      * o = new KJUR.asn1.ocsp.CertID();
      * o.setByValue("1fac...", "fd3a...", "1234"); // sha1 is used by default
      * o.setByValue("1fac...", "fd3a...", "1234", "sha256");
      */
    def setByValue(issuerNameHashHex: String, issuerKeyHashHex: String, serialNumberHex: String): Unit = js.native
    def setByValue(issuerNameHashHex: String, issuerKeyHashHex: String, serialNumberHex: String, algName: String): Unit = js.native
  }
  
  trait CertificateRequest extends StObject {
    
    var alg: js.UndefOr[String] = js.undefined
    
    var issuerCert: String
    
    var subjectCert: String
  }
  object CertificateRequest {
    
    inline def apply(issuerCert: String, subjectCert: String): CertificateRequest = {
      val __obj = js.Dynamic.literal(issuerCert = issuerCert.asInstanceOf[js.Any], subjectCert = subjectCert.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateRequest]
    }
    
    extension [Self <: CertificateRequest](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setIssuerCert(value: String): Self = StObject.set(x, "issuerCert", value.asInstanceOf[js.Any])
      
      inline def setSubjectCert(value: String): Self = StObject.set(x, "subjectCert", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateRequestList extends StObject {
    
    var reqList: js.Array[CertificateRequest]
  }
  object CertificateRequestList {
    
    inline def apply(reqList: js.Array[CertificateRequest]): CertificateRequestList = {
      val __obj = js.Dynamic.literal(reqList = reqList.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateRequestList]
    }
    
    extension [Self <: CertificateRequestList](x: Self) {
      
      inline def setReqList(value: js.Array[CertificateRequest]): Self = StObject.set(x, "reqList", value.asInstanceOf[js.Any])
      
      inline def setReqListVarargs(value: CertificateRequest*): Self = StObject.set(x, "reqList", js.Array(value :_*))
    }
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
  trait OCSPRequest
    extends StObject
       with ASN1Object
  object OCSPRequest {
    
    inline def apply(
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String
    ): OCSPRequest = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
      __obj.asInstanceOf[OCSPRequest]
    }
  }
  
  /**
    * Utility class for OCSP
    * @description
    * This class provides utility static methods for OCSP.
    * - `KJUR.asn1.ocsp.OCSPUtil.getRequestHex` - generates hexadecimal string of OCSP request
    *
    */
  object OCSPUtil {
    
    trait ResponseInfo extends StObject {
      
      var certStatus: String
      
      var nextUpdate: String
      
      var responseStatus: Double
      
      var thisUpdate: String
    }
    object ResponseInfo {
      
      inline def apply(certStatus: String, nextUpdate: String, responseStatus: Double, thisUpdate: String): ResponseInfo = {
        val __obj = js.Dynamic.literal(certStatus = certStatus.asInstanceOf[js.Any], nextUpdate = nextUpdate.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResponseInfo]
      }
      
      extension [Self <: ResponseInfo](x: Self) {
        
        inline def setCertStatus(value: String): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
        
        inline def setNextUpdate(value: String): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
        
        inline def setResponseStatus(value: Double): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
        
        inline def setThisUpdate(value: String): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
      }
    }
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
  trait Request
    extends StObject
       with ASN1Object
  object Request {
    
    inline def apply(
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String
    ): Request = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
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
  trait TBSRequest
    extends StObject
       with ASN1Object {
    
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
    def setRequestListByParam(aParams: js.Array[CertificateRequest]): Unit
  }
  object TBSRequest {
    
    inline def apply(
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setRequestListByParam: js.Array[CertificateRequest] => Unit
    ): TBSRequest = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setRequestListByParam = js.Any.fromFunction1(setRequestListByParam))
      __obj.asInstanceOf[TBSRequest]
    }
    
    extension [Self <: TBSRequest](x: Self) {
      
      inline def setSetRequestListByParam(value: js.Array[CertificateRequest] => Unit): Self = StObject.set(x, "setRequestListByParam", js.Any.fromFunction1(value))
    }
  }
}
