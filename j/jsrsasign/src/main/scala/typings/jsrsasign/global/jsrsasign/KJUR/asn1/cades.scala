package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.anon.Alg
import typings.jsrsasign.anon.AlgCert
import typings.jsrsasign.anon.Algs
import typings.jsrsasign.anon.Cert
import typings.jsrsasign.anon.CertString
import typings.jsrsasign.anon.Digalg
import typings.jsrsasign.anon.Hash
import typings.jsrsasign.anon.Length
import typings.jsrsasign.anon.Res
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
  
  object CAdESUtil {
    
    @JSGlobal("jsrsasign.KJUR.asn1.cades.CAdESUtil")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * parse CMS SignedData to add unsigned attributes
      * @param hex hexadecimal string of ContentInfo of CMS SignedData
      * @return associative array of parsed data
      * @description
      * This method will parse a hexadecimal string of
      * ContentInfo with CMS SignedData to add a attribute
      * to unsigned attributes field in a signerInfo field.
      * Parsed result will be an associative array which has
      * following properties:
      *
      * - version - hex of CMSVersion ASN.1 TLV
      * - algs - hex of DigestAlgorithms ASN.1 TLV
      * - encapcontent - hex of EncapContentInfo ASN.1 TLV
      * - certs - hex of Certificates ASN.1 TLV
      * - revs - hex of RevocationInfoChoices ASN.1 TLV
      * - si[] - array of SignerInfo properties
      * - obj - parsed KJUR.asn1.cms.SignedData object
      *
      * @example
      * info = KJUR.asn1.cades.CAdESUtil.parseSignedDataForAddingUnsigned(beshex);
      * sd = info.obj;
      */
    inline def parseSignedDataForAddingUnsigned(hex: String): Algs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSignedDataForAddingUnsigned")(hex.asInstanceOf[js.Any]).asInstanceOf[Algs]
    
    /**
      * parse SignerInfo to add unsigned attributes
      * @param hex hexadecimal string of SignerInfo
      * @return associative array of parsed data
      * @description
      * This method will parse a hexadecimal string of
      * SignerInfo to add a attribute
      * to unsigned attributes field in a signerInfo field.
      * Parsed result will be an associative array which has
      * following properties:
      *
      * - version - hex TLV of version
      * - si - hex TLV of SignerIdentifier
      * - digalg - hex TLV of DigestAlgorithm
      * - sattrs - hex TLV of SignedAttributes
      * - sigalg - hex TLV of SignatureAlgorithm
      * - sig - hex TLV of signature
      * - sigval = hex V of signature
      * - obj - parsed KJUR.asn1.cms.SignerInfo object
      *
      * NOTE: Parsing of unsigned attributes will be provided in the
      * future version. That's way this version provides support
      * for CAdES-T and not for CAdES-C.
      */
    inline def parseSignerInfoForAddingUnsigned(hex: String, iSI: Double, nth: Double): Digalg = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSignerInfoForAddingUnsigned")(hex.asInstanceOf[js.Any], iSI.asInstanceOf[js.Any], nth.asInstanceOf[js.Any])).asInstanceOf[Digalg]
  }
  
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
  @JSGlobal("jsrsasign.KJUR.asn1.cades.CompleteCertificateRefs")
  @js.native
  class CompleteCertificateRefs ()
    extends typings.jsrsasign.mod.KJUR.asn1.cades.CompleteCertificateRefs {
    def this(params: Length) = this()
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
  @JSGlobal("jsrsasign.KJUR.asn1.cades.OtherCertID")
  @js.native
  class OtherCertID ()
    extends typings.jsrsasign.mod.KJUR.asn1.cades.OtherCertID {
    def this(params: String) = this()
    def this(params: Cert) = this()
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
  @JSGlobal("jsrsasign.KJUR.asn1.cades.OtherHash")
  @js.native
  class OtherHash ()
    extends typings.jsrsasign.mod.KJUR.asn1.cades.OtherHash {
    def this(params: String) = this()
    def this(params: Alg) = this()
    def this(params: AlgCert) = this()
    def this(params: CertString) = this()
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
  @JSGlobal("jsrsasign.KJUR.asn1.cades.OtherHashAlgAndValue")
  @js.native
  class OtherHashAlgAndValue ()
    extends typings.jsrsasign.mod.KJUR.asn1.cades.OtherHashAlgAndValue {
    def this(params: Alg) = this()
  }
  
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
  @JSGlobal("jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier")
  @js.native
  class SignaturePolicyIdentifier ()
    extends typings.jsrsasign.mod.KJUR.asn1.cades.SignaturePolicyIdentifier {
    def this(params: Hash) = this()
  }
  
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
  @JSGlobal("jsrsasign.KJUR.asn1.cades.SignatureTimeStamp")
  @js.native
  class SignatureTimeStamp ()
    extends typings.jsrsasign.mod.KJUR.asn1.cades.SignatureTimeStamp {
    def this(params: Res) = this()
  }
}
