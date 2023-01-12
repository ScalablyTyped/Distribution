package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.anon.ArrayStr
import typings.jsrsasign.anon.ExtnameString
import typings.jsrsasign.anon.HexName
import typings.jsrsasign.anon.HexObj
import typings.jsrsasign.anon.Str
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
  @js.native
  trait CertificationRequest
    extends StObject
       with ASN1Object {
    
    /**
      * get PEM formatted certificate signing request (CSR/PKCS#10)<br/>
      * @return PEM formatted string of CSR/PKCS#10
      * @description
      * This method is to a get CSR PEM string
      *
      * @example
      * csr = new KJUR.asn1.csr.CertificationRequest({
      *   subject: "/C=JP/O=Test",
      *   sbjpubkey: ...
      * });
      * csr.getPEM() &rarr; "-----BEGIN CERTIFICATE REQUEST..."
      */
    def getPEM(): String = js.native
    
    def setByParam(): Unit = js.native
    def setByParam(params: CertificationRequestParams): Unit = js.native
    
    /**
      * sign CertificationRequest and set signature value internally<br/>
      * @description
      * This method self-signs CertificateRequestInfo with a subject's
      * private key and set signature value internally.
      *
      * @example
      * csr = new KJUR.asn1.csr.CertificationRequest({
      *   subject: "/C=JP/O=Test",
      *   sbjpubkey: ...
      * });
      * csr.sign();
      */
    def sign(): Unit = js.native
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
  @js.native
  trait CertificationRequestInfo
    extends StObject
       with ASN1Object {
    
    def setByParam(): Unit = js.native
    def setByParam(params: CertificationRequestInfoParams): Unit = js.native
  }
  
  trait CertificationRequestInfoParams extends StObject {
    
    var extreq: js.UndefOr[js.Array[ExtnameString]] = js.undefined
    
    var sbjprvkey: js.UndefOr[String] = js.undefined
    
    var sbjpubkey: String
    
    var sigalg: js.UndefOr[String] = js.undefined
    
    var sighex: js.UndefOr[String] = js.undefined
    
    var subject: ArrayStr
  }
  object CertificationRequestInfoParams {
    
    inline def apply(sbjpubkey: String, subject: ArrayStr): CertificationRequestInfoParams = {
      val __obj = js.Dynamic.literal(sbjpubkey = sbjpubkey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificationRequestInfoParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificationRequestInfoParams] (val x: Self) extends AnyVal {
      
      inline def setExtreq(value: js.Array[ExtnameString]): Self = StObject.set(x, "extreq", value.asInstanceOf[js.Any])
      
      inline def setExtreqUndefined: Self = StObject.set(x, "extreq", js.undefined)
      
      inline def setExtreqVarargs(value: ExtnameString*): Self = StObject.set(x, "extreq", js.Array(value*))
      
      inline def setSbjprvkey(value: String): Self = StObject.set(x, "sbjprvkey", value.asInstanceOf[js.Any])
      
      inline def setSbjprvkeyUndefined: Self = StObject.set(x, "sbjprvkey", js.undefined)
      
      inline def setSbjpubkey(value: String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
      
      inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
      
      inline def setSigalgUndefined: Self = StObject.set(x, "sigalg", js.undefined)
      
      inline def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
      
      inline def setSighexUndefined: Self = StObject.set(x, "sighex", js.undefined)
      
      inline def setSubject(value: ArrayStr): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificationRequestParams extends StObject {
    
    var extreq: js.UndefOr[js.Array[ExtnameString]] = js.undefined
    
    var sbjprvkey: js.UndefOr[String] = js.undefined
    
    var sbjpubkey: String
    
    var sigalg: String
    
    var sighex: js.UndefOr[String] = js.undefined
    
    var subject: Str
  }
  object CertificationRequestParams {
    
    inline def apply(sbjpubkey: String, sigalg: String, subject: Str): CertificationRequestParams = {
      val __obj = js.Dynamic.literal(sbjpubkey = sbjpubkey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificationRequestParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CertificationRequestParams] (val x: Self) extends AnyVal {
      
      inline def setExtreq(value: js.Array[ExtnameString]): Self = StObject.set(x, "extreq", value.asInstanceOf[js.Any])
      
      inline def setExtreqUndefined: Self = StObject.set(x, "extreq", js.undefined)
      
      inline def setExtreqVarargs(value: ExtnameString*): Self = StObject.set(x, "extreq", js.Array(value*))
      
      inline def setSbjprvkey(value: String): Self = StObject.set(x, "sbjprvkey", value.asInstanceOf[js.Any])
      
      inline def setSbjprvkeyUndefined: Self = StObject.set(x, "sbjprvkey", js.undefined)
      
      inline def setSbjpubkey(value: String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
      
      inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
      
      inline def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
      
      inline def setSighexUndefined: Self = StObject.set(x, "sighex", js.undefined)
      
      inline def setSubject(value: Str): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait PEMInfo extends StObject {
    
    var pubkey: HexObj
    
    var subject: HexName
  }
  object PEMInfo {
    
    inline def apply(pubkey: HexObj, subject: HexName): PEMInfo = {
      val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[PEMInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PEMInfo] (val x: Self) extends AnyVal {
      
      inline def setPubkey(value: HexObj): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: HexName): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParamResponse extends StObject {
    
    var extreq: js.UndefOr[js.Array[ExtnameString]] = js.undefined
    
    var sbjpubkey: String
    
    var sigalg: String
    
    var sighex: String
    
    var subject: ArrayStr
  }
  object ParamResponse {
    
    inline def apply(sbjpubkey: String, sigalg: String, sighex: String, subject: ArrayStr): ParamResponse = {
      val __obj = js.Dynamic.literal(sbjpubkey = sbjpubkey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParamResponse] (val x: Self) extends AnyVal {
      
      inline def setExtreq(value: js.Array[ExtnameString]): Self = StObject.set(x, "extreq", value.asInstanceOf[js.Any])
      
      inline def setExtreqUndefined: Self = StObject.set(x, "extreq", js.undefined)
      
      inline def setExtreqVarargs(value: ExtnameString*): Self = StObject.set(x, "extreq", js.Array(value*))
      
      inline def setSbjpubkey(value: String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
      
      inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
      
      inline def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: ArrayStr): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
}
