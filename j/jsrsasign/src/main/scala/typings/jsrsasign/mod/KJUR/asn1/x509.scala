package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.anon.AnyExtendedKeyUsage
import typings.jsrsasign.anon.ArrayArray
import typings.jsrsasign.anon.ArrayCritical
import typings.jsrsasign.anon.ArrayExtname
import typings.jsrsasign.anon.ArrayParamUriParamcritica
import typings.jsrsasign.anon.Asn1params
import typings.jsrsasign.anon.Bin
import typings.jsrsasign.anon.BusinessCategory
import typings.jsrsasign.anon.CA
import typings.jsrsasign.anon.Cakey
import typings.jsrsasign.anon.Certissuer
import typings.jsrsasign.anon.Code
import typings.jsrsasign.anon.Critical
import typings.jsrsasign.anon.CriticalBoolean
import typings.jsrsasign.anon.CriticalExtname
import typings.jsrsasign.anon.Dpobj
import typings.jsrsasign.anon.Extname
import typings.jsrsasign.anon.Int
import typings.jsrsasign.anon.Reqauth
import typings.jsrsasign.anon.Rsaprvkey
import typings.jsrsasign.anon.Sn
import typings.jsrsasign.anon.StringParamcertissuerstri
import typings.jsrsasign.anon.Tlv
import typings.jsrsasign.anon.Uri
import typings.jsrsasign.anon.X500NameParamcertissuerst
import typings.jsrsasign.jsrsasign.CertificateTBSParams
import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.ExtensionParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X500NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X509CertificateParams
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import typings.jsrsasign.jsrsasignStrings.authorityinfoaccess_
import typings.jsrsasign.jsrsasignStrings.authoritykeyidentifier_
import typings.jsrsasign.jsrsasignStrings.basicconstraints_
import typings.jsrsasign.jsrsasignStrings.crldistributionpoints_
import typings.jsrsasign.jsrsasignStrings.extkeyusage_
import typings.jsrsasign.jsrsasignStrings.issueraltname_
import typings.jsrsasign.jsrsasignStrings.keyusage_
import typings.jsrsasign.jsrsasignStrings.subjectaltname_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's ASN.1 class for X.509 certificate library name space
  *
  * __FEATURES__
  *
  * - easily issue any kind of certificate
  * - APIs are very similar to BouncyCastle library ASN.1 classes. So easy to learn.
  *
  * __PROVIDED CLASSES__
  *
  * - `KJUR.asn1.x509.Certificate`
  * - `KJUR.asn1.x509.TBSCertificate`
  * - `KJUR.asn1.x509.Extension` abstract class
  * - `KJUR.asn1.x509.Extensions`
  * - `KJUR.asn1.x509.SubjectPublicKeyInfo`
  * - `KJUR.asn1.x509.AlgorithmIdentifier`
  * - `KJUR.asn1.x509.GeneralNames`
  * - `KJUR.asn1.x509.GeneralName`
  * - `KJUR.asn1.x509.X500Name`
  * - `KJUR.asn1.x509.RDN`
  * - `KJUR.asn1.x509.AttributeTypeAndValue`
  * - `KJUR.asn1.x509.DistributionPointName`
  * - `KJUR.asn1.x509.DistributionPoint`
  * - `KJUR.asn1.x509.PolicyInformation`
  * - `KJUR.asn1.x509.PolicyQualifierInfo`
  * - `KJUR.asn1.x509.UserNotice`
  * - `KJUR.asn1.x509.NoticeReference`
  * - `KJUR.asn1.x509.DisplayText`
  * - `KJUR.asn1.x509.CRL`
  * - `KJUR.asn1.x509.TBSCertList` (DEPRECATED)
  * - `KJUR.asn1.x509.CRLEntry`
  * - `KJUR.asn1.x509.OID`
  *
  * __SUPPORTED EXTENSIONS__
  *
  * - `KJUR.asn1.x509.BasicConstraints`
  * - `KJUR.asn1.x509.KeyUsage`
  * - `KJUR.asn1.x509.CRLDistributionPoints`
  * - `KJUR.asn1.x509.CertificatePolicies`
  * - `KJUR.asn1.x509.ExtKeyUsage`
  * - `KJUR.asn1.x509.AuthorityKeyIdentifier`
  * - `KJUR.asn1.x509.SubjectKeyIdentifier`
  * - `KJUR.asn1.x509.AuthorityInfoAccess`
  * - `KJUR.asn1.x509.SubjectAltName`
  * - `KJUR.asn1.x509.IssuerAltName`
  * - `KJUR.asn1.x509.CertificatePolicies`
  * - `KJUR.asn1.x509.CRLNumber`
  * - `KJUR.asn1.x509.CRLReason`
  * - `KJUR.asn1.x509.OCSPNonce`
  * - `KJUR.asn1.x509.OCSPNoCheck`
  * - `KJUR.asn1.x509.AdobeTimeStamp`
  * - `KJUR.asn1.x509.SubjectDirectoryAttributes`
  * - `KJUR.asn1.x509.PrivateExtension`
  *
  * NOTE: `SubjectAltName` and `IssuerAltName` extensions were supported since
  * jsrsasign 6.2.3 asn1x509 1.0.19.
  * NOTE: `CeritifcatePolicies` supported supported since jsrsasign 8.0.23 asn1x509 1.1.12
  */
object x509 {
  
  /**
    * AdobeTimeStamp X.509v3 extension ASN.1 encoder class<br/>
    * @since jsrsasign 10.0.1 asn1x509 2.1.4
    * @param params JSON object for AdobeTimeStamp extension parameter
    * @see KJUR.asn1.x509.Extensions
    * @see X509#getExtAdobeTimeStamp
    * @description
    * This class represents
    * AdobeTimeStamp X.509v3 extension value defined in
    * <a href="https://www.adobe.com/devnet-docs/acrobatetk/tools/DigSigDC/oids.html">
    * Adobe site</a> as JSON object.
    * <pre>
    * adbe- OBJECT IDENTIFIER ::=  { adbe(1.2.840.113583) acrobat(1) security(1) x509Ext(9) 1 }
    *  ::= SEQUENCE {
    *     version INTEGER  { v1(1) }, -- extension version
    *     location GeneralName (In v1 GeneralName can be only uniformResourceIdentifier)
    *     requiresAuth        boolean (default false), OPTIONAL }
    * </pre>
    * Constructor of this class may have following parameters:
    * <ul>
    * <li>{String}uri - RFC 3161 time stamp service URL</li>
    * <li>{Boolean}reqauth - authentication required or not</li>
    * </ul>
    * </pre>
    * <br/>
    * NOTE: This extesion doesn't seem to have official name. This may be called as "pdfTimeStamp".
    * @example
    * new KJUR.asn1.x509.AdobeTimesStamp({
    *   uri: "http://tsa.example.com/",
    *   reqauth: true
    * }
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.AdobeTimeStamp")
  @js.native
  open class AdobeTimeStamp ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension {
    def this(params: Reqauth) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * AlgorithmIdentifier ASN.1 structure class
    * @param params associative array of parameters (ex. {'name': 'SHA1withRSA'})
    * @description
    * The 'params' argument is an associative array and has following parameters:
    *
    * - name: algorithm name (MANDATORY, ex. sha1, SHA256withRSA)
    * - asn1params: explicitly specify ASN.1 object for algorithm. (OPTION)
    * - paramempty: set algorithm parameter to NULL by force.
    * If paramempty is false, algorithm parameter will be set automatically.
    * If paramempty is false and algorithm name is "*withDSA" or "withECDSA" parameter field of
    * AlgorithmIdentifier will be ommitted otherwise
    * it will be NULL by default.
    * (OPTION, DEFAULT = false)
    *
    * @example
    * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "sha1"});
    * // set parameter to NULL authomatically if algorithm name is "*withRSA".
    * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "SHA256withRSA"});
    * // set parameter to NULL authomatically if algorithm name is "rsaEncryption".
    * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "rsaEncryption"});
    * // SHA256withRSA and set parameter empty by force
    * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "SHA256withRSA", paramempty: true});
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.AlgorithmIdentifier")
  @js.native
  open class AlgorithmIdentifier ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AlgorithmIdentifier {
    def this(params: Asn1params) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * AttributeTypeAndValue ASN.1 structure class
    * @param params associative array of parameters (ex. {'str': 'C=US'})
    * @see KJUR.asn1.x509.X500Name
    * @see KJUR.asn1.x509.RDN
    * @see KJUR.asn1.x509.AttributeTypeAndValue
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.AttributeTypeAndValue")
  @js.native
  open class AttributeTypeAndValue protected ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AttributeTypeAndValue {
    def this(params: StringParam) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * AuthorityInfoAccess ASN.1 structure class
    * @param params associative array of parameters
    * @description
    * ```
    * id-pe OBJECT IDENTIFIER  ::=  { id-pkix 1 }
    * id-pe-authorityInfoAccess OBJECT IDENTIFIER ::= { id-pe 1 }
    * AuthorityInfoAccessSyntax  ::=
    *         SEQUENCE SIZE (1..MAX) OF AccessDescription
    * AccessDescription  ::=  SEQUENCE {
    *         accessMethod          OBJECT IDENTIFIER,
    *         accessLocation        GeneralName  }
    * id-ad OBJECT IDENTIFIER ::= { id-pkix 48 }
    * id-ad-caIssuers OBJECT IDENTIFIER ::= { id-ad 2 }
    * id-ad-ocsp OBJECT IDENTIFIER ::= { id-ad 1 }
    * ```
    * @example
    * e1 = new KJUR.asn1.x509.AuthorityInfoAccess({
    *   array: [{
    *     accessMethod:{'oid': '1.3.6.1.5.5.7.48.1'},
    *     accessLocation:{'uri': 'http://ocsp.cacert.org'}
    *   }]
    * });
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.AuthorityInfoAccess")
  @js.native
  open class AuthorityInfoAccess ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AuthorityInfoAccess {
    def this(params: ArrayParam[ExtensionParam]) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getExtnValueHex(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /* CompleteClass */
    override def setAccessDescriptionArray(accessDescriptionArray: js.Array[ExtensionParam]): Unit = js.native
  }
  
  /**
    * AuthorityKeyIdentifier ASN.1 structure class
    * @param params associative array of parameters (ex. {'uri': 'http://a.com/', 'critical': true})
    * @description
    * ```
    * d-ce-authorityKeyIdentifier OBJECT IDENTIFIER ::=  { id-ce 35 }
    * AuthorityKeyIdentifier ::= SEQUENCE {
    *    keyIdentifier             [0] KeyIdentifier           OPTIONAL,
    *    authorityCertIssuer       [1] GeneralNames            OPTIONAL,
    *    authorityCertSerialNumber [2] CertificateSerialNumber OPTIONAL  }
    * KeyIdentifier ::= OCTET STRING
    * ```
    * @example
    * e1 = new KJUR.asn1.x509.AuthorityKeyIdentifier({
    *   critical: true,
    *   kid:    {hex: '89ab'},
    *   issuer: {str: '/C=US/CN=a'},
    *   sn:     {hex: '1234'}
    * });
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.AuthorityKeyIdentifier")
  @js.native
  open class AuthorityKeyIdentifier ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AuthorityKeyIdentifier {
    def this(params: Critical) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * BasicConstraints ASN.1 structure class
    * @param params associative array of parameters (ex. {'cA': true, 'critical': true})
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.BasicConstraints")
  @js.native
  open class BasicConstraints ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.BasicConstraints {
    def this(params: CA) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getExtnValueHex(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * X.509 CRL class to sign and generate hex encoded CRL
    * @param params associative array of parameters (ex. {'tbsobj': obj, 'rsaprvkey': key})
    * @description
    * As for argument 'params' for constructor, you can specify one of
    * following properties:
    *
    * - tbsobj - specify `KJUR.asn1.x509.TBSCertList` object to be signed
    * - rsaprvkey - specify `RSAKey` object CA private key
    *
    * NOTE: 'params' can be omitted.
    * __EXAMPLE__
    * @example
    * var prvKey = new RSAKey(); // CA's private key
    * prvKey.readPrivateKeyFromASN1HexString("3080...");
    * var crl = new KJUR.asn1x509.CRL({'tbsobj': tbs, 'prvkeyobj': prvKey});
    * crl.sign(); // issue CRL by CA's private key
    * var hCRL = crl.getEncodedHex();
    *
    * // CertificateList  ::=  SEQUENCE  {
    * //     tbsCertList          TBSCertList,
    * //     signatureAlgorithm   AlgorithmIdentifier,
    * //     signatureValue       BIT STRING  }
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.CRL")
  @js.native
  open class CRL ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.CRL {
    def this(params: Rsaprvkey) = this()
    
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
      * get PEM formatted CRL string after signed.
      * @return PEM formatted string of CRL
      * @description
      * This method returns a string of PEM formatted CRL.
      * @example
      * crl = new KJUR.asn1.x509.CRL({...});
      * crl.getPEM() →
      * "-----BEGIN X509 CRL-----\r\n..."
      */
    /* CompleteClass */
    override def getPEM(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /**
      * sign TBSCertList and set signature value internally
      * @example
      * var cert = new KJUR.asn1.x509.CRL({'tbsobj': tbs, 'prvkeyobj': prvKey});
      * cert.sign();
      */
    /* CompleteClass */
    override def sign(): Unit = js.native
  }
  
  /**
    * CRLDistributionPoints ASN.1 structure class
    * @param params associative array of parameters (ex. {'uri': 'http://a.com/', 'critical': true})
    * @description
    * ```
    * id-ce-cRLDistributionPoints OBJECT IDENTIFIER ::=  { id-ce 31 }
    *
    * CRLDistributionPoints ::= SEQUENCE SIZE (1..MAX) OF DistributionPoint
    *
    * DistributionPoint ::= SEQUENCE {
    *      distributionPoint       [0]     DistributionPointName OPTIONAL,
    *      reasons                 [1]     ReasonFlags OPTIONAL,
    *      cRLIssuer               [2]     GeneralNames OPTIONAL }
    *
    * DistributionPointName ::= CHOICE {
    *      fullName                [0]     GeneralNames,
    *      nameRelativeToCRLIssuer [1]     RelativeDistinguishedName }
    *
    * ReasonFlags ::= BIT STRING {
    *      unused                  (0),
    *      keyCompromise           (1),
    *      cACompromise            (2),
    *      affiliationChanged      (3),
    *      superseded              (4),
    *      cessationOfOperation    (5),
    *      certificateHold         (6),
    *      privilegeWithdrawn      (7),
    *      aACompromise            (8) }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.CRLDistributionPoints")
  @js.native
  open class CRLDistributionPoints ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.CRLDistributionPoints {
    def this(params: Uri) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getExtnValueHex(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /* CompleteClass */
    override def setByDPArray(dpArray: js.Array[typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]): Unit = js.native
    
    /* CompleteClass */
    override def setByOneURI(uri: String): Unit = js.native
  }
  
  /**
    * ASN.1 CRLEntry structure class for CRL
    * @param params associative array of parameters (ex. {})
    * @example
    * var e = new KJUR.asn1.x509.CRLEntry({'time': {'str': '130514235959Z'}, 'sn': {'int': 234}});
    *
    * // revokedCertificates     SEQUENCE OF SEQUENCE  {
    * //     userCertificate         CertificateSerialNumber,
    * //     revocationDate          Time,
    * //     crlEntryExtensions      Extensions OPTIONAL
    * //                             -- if present, version MUST be v2 }
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.CRLEntry")
  @js.native
  open class CRLEntry ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.CRLEntry {
    def this(params: Sn) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /**
      * set DERInteger parameter for serial number of revoked certificate
      * @param intParam DERInteger parameter for certificate serial number
      * @example
      * entry.setCertSerial({'int': 3});
      */
    /* CompleteClass */
    override def setCertSerial(intParam: IntegerParam): Unit = js.native
    
    /**
      * set Time parameter for revocation date
      * @param timeParam Time parameter for revocation date
      * @example
      * entry.setRevocationDate({'str': '130508235959Z'});
      */
    /* CompleteClass */
    override def setRevocationDate(timeParam: StringParam): Unit = js.native
  }
  
  /**
    * CRLNumber CRL extension ASN.1 structure class.
    * @param params
    * @description
    * This class represents ASN.1 structure for CRLNumber CRL extension defined in <a href="https://tools.ietf.org/html/rfc5280#section-5.2.3"> RFC 5280 5.2.3</a>.
    * <pre>
    * id-ce-cRLNumber OBJECT IDENTIFIER ::= { id-ce 20 }
    * CRLNumber ::= INTEGER (0..MAX)
    * </pre>
    * Constructor of this class may have following parameters:
    * - {String}extname - name "cRLNumber". It is ignored in this class but required to use with {@link KJUR.asn1.x509.Extensions} class. (OPTION)</li>
    * - {Object}num - CRLNumber value to specify {@link KJUR.asn1.DERInteger} parameter.
    * - {Boolean}critical - critical flag. Generally false and not specified in this class.(OPTION)
    *
    * @example
    * new KJUR.asn1.x509.CRLNumber({extname:'cRLNumber',
    *                               num:{'int':147}})
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.CRLNumber")
  @js.native
  open class CRLNumber ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: Extname) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * X.509 Certificate class to sign and generate hex encoded certificate
    * @param params JSON object for Certificate parameters
    * @description
    * <br/>
    * This class provides Certificate ASN.1 class structure
    * defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.1">
    * RFC 5280 4.1</a>.
    * <pre>
    * Certificate  ::=  SEQUENCE  {
    *      tbsCertificate       TBSCertificate,
    *      signatureAlgorithm   AlgorithmIdentifier,
    *      signatureValue       BIT STRING  }
    * </pre>
    * Parameter "params" JSON object can be
    * the same as {@link KJUR.asn1.x509.TBSCertificate}.
    * Then they are used to generate TBSCertificate.
    * Additionally just for Certificate, following parameters can be used:
    * <ul>
    * <li>{TBSCertfificate}tbsobj -
    * specifies {@link KJUR.asn1.x509.TBSCertificate}
    * object to be signed if needed.
    * When this isn't specified,
    * this will be set from other parametes of TBSCertificate.
    * <li>{Object}cakey (OPTION) - specifies certificate signing private key.
    * Parameter "cakey" or "sighex" shall be specified. Following
    * values can be specified:
    *   <ul>
    *   <li>PKCS#1/5 or PKCS#8 PEM string of private key
    *   <li>RSAKey/DSA/ECDSA key object. {@link KEYUTIL.getKey} is useful
    *   to generate a key object.
    *   </ul>
    *
    * <li>{String}sighex (OPTION) - hexadecimal string of signature value
    * (i.e. ASN.1 value(V) of signatureValue BIT STRING without
    * unused bits)
    * </ul>
    * CAUTION: APIs of this class have been totally updated without
    * backward compatibility since jsrsasign 9.0.0.<br/>
    * NOTE1: 'params' can be omitted.<br/>
    * NOTE2: DSA/ECDSA is also supported for CA signging key from asn1x509 1.0.6.
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({
    *  version: 3,
    *  serial: {hex: "1234..."},
    *  sigalg: "SHA256withRSAandMGF1",
    *  ...
    *  sighex: "1d3f..." // sign() method won't be called
    * });
    *
    * // sighex will by calculated by signing with cakey
    * var cert = new KJUR.asn1.x509.Certificate({
    *  version: 3,
    *  serial: {hex: "2345..."},
    *  sigalg: "SHA256withRSA",
    *  ...
    *  cakey: "-----BEGIN PRIVATE KEY..."
    * });
    *
    * // use TBSCertificate object to sign
    * var cert = new KJUR.asn1.x509.Certificate({
    *  tbsobj: <<OBJ>>,
    *  sigalg: "SHA256withRSA",
    *  cakey: "-----BEGIN PRIVATE KEY..."
    * });
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.Certificate")
  @js.native
  open class Certificate ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Certificate {
    def this(params: X509CertificateParams) = this()
    
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
      * get PEM formatted certificate string after signed
      * @return PEM formatted string of certificate
      * @since jsrsasign 9.0.0 asn1hex 2.0.0
      * @description
      * This method returns a string of PEM formatted
      * certificate.
      * @example
      * cert = new KJUR.asn1.x509.Certificate({...});
      * cert.getPEM() &rarr;
      * "-----BEGIN CERTIFICATE-----\r\n..."
      */
    /* CompleteClass */
    override def getPEM(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /**
      * set parameter<br/>
      * @param params JSON object of certificate parameters
      * @description
      * This method will set parameter
      * {@link KJUR.asn1.x509.Certificate#params}
      * to this object.
      * @example
      * cert = new KJUR.asn1.x509.Certificate();
      * cert.setByParam({
      *   version: 3,
      *   serial: {hex: "1234..."},
      *   ...
      * });
      */
    /* CompleteClass */
    override def setByParam(params: X509CertificateParams): Unit = js.native
  }
  
  /**
    * CertificatePolicies ASN.1 structure class
    * @param params associative array of parameters
    * @since jsrsasign 8.0.23 asn1x509 1.1.12
    * @see KJUR.asn1.x509.CertificatePolicies
    * @see KJUR.asn1.x509.PolicyInformation
    * @see KJUR.asn1.x509.PolicyQualifierInfo
    * @see KJUR.asn1.x509.UserNotice
    * @see KJUR.asn1.x509.NoticeReference
    * @see KJUR.asn1.x509.DisplayText
    * @description
    * This class represents
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.4">
    * CertificatePolicies extension defined in RFC 5280 4.2.1.4</a>.
    * <pre>
    * id-ce-certificatePolicies OBJECT IDENTIFIER ::=  { id-ce 32 }
    * CertificatePolicies ::= SEQUENCE SIZE (1..MAX) OF PolicyInformation
    * </pre>
    * Its constructor can have following parameters:
    * <ul>
    * <li>array - array of {@link KJUR.asn1.x509.PolicyInformation} parameter</li>
    * <li>critical - boolean: critical flag</li>
    * </ul>
    * NOTE: Returned JSON value format have been changed without
    * backward compatibility since jsrsasign 9.0.0 asn1x509 2.0.0.
    * @example
    * e1 = new KJUR.asn1.x509.CertificatePolicies({
    *   array: [
    *     { policyoid: "1.2.3.4.5",
    *       array: [
    *         { cps: "https://example.com/repository" },
    *         { unotice: {
    *           noticeref: { // CA SHOULD NOT use this by RFC
    *             org: {type: "ia5", str: "Sample Org"},
    *             noticenum: [{int: 5}, {hex: "01af"}]
    *           },
    *           exptext: {type: "ia5", str: "Sample Policy"}
    *         }}
    *       ]
    *     }
    *   ],
    *   critical: true
    * });
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.CertificatePolicies")
  @js.native
  open class CertificatePolicies ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension {
    def this(params: ArrayCritical) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * DistributionPoint ASN.1 structure class
    * @description
    * ```
    * DistributionPoint ::= SEQUENCE {
    *      distributionPoint       [0]     DistributionPointName OPTIONAL,
    *      reasons                 [1]     ReasonFlags OPTIONAL,
    *      cRLIssuer               [2]     GeneralNames OPTIONAL }
    *
    * DistributionPointName ::= CHOICE {
    *      fullName                [0]     GeneralNames,
    *      nameRelativeToCRLIssuer [1]     RelativeDistinguishedName }
    *
    * ReasonFlags ::= BIT STRING {
    *      unused                  (0),
    *      keyCompromise           (1),
    *      cACompromise            (2),
    *      affiliationChanged      (3),
    *      superseded              (4),
    *      cessationOfOperation    (5),
    *      certificateHold         (6),
    *      privilegeWithdrawn      (7),
    *      aACompromise            (8) }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.DistributionPoint")
  @js.native
  open class DistributionPoint ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.DistributionPoint {
    def this(params: Dpobj) = this()
    
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
  }
  
  /**
    * DistributionPointName ASN.1 structure class
    * @description
    * ```
    * DistributionPoint ::= SEQUENCE {
    *      distributionPoint       [0]     DistributionPointName OPTIONAL,
    *      reasons                 [1]     ReasonFlags OPTIONAL,
    *      cRLIssuer               [2]     GeneralNames OPTIONAL }
    *
    * DistributionPointName ::= CHOICE {
    *      fullName                [0]     GeneralNames,
    *      nameRelativeToCRLIssuer [1]     RelativeDistinguishedName }
    *
    * ReasonFlags ::= BIT STRING {
    *      unused                  (0),
    *      keyCompromise           (1),
    *      cACompromise            (2),
    *      affiliationChanged      (3),
    *      superseded              (4),
    *      cessationOfOperation    (5),
    *      certificateHold         (6),
    *      privilegeWithdrawn      (7),
    *      aACompromise            (8) }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.DistributionPointName")
  @js.native
  open class DistributionPointName protected ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.DistributionPointName {
    def this(gnOrRdn: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNames) = this()
    
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
  }
  
  /**
    * KeyUsage ASN.1 structure class
    * @param params associative array of parameters
    * @example
    * e1 = new KJUR.asn1.x509.ExtKeyUsage({
    *   critical: true,
    *   array: [
    *     {oid: '2.5.29.37.0'},  // anyExtendedKeyUsage
    *     {name: 'clientAuth'}
    *   ]
    * });
    * // id-ce-extKeyUsage OBJECT IDENTIFIER ::= { id-ce 37 }
    * // ExtKeyUsageSyntax ::= SEQUENCE SIZE (1..MAX) OF KeyPurposeId
    * // KeyPurposeId ::= OBJECT IDENTIFIER
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.ExtKeyUsage")
  @js.native
  open class ExtKeyUsage ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.ExtKeyUsage {
    def this(params: ArrayArray) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getExtnValueHex(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /* CompleteClass */
    override def setPurposeArray(purposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Unit = js.native
  }
  
  /**
    * base Extension ASN.1 structure class
    * @param params associative array of parameters (ex. {'critical': true})
    * @example
    * ```
    * // Extension  ::=  SEQUENCE  {
    * //     extnID      OBJECT IDENTIFIER,
    * //     critical    BOOLEAN DEFAULT FALSE,
    * //     extnValue   OCTET STRING  }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.Extension")
  @js.native
  open class Extension ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension {
    def this(params: CriticalBoolean) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  object Extension {
    
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * append X.509v3 extension to any specified array
      * @param name X.509v3 extension name
      * @param extParams associative array of extension parameters
      * @param a array to add specified extension
      * @see KJUR.asn1.x509.Extension
      * @description
      * This static function add a X.509v3 extension specified by name and extParams to
      * array 'a' so that 'a' will be an array of X.509v3 extension objects.
      * @example
      * var a = new Array();
      * KJUR.asn1.x509.Extension.appendByNameToArray("BasicConstraints", {'cA':true, 'critical': true}, a);
      * KJUR.asn1.x509.Extension.appendByNameToArray("KeyUsage", {'bin':'11'}, a);
      */
    /* static member */
    inline def appendByNameToArray(
      name: basicconstraints_ | keyusage_ | crldistributionpoints_ | extkeyusage_ | authoritykeyidentifier_ | authorityinfoaccess_ | subjectaltname_ | issueraltname_,
      extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
      a: js.Array[Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendByNameToArray")(name.asInstanceOf[js.Any], extParams.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * GeneralName ASN.1 structure class
    * @description
    * As for argument 'params' for constructor, you can specify one of
    * following properties:
    *
    * - rfc822 - rfc822Name[1] (ex. user1@foo.com)
    * - dns - dNSName[2] (ex. foo.com)
    * - uri - uniformResourceIdentifier[6] (ex. http://foo.com/)
    * - dn - directoryName[4] (ex. /C=US/O=Test)
    * - ldapdn - directoryName[4] (ex. O=Test,C=US)
    * - certissuer - directoryName[4] (PEM or hex string of cert)
    * - certsubj - directoryName[4] (PEM or hex string of cert)
    *
    * NOTE1: certissuer and certsubj were supported since asn1x509 1.0.10.
    * NOTE2: dn and ldapdn were supported since jsrsasign 6.2.3 asn1x509 1.0.19.
    *
    * Here is definition of the ASN.1 syntax:
    * ```
    * -- NOTE: under the CHOICE, it will always be explicit.
    * GeneralName ::= CHOICE {
    *   otherName                  [0] OtherName,
    *   rfc822Name                 [1] IA5String,
    *   dNSName                    [2] IA5String,
    *   x400Address                [3] ORAddress,
    *   directoryName              [4] Name,
    *   ediPartyName               [5] EDIPartyName,
    *   uniformResourceIdentifier  [6] IA5String,
    *   iPAddress                  [7] OCTET STRING,
    *   registeredID               [8] OBJECT IDENTIFIER }
    * ```
    *
    * @example
    * gn = new KJUR.asn1.x509.GeneralName({rfc822:     'test@aaa.com'});
    * gn = new KJUR.asn1.x509.GeneralName({dns:        'aaa.com'});
    * gn = new KJUR.asn1.x509.GeneralName({uri:        'http://aaa.com/'});
    * gn = new KJUR.asn1.x509.GeneralName({dn:         '/C=US/O=Test'});
    * gn = new KJUR.asn1.x509.GeneralName({ldapdn:     'O=Test,C=US'});
    * gn = new KJUR.asn1.x509.GeneralName({certissuer: certPEM});
    * gn = new KJUR.asn1.x509.GeneralName({certsubj:   certPEM});
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.GeneralName")
  @js.native
  open class GeneralName ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralName {
    def this(params: GeneralNameParam) = this()
    
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def setByParam(params: js.Array[String]): Unit = js.native
  }
  
  /**
    * GeneralNames ASN.1 structure class
    * @example
    * gns = new KJUR.asn1.x509.GeneralNames([{'uri': 'http://aaa.com/'}, {'uri': 'http://bbb.com/'}]);
    *
    * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.GeneralNames")
  @js.native
  open class GeneralNames protected ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNames {
    def this(paramsArray: js.Array[UriParam]) = this()
    
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /**
      * set a array of `KJUR.asn1.x509.GeneralName` parameters
      * @param paramsArray Array of `KJUR.asn1.x509.GeneralNames`
      * @example
      * gns = new KJUR.asn1.x509.GeneralNames();
      * gns.setByParamArray([{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]);
      */
    /* CompleteClass */
    override def setByParamArray(paramsArray: js.Array[GeneralNameParam]): Unit = js.native
  }
  
  /**
    * IssuerAltName ASN.1 structure class
    * @param params associative array of parameters
    * @see KJUR.asn1.x509.GeneralNames
    * @see KJUR.asn1.x509.GeneralName
    * @description
    * This class provides X.509v3 IssuerAltName extension.
    * ```
    * id-ce-subjectAltName OBJECT IDENTIFIER ::=  { id-ce 18 }
    * IssuerAltName ::= GeneralNames
    * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
    * GeneralName ::= CHOICE {
    *   otherName                  [0] OtherName,
    *   rfc822Name                 [1] IA5String,
    *   dNSName                    [2] IA5String,
    *   x400Address                [3] ORAddress,
    *   directoryName              [4] Name,
    *   ediPartyName               [5] EDIPartyName,
    *   uniformResourceIdentifier  [6] IA5String,
    *   iPAddress                  [7] OCTET STRING,
    *   registeredID               [8] OBJECT IDENTIFIER }
    * ```
    * @example
    * e1 = new KJUR.asn1.x509.IssuerAltName({
    *   critical: true,
    *   array: [{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]
    * });
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.IssuerAltName")
  @js.native
  open class IssuerAltName ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.IssuerAltName {
    def this(params: ArrayParamUriParamcritica) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getExtnValueHex(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /* CompleteClass */
    override def setNameArray(paramsArray: js.Array[UriParam]): Unit = js.native
  }
  
  /**
    * KeyUsage ASN.1 structure class
    * @param params associative array of parameters (ex. {'bin': '11', 'critical': true})
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.KeyUsage")
  @js.native
  open class KeyUsage ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.KeyUsage {
    def this(params: Bin) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getExtnValueHex(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /* CompleteClass */
    override def setPurposeArray(purposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Unit = js.native
  }
  
  /**
    * OCSPNoCheck certificate ASN.1 structure class<br/>
    * @since jsrsasign 9.1.6 asn1x509 2.1.2
    * @param params JSON object for OCSPNoCheck extension
    * @see KJUR.asn1.x509.Extensions
    * @see X509#getExtOCSPNoCheck
    * @description
    * This class represents
    * OCSPNoCheck extension value defined in
    * <a href="https://tools.ietf.org/html/rfc6960#section-4.2.2.2.1">
    * RFC 6960 4.2.2.2.1</a> as JSON object.
    * <pre>
    * id-pkix-ocsp-nocheck OBJECT IDENTIFIER ::= { id-pkix-ocsp 5 }
    * </pre>
    * Constructor of this class may have following parameters:
    * <ul>
    * <li>{String}extname - name "ocspNoCheck". It is ignored in this class but
    * required to use with {@link KJUR.asn1.x509.Extensions} class. (OPTION)</li>
    * <li>{Boolean}critical - critical flag. Generally false and not specified
    * in this class.(OPTION)</li>
    * </ul>
    *
    * @example
    * new KJUR.asn1.x509.OCSPNonce({extname:'ocspNoCheck'})
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.OCSPNoCheck")
  @js.native
  open class OCSPNoCheck ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension {
    def this(params: CriticalExtname) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * Nonce OCSP extension ASN.1 structure class<br/>
    * @since jsrsasign 9.1.6 asn1x509 2.1.2
    * @param params JSON object for Nonce extension
    * @see KJUR.asn1.ocsp.ResponseData
    * @see KJUR.asn1.x509.Extensions
    * @see X509#getExtOCSPNonce
    * @description
    * This class represents
    * Nonce OCSP extension value defined in
    * <a href="https://tools.ietf.org/html/rfc6960#section-4.4.1">
    * RFC 6960 4.4.1</a> as JSON object.
    * <pre>
    * id-pkix-ocsp           OBJECT IDENTIFIER ::= { id-ad-ocsp }
    * id-pkix-ocsp-nonce     OBJECT IDENTIFIER ::= { id-pkix-ocsp 2 }
    * Nonce ::= OCTET STRING
    * </pre>
    * Constructor of this class may have following parameters:
    * <ul>
    * <li>{String}extname - name "ocspNonce". It is ignored in this class but
    * required to use with {@link KJUR.asn1.x509.Extensions} class. (OPTION)</li>
    * <li>{String}hex - hexadecimal string of nonce value</li>
    * <li>{Number}int - integer of nonce value. "hex" or "int" needs to be
    * specified.</li>
    * <li>{Boolean}critical - critical flag. Generally false and not specified
    * in this class.(OPTION)</li>
    * </ul>
    *
    * @example
    * new KJUR.asn1.x509.OCSPNonce({extname:'ocspNonce',
    *                               hex: '12ab...'})
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.OCSPNonce")
  @js.native
  open class OCSPNonce ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension {
    def this(params: Int) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * static object for OID
    * @description
    * This class defines OID name and values.
    * AttributeType names registered in OID.atype2oidList are following:
    *
    * |short|long|OID|
    * |:------|:----|:----------|
    * |CN|commonName|2.5.4.3|
    * |L|localityName|2.5.4.7|
    * |ST|stateOrProvinceName|2.5.4.8|
    * |O|organizationName|2.5.4.10|
    * |OU|organizationalUnitName|2.5.4.11|
    * |C|countryName|2.5.4.6|
    * |STREET|streetAddress|2.5.4.6|
    * |DC|domainComponent|0.9.2342.19200300.100.1.25|
    * |UID|userId|0.9.2342.19200300.100.1.1|
    * |SN|surname|2.5.4.4|
    * |DN|distinguishedName|2.5.4.49|
    * |E|emailAddress|1.2.840.113549.1.9.1|
    * ||businessCategory|2.5.4.15|
    * ||postalCode|2.5.4.17|
    * ||jurisdictionOfIncorporationL|1.3.6.1.4.1.311.60.2.1.1|
    * ||jurisdictionOfIncorporationSP|1.3.6.1.4.1.311.60.2.1.2|
    * ||jurisdictionOfIncorporationC|1.3.6.1.4.1.311.60.2.1.3|
    */
  object OID {
    
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * get DERObjectIdentifier by registered attribute type name such like 'C' or 'CN'
      * @param atype short attribute type name such like 'C' or 'CN'
      * @example
      * KJUR.asn1.x509.OID.atype2obj('CN') → 2.5.4.3
      * KJUR.asn1.x509.OID.atype2obj('OU') → 2.5.4.11
      */
    inline def atype2obj(atype: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atype2obj")(atype.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** for short attribute type name and oid (ex. 'C' and '2.5.4.6') */
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID.atype2oidList")
    @js.native
    val atype2oidList: BusinessCategory = js.native
    
    /**
      * get DERObjectIdentifier by registered OID name
      * @param name OID
      * @example
      * var asn1ObjOID = OID.name2obj('SHA1withRSA');
      */
    inline def name2obj(name: String): typings.jsrsasign.jsrsasign.KJUR.asn1.DERObjectIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("name2obj")(name.asInstanceOf[js.Any]).asInstanceOf[typings.jsrsasign.jsrsasign.KJUR.asn1.DERObjectIdentifier]
    
    /**
      * convert OID name to OID value
      * @param OID name
      * @return dot noted Object Identifer string (ex. 1.2.3.4)
      * @description
      * This static method converts from OID name to OID string.
      * If OID is undefined then it returns empty string (i.e. '').
      * @example
      * KJUR.asn1.x509.OID.name2oid("authorityInfoAccess") → 1.3.6.1.5.5.7.1.1
      */
    inline def name2oid(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("name2oid")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** for oid name and oid (ex. 'keyUsage' and '2.5.29.15') */
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID.name2oidList")
    @js.native
    val name2oidList: AnyExtendedKeyUsage = js.native
    
    /**
      * convert OID to AttributeType name
      * @param oid dot noted Object Identifer string (ex. 1.2.3.4)
      * @return OID AttributeType name if registered otherwise oid
      * @description
      * This static method converts OID string to its AttributeType name.
      * If OID is not defined in OID.atype2oidList associative array then it returns OID
      * specified as argument.
      * @example
      * KJUR.asn1.x509.OID.oid2atype("2.5.4.3") → CN
      * KJUR.asn1.x509.OID.oid2atype("1.3.6.1.4.1.311.60.2.1.3") → jurisdictionOfIncorporationC
      * KJUR.asn1.x509.OID.oid2atype("0.1.2.3.4") → 0.1.2.3.4 // unregistered OID
      */
    inline def oid2atype(oid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("oid2atype")(oid.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * convert OID to name
      * @param oid dot noted Object Identifer string (ex. 1.2.3.4)
      * @return OID name if registered otherwise empty string
      * @description
      * This static method converts OID string to its name.
      * If OID is undefined then it returns empty string (i.e. '').
      * @example
      * KJUR.asn1.x509.OID.oid2name("1.3.6.1.5.5.7.1.1") → 'authorityInfoAccess'
      */
    inline def oid2name(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("oid2name")().asInstanceOf[String]
    inline def oid2name(oid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("oid2name")(oid.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /**
    * RDN (Relative Distinguished Name) ASN.1 structure class
    * @param params associative array of parameters (ex. {'str': 'C=US'})
    * @see KJUR.asn1.x509.X500Name
    * @see KJUR.asn1.x509.RDN
    * @see KJUR.asn1.x509.AttributeTypeAndValue
    * @description
    * This class provides RelativeDistinguishedName ASN.1 class structure
    * defined in [RFC 2253 section 2](https://tools.ietf.org/html/rfc2253#section-2).
    * ```
    * RelativeDistinguishedName ::= SET SIZE (1..MAX) OF
    *   AttributeTypeAndValue
    *
    * AttributeTypeAndValue ::= SEQUENCE {
    *   type  AttributeType,
    *   value AttributeValue }
    * ```
    *
    * NOTE: Multi-valued RDN is supported since jsrsasign 6.2.1 asn1x509 1.0.17.
    * @example
    * rdn = new KJUR.asn1.x509.RDN({str: "CN=test"});
    * rdn = new KJUR.asn1.x509.RDN({str: "O=a+O=bb+O=c"}); // multi-valued
    * rdn = new KJUR.asn1.x509.RDN({str: "O=a+O=b\\+b+O=c"}); // plus escaped
    * rdn = new KJUR.asn1.x509.RDN({str: "O=a+O=\"b+b\"+O=c"}); // double quoted
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.RDN")
  @js.native
  open class RDN ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.RDN {
    def this(params: StringParam) = this()
    
    /**
      * add one AttributeTypeAndValue by multi-valued string
      * @param s string of multi-valued RDN
      * @description
      * This method add multi-valued RDN to RDN object.
      * @example
      * rdn = new KJUR.asn1.x509.RDN();
      * rdn.addByMultiValuedString("CN=john+O=test");
      * rdn.addByMultiValuedString("O=a+O=b\+b\+b+O=c"); // multi-valued RDN with quoted plus
      * rdn.addByMultiValuedString("O=a+O=\"b+b+b\"+O=c"); // multi-valued RDN with quoted quotation
      */
    /* CompleteClass */
    override def addByMultiValuedString(s: String): Unit = js.native
    
    /**
      * add one AttributeTypeAndValue by string
      * @param s string of AttributeTypeAndValue
      * @return unspecified
      * @description
      * This method adds one AttributeTypeAndValue to RDN object.
      * @example
      * rdn = new KJUR.asn1.x509.RDN();
      * rdn.addByString("CN=john");
      * rdn.addByString("serialNumber=1234"); // for multi-valued RDN
      */
    /* CompleteClass */
    override def addByString(s: String): Unit = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  object RDN {
    
    @JSImport("jsrsasign", "KJUR.asn1.x509.RDN")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * parse multi-valued RDN string and split into array of 'AttributeTypeAndValue'
      * @param s multi-valued string of RDN
      * @return array of string of AttributeTypeAndValue
      * @description
      * This static method parses multi-valued RDN string and split into
      * array of AttributeTypeAndValue.
      * @example
      * KJUR.asn1.x509.RDN.parseString("CN=john") → ["CN=john"]
      * KJUR.asn1.x509.RDN.parseString("CN=john+OU=test") → ["CN=john", "OU=test"]
      * KJUR.asn1.x509.RDN.parseString('CN="jo+hn"+OU=test') → ["CN=jo+hn", "OU=test"]
      * KJUR.asn1.x509.RDN.parseString('CN=jo\+hn+OU=test') → ["CN=jo+hn", "OU=test"]
      * KJUR.asn1.x509.RDN.parseString("CN=john+OU=test+OU=t1") → ["CN=john", "OU=test", "OU=t1"]
      */
    /* static member */
    inline def parseString(s: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(s.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  /**
    * SubjectAltName ASN.1 structure class
    * @param params associative array of parameters
    * @see KJUR.asn1.x509.GeneralNames
    * @see KJUR.asn1.x509.GeneralName
    * @description
    * This class provides X.509v3 SubjectAltName extension.
    * ```
    * id-ce-subjectAltName OBJECT IDENTIFIER ::=  { id-ce 17 }
    * SubjectAltName ::= GeneralNames
    * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
    * GeneralName ::= CHOICE {
    *   otherName                  [0] OtherName,
    *   rfc822Name                 [1] IA5String,
    *   dNSName                    [2] IA5String,
    *   x400Address                [3] ORAddress,
    *   directoryName              [4] Name,
    *   ediPartyName               [5] EDIPartyName,
    *   uniformResourceIdentifier  [6] IA5String,
    *   iPAddress                  [7] OCTET STRING,
    *   registeredID               [8] OBJECT IDENTIFIER }
    * ```
    * @example
    * e1 = new KJUR.asn1.x509.SubjectAltName({
    *   critical: true,
    *   array: [{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]
    * });
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.SubjectAltName")
  @js.native
  open class SubjectAltName ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectAltName {
    def this(params: ArrayParamUriParamcritica) = this()
    
    /**
      * get hexadecimal string of ASN.1 TLV bytes
      * @return hexadecimal string of ASN.1 TLV
      */
    /* CompleteClass */
    override def getEncodedHex(): String = js.native
    
    /* CompleteClass */
    override def getExtnValueHex(): String = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /* CompleteClass */
    override def setNameArray(paramsArray: js.Array[UriParam]): Unit = js.native
  }
  
  /**
    * SubjectDirectoryAttributes ASN.1 structure class<br/>
    * name KJUR.asn1.x509.SubjectDirectoryAttributes
    * class SubjectDirectoryAttributes ASN.1 structure class
    * @param params associative array of parameters
    * extends KJUR.asn1.x509.Extension
    * @since jsrsasign 10.1.9 asn1x509 2.1.7
    * @description
    * This class provides X.509v3 SubjectDirectoryAttributes extension
    * defined in <a href="https://tools.ietf.org/html/rfc3739#section-3.3.2">
    * RFC 3739 Qualified Certificate Profile section 3.3.2</a>.
    * <pre>
    * SubjectDirectoryAttributes ::= Attributes
    * Attributes ::= SEQUENCE SIZE (1..MAX) OF Attribute
    * Attribute ::= SEQUENCE {
    *   type AttributeType
    *   values SET OF AttributeValue }
    * AttributeType ::= OBJECT IDENTIFIER
    * AttributeValue ::= ANY DEFINED BY AttributeType
    * </pre>
    * @example
    * e1 = new KJUR.asn1.x509.SubjectDirectoryAttributes({
    *   extname: "subjectDirectoryAttributes",
    *   array: [
    *     { attr: "dateOfBirth", str: "19701231230000Z" },
    *     { attr: "placeOfBirth", str: "Tokyo" },
    *     { attr: "gender", str: "F" },
    *     { attr: "countryOfCitizenship", str: "JP" },
    *     { attr: "countryOfResidence", str: "JP" }
    *   ]
    * });
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.SubjectDirectoryAttributes")
  @js.native
  open class SubjectDirectoryAttributes ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectDirectoryAttributes {
    def this(params: ArrayExtname) = this()
    
    /* CompleteClass */
    override def getExtnValueHex(): String = js.native
  }
  
  /**
    * SubjectKeyIdentifier extension ASN.1 structure class
    * @param params associative array of parameters (ex. {kid: {hex: '89ab...'}, critical: true})
    * @since asn1x509 1.1.7 jsrsasign 8.0.14
    * @description
    * This class represents ASN.1 structure for
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.2">
    * SubjectKeyIdentifier in RFC 5280</a>.
    * Constructor of this class may have following parameters:
    * <ul>
    * <li>kid - When key object (RSA, KJUR.crypto.ECDSA/DSA) or PEM string of subject public key or certificate is specified,
    *     key identifier will be automatically calculated by the method specified in RFC 5280. When a hexadecimal string is specifed, kid will be set explicitly by it.</li>
    * <li>critical - boolean to specify criticality of this extension
    * however conforming CA must mark this extension as non-critical in RFC 5280.</li>
    * </ul>
    * <pre>
    * d-ce-subjectKeyIdentifier OBJECT IDENTIFIER ::=  { id-ce 14 }
    * SubjectKeyIdentifier ::= KeyIdentifier
    * KeyIdentifier ::= OCTET STRING
    * </pre>
    *
    * @example
    * // set by hexadecimal string
    * e = new KJUR.asn1.x509.SubjectKeyIdentifier({kid: {hex: '89ab'}});
    * // set by PEM public key or certificate string
    * e = new KJUR.asn1.x509.SubjectKeyIdentifier({kid: "-----BEGIN CERTIFICATE..."});
    * // set by public key object
    * pubkey = KEYUTIL.getKey("-----BEGIN CERTIFICATE...");
    * e = new KJUR.asn1.x509.SubjectKeyIdentifier({kid: pubkey});
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.SubjectKeyIdentifier")
  @js.native
  open class SubjectKeyIdentifier ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectKeyIdentifier {
    def this(params: Any) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /**
      * set keyIdentifier value by DEROctetString parameter, key object or PEM file
      * @param param array of {@link KJUR.asn1.DERInteger} parameter
      * @since asn1x509 1.1.7 jsrsasign 8.0.14
      * @description
      * <ul>
      * <li>{str: "123"} - by raw string</li>
      * <li>{hex: "01af..."} - by hexadecimal value</li>
      * <li>RSAKey/DSA/ECDSA - by RSAKey, KJUR.crypto.{DSA/ECDSA} public key object.
      * key identifier value will be calculated by the method described in
      * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.2">RFC 5280 4.2.1.2 (1)</a>.
      * </li>
      * <li>certificate PEM string - extract subjectPublicKeyInfo from specified PEM
      * certificate and
      * key identifier value will be calculated by the method described in
      * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.2">RFC 5280 4.2.1.2 (1)</a>.
      * <li>PKCS#1/#8 public key PEM string - pem will be converted to a key object and
      * to PKCS#8 ASN.1 structure then calculate
      * a key identifier value will be calculated by the method described in
      * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.2">RFC 5280 4.2.1.2 (1)</a>.
      * </ul>
      *
      * NOTE1: Automatic key identifier calculation is supported
      * since jsrsasign 8.0.16.
      *
      * @see KEYUTIL.getKeyID
      *
      * @example
      * o = new KJUR.asn1.x509.SubjectKeyIdentifier();
      * // set by hexadecimal string
      * o.setKIDByParam({hex: '1ad9...'});
      * // set by SubjectPublicKeyInfo of PEM certificate string
      * o.setKIDByParam("-----BEGIN CERTIFICATE...");
      * // set by PKCS#8 PEM public key string
      * o.setKIDByParam("-----BEGIN PUBLIC KEY...");
      * // set by public key object
      * pubkey = KEYUTIL.getKey("-----BEGIN CERTIFICATE...");
      * o.setKIDByParam(pubkey);
      */
    /* CompleteClass */
    override def setKIDByParam(param: Any): Unit = js.native
  }
  
  /**
    * SubjectPublicKeyInfo ASN.1 structure class
    * @param params parameter for subject public key
    * @description
    * As for argument 'params' for constructor, you can specify one of
    * following properties:
    *
    * - `RSAKey` object
    * - `KJUR.crypto.ECDSA` object
    * - `KJUR.crypto.DSA` object
    *
    * NOTE1: 'params' can be omitted.
    * NOTE2: DSA/ECDSA key object is also supported since asn1x509 1.0.6.
    *
    * @example
    * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(RSAKey_object);
    * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(KJURcryptoECDSA_object);
    * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(KJURcryptoDSA_object);
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.SubjectPublicKeyInfo")
  @js.native
  open class SubjectPublicKeyInfo ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectPublicKeyInfo {
    def this(params: DSA) = this()
    def this(params: ECDSA) = this()
    def this(params: RSAKey) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
  
  /**
    * ASN.1 TBSCertList structure class for CRL
    * @param params associative array of parameters (ex. {})
    * @example
    *  var o = new KJUR.asn1.x509.TBSCertList();
    *  o.setSignatureAlgByParam({'name': 'SHA1withRSA'});
    *  o.setIssuerByParam({'str': '/C=US/O=a'});
    *  o.setNotThisUpdateByParam({'str': '130504235959Z'});
    *  o.setNotNextUpdateByParam({'str': '140504235959Z'});
    *  o.addRevokedCert({'int': 4}, {'str':'130514235959Z'}));
    *  o.addRevokedCert({'hex': '0f34dd'}, {'str':'130514235959Z'}));
    *
    * // TBSCertList  ::=  SEQUENCE  {
    * //        version                 Version OPTIONAL,
    * //                                     -- if present, MUST be v2
    * //        signature               AlgorithmIdentifier,
    * //        issuer                  Name,
    * //        thisUpdate              Time,
    * //        nextUpdate              Time OPTIONAL,
    * //        revokedCertificates     SEQUENCE OF SEQUENCE  {
    * //             userCertificate         CertificateSerialNumber,
    * //             revocationDate          Time,
    * //             crlEntryExtensions      Extensions OPTIONAL
    * //                                      -- if present, version MUST be v2
    * //                                  }  OPTIONAL,
    * //        crlExtensions           [0]  EXPLICIT Extensions OPTIONAL
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.TBSCertList")
  @js.native
  open class TBSCertList ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertList {
    
    /**
      * add revoked certificate by parameter
      * @param snParam DERInteger parameter for certificate serial number
      * @param timeParam Time parameter for revocation date
      * @example
      * tbsc.addRevokedCert({'int': 3}, {'str': '130508235959Z'});
      * @see KJUR.asn1.x509.Time
      */
    /* CompleteClass */
    override def addRevokedCert(snParam: IntegerParam, timeParam: StringParam): Unit = js.native
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /**
      * set issuer name field by parameter
      * @param x500NameParam X500Name parameter
      * @example
      * tbsc.setIssuerParam({'str': '/C=US/CN=b'});
      * @see KJUR.asn1.x509.X500Name
      */
    /* CompleteClass */
    override def setIssuerByParam(x500NameParam: StringParam): Unit = js.native
    
    /**
      * set nextUpdate field by parameter
      * @param timeParam Time parameter
      * @example
      * tbsc.setNextUpdateByParam({'str': '130508235959Z'});
      * @see KJUR.asn1.x509.Time
      */
    /* CompleteClass */
    override def setNextUpdateByParam(timeParam: StringParam): Unit = js.native
    
    /**
      * set signature algorithm field by parameter
      * @param algIdParam AlgorithmIdentifier parameter
      * @example
      * tbsc.setSignatureAlgByParam({'name': 'SHA1withRSA'});
      */
    /* CompleteClass */
    override def setSignatureAlgByParam(algIdParam: NameParam): Unit = js.native
    
    /**
      * set thisUpdate field by parameter
      * @param timeParam Time parameter
      * @example
      * tbsc.setThisUpdateByParam({'str': '130508235959Z'});
      * @see KJUR.asn1.x509.Time
      */
    /* CompleteClass */
    override def setThisUpdateByParam(timeParam: StringParam): Unit = js.native
  }
  
  /**
    * ASN.1 TBSCertificate structure class<br/>
    * @param params JSON object of TBSCertificate parameters
    *
    * @description
    * <br/>
    * NOTE: TBSCertificate class is updated without backward
    * compatibility from jsrsasign 9.0.0 asn1x509 2.0.0.
    * Most of methods are removed and parameters can be set
    * by JSON object.
    *
    * @example
    * new TBSCertificate({
    *  version: 3, // this can be omitted, the default is 3.
    *  serial: {hex: "1234..."}, // DERInteger parameter
    *  sigalg: "SHA256withRSA",
    *  issuer: {array:[[{type:'O',value:'Test',ds:'prn'}]]}, // X500Name parameter
    *  notbefore: "151231235959Z", // string, passed to Time
    *  notafter: "251231235959Z", // string, passed to Time
    *  subject: {array:[[{type:'O',value:'Test',ds:'prn'}]]}, // X500Name parameter
    *  sbjpubkey: "-----BEGIN...", // KEYUTIL.getKey pubkey parameter
    *  // As for extension parameters, please see extension class
    *  // All extension parameters need to have "extname" parameter additionaly.
    *  ext:[{
    *   extname:"keyUsage",critical:true,
    *   names:["digitalSignature","keyEncipherment"]
    *  },{
    *   extname:"cRLDistributionPoints",
    *   array:[{dpname:{full:[{uri:"http://example.com/a1.crl"}]}}]
    *  }, ...]
    * })
    *
    * var tbsc = new TBSCertificate();
    * tbsc.setByParam({version:3,serial:{hex:'1234...'},...});
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.TBSCertificate")
  @js.native
  open class TBSCertificate ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate {
    def this(params: CertificateTBSParams) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /**
      * get array of ASN.1 object for extensions<br/>
      * @param params JSON object of TBSCertificate parameters
      * @example
      * tbsc = new KJUR.asn1.x509.TBSCertificate();
      * tbsc.setByParam({version:3, serial:{hex:'1234...'},...});
      */
    /* CompleteClass */
    override def setByParam(params: CertificateTBSParams): Unit = js.native
  }
  
  /**
    * X500Name ASN.1 structure class
    * @param params associative array of parameters (ex. {'str': '/C=US/O=a'})
    * @see KJUR.asn1.x509.X500Name
    * @see KJUR.asn1.x509.RDN
    * @see KJUR.asn1.x509.AttributeTypeAndValue
    * @description
    * This class provides DistinguishedName ASN.1 class structure
    * defined in [RFC 2253 section 2](https://tools.ietf.org/html/rfc2253#section-2).
    * ```
    * DistinguishedName ::= RDNSequence
    *
    * RDNSequence ::= SEQUENCE OF RelativeDistinguishedName
    *
    * RelativeDistinguishedName ::= SET SIZE (1..MAX) OF
    *   AttributeTypeAndValue
    *
    * AttributeTypeAndValue ::= SEQUENCE {
    *   type  AttributeType,
    *   value AttributeValue }
    * ```
    *
    * For string representation of distinguished name in jsrsasign,
    * OpenSSL oneline format is used. Please see [wiki article](https://github.com/kjur/jsrsasign/wiki/NOTE-distinguished-name-representation-in-jsrsasign) for it.
    *
    * NOTE: Multi-valued RDN is supported since jsrsasign 6.2.1 asn1x509 1.0.17.
    * @example
    * // 1. construct with string
    * o = new KJUR.asn1.x509.X500Name({str: "/C=US/O=aaa/OU=bbb/CN=foo@example.com"});
    * o = new KJUR.asn1.x509.X500Name({str: "/C=US/O=aaa+CN=contact@example.com"}); // multi valued
    * // 2. construct by object
    * o = new KJUR.asn1.x509.X500Name({C: "US", O: "aaa", CN: "http://example.com/"});
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.X500Name")
  @js.native
  open class X500Name protected ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X500Name {
    def this(params: Certissuer) = this()
    def this(params: StringParamcertissuerstri) = this()
    def this(params: X500NameParamcertissuerst) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
    
    /**
      * set DN by LDAP(RFC 2253) distinguished name string
      * @param dnStr distinguished name by LDAP string (ex. O=aaa,C=US)
      * @example
      * name = new KJUR.asn1.x509.X500Name();
      * name.setByLdapString("CN=foo@example.com,OU=bbb,O=aaa,C=US");
      */
    /* CompleteClass */
    override def setByLdapString(dnStr: String): Unit = js.native
    
    /**
      * set DN by associative array
      * @param dnObj associative array of DN (ex. {C: "US", O: "aaa"})
      * @example
      * name = new KJUR.asn1.x509.X500Name();
      * name.setByObject({C: "US", O: "aaa", CN="http://example.com/"1});
      */
    /* CompleteClass */
    override def setByObject(dnObj: X500NameParam): Unit = js.native
    
    /**
      * set DN by OpenSSL oneline distinguished name string
      * @param dnStr distinguished name by string (ex. /C=US/O=aaa)
      * @example
      * name = new KJUR.asn1.x509.X500Name();
      * name.setByString("/C=US/O=aaa/OU=bbb/CN=foo@example.com");
      */
    /* CompleteClass */
    override def setByString(dnStr: String): Unit = js.native
  }
  object X500Name {
    
    @JSImport("jsrsasign", "KJUR.asn1.x509.X500Name")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * convert LDAP(RFC 2253) distinguished name format string to OpenSSL oneline format
      * @param s distinguished name string in LDAP(RFC 2253) format (ex. O=test,C=US)
      * @return distinguished name string in OpenSSL oneline format (ex. /C=US/O=test)
      * @description
      * This static method converts a distinguished name string in
      * LDAP(RFC 2253) format to OpenSSL oneline format.
      * @see [jsrsasign wiki](https://github.com/kjur/jsrsasign/wiki/NOTE-distinguished-name-representation-in-jsrsasign):
      * distinguished name string difference between OpenSSL oneline and LDAP(RFC 2253)
      * @example
      * KJUR.asn1.x509.X500Name.ldapToOneline('O=test,C=US') → '/C=US/O=test'
      * KJUR.asn1.x509.X500Name.ldapToOneline('O=a\,a,C=US') → '/C=US/O=a,a'
      * KJUR.asn1.x509.X500Name.ldapToOneline('O=a/a,C=US')  → '/C=US/O=a\/a'
      */
    /* static member */
    inline def ldapToOneline(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ldapToOneline")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * convert OpenSSL oneline distinguished name format string to LDAP(RFC 2253) format
      * @param s distinguished name string in OpenSSL oneline format (ex. /C=US/O=test)
      * @return distinguished name string in LDAP(RFC 2253) format (ex. O=test,C=US)
      * @description
      * This static method converts a distinguished name string in OpenSSL oneline
      * format to LDAP(RFC 2253) format.
      * @see [jsrsasign wiki](https://github.com/kjur/jsrsasign/wiki/NOTE-distinguished-name-representation-in-jsrsasign):
      * distinguished name string difference between OpenSSL oneline and LDAP(RFC 2253)
      *
      * @example
      * KJUR.asn1.x509.X500Name.onelineToLDAP("/C=US/O=test") → 'O=test,C=US'
      * KJUR.asn1.x509.X500Name.onelineToLDAP("/C=US/O=a,a") → 'O=a\,a,C=US'
      */
    /* static member */
    inline def onelineToLDAP(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("onelineToLDAP")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object X509Util {
    
    @JSImport("jsrsasign", "KJUR.asn1.x509.X509Util")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * issue a certificate in PEM format
      * @param param parameter to issue a certificate
      * @description
      * This method can issue a certificate by a simple
      * JSON object.
      * Signature value will be provided by signing with
      * private key using 'cakey' parameter or
      * hexa decimal signature value by 'sighex' parameter.
      *
      * NOTE: Algorithm parameter of AlgorithmIdentifier will
      * be set automatically by default. (see `KJUR.asn1.x509.AlgorithmIdentifier`)
      * from jsrsasign 7.1.1 asn1x509 1.0.20.
      *
      * @example
      * var certPEM = KJUR.asn1.x509.X509Util.newCertPEM({
      *   serial: {int: 4},
      *   sigalg: {name: 'SHA1withECDSA'},
      *   issuer: {str: '/C=US/O=a'},
      *   notbefore: {'str': '130504235959Z'},
      *   notafter: {'str': '140504235959Z'},
      *   subject: {str: '/C=US/O=b'},
      *   sbjpubkey: pubKeyObj,
      *   ext: [
      *     {basicConstraints: {cA: true, critical: true}},
      *     {keyUsage: {bin: '11'}},
      *   ],
      *   cakey: prvKeyObj
      * });
      * // -- or --
      * var certPEM = KJUR.asn1.x509.X509Util.newCertPEM({
      *   serial: {int: 4},
      *   sigalg: {name: 'SHA1withECDSA'},
      *   issuer: {str: '/C=US/O=a'},
      *   notbefore: {'str': '130504235959Z'},
      *   notafter: {'str': '140504235959Z'},
      *   subject: {str: '/C=US/O=b'},
      *   sbjpubkey: pubKeyPEM,
      *   ext: [
      *     {basicConstraints: {cA: true, critical: true}},
      *     {keyUsage: {bin: '11'}},
      *   ],
      *   cakey: [prvkey, pass]}
      * );
      * // -- or --
      * var certPEM = KJUR.asn1.x509.X509Util.newCertPEM({
      *   serial: {int: 1},
      *   sigalg: {name: 'SHA1withRSA'},
      *   issuer: {str: '/C=US/O=T1'},
      *   notbefore: {'str': '130504235959Z'},
      *   notafter: {'str': '140504235959Z'},
      *   subject: {str: '/C=US/O=T1'},
      *   sbjpubkey: pubKeyObj,
      *   sighex: '0102030405..'
      * });
      * // for the issuer and subject field, another
      * // representation is also available
      * var certPEM = KJUR.asn1.x509.X509Util.newCertPEM({
      *   serial: {int: 1},
      *   sigalg: {name: 'SHA256withRSA'},
      *   issuer: {C: "US", O: "T1"},
      *   notbefore: {'str': '130504235959Z'},
      *   notafter: {'str': '140504235959Z'},
      *   subject: {C: "US", O: "T1", CN: "http://example.com/"},
      *   sbjpubkey: pubKeyObj,
      *   sighex: '0102030405..'
      * });
      */
    inline def newCertPEM(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newCertPEM")().asInstanceOf[String]
    inline def newCertPEM(param: Cakey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newCertPEM")(param.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /**
    * CRLReason CRL entry extension ASN.1 structure class.
    * @param params
    * @description
    * This class represents ASN.1 structure for
    * CRLReason CRL entry extension defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-5.3.1">
    * RFC 5280 5.3.1</a>
    * <pre>
    * id-ce-cRLReasons OBJECT IDENTIFIER ::= { id-ce 21 }
    * -- reasonCode ::= { CRLReason }
    * CRLReason ::= ENUMERATED {
    *      unspecified             (0),
    *      keyCompromise           (1),
    *      cACompromise            (2),
    *      affiliationChanged      (3),
    *      superseded              (4),
    *      cessationOfOperation    (5),
    *      certificateHold         (6),
    *      removeFromCRL           (8),
    *      privilegeWithdrawn      (9),
    *      aACompromise           (10) }
    * </pre>
    * Constructor of this class may have following parameters:
    * - {String}extname - name "cRLReason". It is ignored in this class but required to use with {@link KJUR.asn1.x509.Extensions} class. (OPTION)
    * - {Integer}code - reasonCode value
    * - {Boolean}critical - critical flag. Generally false and not specified in this class.(OPTION)
    * @example
    * new KJUR.asn1.x509.CRLReason({extname:'cRLReason',code:4})
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.cRLReason")
  @js.native
  open class cRLReason ()
    extends StObject
       with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: Code) = this()
    
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
    
    /** JSON object parameter for ASN.1 encode */
    /* CompleteClass */
    var params: Tlv | Null = js.native
  }
}
