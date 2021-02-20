package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.anon.AnyExtendedKeyUsage
import typings.jsrsasign.anon.ArrayArray
import typings.jsrsasign.anon.ArrayParamUriParamcritica
import typings.jsrsasign.anon.Asn1params
import typings.jsrsasign.anon.Bin
import typings.jsrsasign.anon.BusinessCategory
import typings.jsrsasign.anon.CA_
import typings.jsrsasign.anon.Cakey
import typings.jsrsasign.anon.Certissuer
import typings.jsrsasign.anon.Critical
import typings.jsrsasign.anon.CriticalBoolean
import typings.jsrsasign.anon.Dpobj
import typings.jsrsasign.anon.Prvkeyobj
import typings.jsrsasign.anon.Rsaprvkey
import typings.jsrsasign.anon.Sn
import typings.jsrsasign.anon.StringParamcertissuerstri
import typings.jsrsasign.anon.Uri
import typings.jsrsasign.anon.X500NameParamcertissuerst
import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.ExtensionParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import typings.jsrsasign.jsrsasignStrings.authorityinfoaccess
import typings.jsrsasign.jsrsasignStrings.authoritykeyidentifier
import typings.jsrsasign.jsrsasignStrings.basicconstraints
import typings.jsrsasign.jsrsasignStrings.crldistributionpoints
import typings.jsrsasign.jsrsasignStrings.extkeyusage
import typings.jsrsasign.jsrsasignStrings.issueraltname
import typings.jsrsasign.jsrsasignStrings.keyusage
import typings.jsrsasign.jsrsasignStrings.subjectaltname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  * - `KJUR.asn1.x509.Extension`
  * - `KJUR.asn1.x509.X500Name`
  * - `KJUR.asn1.x509.RDN`
  * - `KJUR.asn1.x509.AttributeTypeAndValue`
  * - `KJUR.asn1.x509.SubjectPublicKeyInfo`
  * - `KJUR.asn1.x509.AlgorithmIdentifier`
  * - `KJUR.asn1.x509.GeneralName`
  * - `KJUR.asn1.x509.GeneralNames`
  * - `KJUR.asn1.x509.DistributionPointName`
  * - `KJUR.asn1.x509.DistributionPoint`
  * - `KJUR.asn1.x509.CRL`
  * - `KJUR.asn1.x509.TBSCertList`
  * - `KJUR.asn1.x509.CRLEntry`
  * - `KJUR.asn1.x509.OID`
  *
  * __SUPPORTED EXTENSIONS__
  *
  * - `KJUR.asn1.x509.BasicConstraints`
  * - `KJUR.asn1.x509.KeyUsage`
  * - `KJUR.asn1.x509.CRLDistributionPoints`
  * - `KJUR.asn1.x509.ExtKeyUsage`
  * - `KJUR.asn1.x509.AuthorityKeyIdentifier`
  * - `KJUR.asn1.x509.AuthorityInfoAccess`
  * - `KJUR.asn1.x509.SubjectAltName`
  * - `KJUR.asn1.x509.IssuerAltName`
  *
  * NOTE: `SubjectAltName` and `IssuerAltName` extensions were supported since
  * jsrsasign 6.2.3 asn1x509 1.0.19.
  */
object x509 {
  
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
  class AlgorithmIdentifier ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AlgorithmIdentifier {
    def this(params: Asn1params) = this()
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
  class AttributeTypeAndValue protected ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AttributeTypeAndValue {
    def this(params: StringParam) = this()
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
  class AuthorityInfoAccess ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AuthorityInfoAccess {
    def this(params: ArrayParam[ExtensionParam]) = this()
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
  class AuthorityKeyIdentifier ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AuthorityKeyIdentifier {
    def this(params: Critical) = this()
  }
  
  /**
    * BasicConstraints ASN.1 structure class
    * @param params associative array of parameters (ex. {'cA': true, 'critical': true})
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.BasicConstraints")
  @js.native
  class BasicConstraints ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.BasicConstraints {
    def this(params: CA_) = this()
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
  class CRL ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.CRL {
    def this(params: Rsaprvkey) = this()
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
  class CRLDistributionPoints ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.CRLDistributionPoints {
    def this(params: Uri) = this()
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
  class CRLEntry ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.CRLEntry {
    def this(params: Sn) = this()
  }
  
  /**
    * X.509 Certificate class to sign and generate hex encoded certificate
    * @param params associative array of parameters (ex. {'tbscertobj': obj, 'prvkeyobj': key})
    * @description
    * As for argument 'params' for constructor, you can specify one of
    * following properties:
    *
    * - tbscertobj - specify `KJUR.asn1.x509.TBSCertificate` object
    * - prvkeyobj - specify `RSAKey`, `KJUR.crypto.ECDSA` or `KJUR.crypto.DSA` object for CA private key to sign the certificate
    *
    * NOTE1: 'params' can be omitted.
    * NOTE2: DSA/ECDSA is also supported for CA signging key from asn1x509 1.0.6.
    * @example
    * var caKey = KEYUTIL.getKey(caKeyPEM); // CA's private key
    * var cert = new KJUR.asn1x509.Certificate({'tbscertobj': tbs, 'prvkeyobj': caKey});
    * cert.sign(); // issue certificate by CA's private key
    * var certPEM = cert.getPEMString();
    *
    * // Certificate  ::=  SEQUENCE  {
    * //     tbsCertificate       TBSCertificate,
    * //     signatureAlgorithm   AlgorithmIdentifier,
    * //     signature            BIT STRING  }
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.Certificate")
  @js.native
  class Certificate ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Certificate {
    def this(params: Prvkeyobj) = this()
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
  class DistributionPoint ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.DistributionPoint {
    def this(params: Dpobj) = this()
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
  class DistributionPointName protected ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.DistributionPointName {
    def this(gnOrRdn: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNames) = this()
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
  class ExtKeyUsage ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.ExtKeyUsage {
    def this(params: ArrayArray) = this()
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
  class Extension ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension {
    def this(params: CriticalBoolean) = this()
  }
  object Extension {
    
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension.appendByNameToArray")
    @js.native
    def appendByNameToArray_authorityinfoaccess(
      name: authorityinfoaccess,
      extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
      a: js.Array[_]
    ): Unit = js.native
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension.appendByNameToArray")
    @js.native
    def appendByNameToArray_authoritykeyidentifier(
      name: authoritykeyidentifier,
      extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
      a: js.Array[_]
    ): Unit = js.native
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension.appendByNameToArray")
    @js.native
    def appendByNameToArray_basicconstraints(
      name: basicconstraints,
      extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
      a: js.Array[_]
    ): Unit = js.native
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension.appendByNameToArray")
    @js.native
    def appendByNameToArray_crldistributionpoints(
      name: crldistributionpoints,
      extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
      a: js.Array[_]
    ): Unit = js.native
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension.appendByNameToArray")
    @js.native
    def appendByNameToArray_extkeyusage(name: extkeyusage, extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension, a: js.Array[_]): Unit = js.native
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension.appendByNameToArray")
    @js.native
    def appendByNameToArray_issueraltname(
      name: issueraltname,
      extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
      a: js.Array[_]
    ): Unit = js.native
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension.appendByNameToArray")
    @js.native
    def appendByNameToArray_keyusage(name: keyusage, extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension, a: js.Array[_]): Unit = js.native
    @JSImport("jsrsasign", "KJUR.asn1.x509.Extension.appendByNameToArray")
    @js.native
    def appendByNameToArray_subjectaltname(
      name: subjectaltname,
      extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
      a: js.Array[_]
    ): Unit = js.native
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
  class GeneralName ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralName {
    def this(params: GeneralNameParam) = this()
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
  class GeneralNames protected ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNames {
    def this(paramsArray: js.Array[UriParam]) = this()
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
  class IssuerAltName ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.IssuerAltName {
    def this(params: ArrayParamUriParamcritica) = this()
  }
  
  /**
    * KeyUsage ASN.1 structure class
    * @param params associative array of parameters (ex. {'bin': '11', 'critical': true})
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.KeyUsage")
  @js.native
  class KeyUsage ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.KeyUsage {
    def this(params: Bin) = this()
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
    
    /**
      * get DERObjectIdentifier by registered attribute type name such like 'C' or 'CN'
      * @param atype short attribute type name such like 'C' or 'CN'
      * @example
      * KJUR.asn1.x509.OID.atype2obj('CN') → 2.5.4.3
      * KJUR.asn1.x509.OID.atype2obj('OU') → 2.5.4.11
      */
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID.atype2obj")
    @js.native
    def atype2obj(atype: String): String = js.native
    
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID.name2obj")
    @js.native
    def name2obj(name: String): typings.jsrsasign.jsrsasign.KJUR.asn1.DERObjectIdentifier = js.native
    
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID.name2oid")
    @js.native
    def name2oid(name: String): String = js.native
    
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID.oid2atype")
    @js.native
    def oid2atype(oid: String): String = js.native
    
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID.oid2name")
    @js.native
    def oid2name(): String = js.native
    @JSImport("jsrsasign", "KJUR.asn1.x509.OID.oid2name")
    @js.native
    def oid2name(oid: String): String = js.native
    
    /** for caching name and DERObjectIdentifier object */
    object objCache
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
  class RDN ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.RDN {
    def this(params: StringParam) = this()
  }
  object RDN {
    
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.RDN.parseString")
    @js.native
    def parseString(s: String): js.Array[String] = js.native
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
  class SubjectAltName ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectAltName {
    def this(params: ArrayParamUriParamcritica) = this()
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
  class SubjectPublicKeyInfo ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectPublicKeyInfo {
    def this(params: DSA) = this()
    def this(params: ECDSA) = this()
    def this(params: RSAKey) = this()
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
  class TBSCertList ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertList
  
  /**
    * ASN.1 TBSCertificate structure class
    * @param params associative array of parameters (ex. {})
    * @example
    *  var o = new KJUR.asn1.x509.TBSCertificate();
    *  o.setSerialNumberByParam({'int': 4});
    *  o.setSignatureAlgByParam({'name': 'SHA1withRSA'});
    *  o.setIssuerByParam({'str': '/C=US/O=a'});
    *  o.setNotBeforeByParam({'str': '130504235959Z'});
    *  o.setNotAfterByParam({'str': '140504235959Z'});
    *  o.setSubjectByParam({'str': '/C=US/CN=b'});
    *  o.setSubjectPublicKey(rsaPubKey);
    *  o.appendExtension(new KJUR.asn1.x509.BasicConstraints({'cA':true}));
    *  o.appendExtension(new KJUR.asn1.x509.KeyUsage({'bin':'11'}));
    */
  @JSImport("jsrsasign", "KJUR.asn1.x509.TBSCertificate")
  @js.native
  class TBSCertificate ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate
  
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
  class X500Name protected ()
    extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.X500Name {
    def this(params: Certissuer) = this()
    def this(params: StringParamcertissuerstri) = this()
    def this(params: X500NameParamcertissuerst) = this()
  }
  object X500Name {
    
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.X500Name.ldapToOneline")
    @js.native
    def ldapToOneline(s: String): String = js.native
    
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.X500Name.onelineToLDAP")
    @js.native
    def onelineToLDAP(s: String): String = js.native
  }
  
  object X509Util {
    
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
    @JSImport("jsrsasign", "KJUR.asn1.x509.X509Util.newCertPEM")
    @js.native
    def newCertPEM(): String = js.native
    @JSImport("jsrsasign", "KJUR.asn1.x509.X509Util.newCertPEM")
    @js.native
    def newCertPEM(param: Cakey): String = js.native
  }
}
