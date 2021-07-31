package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.anon.E
import typings.jsrsasign.anon.EciObj
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's ASN.1 class for Cryptographic Message Syntax(CMS)
  *
  * This name space provides
  * [RFC 5652 Cryptographic Message Syntax (CMS)](https://tools.ietf.org/html/rfc5652) SignedData generator.
  *
  * __FEATURES__
  *
  * - easily generate CMS SignedData
  * - easily verify CMS SignedData
  * - APIs are very similar to BouncyCastle library ASN.1 classes. So easy to learn.
  *
  *
  * __PROVIDED CLASSES__
  *
  * - `KJUR.asn1.cms.SignedData`
  * - `KJUR.asn1.cms.SignerInfo`
  * - `KJUR.asn1.cms.AttributeList`
  * - `KJUR.asn1.cms.ContentInfo`
  * - `KJUR.asn1.cms.EncapsulatedContentInfo`
  * - `KJUR.asn1.cms.IssuerAndSerialNumber`
  * - `KJUR.asn1.cms.CMSUtil`
  * - `KJUR.asn1.cms.Attribute`
  * - `KJUR.asn1.cms.ContentType`
  * - `KJUR.asn1.cms.MessageDigest`
  * - `KJUR.asn1.cms.SigningTime`
  * - `KJUR.asn1.cms.SigningCertificate`
  * - `KJUR.asn1.cms.SigningCertificateV2`
  */
object cms {
  
  /**
    * Attribute class for base of CMS attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attributes ::= SET OF Attribute
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * ```
    */
  trait Attribute
    extends StObject
       with ASN1Object
  object Attribute {
    
    @scala.inline
    def apply(
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String
    ): Attribute = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
  }
  
  /**
    * class for Attributes ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * Attributes ::= SET OF Attribute
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * ```
    * @example
    * // specify by X500Name and DERInteger
    * o = new KJUR.asn1.cms.AttributeList({sorted: false}); // ASN.1 BER unsorted SET OF
    * o = new KJUR.asn1.cms.AttributeList();  // ASN.1 DER sorted by default
    * o.clear();                              // clear list of Attributes
    * n = o.length();                         // get number of Attribute
    * o.add(new KJUR.asn1.cms.SigningTime()); // add SigningTime attribute
    * hex = o.getEncodedHex();                // get hex encoded ASN.1 data
    */
  trait AttributeList
    extends StObject
       with ASN1Object {
    
    def add(item: Attribute): Unit
    
    def clear(): Unit
    
    def length(): Double
  }
  object AttributeList {
    
    @scala.inline
    def apply(
      add: Attribute => Unit,
      clear: () => Unit,
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      length: () => Double
    ): AttributeList = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], length = js.Any.fromFunction0(length))
      __obj.asInstanceOf[AttributeList]
    }
    
    @scala.inline
    implicit class AttributeListMutableBuilder[Self <: AttributeList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Attribute => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * class for ContentInfo ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * ContentInfo ::= SEQUENCE {
    *    contentType ContentType,
    *    content [0] EXPLICIT ANY DEFINED BY contentType }
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * a = [new KJUR.asn1.DERInteger({int: 1}),
    *      new KJUR.asn1.DERInteger({int: 2})];
    * seq = new KJUR.asn1.DERSequence({array: a});
    * o = new KJUR.asn1.cms.ContentInfo({type: 'data', obj: seq});
    */
  trait ContentInfo
    extends StObject
       with ASN1Object {
    
    def setContentType(params: String): Unit
  }
  object ContentInfo {
    
    @scala.inline
    def apply(
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setContentType: String => Unit
    ): ContentInfo = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setContentType = js.Any.fromFunction1(setContentType))
      __obj.asInstanceOf[ContentInfo]
    }
    
    @scala.inline
    implicit class ContentInfoMutableBuilder[Self <: ContentInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetContentType(value: String => Unit): Self = StObject.set(x, "setContentType", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * class for CMS ContentType attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * o = new KJUR.asn1.cms.ContentType({name: 'data'});
    * o = new KJUR.asn1.cms.ContentType({oid: '1.2.840.113549.1.9.16.1.4'});
    */
  type ContentType = Attribute
  
  /**
    * class for EncapsulatedContentInfo ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * EncapsulatedContentInfo ::= SEQUENCE {
    *    eContentType ContentType,
    *    eContent [0] EXPLICIT OCTET STRING OPTIONAL }
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * o = new KJUR.asn1.cms.EncapsulatedContentInfo();
    * o.setContentType('1.2.3.4.5');     // specify eContentType by OID
    * o.setContentType('data');          // specify eContentType by name
    * o.setContentValueHex('a1a2a4...'); // specify eContent data by hex string
    * o.setContentValueStr('apple');     // specify eContent data by UTF-8 string
    * // for detached contents (i.e. data not concluded in eContent)
    * o.isDetached = true;               // false as default
    */
  @js.native
  trait EncapsulatedContentInfo
    extends StObject
       with ASN1Object {
    
    def setContentType(nameOrOid: String): Unit = js.native
    
    def setContentValue(params: HexParam): Unit = js.native
    def setContentValue(params: StringParam): Unit = js.native
    
    def setContentValueHex(valueHex: String): Unit = js.native
    
    def setContentValueStr(valueStr: String): Unit = js.native
  }
  
  /**
    * class for IssuerAndSerialNumber ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * IssuerAndSerialNumber ::= SEQUENCE {
    *    issuer Name,
    *    serialNumber CertificateSerialNumber }
    * CertificateSerialNumber ::= INTEGER
    * ```
    * @example
    * // specify by X500Name and DERInteger
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber(
    *      {issuer: {str: '/C=US/O=T1'}, serial {int: 3}});
    * // specify by PEM certificate
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber({cert: certPEM});
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber(certPEM); // since 1.0.3
    */
  trait IssuerAndSerialNumber
    extends StObject
       with ASN1Object {
    
    def setByCertPEM(certPEM: String): Unit
  }
  object IssuerAndSerialNumber {
    
    @scala.inline
    def apply(
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
    ): IssuerAndSerialNumber = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByCertPEM = js.Any.fromFunction1(setByCertPEM))
      __obj.asInstanceOf[IssuerAndSerialNumber]
    }
    
    @scala.inline
    implicit class IssuerAndSerialNumberMutableBuilder[Self <: IssuerAndSerialNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetByCertPEM(value: String => Unit): Self = StObject.set(x, "setByCertPEM", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * class for CMS MessageDigest attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * MessageDigest ::= OCTET STRING
    * ```
    * @example
    * o = new KJUR.asn1.cms.MessageDigest({hex: 'a1a2a3a4...'});
    */
  type MessageDigest = Attribute
  
  /**
    * class for SignerInfo ASN.1 structure of CMS SignedData
    * @param params associative array of parameters
    * @description
    * ```
    * SignedData ::= SEQUENCE {
    *    version CMSVersion,
    *    digestAlgorithms DigestAlgorithmIdentifiers,
    *    encapContentInfo EncapsulatedContentInfo,
    *    certificates [0] IMPLICIT CertificateSet OPTIONAL,
    *    crls [1] IMPLICIT RevocationInfoChoices OPTIONAL,
    *    signerInfos SignerInfos }
    * SignerInfos ::= SET OF SignerInfo
    * CertificateSet ::= SET OF CertificateChoices
    * DigestAlgorithmIdentifiers ::= SET OF DigestAlgorithmIdentifier
    * CertificateSet ::= SET OF CertificateChoices
    * RevocationInfoChoices ::= SET OF RevocationInfoChoice
    * ```
    *
    * @example
    * sd = new KJUR.asn1.cms.SignedData();
    * sd.dEncapContentInfo.setContentValueStr("test string");
    * sd.signerInfoList[0].setForContentAndHash({sdObj: sd,
    *                                            eciObj: sd.dEncapContentInfo,
    *                                            hashAlg: 'sha256'});
    * sd.signerInfoList[0].dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
    * sd.signerInfoList[0].setSignerIdentifier(certPEM);
    * sd.signerInfoList[0].sign(prvP8PEM, "SHA256withRSA");
    * hex = sd.getContentInfoEncodedHex();
    */
  trait SignedData
    extends StObject
       with ASN1Object {
    
    def addCertificatesByPEM(certPEM: String): Unit
    
    def getContentInfo(): ContentInfo
    
    def getContentInfoEncodedHex(): String
    
    def getPEM(): String
    
    var signerInfoList: js.Array[SignerInfo]
  }
  object SignedData {
    
    @scala.inline
    def apply(
      addCertificatesByPEM: String => Unit,
      getContentInfo: () => ContentInfo,
      getContentInfoEncodedHex: () => String,
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getPEM: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      signerInfoList: js.Array[SignerInfo]
    ): SignedData = {
      val __obj = js.Dynamic.literal(addCertificatesByPEM = js.Any.fromFunction1(addCertificatesByPEM), getContentInfo = js.Any.fromFunction0(getContentInfo), getContentInfoEncodedHex = js.Any.fromFunction0(getContentInfoEncodedHex), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getPEM = js.Any.fromFunction0(getPEM), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], signerInfoList = signerInfoList.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedData]
    }
    
    @scala.inline
    implicit class SignedDataMutableBuilder[Self <: SignedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCertificatesByPEM(value: String => Unit): Self = StObject.set(x, "addCertificatesByPEM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContentInfo(value: () => ContentInfo): Self = StObject.set(x, "getContentInfo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentInfoEncodedHex(value: () => String): Self = StObject.set(x, "getContentInfoEncodedHex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPEM(value: () => String): Self = StObject.set(x, "getPEM", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSignerInfoList(value: js.Array[SignerInfo]): Self = StObject.set(x, "signerInfoList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerInfoListVarargs(value: SignerInfo*): Self = StObject.set(x, "signerInfoList", js.Array(value :_*))
    }
  }
  
  /**
    * class for SignerInfo ASN.1 structure of CMS SignedData
    * @param params associative array of parameters
    * @description
    * ```
    * SignerInfo ::= SEQUENCE {
    *    version CMSVersion,
    *    sid SignerIdentifier,
    *    digestAlgorithm DigestAlgorithmIdentifier,
    *    signedAttrs [0] IMPLICIT SignedAttributes OPTIONAL,
    *    signatureAlgorithm SignatureAlgorithmIdentifier,
    *    signature SignatureValue,
    *    unsignedAttrs [1] IMPLICIT UnsignedAttributes OPTIONAL }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SignerInfo();
    * o.setSignerIdentifier(certPEMstring);
    * o.dSignedAttrs.add(new KJUR.asn1.cms.ContentType({name: 'data'}));
    * o.dSignedAttrs.add(new KJUR.asn1.cms.MessageDigest({hex: 'a1b2...'}));
    * o.dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
    * o.sign(privteKeyParam, "SHA1withRSA");
    */
  @js.native
  trait SignerInfo
    extends StObject
       with ASN1Object {
    
    def addUnsigned(attr: Attribute): Unit = js.native
    
    /**
      * set ContentType/MessageDigest/DigestAlgorithms for SignerInfo/SignedData
      * @param params JSON parameter to set content related field
      * @description
      * This method will specify following fields by a parameters:
      *
      * - add ContentType signed attribute by encapContentInfo
      * - add MessageDigest signed attribute by encapContentInfo and hashAlg
      * - add a hash algorithm used in MessageDigest to digestAlgorithms field of SignedData
      * - set a hash algorithm used in MessageDigest to digestAlgorithm field of SignerInfo
      *
      * Argument 'params' is an associative array having following elements:
      *
      * - eciObj - `KJUR.asn1.cms.EncapsulatedContentInfo` object
      * - sdObj - `KJUR.asn1.cms.SignedData` object (Option) to set DigestAlgorithms
      * - hashAlg - string of hash algorithm name which is used for MessageDigest attribute
      *
      * some of elements can be omited.
      * @example
      * sd = new KJUR.asn1.cms.SignedData();
      * signerInfo.setForContentAndHash({sdObj: sd,
      *                                  eciObj: sd.dEncapContentInfo,
      *                                  hashAlg: 'sha256'});
      */
    def setForContentAndHash(params: EciObj): Unit = js.native
    
    def setSignerIdentifier(params: String): Unit = js.native
    
    def sign(keyParam: String, sigAlg: String): Unit = js.native
    def sign(keyParam: E, sigAlg: String): Unit = js.native
    def sign(keyParam: DSA, sigAlg: String): Unit = js.native
    def sign(keyParam: ECDSA, sigAlg: String): Unit = js.native
    def sign(keyParam: JsonWebKey, sigAlg: String): Unit = js.native
    def sign(keyParam: RSAKey, sigAlg: String): Unit = js.native
  }
  
  /**
    * class for CMS SigningCertificate attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningCertificate ::= SEQUENCE {
    *    certs SEQUENCE OF ESSCertID,
    *    policies SEQUENCE OF PolicyInformation OPTIONAL }
    * ESSCertID ::= SEQUENCE {
    *    certHash Hash,
    *    issuerSerial IssuerSerial OPTIONAL }
    * IssuerSerial ::= SEQUENCE {
    *    issuer GeneralNames,
    *    serialNumber CertificateSerialNumber }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SigningCertificate({array: [certPEM]});
    */
  trait SigningCertificate
    extends StObject
       with Attribute {
    
    def setCerts(listPEM: js.Array[String]): Unit
  }
  object SigningCertificate {
    
    @scala.inline
    def apply(
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setCerts: js.Array[String] => Unit
    ): SigningCertificate = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setCerts = js.Any.fromFunction1(setCerts))
      __obj.asInstanceOf[SigningCertificate]
    }
    
    @scala.inline
    implicit class SigningCertificateMutableBuilder[Self <: SigningCertificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetCerts(value: js.Array[String] => Unit): Self = StObject.set(x, "setCerts", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * class for CMS SigningCertificateV2 attribute
    * @param params associative array of parameters
    * @description
    * ```
    * oid-signingCertificateV2 = 1.2.840.113549.1.9.16.2.47
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningCertificateV2 ::=  SEQUENCE {
    *    certs        SEQUENCE OF ESSCertIDv2,
    *    policies     SEQUENCE OF PolicyInformation OPTIONAL }
    * ESSCertIDv2 ::=  SEQUENCE {
    *    hashAlgorithm           AlgorithmIdentifier
    *                            DEFAULT {algorithm id-sha256},
    *    certHash                Hash,
    *    issuerSerial            IssuerSerial OPTIONAL }
    * Hash ::= OCTET STRING
    * IssuerSerial ::= SEQUENCE {
    *    issuer                  GeneralNames,
    *    serialNumber            CertificateSerialNumber }
    * ```
    * @example
    * // hash algorithm is sha256 by default:
    * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM]});
    * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM],
    *                                             hashAlg: 'sha512'});
    */
  trait SigningCertificateV2
    extends StObject
       with Attribute {
    
    def setCerts(listPEM: js.Array[String], hashAlg: String): Unit
  }
  object SigningCertificateV2 {
    
    @scala.inline
    def apply(
      getEncodedHex: () => String,
      getFreshValueHex: () => String,
      getLengthHexFromValue: () => String,
      getValueHex: () => String,
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setCerts: (js.Array[String], String) => Unit
    ): SigningCertificateV2 = {
      val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setCerts = js.Any.fromFunction2(setCerts))
      __obj.asInstanceOf[SigningCertificateV2]
    }
    
    @scala.inline
    implicit class SigningCertificateV2MutableBuilder[Self <: SigningCertificateV2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetCerts(value: (js.Array[String], String) => Unit): Self = StObject.set(x, "setCerts", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * class for CMS SigningTime attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningTime  ::= Time
    * Time ::= CHOICE {
    *    utcTime UTCTime,
    *    generalTime GeneralizedTime }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SigningTime(); // current time UTCTime by default
    * o = new KJUR.asn1.cms.SigningTime({type: 'gen'}); // current time GeneralizedTime
    * o = new KJUR.asn1.cms.SigningTime({str: '20140517093800Z'}); // specified GeneralizedTime
    * o = new KJUR.asn1.cms.SigningTime({str: '140517093800Z'}); // specified UTCTime
    */
  type SigningTime = Attribute
}
