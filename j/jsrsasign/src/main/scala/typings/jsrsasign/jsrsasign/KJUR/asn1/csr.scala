package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.anon.AccessLocation
import typings.jsrsasign.anon.Ca
import typings.jsrsasign.anon.E
import typings.jsrsasign.anon.HexName
import typings.jsrsasign.anon.Kid
import typings.jsrsasign.anon.Name
import typings.jsrsasign.anon.Obj
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
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
  object CSRUtil
  
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
  trait CertificationRequest
    extends StObject
       with ASN1Object {
    
    /**
      * get PEM formatted certificate signing request (CSR/PKCS#10)
      * @return PEM formatted string of CSR/PKCS#10
      * @description
      * This method is to a get CSR PEM string after signed.
      *
      * @example
      * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
      * csr.sign();
      * pem =  csr.getPEMString();
      * // pem will be following:
      * // -----BEGIN CERTIFICATE REQUEST-----
      * // MII ...snip...
      * // -----END CERTIFICATE REQUEST-----
      */
    def getPEMString(): String
    
    /**
      * sign CertificationRequest and set signature value internally
      * @description
      * This method self-signs CertificateRequestInfo with a subject's
      * private key and set signature value internally.
      *
      * @example
      * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
      * csr.sign("SHA256withRSA", prvKeyObj);
      */
    def sign(sigAlgName: String, prvKeyObj: js.Any): Unit
  }
  object CertificationRequest {
    
    @scala.inline
    def apply(
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getPEMString: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      sign: (String, js.Any) => Unit
    ): CertificationRequest = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getPEMString = js.Any.fromFunction0(getPEMString), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], sign = js.Any.fromFunction2(sign))
      __obj.asInstanceOf[CertificationRequest]
    }
    
    @scala.inline
    implicit class CertificationRequestMutableBuilder[Self <: CertificationRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPEMString(value: () => String): Self = StObject.set(x, "getPEMString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSign(value: (String, js.Any) => Unit): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
    }
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
  @js.native
  trait CertificationRequestInfo
    extends StObject
       with ASN1Object {
    
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
  
  trait PEMInfo extends StObject {
    
    var pubkey: Obj
    
    var subject: HexName
  }
  object PEMInfo {
    
    @scala.inline
    def apply(pubkey: Obj, subject: HexName): PEMInfo = {
      val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[PEMInfo]
    }
    
    @scala.inline
    implicit class PEMInfoMutableBuilder[Self <: PEMInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPubkey(value: Obj): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: HexName): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
}
