package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.Attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's ASN.1 class for RFC 5126 CAdES long term signature
  *
  * This name space provides [RFC 5126 CAdES (CMS Advanced Electronic Signature)](https://tools.ietf.org/html/rfc5126) generator.
  *
  * __SUPPORTED FORMATS__
  *
  * Following CAdES formats is supported by this library.
  *
  * - CAdES-BES - CAdES Basic Electronic Signature
  * - CAdES-EPES - CAdES Explicit Policy-based Electronic Signature
  * - CAdES-T - Electronic Signature with Time
  *
  * __PROVIDED ATTRIBUTE CLASSES__
  *
  * - `KJUR.asn1.cades.SignaturePolicyIdentifier` - for CAdES-EPES
  * - `KJUR.asn1.cades.SignatureTimeStamp` - for CAdES-T
  * - `KJUR.asn1.cades.CompleteCertificateRefs` - for CAdES-C(for future use)
  *
  * NOTE: Currntly CAdES-C is not supported since parser can't
  * handle unsigned attribute.
  *
  * __OTHER CLASSES__
  *
  * - `KJUR.asn1.cades.OtherHashAlgAndValue`
  * - `KJUR.asn1.cades.OtherHash`
  * - `KJUR.asn1.cades.OtherCertID`
  * - `KJUR.asn1.cades.CAdESUtil` - utilities for CAdES
  *
  * __GENERATE CAdES-BES__
  *
  * To generate CAdES-BES, `KJUR.asn.cades` namespace
  * classes are not required and already `KJUR.asn.cms` namespace
  * provides attributes for CAdES-BES.
  * Create `KJUR.asn1.cms.SignedData` with following
  * mandatory attribute in CAdES-BES:
  *
  * - `KJUR.asn1.cms.ContentType`
  * - `KJUR.asn1.cms.MessageDigest`
  * - `KJUR.asn1.cms.SigningCertificate`
  * - `KJUR.asn1.cms.SigningCertificateV2`
  *
  * CMSUtil.newSignedData method is very useful to generate CAdES-BES.
  *
  * ```
  * sd = KJUR.asn1.cms.CMSUtil.newSignedData({
  *   content: {str: "aaa"},
  *   certs: [certPEM],
  *   signerInfos: [{
  *     hashAlg: 'sha256',
  *     sAttr: {SigningCertificateV2: {array: [certPEM]}},
  *     signerCert: certPEM,
  *     sigAlg: 'SHA256withRSA',
  *     signerPrvKey: pkcs8PrvKeyPEM
  *   }]
  * });
  * signedDataHex = sd.getContentInfoEncodedHex();
  * ```
  *
  * NOTE: ContentType and MessageDigest signed attributes
  * are automatically added by default.
  *
  * __GENERATE CAdES-BES with multiple signers__
  *
  * If you need signature by multiple signers, you can
  * specify one or more items in 'signerInfos' property as below.
  *
  * ```
  * sd = KJUR.asn1.cms.CMSUtil.newSignedData({
  *   content: {str: "aaa"},
  *   certs: [certPEM1, certPEM2],
  *   signerInfos: [{
  *     hashAlg: 'sha256',
  *     sAttr: {SigningCertificateV2: {array: [certPEM1]}},
  *     signerCert: certPEM1,
  *     sigAlg: 'SHA256withRSA',
  *     signerPrvKey: pkcs8PrvKeyPEM1
  *   },{
  *     hashAlg: 'sha1',
  *     sAttr: {SigningCertificateV2: {array: [certPEM2]}},
  *     signerCert: certPEM2,
  *     sigAlg: 'SHA1withRSA',
  *     signerPrvKey: pkcs8PrvKeyPEM2
  *   }]
  * });
  * signedDataHex = sd.getContentInfoEncodedHex();
  * ```
  *
  * __GENERATE CAdES-EPES__
  *
  * When you need a CAdES-EPES signature,
  * you just need to add 'SignaturePolicyIdentifier'
  * attribute as below.
  *
  * ```
  * sd = KJUR.asn1.cms.CMSUtil.newSignedData({
  *   content: {str: "aaa"},
  *   certs: [certPEM],
  *   signerInfos: [{
  *     hashAlg: 'sha256',
  *     sAttr: {
  *       SigningCertificateV2: {array: [certPEM]},
  *       SignaturePolicyIdentifier: {
  *         oid: '1.2.3.4.5',
  *         hash: {alg: 'sha1', hash: 'b1b2b3b4b...'}
  *       },
  *     },
  *     signerCert: certPEM,
  *     sigAlg: 'SHA256withRSA',
  *     signerPrvKey: pkcs8PrvKeyPEM
  *   }]
  * });
  * signedDataHex = sd.getContentInfoEncodedHex();
  * ```
  *
  * __GENERATE CAdES-T__
  *
  * After a signed CAdES-BES or CAdES-EPES signature have been generated,
  * you can generate CAdES-T by adding SigningTimeStamp unsigned attribute.
  *
  * ```
  * beshex = "30..."; // hex of CAdES-BES or EPES data
  * info = KJUR.asn1.cades.CAdESUtil.parseSignedDataForAddingUnsigned(beshex);
  * ```
  *
  * // You can refer a hexadecimal string of signature value
  * // in the first signerInfo in the CAdES-BES/EPES with a variable:
  * // 'info.si[0].sigval'. You need to get RFC 3161 TimeStampToken
  * // from a trusted time stamp authority. Otherwise you can also
  * // get it by 'KJUR.asn1.tsp' module. We suppose that we could
  * // get proper time stamp.
  *
  * ```
  * tsthex0 = "30..."; // hex of TimeStampToken for signerInfo[0] sigval
  * si0 = info.obj.signerInfoList[0];
  * si0.addUnsigned(new KJUR.asn1.cades.SignatureTimeStamp({tst: tsthex0});
  * esthex = info.obj.getContentInfoEncodedHex(); // CAdES-T
  * ```
  */
object cades {
  
  /**
    * class for RFC 5126 CAdES CompleteCertificateRefs attribute
    * @param params associative array of parameters
    * @description
    * ```
    * id-aa-ets-certificateRefs OBJECT IDENTIFIER =
    *    1.2.840.113549.1.9.16.2.21
    * CompleteCertificateRefs ::=  SEQUENCE OF OtherCertID
    * ```
    * @example
    * o = new KJUR.asn1.cades.CompleteCertificateRefs([certPEM1,certPEM2]);
    */
  trait CompleteCertificateRefs
    extends StObject
       with Attribute {
    
    /**
      * set value by array
      * @param a array of `KJUR.asn1.cades.OtherCertID` argument
      */
    def setByArray(a: js.Array[OtherCertID]): Unit
  }
  object CompleteCertificateRefs {
    
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
      setByArray: js.Array[OtherCertID] => Unit
    ): CompleteCertificateRefs = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByArray = js.Any.fromFunction1(setByArray))
      __obj.asInstanceOf[CompleteCertificateRefs]
    }
    
    extension [Self <: CompleteCertificateRefs](x: Self) {
      
      inline def setSetByArray(value: js.Array[OtherCertID] => Unit): Self = StObject.set(x, "setByArray", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * class for OtherCertID ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * OtherCertID ::= SEQUENCE {
    *    otherCertHash    OtherHash,
    *    issuerSerial     IssuerSerial OPTIONAL }
    * ```
    * @example
    * o = new KJUR.asn1.cades.OtherCertID(certPEM);
    * o = new KJUR.asn1.cades.OtherCertID({cert:certPEM, hasis: false});
    */
  trait OtherCertID
    extends StObject
       with ASN1Object {
    
    /**
      * set value by PEM string of certificate
      * @param certPEM PEM string of certificate
      * @description
      * This method will set value by a PEM string of a certificate.
      * This will add IssuerAndSerialNumber by default
      * which depends on hasIssuerSerial flag.
      */
    def setByCertPEM(certPEM: String): Unit
  }
  object OtherCertID {
    
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
      setByCertPEM: String => Unit
    ): OtherCertID = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByCertPEM = js.Any.fromFunction1(setByCertPEM))
      __obj.asInstanceOf[OtherCertID]
    }
    
    extension [Self <: OtherCertID](x: Self) {
      
      inline def setSetByCertPEM(value: String => Unit): Self = StObject.set(x, "setByCertPEM", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * class for OtherHash ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * OtherHash ::= CHOICE {
    *    sha1Hash   OtherHashValue,  -- This contains a SHA-1 hash
    *    otherHash  OtherHashAlgAndValue}
    * OtherHashValue ::= OCTET STRING
    * ```
    * @example
    * o = new KJUR.asn1.cades.OtherHash("1234");
    * o = new KJUR.asn1.cades.OtherHash(certPEMStr); // default alg=sha256
    * o = new KJUR.asn1.cades.OtherHash({alg: 'sha256', hash: '1234'});
    * o = new KJUR.asn1.cades.OtherHash({alg: 'sha256', cert: certPEM});
    * o = new KJUR.asn1.cades.OtherHash({cert: certPEM});
    */
  trait OtherHash
    extends StObject
       with ASN1Object {
    
    /**
      * set value by PEM string of certificate
      * @param certPEM PEM string of certificate
      * @description
      * This method will set value by a PEM string of a certificate.
      * An algorithm used to hash certificate data will
      * be defined by 'alg' property and 'sha256' is default.
      */
    def setByCertPEM(certPEM: String): Unit
  }
  object OtherHash {
    
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
      setByCertPEM: String => Unit
    ): OtherHash = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByCertPEM = js.Any.fromFunction1(setByCertPEM))
      __obj.asInstanceOf[OtherHash]
    }
    
    extension [Self <: OtherHash](x: Self) {
      
      inline def setSetByCertPEM(value: String => Unit): Self = StObject.set(x, "setByCertPEM", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * class for OtherHashAlgAndValue ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * OtherHashAlgAndValue ::= SEQUENCE {
    *    hashAlgorithm   AlgorithmIdentifier,
    *    hashValue       OtherHashValue }
    * OtherHashValue ::= OCTET STRING
    * ```
    */
  type OtherHashAlgAndValue = ASN1Object
  
  /**
    * class for RFC 5126 CAdES SignaturePolicyIdentifier attribute
    * @param params associative array of parameters
    * @description
    * ```
    * SignaturePolicyIdentifier ::= CHOICE {
    *    signaturePolicyId       SignaturePolicyId,
    *    signaturePolicyImplied  SignaturePolicyImplied } -- not used
    *
    * SignaturePolicyImplied ::= NULL
    * SignaturePolicyId ::= SEQUENCE {
    *    sigPolicyId           SigPolicyId,
    *    sigPolicyHash         SigPolicyHash,
    *    sigPolicyQualifiers   SEQUENCE SIZE (1..MAX) OF
    *                             SigPolicyQualifierInfo OPTIONAL }
    * SigPolicyId ::= OBJECT IDENTIFIER
    * SigPolicyHash ::= OtherHashAlgAndValue
    * ```
    * @example
    * var o = new KJUR.asn1.cades.SignaturePolicyIdentifier({
    *   oid: '1.2.3.4.5',
    *   hash: {alg: 'sha1', hash: 'a1a2a3a4...'}
    * });
    */
  type SignaturePolicyIdentifier = Attribute
  
  /**
    * class for RFC 5126 CAdES SignatureTimeStamp attribute
    * @param params associative array of parameters
    * @description
    * ```
    * id-aa-signatureTimeStampToken OBJECT IDENTIFIER ::=
    *    1.2.840.113549.1.9.16.2.14
    * SignatureTimeStampToken ::= TimeStampToken
    * ```
    */
  type SignatureTimeStamp = Attribute
}
