package typings.jsrsasign.jsrsasign

import typings.jsrsasign.anon.Ds
import typings.jsrsasign.anon.ExtnameKid
import typings.jsrsasign.anon.Nodnarray
import typings.jsrsasign.anon.Notafter
import typings.jsrsasign.anon.Type
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasignStrings.mixed
import typings.jsrsasign.jsrsasignStrings.prn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * hexadecimal X.509 certificate ASN.1 parser class.<br/>
  * property String hex hexacedimal string for X.509 certificate.
  * property Number version format version (1: X509v1, 3: X509v3, otherwise: unknown) since jsrsasign 7.1.4
  * property Array aExtInfo (DEPRECATED) array of parameters for extensions
  * @author Kenji Urushima
  * @version 1.0.1 (08 May 2012)
  * @see <a href="https://kjur.github.io/jsrsasigns/">'jsrsasign'(RSA Sign JavaScript Library) home page https://kjur.github.io/jsrsasign/</a>
  * @description
  * X509 class provides following functionality:
  * <ul>
  * <li>parse X.509 certificate ASN.1 structure</li>
  * <li>get basic fields, extensions, signature algorithms and signature values</li>
  * <li>read PEM certificate</li>
  * </ul>
  *
  * <ul>
  * <li><b>TO GET FIELDS</b>
  *   <ul>
  *   <li>serial - {@link X509#getSerialNumberHex}</li>
  *   <li>signature algorithm field - {@link X509#getSignatureAlgorithmField}</li>
  *   <li>issuer - {@link X509#getIssuerHex}</li>
  *   <li>issuer - {@link X509#getIssuerString}</li>
  *   <li>notBefore - {@link X509#getNotBefore}</li>
  *   <li>notAfter - {@link X509#getNotAfter}</li>
  *   <li>subject - {@link X509#getSubjectHex}</li>
  *   <li>subject - {@link X509#getSubjectString}</li>
  *   <li>subjectPublicKeyInfo - {@link X509#getPublicKey}</li>
  *   <li>subjectPublicKeyInfo - {@link X509#getPublicKeyHex}</li>
  *   <li>subjectPublicKeyInfo - {@link X509#getPublicKeyIdx}</li>
  *   <li>subjectPublicKeyInfo - {@link X509.getPublicKeyFromCertPEM}</li>
  *   <li>subjectPublicKeyInfo - {@link X509.getPublicKeyFromCertHex}</li>
  *   <li>subjectPublicKeyInfo - {@link X509#getPublicKeyContentIdx}</li>
  *   <li>signature algorithm - {@link X509#getSignatureAlgorithmName}</li>
  *   <li>signature value - {@link X509#getSignatureValueHex}</li>
  *   </ul>
  * </li>
  * <li><b>X509 METHODS TO GET EXTENSIONS</b>
  *   <ul>
  *   <li>authorityKeyIdentifier - {@link X509#getExtAuthorityKeyIdentifier}</li>
  *   <li>subjectKeyIdentifier - {@link X509#getExtSubjectKeyIdentifier}</li>
  *   <li>keyUsage - {@link X509#getExtKeyUsage}</li>
  *   <li>keyUsage - {@link X509#getExtKeyUsageBin}</li>
  *   <li>keyUsage - {@link X509#getExtKeyUsageString}</li>
  *   <li>certificatePolicies - {@link X509#getExtCertificatePolicies}</li>
  *   <li>subjectAltName - {@link X509#getExtSubjectAltName}</li>
  *   <li>subjectAltName2 - {@link X509#getExtSubjectAltName2} (DEPRECATED)</li>
  *   <li>issuerAltName - {@link X509#getExtIssuerAltName}</li>
  *   <li>basicConstraints - {@link X509#getExtBasicConstraints}</li>
  *   <li>nameConstraints - {@link X509#getExtNameConstraints}</li>
  *   <li>extKeyUsage - {@link X509#getExtExtKeyUsage}</li>
  *   <li>extKeyUsage - {@link X509#getExtExtKeyUsageName} (DEPRECATED)</li>
  *   <li>cRLDistributionPoints - {@link X509#getExtCRLDistributionPoints}</li>
  *   <li>cRLDistributionPoints - {@link X509#getExtCRLDistributionPointsURI} (DEPRECATED)</li>
  *   <li>authorityInfoAccess - {@link X509#getExtAuthorityInfoAccess}</li>
  *   <li>authorityInfoAccess - {@link X509#getExtAIAInfo} (DEPRECATED)</li>
  *   <li>cRLNumber - {@link X509#getExtCRLNumber}</li>
  *   <li>cRLReason - {@link X509#getExtCRLReason}</li>
  *   <li>ocspNonce - {@link X509#getExtOcspNonce}</li>
  *   <li>ocspNoCheck - {@link X509#getExtOcspNoCheck}</li>
  *   <li>adobeTimeStamp - {@link X509#getExtAdobeTimeStamp}</li>
  *   </ul>
  * </li>
  * <li><b>UTILITIES</b>
  *   <ul>
  *   <li>reading PEM X.509 certificate - {@link X509#readCertPEM}</li>
  *   <li>reading hexadecimal string of X.509 certificate - {@link X509#readCertHex}</li>
  *   <li>get all certificate information - {@link X509#getInfo}</li>
  *   <li>get specified extension information - {@link X509#getExtInfo}</li>
  *   <li>verify signature value - {@link X509#verifySignature}</li>
  *   </ul>
  * </li>
  * </ul>
  */
@js.native
trait X509 extends StObject {
  
  /**
    * (DEPRECATED) array of parameters for extensions
    */
  var aExtInfo: js.Array[X509Extension] = js.native
  
  /**
    * convert array for X500 distinguish name to distinguish name string<br/>
    * name dnarraytostr
    * memberOf X509#
    *
    * @param aDN array for X500 distinguish name
    * @return String distinguish name
    * @since jsrsasign 10.0.6 x509 2.0.8
    * @see X509#getX500Name
    * @see X509#getX500NameArray
    * @see KJUR.asn1.x509.X500Name
    *
    * @description
    * This method converts from an array representation of
    * X.500 distinguished name to X.500 name string.
    * This supports multi-valued RDN.
    *
    * @example
    * var x = new X509();
    * x.dnarraytostr(
    *   [[{type:"C",value:"JP",ds:"prn"}],
    *   [{type:"O",value:"T1",ds:"prn"}]]) &rarr; "/C=JP/O=T1"
    * x.dnarraytostr(
    *   [[{type:"C",value:"JP",ds:"prn"}],
    *   [{type:"O",value:"T1",ds:"prn"}
    *    {type:"CN",value:"Bob",ds:"prn"}]]) &rarr; "/C=JP/O=T1+CN=Bob"
    */
  def dnarraytostr(aDN: js.Array[Any]): String = js.native
  
  /**
    * find extension parameter in array<br/>
    * name findExt
    * memberOf X509#
    *
    * @param aExt array of extension parameters
    * @param extname extension name
    * @return Array extension parameter in the array or null
    * @since jsrsasign 10.0.3 x509 2.0.7
    * @see X509#getParam
    *
    * @description
    * This method returns an extension parameter for
    * specified extension name in the array.
    * This method is useful to update extension parameter value.
    * When there is no such extension with the extname,
    * this returns "null".
    *
    * @example
    * // (1)
    * x = new X509(CERTPEM);
    * params = x.getParam();
    * pSKID = x.findExt(params.ext, "subjectKeyIdentifier");
    * pSKID.kid = "1234abced..."; // skid in the params is updated.
    *   // then params was updated
    *
    * // (2) another example
    * aExt = [
    *   {extname:"keyUsage",critical:true,names:["digitalSignature"]},
    *   {extname:"basicConstraints",critical:true},
    *   {extname:"subjectKeyIdentifier",kid:{hex:"f2eb..."}},
    *   {extname:"authorityKeyIdentifier",kid:{hex:"12ab..."}},
    *   {extname:"authorityInfoAccess",array:[{ocsp:"http://ocsp.example.com/"}]},
    *   {extname:"certificatePolicies",array:[{policyoid:"2.23.140.1.2.1"}]}
    * ];
    * var x = new X509();
    * x.findExt(aExt, "authorityKeyInfoAccess").array[0].ocsp = "http://aaa.com";
    * pKU = x.findExt(aExt, "keyUsage");
    * delete pKU["critical"]; // clear criticla flag
    * pKU.names = ["keyCertSign", "cRLSign"];
    *   // then aExt was updated
    */
  def findExt(aExt: js.Array[ExtensionParameter], extname: String): js.Array[Any] | Null = js.native
  
  var foffset: Double = js.native
  
  /**
    * get algorithm name name of AlgorithmIdentifier ASN.1 structure
    * @param hTLV hexadecimal string of AlgorithmIdentifier
    * @return String algorithm name (ex. SHA1withRSA, SHA256withECDSA, SHA512withRSAandMGF1, SHA1)
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @description
    * This method will get a name of AlgorithmIdentifier.
    * <br/>
    * @example
    * var x = new X509();
    * algName = x.getAlgorithmIdentifierName("30...");
    */
  def getAlgorithmIdentifierName(hTLV: String): String = js.native
  
  /**
    * get AttributeTypeAndValue ASN.1 structure parameter as JSON object<br/>
    * name getAttrTypeAndValue
    * memberOf X509#
    *
    * @param h hexadecimal string of AttributeTypeAndValue
    * @return Object JSON object of AttributeTypeAndValue parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getX500Name
    * @see X509#getRDN
    * @description
    * This method will get AttributeTypeAndValue parameters defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.4">
    * RFC 5280 4.1.2.4</a>.
    * <pre>
    * AttributeTypeAndValue ::= SEQUENCE {
    *   type     AttributeType,
    *   value    AttributeValue }
    * AttributeType ::= OBJECT IDENTIFIER
    * AttributeValue ::= ANY -- DEFINED BY AttributeType
    * </pre>
    * <ul>
    * <li>Stringtype - AttributeType name or OID(ex. C,O,CN)</li>
    * <li>Stringvalue - raw string of ASN.1 value of AttributeValue</li>
    * <li>Stringds - DirectoryString type of AttributeValue</li>
    * </ul>
    * "ds" has one of following value:
    * <ul>
    * <li>utf8 - (0x0c) UTF8String</li>
    * <li>num  - (0x12) NumericString</li>
    * <li>prn  - (0x13) PrintableString</li>
    * <li>tel  - (0x14) TeletexString</li>
    * <li>ia5  - (0x16) IA5String</li>
    * <li>vis  - (0x1a) VisibleString</li>
    * <li>bmp  - (0x1e) BMPString</li>
    * </ul>
    * @example
    * x = new X509();
    * x.getAttrTypeAndValue("30...") &rarr;
    * {type:"CN",value:"john.smith@example.com",ds:"ia5"} or
    * {type:"O",value:"Sample Corp.",ds:"prn"}
    */
  // unv  - (0x1c??) UniversalString ... for future
  def getAttrTypeAndValue(h: String): Type = js.native
  
  /**
    * get DisplayText ASN.1 structure parameter as JSON object
    * name getDisplayText
    * memberOf X509#
    *
    * @param h hexadecimal string of DisplayText
    * @return Object JSON object of DisplayText parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getExtCertificatePolicies
    * @see X509#getPolicyInformation
    * @description
    * This method will get
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.4">
    * DisplayText</a> parameters.
    * <pre>
    * DisplayText ::= CHOICE {
    *      ia5String        IA5String      (SIZE (1..200)),
    *      visibleString    VisibleString  (SIZE (1..200)),
    *      bmpString        BMPString      (SIZE (1..200)),
    *      utf8String       UTF8String     (SIZE (1..200)) }
    * </pre>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.DisplayText} constructor.
    * @example
    * x = new X509();
    * x.getDisplayText("0c03616161") &rarr {type: 'utf8', str: 'aaa'}
    * x.getDisplayText("1e03616161") &rarr {type: 'bmp',  str: 'aaa'}
    */
  def getDisplayText(h: String): DisplayText = js.native
  
  /**
    * get DistributionPoint ASN.1 structure parameter as JSON object
    * name getDistributionPoint
    * memberOf X509#
    *
    * @param h hexadecimal string of DistributionPoint
    * @return Object JSON object of DistributionPoint parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getExtCRLDistributionPoints
    * @see X509#getDistributionPointName
    * @see X509#getGeneralNames
    * @see X509#getGeneralName
    * @description
    * This method will get DistributionPoint parameters.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.DistributionPoint} constructor.
    * <br/>
    * NOTE: reasons[1] and CRLIssuer[2] field not supported
    * @example
    * x = new X509();
    * x.getDistributionPoint("30...") &rarr;
    * {dpname: {full: [{uri: "http://aaa.com/"}]}}
    */
  def getDistributionPoint(h: String): DistributionPoint = js.native
  
  /**
    * get DistributionPointName ASN.1 structure parameter as JSON object
    * name getDistributionPointName
    * memberOf X509#
    *
    * @param h hexadecimal string of DistributionPointName
    * @return Object JSON object of DistributionPointName parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getExtCRLDistributionPoints
    * @see X509#getDistributionPoint
    * @see X509#getGeneralNames
    * @see X509#getGeneralName
    * @description
    * This method will get DistributionPointName parameters.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.DistributionPointName} constructor.
    * <br/>
    * NOTE: nameRelativeToCRLIssuer[1] not supported
    * @example
    * x = new X509();
    * x.getDistributionPointName("a0...") &rarr;
    * {full: [{uri: "http://aaa.com/"}]}
    */
  def getDistributionPointName(h: String): DistributionPointName = js.native
  
  /**
    * get AuthorityInfoAccess extension value in the certificate as associative array
    * @return associative array of AIA extension properties
    * @description
    * This method will get authority info access value
    * as associate array which has following properties:
    *
    * - ocsp - array of string for OCSP responder URL
    * - caissuer - array of string for caIssuer value (i.e. CA certificates URL)
    *
    * If there is this in the certificate, it returns undefined;
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtAIAInfo(hCert) →
    * { ocsp:     ["http://ocsp.foo.com"],
    *   caissuer: ["http://rep.foo.com/aaa.p8m"] }
    */
  def getExtAIAInfo(): js.UndefOr[AIAInfo] = js.native
  
  /**
    * parse AdobeTimeStamp extension as JSON object<br/>
    * name getExtAdobeTimeStamp
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value
    * @param Boolean critical flag
    * @return Array JSON object of parsed AdobeTimeStamp extension
    * @since jsrsasign 10.0.1 x509 2.0.5
    * @see KJUR.asn1.x509.AdobeTimeStamp
    * @see X509#getExtParamArray
    * @see X509#getExtParam
    * @description
    * This method parses
    * X.509v3 AdobeTimeStamp private extension value defined in the
    * <a href="https://www.adobe.com/devnet-docs/acrobatetk/tools/DigSigDC/oids.html">
    * Adobe site</a> as JSON object.
    * This extension provides the URL location for time stamp service.
    * <pre>
    * adbe- OBJECT IDENTIFIER ::=  { adbe(1.2.840.113583) acrobat(1) security(1) x509Ext(9) 1 }
    *  ::= SEQUENCE {
    *     version INTEGER  { v1(1) }, -- extension version
    *     location GeneralName (In v1 GeneralName can be only uniformResourceIdentifier)
    *     requiresAuth        boolean (default false), OPTIONAL }
    * </pre>
    * <br/>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.AdobeTimeStamp} constructor.
    * <br/>
    * NOTE: This extesion doesn't seem to have official name. This may be called as "pdfTimeStamp".
    * @example
    * x.getExtAdobeTimeStamp(<<extn hex value >>) &rarr;
    * { extname: "adobeTimeStamp", uri: "http://tsa.example.com/" reqauth: true }
    */
  def getExtAdobeTimeStamp(hExtV: String, critical: Boolean): ExtAdobeTimeStamp = js.native
  
  /**
    * get AuthorityInfoAccess extension value as JSON object
    * name getExtAuthorityInfoAccess
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Array JSON object of AuthorityInfoAccess parameters or undefined
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see KJUR.asn1.x509.AuthorityInfoAccess
    * @description
    * This method parse authorityInfoAccess extension. When arguments are
    * not specified, its extension in X509 object will be parsed.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.AuthorityInfoAccess} constructor.
    * <br>
    * When hExtV and critical specified as arguments, return value
    * will be generated from them.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtAuthorityInfoAccess() &rarr;
    * {
    *   critial: true, //
    *   array: [{ocsp: http://ocsp.example.com/},
    *           {caissuer: https://repository.example.com/}]
    * }
    *
    * x = new X509();
    * x.getExtAuthorityInfoAccesss("306230...")
    * x.getExtAuthorityInfoAccesss("306230...", true)
    */
  def getExtAuthorityInfoAccess(): ExtAuthorityInfoAccess = js.native
  def getExtAuthorityInfoAccess(hExtV: String): ExtAuthorityInfoAccess = js.native
  def getExtAuthorityInfoAccess(hExtV: String, critical: Boolean): ExtAuthorityInfoAccess = js.native
  def getExtAuthorityInfoAccess(hExtV: Unit, critical: Boolean): ExtAuthorityInfoAccess = js.native
  
  /**
    * get authorityKeyIdentifier value as JSON object in the certificate
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param critical flag (OPTIONAL)
    * @return JSON object of AuthorityKeyIdentifier parameter or undefined
    * @description
    * This method will get
    * {@link getExtAuthorityKeyIdentifier https://tools.ietf.org/html/rfc5280#section-4.2.1.1}
    * value as JSON object.
    *
    * When hExtV and critical specified as arguments, return value
    * will be generated from them.
    * If there is no such extension in the certificate, it returns undefined.
    *
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.AuthorityKeyIdentifier} constructor.
    *
    *    id-ce-authorityKeyIdentifier OBJECT IDENTIFIER ::=  { id-ce 35 }
    *    AuthorityKeyIdentifier ::= SEQUENCE {
    *       keyIdentifier             [0] KeyIdentifier           OPTIONAL,
    *       authorityCertIssuer       [1] GeneralNames            OPTIONAL,
    *       authorityCertSerialNumber [2] CertificateSerialNumber OPTIONAL  }
    *    KeyIdentifier ::= OCTET STRING
    *
    * Constructor may have following parameters:
    *
    * - Arraykid - JSON object of {@link KJUR.asn1.DEROctetString} parameters
    * - Arrayissuer - JSON object of {@link KJUR.asn1.x509.X500Name} parameters
    * - Arraysn - JSON object of {@link KJUR.asn1.DERInteger} parameters
    * - {Boolean}critical - critical flag
    *
    *
    * NOTE: The 'authorityCertIssuer' and 'authorityCertSerialNumber'
    * supported since jsrsasign 9.0.0 x509 2.0.0.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM);
    * x.getExtAuthorityKeyIdentifier() &rarr;
    * { kid: {hex: "1234abcd..."},
    *   issuer: {hex: "30..."},
    *   sn: {hex: "1234..."},
    *   critical: true}
    */
  def getExtAuthorityKeyIdentifier(): AuthorityKeyIdentifierResult = js.native
  def getExtAuthorityKeyIdentifier(hExtV: String): AuthorityKeyIdentifierResult = js.native
  def getExtAuthorityKeyIdentifier(hExtV: String, critical: Boolean): AuthorityKeyIdentifierResult = js.native
  def getExtAuthorityKeyIdentifier(hExtV: Unit, critical: Boolean): AuthorityKeyIdentifierResult = js.native
  
  /**
    * get BasicConstraints extension value as object in the certificate
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param critical flag (OPTIONAL)
    * @return JSON object of BasicConstraints parameter or undefined
    * @description
    * This method will get basic constraints extension value as object with following paramters.
    *
    * - {Boolean}cA - CA flag whether CA or not
    * - {Integer}pathLen - maximum intermediate certificate length
    * - {Boolean}critical - critical flag
    *
    * There are use cases for return values:
    *
    * - {cA:true,pathLen:3,critical:true} - cA flag is true and pathLen is 3
    * - {cA:true,critical:true} - cA flag is true and no pathLen
    * - {} - basic constraints has no value in case of end entity certificate
    * undefined - there is no basic constraints extension
    *
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtBasicConstraints() &rarr; {cA:true,pathLen:3,critical:true}
    */
  def getExtBasicConstraints(): ExtBasicConstraints = js.native
  def getExtBasicConstraints(hExtV: String): ExtBasicConstraints = js.native
  def getExtBasicConstraints(hExtV: String, critical: Boolean): ExtBasicConstraints = js.native
  def getExtBasicConstraints(hExtV: Unit, critical: Boolean): ExtBasicConstraints = js.native
  
  /**
    * get CRLDistributionPoints extension value as JSON object
    * name getExtCRLDistributionPoints
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Object JSON object of CRLDistributionPoints parameters or undefined
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see KJUR.asn1.x509.CRLDistributionPoints
    * @see X509#getDistributionPoint
    * @see X509#getDistributionPointName
    * @see X509#getGeneralNames
    * @see X509#getGeneralName
    * @description
    * This method will get certificate policies value
    * as an array of JSON object which has properties defined
    * in {@link KJUR.asn1.x509.CRLDistributionPoints}.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.CRLDistributionPoints} constructor.
    * If there is no this extension in the certificate,
    * it returns undefined.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtCRLDistributionPoints() &rarr;
    * {array: [
    *   {dpname: {full: [{uri: "http://example.com/"}]}},
    *   {dpname: {full: [{uri: "ldap://example.com/"}]}}
    *  ],
    *  critical: true}
    */
  def getExtCRLDistributionPoints(): ExtCRLDistributionPoints = js.native
  def getExtCRLDistributionPoints(hExtV: String): ExtCRLDistributionPoints = js.native
  def getExtCRLDistributionPoints(hExtV: String, critical: Boolean): ExtCRLDistributionPoints = js.native
  def getExtCRLDistributionPoints(hExtV: Unit, critical: Boolean): ExtCRLDistributionPoints = js.native
  
  /**
    * get array of string for fullName URIs in cRLDistributionPoints(CDP) in the certificate (DEPRECATED)
    * name getExtCRLDistributionPointsURI
    * memberOf X509#
    *
    * @return Object array of fullName URIs of CDP of the certificate
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @description
    * This method will get all fullName URIs of cRLDistributionPoints extension
    * in the certificate as array of URI string.
    * If there is this in the certificate, it returns undefined;
    * <br>
    * NOTE: Currently this method supports only fullName URI so that
    * other parameters will not be returned.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtCRLDistributionPointsURI() &rarr;
    * ["http://example.com/aaa.crl", "http://example.org/aaa.crl"]
    */
  def getExtCRLDistributionPointsURI(): js.UndefOr[js.Array[String]] = js.native
  
  /**
    * parse cRLNumber CRL extension as JSON object<br/>
    * name getExtCRLNumber
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value
    * @param Boolean critical flag
    * @since jsrsasign 9.1.1 x509 2.0.1
    * @see KJUR.asn1.x509.CRLNumber
    * @see X509#getExtParamArray
    * @description
    * This method parses
    * CRLNumber CRL extension value defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-5.2.3">
    * RFC 5280 5.2.3</a> as JSON object.
    * <pre>
    * id-ce-cRLNumber OBJECT IDENTIFIER ::= { id-ce 20 }
    * CRLNumber ::= INTEGER (0..MAX)
    * </pre>
    * <br/>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.CRLNumber} constructor.
    * @example
    * crl = X509CRL("-----BEGIN X509 CRL...");
    * ... get hExtV and critical flag ...
    * crl.getExtCRLNumber("02...", false) &rarr;
    * {extname: "cRLNumber", num: {hex: "12af"}}
    */
  def getExtCRLNumber(hExtV: String, critical: Boolean): ExtCRLNumber = js.native
  
  /**
    * parse cRLReason CRL entry extension as JSON object<br/>
    * name getExtCRLReason
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value
    * @param Boolean critical flag
    * @since jsrsasign 9.1.1 x509 2.0.1
    * @see KJUR.asn1.x509.CRLReason
    * @see X509#getExtParamArray
    * @description
    * This method parses
    * CRLReason CRL entry extension value defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-5.3.1">
    * RFC 5280 5.3.1</a> as JSON object.
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
    * <br/>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.CRLReason} constructor.
    * @example
    * crl = X509CRL("-----BEGIN X509 CRL...");
    * ... get hExtV and critical flag ...
    * crl.getExtCRLReason("02...", false) &rarr;
    * {extname: "cRLReason", code: 3}
    */
  def getExtCRLReason(hExtV: String, critical: Boolean): ExtCRLReason = js.native
  
  /**
    * get CertificatePolicies extension value as JSON object
    * name getExtCertificatePolicies
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Object JSON object of CertificatePolicies parameters or undefined
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @description
    * This method will get certificate policies value
    * as an array of JSON object which has properties defined
    * in {@link KJUR.asn1.x509.CertificatePolicies}.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.CertificatePolicies} constructor.
    * If there is no this extension in the certificate,
    * it returns undefined.
    * <br>
    * CAUTION: return value of JSON object format have been changed
    * from jsrsasign 9.0.0 without backword compatibility.
    * <br>
    * When hExtV and critical specified as arguments, return value
    * will be generated from them.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtCertificatePolicies() &rarr;
    * { array: [
    *   { policyoid: "1.2.3.4" }
    *   { policyoid: "1.2.3.5",
    *     array: [
    *       { cps: "https://example.com/" },
    *       { unotice: { exptext: { type: "bmp", str: "sample text" } } }
    *     ]
    *   }
    * ]}
    */
  def getExtCertificatePolicies(): ExtCertificatePolicies = js.native
  
  /**
    * get extKeyUsage value as JSON object
    * name getExtExtKeyUsage
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Array JSON object of ExtKeyUsage parameter or undefined
    * @return Object JSONarray of extended key usage ID name or oid
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see KJUR.asn1.x509.ExtKeyUsage
    * @description
    * This method parse extKeyUsage extension. When arguments are
    * not specified, its extension in X509 object will be parsed.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.ExtKeyUsage} constructor.
    * <br>
    * When hExtV and critical specified as arguments, return value
    * will be generated from them.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtExtKeyUsage() &rarr;
    * { array: ["clientAuth", "emailProtection", "1.3.6.1.4.1.311.10.3.4"],
    *   critical: true},
    */
  def getExtExtKeyUsage(): ExtExtKeyUsage = js.native
  def getExtExtKeyUsage(hExtV: String): ExtExtKeyUsage = js.native
  def getExtExtKeyUsage(hExtV: String, critical: Boolean): ExtExtKeyUsage = js.native
  def getExtExtKeyUsage(hExtV: Unit, critical: Boolean): ExtExtKeyUsage = js.native
  
  /**
    * get extKeyUsage value as array of name string in the certificate(DEPRECATED)<br/>
    * name getExtExtKeyUsageName
    * memberOf X509#
    *
    * @return Object array of extended key usage ID name or oid
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @deprecated since jsrsasign 9.0.0 x509 2.0.0
    * @description
    * This method will get extended key usage extension value
    * as array of name or OID string.
    * If there is this in the certificate, it returns undefined;
    * <br>
    * NOTE: Supported extended key usage ID names are defined in
    * name2oidList parameter in asn1x509.js file.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtExtKeyUsageName() &rarr; ["serverAuth", "clientAuth", "0.1.2.3.4.5"]
    */
  def getExtExtKeyUsageName(): js.Array[String] = js.native
  
  /**
    * get a X.509v3 extesion information such as extension OID, criticality and value index for specified oid or name.
    * @param oidOrName X.509 extension oid or name (ex. keyUsage or 2.5.29.19)
    * @return X.509 extension information such as extension OID or value indx (see `X509#parseExt`)
    * @description
    * This method will get an X.509v3 extension information JSON object
    * having extension OID, criticality and value idx for specified
    * extension OID or name.
    * If there is no such extension, this returns undefined.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    *
    * x.getExtInfo("keyUsage") → { oid: "2.5.29.15", critical: true, vidx: 1714 }
    * x.getExtInfo("unknownExt") → undefined
    */
  def getExtInfo(oidOrName: String): js.UndefOr[X509Extension] = js.native
  
  /**
    * get issuerAltName value as array of string in the certificate
    * name getExtIssuerAltName
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Array JSON object of IssuerAltName parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see KJUR.asn1.x509.IssuerAltName
    * @see X509#getExtSubjectAltName
    * @description
    * This method will get issuerAltName value
    * as an array of JSON object which has properties defined
    * in {@link KJUR.asn1.x509.IssuerAltName}.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.IssuerAltName} constructor.
    * If there is no this extension in the certificate,
    * it returns undefined.
    * <br>
    * When hExtV and critical specified as arguments, return value
    * will be generated from them.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtIssuerAltName() &rarr;
    * { array: [
    *     {uri: "http://example.com/"},
    *     {rfc822: "user1@example.com"},
    *     {dns: "example.com"}
    *   ],
    *   critical: true
    * }
    *
    * x.getExtIssuerAltName("3026...") &rarr;
    * { array: [{ip: "192.168.1.1"}] }
    */
  def getExtIssuerAltName(): ExtIssuerAltName = js.native
  def getExtIssuerAltName(hExtV: String): ExtIssuerAltName = js.native
  def getExtIssuerAltName(hExtV: String, critical: Boolean): ExtIssuerAltName = js.native
  def getExtIssuerAltName(hExtV: Unit, critical: Boolean): ExtIssuerAltName = js.native
  
  /**
    * get KeyUsage extension value as JSON object
    * memberOf X509#
    *
    * name getExtKeyUsage
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Array JSON object of KeyUsage parameter or undefined
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see KJUR.asn1.x509.KeyUsage
    * @see X509#getExtKeyUsageString
    * @description
    * This method parse keyUsage extension. When arguments are
    * not specified, its extension in X509 object will be parsed.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.KeyUsage} constructor.
    * <br>
    * When hExtV and critical specified as arguments, return value
    * will be generated from them.
    * <pre>
    * id-ce-keyUsage OBJECT IDENTIFIER ::=  { id-ce 15 }
    * KeyUsage ::= BIT STRING {
    *      digitalSignature        (0),
    *      nonRepudiation          (1),
    *      keyEncipherment         (2),
    *      dataEncipherment        (3),
    *      keyAgreement            (4),
    *      keyCertSign             (5),
    *      cRLSign                 (6),
    *      encipherOnly            (7),
    *      decipherOnly            (8) }
    * </pre>
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtKeyUsage() &rarr;
    * {
    *   critial: true,
    *   names: ["digitalSignature", "decipherOnly"]
    * }
    *
    * x = new X509();
    * x.getExtKeyUsage("306230...")
    * x.getExtKeyUsage("306230...", true)
    */
  def getExtKeyUsage(): ExtKeyUsage = js.native
  def getExtKeyUsage(hExtV: String): ExtKeyUsage = js.native
  def getExtKeyUsage(hExtV: String, critical: Boolean): ExtKeyUsage = js.native
  def getExtKeyUsage(hExtV: Unit, critical: Boolean): ExtKeyUsage = js.native
  
  /**
    * get KeyUsage extension value as binary string in the certificate<br/>
    * name getExtKeyUsageBin
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @return String binary string of key usage bits (ex. '101')
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @see X509#getExtKeyUsage
    * @description
    * This method will get key usage extension value
    * as binary string such like '101'.
    * Key usage bits definition is in the RFC 5280.
    * If there is no key usage extension in the certificate,
    * it returns empty string (i.e. '').
    * <br/>
    * NOTE: argument 'hExtV' supported since jsrsasign 9.0.0 x509 2.0.0.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtKeyUsageBin() &rarr; '101'
    * // 1 - digitalSignature
    * // 0 - nonRepudiation
    * // 1 - keyEncipherment
    */
  def getExtKeyUsageBin(): String = js.native
  def getExtKeyUsageBin(hExtV: String): String = js.native
  
  /**
    * get KeyUsage extension value as names in the certificate<br/>
    * name getExtKeyUsageString
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @return String comma separated string of key usage
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @see X509#getExtKeyUsage
    * @description
    * This method will get key usage extension value
    * as comma separated string of usage names.
    * If there is no key usage extension in the certificate,
    * it returns empty string (i.e. '').
    * <br/>
    * NOTE: argument 'hExtV' supported since jsrsasign 9.0.0 x509 2.0.0.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtKeyUsageString() &rarr; "digitalSignature,keyEncipherment"
    */
  def getExtKeyUsageString(): String = js.native
  def getExtKeyUsageString(hExtV: String): String = js.native
  
  /**
    * get NameConstraints extension value as object in the certificate<br/>
    * name getExtNameConstraints
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Object JSON object of NamConstraints parameter or undefined
    * @since jsrsasign 10.5.16 x509 2.0.16
    * @see KJUR.asn1.x509.NameConstraints
    * @see KJUR.asn1.x509.GeneralSubtree
    * @see KJUR.asn1.x509.GeneralName
    * @see X509#getGeneralSubtree
    * @see X509#getGeneralName
    *
    * @description
    * This method will get name constraints extension value as object with following paramters.
    * <ul>
    * <li>Arraypermit - array of {@link KJUR.asn1.x509.GeneralSubtree} parameter</li>
    * <li>Arrayexclude - array of {@link KJUR.asn1.x509.GeneralSubtree} parameter</li>
    * <li>{Boolean}critical - critical flag</li>
    * </ul>
    *
    * @example
    * x = new X509(sCertPEM);
    * x.getExtNameConstraints() &rarr; {
    *   critical: true,
    *   permit: [{dns: 'example.com'},{rfc822: 'john@example.com'}],
    *   exclude: [{dn: {...X500Name parameter...}}]
    * }
    */
  def getExtNameConstraints(): ExtNameConstraints = js.native
  def getExtNameConstraints(hExtV: String): ExtNameConstraints = js.native
  def getExtNameConstraints(hExtV: String, critical: Boolean): ExtNameConstraints = js.native
  def getExtNameConstraints(hExtV: Unit, critical: Boolean): ExtNameConstraints = js.native
  
  /**
    * parse OCSPNoCheck OCSP extension as JSON object<br/>
    * name getExtOcspNoCheck
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value
    * @param Boolean critical flag
    * @return Array JSON object of parsed OCSPNoCheck extension
    * @since jsrsasign 9.1.6 x509 2.0.3
    * @see KJUR.asn1.x509.OCSPNoCheck
    * @see X509#getExtParamArray
    * @see X509#getExtParam
    * @description
    * This method parses
    * OCSPNoCheck extension value defined in
    * <a href="https://tools.ietf.org/html/rfc6960#section-4.2.2.2.1">
    * RFC 6960 4.2.2.2.1</a> as JSON object.
    * <pre>
    * id-pkix-ocsp-nocheck OBJECT IDENTIFIER ::= { id-pkix-ocsp 5 }
    * </pre>
    * <br/>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.OCSPNoCheck} constructor.
    * @example
    * x = new X509();
    * x.getExtOcspNoCheck(<<extn hex value >>) &rarr;
    * { extname: "ocspNoCheck" }
    */
  def getExtOcspNoCheck(hExtV: String, critical: Boolean): ExtOcspNoCheck = js.native
  
  /**
    * parse OCSPNonce OCSP extension as JSON object<br/>
    * name getExtOcspNonce
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value
    * @param Boolean critical flag
    * @return Array JSON object of parsed OCSPNonce extension
    * @since jsrsasign 9.1.6 x509 2.0.3
    * @see KJUR.asn1.x509.OCSPNonce
    * @see X509#getExtParamArray
    * @see X509#getExtParam
    * @description
    * This method parses
    * Nonce OCSP extension value defined in
    * <a href="https://tools.ietf.org/html/rfc6960#section-4.4.1">
    * RFC 6960 4.4.1</a> as JSON object.
    * <pre>
    * id-pkix-ocsp           OBJECT IDENTIFIER ::= { id-ad-ocsp }
    * id-pkix-ocsp-nonce     OBJECT IDENTIFIER ::= { id-pkix-ocsp 2 }
    * Nonce ::= OCTET STRING
    * </pre>
    * <br/>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.OCSPNonce} constructor.
    * @example
    * x = new X509();
    * x.getExtOcspNonce(<<extn hex value >>) &rarr;
    * { extname: "ocspNonce", hex: "1a2b..." }
    */
  def getExtOcspNonce(hExtV: String, critical: Boolean): ExtOcspNonce = js.native
  
  /**
    * get a extension parameter JSON object<br/>
    * name getExtParam
    * memberOf X509#
    *
    * @param hExt hexadecimal string of Extension
    * @return Array Extension parameter JSON object
    * @since jsrsasign 9.1.1 x509 2.0.1
    * @see KJUR.asn1.x509.X509Util.newCertPEM
    * @see X509#getParam
    * @see X509#getExtParamArray
    * @see X509CRL#getParam
    * @see KJUR.asn1.csr.CSRUtil.getParam
    *
    * @description
    * This method returns a extension parameters as JSON object.
    *
    * @example
    * x = new X509();
    * ...
    * x.getExtParam("30...") &rarr;
    * {extname:"keyUsage",critical:true,names:["digitalSignature"]}
    */
  def getExtParam(hExt: String): ExtParam = js.native
  
  /**
    * get array of certificate extension parameter JSON object<br/>
    * name getExtParamArray
    * memberOf X509#
    *
    * @param hExtSeq hexadecimal string of SEQUENCE of Extension
    * @return Array array of certificate extension parameter JSON object
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see KJUR.asn1.x509.X509Util.newCertPEM
    * @see X509#getParam
    * @see X509#getExtParam
    * @see X509CRL#getParam
    * @see KJUR.asn1.csr.CSRUtil.getParam
    *
    * @description
    * This method returns an array of certificate extension
    * parameters.
    * <br/>
    * NOTE: Argument "hExtSeq" have been supported since jsrsasign 9.1.1.
    *
    * @example
    * x = new X509();
    * x.readCertPEM("-----BEGIN CERTIFICATE...");
    * x.getExtParamArray() &rarr;
    * [ {extname:"keyUsage",critical:true,names:["digitalSignature"]},
    *   {extname:"basicConstraints",critical:true},
    *   {extname:"subjectKeyIdentifier",kid:{hex:"f2eb..."}},
    *   {extname:"authorityKeyIdentifier",kid:{hex:"12ab..."}},
    *   {extname:"authorityInfoAccess",array:[{ocsp:"http://ocsp.example.com/"}]},
    *   {extname:"certificatePolicies",array:[{policyoid:"2.23.140.1.2.1"}]}]
    */
  def getExtParamArray(hExtSeq: String): js.Array[ExtParam] = js.native
  
  /**
    * get subjectAltName value as array of string in the certificate
    * name getExtSubjectAltName
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Array JSON object of SubjectAltName parameters or undefined
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @see KJUR.asn1.x509.SubjectAltName
    * @see X509#getExtIssuerAltName
    * @description
    * This method will get subjectAltName value
    * as an array of JSON object which has properties defined
    * in {@link KJUR.asn1.x509.SubjectAltName}.
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.SubjectAltName} constructor.
    * If there is no this extension in the certificate,
    * it returns undefined.
    * <br>
    * When hExtV and critical specified as arguments, return value
    * will be generated from them.
    * <br>
    * CAUTION: return value of JSON object format have been changed
    * from jsrsasign 9.0.0 x509 2.0.0 without backword compatibility.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtSubjectAltName() &rarr;
    * { array: [
    *     {uri: "http://example.com/"},
    *     {rfc822: "user1@example.com"},
    *     {dns: "example.com"}
    *   ],
    *   critical: true
    * }
    *
    * x.getExtSubjectAltName("3026...") &rarr;
    * { array: [{ip: "192.168.1.1"}] }
    */
  def getExtSubjectAltName(): ExtSubjectAltName = js.native
  def getExtSubjectAltName(hExtV: String): ExtSubjectAltName = js.native
  def getExtSubjectAltName(hExtV: String, critical: Boolean): ExtSubjectAltName = js.native
  def getExtSubjectAltName(hExtV: Unit, critical: Boolean): ExtSubjectAltName = js.native
  
  /**
    * get subjectAltName value as array of string in the certificate (DEPRECATED)
    * name getExtSubjectAltName2
    * memberOf X509#
    *
    * @return Object array of alt name array
    * @since jsrsasign 8.0.1 x509 1.1.17
    * @deprecated jsrsasign 9.0.0 x509 2.0.0
    * @description
    * This method will get subject alt name extension value
    * as array of type and name.
    * If there is this in the certificate, it returns undefined;
    * Type of GeneralName will be shown as following:
    * <ul>
    * <li>"MAIL" - [1]rfc822Name</li>
    * <li>"DNS"  - [2]dNSName</li>
    * <li>"DN"   - [4]directoryName</li>
    * <li>"URI"  - [6]uniformResourceIdentifier</li>
    * <li>"IP"   - [7]iPAddress</li>
    * </ul>
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtSubjectAltName2() &rarr;
    * [["DNS",  "example.com"],
    *  ["DNS",  "example.org"],
    *  ["MAIL", "foo@example.com"],
    *  ["IP",   "192.168.1.1"],
    *  ["IP",   "2001:db8::2:1"],
    *  ["DN",   "/C=US/O=TEST1"]]
    */
  def getExtSubjectAltName2(): js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  /**
    * get subjectKeyIdentifier value as hexadecimal string in the certificate<br/>
    * name getExtSubjectKeyIdentifier
    * memberOf X509#
    *
    * @param hExtV hexadecimal string of extension value (OPTIONAL)
    * @param Boolean critical flag (OPTIONAL)
    * @return Array JSON object of SubjectKeyIdentifier parameter or undefined
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @description
    * This method will get
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.2">
    * SubjectKeyIdentifier extension</a> value as JSON object.
    * <br>
    * When hExtV and critical specified as arguments, return value
    * will be generated from them.
    * If there is no such extension in the certificate, it returns undefined.
    * <br>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.SubjectKeyIdentifier} constructor.
    * <pre>
    * id-ce-subjectKeyIdentifier OBJECT IDENTIFIER ::=  { id-ce 14 }
    * SubjectKeyIdentifier ::= KeyIdentifier
    * </pre>
    * <br>
    * CAUTION:
    * Returned JSON value format have been changed without
    * backward compatibility since jsrsasign 9.0.0 x509 2.0.0.
    *
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtSubjectKeyIdentifier() &rarr;
    * { kid: {hex: "1b3347ab..."}, critical: true };
    */
  def getExtSubjectKeyIdentifier(): ExtnameKid = js.native
  def getExtSubjectKeyIdentifier(hExtV: String): ExtnameKid = js.native
  def getExtSubjectKeyIdentifier(hExtV: String, critical: Boolean): ExtnameKid = js.native
  def getExtSubjectKeyIdentifier(hExtV: Unit, critical: Boolean): ExtnameKid = js.native
  
  /**
    * get GeneralName ASN.1 structure parameter as JSON object<br/>
    * name getGeneralName
    * memberOf X509#
    *
    * @param h hexadecimal string of GeneralName
    * @return Array JSON object of GeneralName parameters or undefined
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see KJUR.asn1.x509.GeneralNames
    * @see KJUR.asn1.x509.GeneralName
    * @see KJUR.asn1.x509.OtherName
    * @see X509#getGeneralName
    * @see X509#getOtherName
    *
    * @description
    * This method will get GeneralName parameters defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.6">
    * RFC 5280 4.2.1.6</a>.
    * <pre>
    * GeneralName ::= CHOICE {
    *      otherName                       [0]     OtherName,
    *      rfc822Name                      [1]     IA5String,
    *      dNSName                         [2]     IA5String,
    *      x400Address                     [3]     ORAddress,
    *      directoryName                   [4]     Name,
    *      ediPartyName                    [5]     EDIPartyName,
    *      uniformResourceIdentifier       [6]     IA5String,
    *      iPAddress                       [7]     OCTET STRING,
    *      registeredID                    [8]     OBJECT IDENTIFIER }
    * </pre>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.GeneralName} constructor.
    * @example
    * x = new X509();
    * x.getGeneralName("860f687474703a2f2f6161612e636f6d2f")
    * &rarr; {uri: "http://aaa.com/"}
    * x.getGeneralName("a41c30...") &rarr;
    * { dn: {
    *     array: [
    *       [{type:"C", value:"JP", ds:"prn"}],
    *       [{type:"O", value:"T1", ds:"utf8"}]
    *     ],
    *     str: "/C=JP/O=T1" } }
    */
  def getGeneralName(h: String): GeneralName = js.native
  
  /**
    * get GeneralNames ASN.1 structure parameter as JSON object
    * name getGeneralNames
    * memberOf X509#
    *
    * @param h hexadecimal string of GeneralNames
    * @return Array array of GeneralNames parameters
    * @see KJUR.asn1.x509.GeneralNames
    * @see KJUR.asn1.x509.GeneralName
    * @see X509#getGeneralNames
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @description
    * This method will get GeneralNames parameters defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.6">
    * RFC 5280 4.2.1.6</a>.
    * <pre>
    * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
    * </pre>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.GeneralNames} constructor.
    * @example
    * x = new X509();
    * x.getGeneralNames("3011860f687474703a2f2f6161612e636f6d2f")
    * &rarr; [{uri: "http://aaa.com/"}]
    *
    * x.getGeneralNames("301ea41c30...") &rarr;
    * [{ dn: {
    *     array: [
    *       [{type:"C", value:"JP", ds:"prn"}],
    *       [{type:"O", value:"T1", ds:"utf8"}]
    *     ],
    *     str: "/C=JP/O=T1" } }]
    */
  def getGeneralNames(h: String): js.Array[GeneralName] = js.native
  
  /**
    * get GeneralSubtree ASN.1 structure parameter as JSON object<br/>
    * name getGeneralSubtree
    * memberOf X509#
    *
    * @param h hexadecimal string of GeneralSubtree
    * @return Object JSON object of GeneralSubtree parameters or undefined
    * @since jsrsasign 10.5.16 x509 2.0.16
    * @see KJUR.asn1.x509.GeneralSubtree
    * @see KJUR.asn1.x509.GeneralName
    * @see X509#getExtNameConstraints
    * @see X509#getGeneralName
    *
    * @description
    * This method will get GeneralSubtree parameters defined in
    * <a href="https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.10">
    * RFC 5280 4.2.1.10</a>.
    * <pre>
    * GeneralSubtree ::= SEQUENCE {
    *      base                    GeneralName,
    *      minimum         [0]     BaseDistance DEFAULT 0,
    *      maximum         [1]     BaseDistance OPTIONAL }
    * BaseDistance ::= INTEGER (0..MAX)
    * </pre>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.GeneralSubtree} constructor.
    *
    * @example
    * x = new X509(sPEM);
    * x.getGeneralSubtree("30...") &rarr; { dn: ...X500NameObject..., min: 1, max: 3 }
    * x.getGeneralSubtree("30...") &rarr; { dns: ".example.com" }
    */
  def getGeneralSubtree(h: String): GeneralSubtree = js.native
  
  /**
    * get certificate information as string.<br/>
    * name getInfo
    * memberOf X509#
    *
    * @return String certificate information string
    * @since jsrsasign 5.0.10 x509 1.1.8
    * @example
    * x = new X509();
    * x.readCertPEM(certPEM);
    * console.log(x.getInfo());
    * // this shows as following
    * Basic Fields
    *   serial number: 02ac5c266a0b409b8f0b79f2ae462577
    *   signature algorithm: SHA1withRSA
    *   issuer: /C=US/O=DigiCert Inc/OU=www.digicert.com/CN=DigiCert High Assurance EV Root CA
    *   notBefore: 061110000000Z
    *   notAfter: 311110000000Z
    *   subject: /C=US/O=DigiCert Inc/OU=www.digicert.com/CN=DigiCert High Assurance EV Root CA
    *   subject public key info:
    *     key algorithm: RSA
    *     n=c6cce573e6fbd4bb...
    *     e=10001
    * X509v3 Extensions:
    *   keyUsage CRITICAL:
    *     digitalSignature,keyCertSign,cRLSign
    *   basicConstraints CRITICAL:
    *     cA=true
    *   subjectKeyIdentifier :
    *     b13ec36903f8bf4701d498261a0802ef63642bc3
    *   authorityKeyIdentifier :
    *     kid=b13ec36903f8bf4701d498261a0802ef63642bc3
    * signature algorithm: SHA1withRSA
    * signature: 1c1a0697dcd79c9f...
    */
  def getInfo(): String = js.native
  
  /**
    * get JSON object of issuer field<br/>
    * @return Array JSON object of issuer field
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getX500Name
    * @description
    * @example
    * var x = new X509(sCertPEM);
    * x.getIssuer() &rarr;
    * { array: [[{type:'C',value:'JP',ds:'prn'}],...],
    *   str: "/C=JP/..." }
    */
  def getIssuer(): IdentityResponse = js.native
  
  /**
    * get hexadecimal string of issuer field TLV of certificate.<br/>
    * @return String hexadecial string of issuer DN ASN.1
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var issuer = x.getIssuerHex(); // return string like "3013..."
    */
  def getIssuerHex(): String = js.native
  
  /**
    * get string of issuer field of certificate.<br/>
    * @return String issuer DN string
    * @see X509#getIssuer
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var dn1 = x.getIssuerString(); // return string like "/C=US/O=TEST"
    * var dn2 = KJUR.asn1.x509.X500Name.compatToLDAP(dn1); // returns "O=TEST, C=US"
    */
  def getIssuerString(): String = js.native
  
  /**
    * get notAfter field string of certificate.<br/>
    * name getNotAfter
    * memberOf X509#
    *
    * @return String not after time value (ex. "151231235959Z")
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var notAfter = x.getNotAfter(); // return string like "151231235959Z"
    */
  def getNotAfter(): String = js.native
  
  /**
    * get notBefore field string of certificate.<br/>
    * name getNotBefore
    * memberOf X509#
    *
    * @return String not before time value (ex. "151231235959Z")
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var notBefore = x.getNotBefore(); // return string like "151231235959Z"
    */
  def getNotBefore(): String = js.native
  
  /**
    * getOtherName ASN.1 structure parameter as JSON object<br/>
    * name getOtherName
    * memberOf X509#
    * @param h hexadecimal string of GeneralName
    * @return Array associative array of OtherName
    * @since jsrsasign 10.5.3 x509 2.0.12
    * @see KJUR.asn1.x509.GeneralNames
    * @see KJUR.asn1.x509.GeneralName
    * @see KJUR.asn1.x509.OtherName
    * @see X509#getGeneralName
    * @see ASN1HEX#parse
    *
    * @description
    * This method will get OtherName parameters defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.6">
    * RFC 5280 4.2.1.6</a>.
    * <pre>
    * OtherName ::= SEQUENCE {
    *    type-id    OBJECT IDENTIFIER,
    *    value      [0] EXPLICIT ANY DEFINED BY type-id }
    * </pre>
    * The value of member "other" is converted by
    * {@link ASN1HEX#parse}.
    *
    * @example
    * x = new X509();
    * x.getOtherName("30...") &rarr;
    * { oid: "1.2.3.4",
    *   other: {utf8str: {str: "aaa"}} }
    */
  def getOtherName(h: String): ASN1HEXParseResult = js.native
  
  /**
    * get JSON object of certificate parameters<br/>
    * name getParam
    * memberOf X509#
    *
    * @param option optional setting for return object
    * @return Object JSON object of certificate parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see KJUR.asn1.x509.X509Util.newCertPEM
    *
    * @description
    * This method returns a JSON object of the certificate
    * parameters. Return value can be passed to
    * {@link KJUR.asn1.x509.X509Util.newCertPEM}.
    * <br>
    * NOTE1: From jsrsasign 10.5.16, optional argument can be applied.
    * It can have following members:
    * <ul>
    * <li>tbshex - if this is true, tbshex member with hex value of
    * tbsCertificate will be added</li>
    * <li>nodnarray - if this is true, array member for subject and
    * issuer will be deleted to simplify it<li>
    * </ul>
    *
    * @example
    * x = new X509();
    * x.readCertPEM("-----BEGIN CERTIFICATE...");
    * x.getParam() &rarr;
    * {version:3,
    *  serial:{hex:"12ab"},
    *  sigalg:"SHA256withRSA",
    *  issuer: {array:[[{type:'CN',value:'CA1',ds:'prn'}]],str:"/O=CA1"},
    *  notbefore:"160403023700Z",
    *  notafter:"160702023700Z",
    *  subject: {array:[[{type:'CN',value:'Test1',ds:'prn'}]],str:"/CN=Test1"},
    *  sbjpubkey:"-----BEGIN PUBLIC KEY...",
    *  ext:[
    *   {extname:"keyUsage",critical:true,names:["digitalSignature"]},
    *   {extname:"basicConstraints",critical:true},
    *   {extname:"subjectKeyIdentifier",kid:{hex:"f2eb..."}},
    *   {extname:"authorityKeyIdentifier",kid:{hex:"12ab..."}},
    *   {extname:"authorityInfoAccess",array:[{ocsp:"http://ocsp.example.com/"}]},
    *   {extname:"certificatePolicies",array:[{policyoid:"2.23.140.1.2.1"}]}
    *  ],
    *  sighex:"0b76...8"
    * };
    *
    * x.getParam({tbshex: true}) &rarr; { ... , tbshex: "30..." }
    * x.getParam({nodnarray: true}) &rarr; {issuer: {str: "/C=JP"}, ...}
    */
  def getParam(option: Nodnarray): Notafter = js.native
  
  /**
    * get PolicyInformation ASN.1 structure parameter as JSON object
    * name getPolicyInformation
    * memberOf X509#
    *
    * @param h hexadecimal string of PolicyInformation
    * @return Object JSON object of PolicyInformation parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @description
    * This method will get PolicyInformation parameters defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.4">
    * RFC 5280 4.2.1.4</a>.
    * <pre>
    * PolicyInformation ::= SEQUENCE {
    *      policyIdentifier   CertPolicyId,
    *      policyQualifiers   SEQUENCE SIZE (1..MAX) OF
    *                              PolicyQualifierInfo OPTIONAL }
    * </pre>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.PolicyInformation} constructor.
    * @example
    * x = new X509();
    * x.getPolicyInformation("30...") &rarr;
    * {
    *     policyoid: "2.16.840.1.114412.2.1",
    *     array: [{cps: "https://www.digicert.com/CPS"}]
    * }
    */
  def getPolicyInformation(h: String): PolicyInformation = js.native
  
  /**
    * get PolicyQualifierInfo ASN.1 structure parameter as JSON object
    * name getPolicyQualifierInfo
    * memberOf X509#
    *
    * @param h hexadecimal string of PolicyQualifierInfo
    * @return Object JSON object of PolicyQualifierInfo parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getExtCertificatePolicies
    * @see X509#getPolicyInformation
    * @description
    * This method will get
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.4">
    * PolicyQualifierInfo</a> parameters.
    * <pre>
    * PolicyQualifierInfo ::= SEQUENCE {
    *      policyQualifierId  PolicyQualifierId,
    *      qualifier          ANY DEFINED BY policyQualifierId }
    * id-qt          OBJECT IDENTIFIER ::=  { id-pkix 2 }
    * id-qt-cps      OBJECT IDENTIFIER ::=  { id-qt 1 }
    * id-qt-unotice  OBJECT IDENTIFIER ::=  { id-qt 2 }
    * PolicyQualifierId ::= OBJECT IDENTIFIER ( id-qt-cps | id-qt-unotice )
    * Qualifier ::= CHOICE {
    *      cPSuri           CPSuri,
    *      userNotice       UserNotice }
    * CPSuri ::= IA5String
    * </pre>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.PolicyQualifierInfo} constructor.
    * @example
    * x = new X509();
    * x.getPolicyQualifierInfo("30...")
    * &rarr; {unotice: {exptext: {type: 'utf8', str: 'aaa'}}}
    * x.getPolicyQualifierInfo("30...")
    * &rarr; {cps: "https://repository.example.com/"}
    */
  def getPolicyQualifierInfo(h: String): PolicyQualifierInfo = js.native
  
  /**
    * get a RSAKey/ECDSA/DSA public key object of subjectPublicKeyInfo field.<br/>
    * name getPublicKey
    * memberOf X509#
    *
    * @return Object RSAKey/ECDSA/DSA public key object of subjectPublicKeyInfo field
    * @since jsrsasign 7.1.4 x509 1.1.13
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM);
    * pubkey= x.getPublicKey();
    */
  def getPublicKey(): RSAKey | DSA | ECDSA = js.native
  
  /**
    * get a string index of contents of subjectPublicKeyInfo BITSTRING value from hexadecimal certificate<br/>
    * name getPublicKeyContentIdx
    * memberOf X509#
    *
    * Integer string index of key contents
    * @since jsrsasign 8.0.0 x509 1.2.0
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM);
    * idx = x.getPublicKeyContentIdx(); // return string index in x.hex parameter
    */
  // NOTE: Without BITSTRING encapsulation.
  def getPublicKeyContentIdx(): Double = js.native
  
  /**
    * get a hexadecimal string of subjectPublicKeyInfo field.<br/>
    * name getPublicKeyHex
    * memberOf X509#
    *
    * @return String ASN.1 SEQUENCE hexadecimal string of subjectPublicKeyInfo field
    * @since jsrsasign 7.1.4 x509 1.1.13
    * @deprecated since jsrsasign 10.5.7 x509 2.0.13. Please use {@link X509#getSPKI} instead.
    *
    * @example
    * x = new X509(sCertPEM);
    * hSPKI = x.getPublicKeyHex(); // return string like "30820122..."
    */
  def getPublicKeyHex(): String = js.native
  
  /**
    * get a string index of subjectPublicKeyInfo field for hexadecimal string certificate.<br/>
    * name getPublicKeyIdx
    * memberOf X509#
    *
    * @return Number string index of subjectPublicKeyInfo field for hexadecimal string certificate.
    * @since jsrsasign 7.1.4 x509 1.1.13
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM);
    * idx = x.getPublicKeyIdx(); // return string index in x.hex parameter
    */
  def getPublicKeyIdx(): Double = js.native
  
  /**
    * get RelativeDistinguishedName ASN.1 structure parameter array<br/>
    * name getRDN
    * memberOf X509#
    *
    * @param h hexadecimal string of RDN
    * @return Array array of AttrTypeAndValue parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getX500Name
    * @see X509#getRDN
    * @see X509#getAttrTypeAndValue
    * @description
    * This method will get RelativeDistinguishedName parameters defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.4">
    * RFC 5280 4.1.2.4</a>.
    * <pre>
    * RelativeDistinguishedName ::=
    *   SET SIZE (1..MAX) OF AttributeTypeAndValue
    * </pre>
    * @example
    * x = new X509();
    * x.getRDN("31...") &rarr;
    * [{type:"C",value:"US",ds:"prn"}] or
    * [{type:"O",value:"Sample Corp.",ds:"prn"}] or
    * [{type:"CN",value:"john.smith@example.com",ds:"ia5"}]
    */
  def getRDN(h: String): js.Array[Type] = js.native
  
  /**
    * get ASN.1 TLV hexadecimal string of subjectPublicKeyInfo field.<br/>
    * name getSPKI
    * memberOf X509#
    *
    * @return string ASN.1 SEQUENCE hexadecimal string of subjectPublicKeyInfo field
    * @since jsrsasign 10.5.8 x509 2.0.13
    * @see X509#getPublicKeyHex
    * @see X509#getSPKIValue
    *
    * @description
    * Get a hexadecimal string of SubjectPublicKeyInfo ASN.1 TLV of the certificate.<br/>
    * <pre>
    * SubjectPublicKeyInfo  ::=  SEQUENCE  {
    *    algorithm         AlgorithmIdentifier,
    *    subjectPublicKey  BIT STRING  }
    * </pre>
    *
    * @example
    * x = new X509(sCertPEM);
    * hSPKI = x.getSPKI(); // return string like "30820122..."
    */
  def getSPKI(): String = js.native
  
  /**
    * get hexadecimal string of subjectPublicKey of subjectPublicKeyInfo field.<br/>
    * name getSPKIValue
    * memberOf X509#
    *
    * @return string ASN.1 hexadecimal string of subjectPublicKey
    * @since jsrsasign 10.5.8 x509 2.0.13
    * @see X509#getSPKI
    *
    * @description
    * Get a hexadecimal string of subjectPublicKey ASN.1 value of SubjectPublicKeyInfo
    * of the certificate without unusedbit "00".
    * The "subjectPublicKey" is encapsulated by BIT STRING.
    * This method returns BIT STRING value without unusedbits.
    * <br/>
    * <pre>
    * SubjectPublicKeyInfo  ::=  SEQUENCE  {
    *    algorithm         AlgorithmIdentifier,
    *    subjectPublicKey  BIT STRING  }
    * </pre>
    *
    * @example
    * x = new X509(sCertPEM);
    * hSPKIValue = x.getSPKIValue(); // without BIT STRING Encapusulation.
    */
  def getSPKIValue(): String = js.native
  
  /**
    * get hexadecimal string of serialNumber field of certificate.<br/>
    * @return String hexadecimal string of certificate serial number
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var sn = x.getSerialNumberHex(); // return string like "01ad..."
    */
  def getSerialNumberHex(): String = js.native
  
  /**
    * get signature algorithm name in basic field
    * @return String signature algorithm name (ex. SHA1withRSA, SHA256withECDSA, SHA512withRSAandMGF1)
    * @since x509 1.1.8
    * @see X509#getAlgorithmIdentifierName
    * @description
    * This method will get a name of signature algorithm in
    * basic field of certificate.
    * <br/>
    * NOTE: From jsrsasign 8.0.21, RSA-PSS certificate is also supported.
    * For supported RSA-PSS algorithm name and PSS parameters,
    * see {@link X509#getSignatureAlgorithmField}.
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * algName = x.getSignatureAlgorithmField();
    */
  def getSignatureAlgorithmField(): String = js.native
  
  /**
    * get signature algorithm name from hexadecimal certificate data
    * name getSignatureAlgorithmName
    * memberOf X509#
    *
    * @return String signature algorithm name (ex. SHA1withRSA, SHA256withECDSA)
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @see X509#getAlgorithmIdentifierName
    * @description
    * This method will get signature algorithm name of certificate:
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * x.getSignatureAlgorithmName() &rarr; "SHA256withRSA"
    */
  def getSignatureAlgorithmName(): String = js.native
  
  /**
    * get signature value as hexadecimal string<br/>
    * name getSignatureValueHex
    * memberOf X509#
    *
    * @return String signature value hexadecimal string without BitString unused bits
    * @since jsrsasign 7.2.0 x509 1.1.14
    *
    * @description
    * This method will get signature value of certificate:
    *
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * x.getSignatureValueHex() &rarr "8a4c47913..."
    */
  def getSignatureValueHex(): String = js.native
  
  /**
    * get JSON object of subject field<br/>
    * name getSubject
    * memberOf X509#
    *
    * @return Array JSON object of subject field
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getX500Name
    * @description
    * @example
    * var x = new X509(sCertPEM);
    * x.getSubject() &rarr;
    * { array: [[{type:'C',value:'JP',ds:'prn'}],...],
    *   str: "/C=JP/..." }
    */
  def getSubject(): IdentityResponse = js.native
  
  /**
    * get hexadecimal string of subject field of certificate.<br/>
    * name getSubjectHex
    * memberOf X509#
    *
    * @return String hexadecial string of subject DN ASN.1
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var subject = x.getSubjectHex(); // return string like "3013..."
    */
  def getSubjectHex(): String = js.native
  
  /**
    * get string of subject field of certificate.<br/>
    * name getSubjectString
    * memberOf X509#
    *
    * @return String subject DN string
    * @see X509#getSubject
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var dn1 = x.getSubjectString(); // return string like "/C=US/O=TEST"
    * var dn2 = KJUR.asn1.x509.X500Name.compatToLDAP(dn1); // returns "O=TEST, C=US"
    */
  def getSubjectString(): String = js.native
  
  /**
    * get UserNotice ASN.1 structure parameter as JSON object
    * name getUserNotice
    * memberOf X509#
    *
    * @param h hexadecimal string of UserNotice
    * @return Object JSON object of UserNotice parameters
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getExtCertificatePolicies
    * @see X509#getPolicyInformation
    * @see X509#getPolicyQualifierInfo
    * @description
    * This method will get
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.2.1.4">
    * UserNotice</a> parameters.
    * <pre>
    * UserNotice ::= SEQUENCE {
    *      noticeRef        NoticeReference OPTIONAL,
    *      explicitText     DisplayText OPTIONAL }
    * </pre>
    * Result of this method can be passed to
    * {@link KJUR.asn1.x509.NoticeReference} constructor.
    * <br/>
    * NOTE: NoticeReference parsing is currently not supported and
    * it will be ignored.
    * @example
    * x = new X509();
    * x.getUserNotice("30...") &rarr; {exptext: {type: 'utf8', str: 'aaa'}}
    */
  def getUserNotice(h: String): UserNotice = js.native
  
  /**
    * get format version (X.509v1 or v3 certificate)<br/>
    * @return Number 1 for X509v1, 3 for X509v3, otherwise 0
    * @since jsrsasign 7.1.14 x509 1.1.13
    * @description
    * This method returns a format version of X.509 certificate.
    * It returns 1 for X.509v1 certificate and 3 for v3 certificate.
    * Otherwise returns 0.
    * This method will be automatically called in
    * {@link X509#readCertPEM}. After then, you can use
    * {@link X509.version} parameter.
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * version = x.getVersion();    // 1 or 3
    * sn = x.getSerialNumberHex(); // return string like "01ad..."
    */
  def getVersion(): Double = js.native
  
  /**
    * get Name ASN.1 structure parameter array<br/>
    * name getX500Name
    * memberOf X509#
    *
    * @param h hexadecimal string of Name
    * @return Array array of RDN parameter array
    * @since jsrsasign 9.0.0 x509 2.0.0
    * @see X509#getX500NameArray
    * @see X509#getRDN
    * @see X509#getAttrTypeAndValue
    * @see KJUR.asn1.x509.X500Name
    * @see KJUR.asn1.x509.GeneralName
    * @see KJUR.asn1.x509.GeneralNames
    * @description
    * This method will get Name parameter defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.4">
    * RFC 5280 4.1.2.4</a>.
    * <pre>
    * Name ::= CHOICE { -- only one possibility for now --
    *   rdnSequence  RDNSequence }
    * RDNSequence ::= SEQUENCE OF RelativeDistinguishedName
    * </pre>
    * @example
    * x = new X509();
    * x.getX500Name("30...") &rarr;
    * { array: [
    *     [{type:"C",value:"US",ds:"prn"}],
    *     [{type:"O",value:"Sample Corp.",ds:"utf8"}],
    *     [{type:"CN",value:"john.smith@example.com",ds:"ia5"}]
    *   ],
    *   str: "/C=US/O=Sample Corp./CN=john.smith@example.com",
    *   hex: "30..."
    * }
    */
  def getX500Name(h: String): X500Name = js.native
  
  /**
    * get X.500 Name ASN.1 structure parameter array<br/>
    * name getX500NameArray
    * memberOf X509#
    *
    * @param h hexadecimal string of Name
    * @return Array array of RDN parameter array
    * @since jsrsasign 10.0.6 x509 2.0.9
    * @see X509#getX500Name
    * @see X509#getRDN
    * @see X509#getAttrTypeAndValue
    * @description
    * This method will get Name parameter defined in
    * <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.4">
    * RFC 5280 4.1.2.4</a>.
    * <pre>
    * Name ::= CHOICE { -- only one possibility for now --
    *   rdnSequence  RDNSequence }
    * RDNSequence ::= SEQUENCE OF RelativeDistinguishedName
    * </pre>
    * @example
    * x = new X509();
    * x.getX500NameArray("30...") &rarr;
    * [[{type:"C",value:"US",ds:"prn"}],
    *  [{type:"O",value:"Sample Corp.",ds:"utf8"}],
    *  [{type:"CN",value:"john.smith@example.com",ds:"ia5"}]]
    */
  def getX500NameArray(h: String): js.Array[Type] = js.native
  
  def getX500NameRule(aDN: js.Array[js.Array[Ds]]): js.UndefOr[mixed | prn | Null] = js.native
  
  /**
    * hexacedimal string for X.509 certificate.
    */
  var hex: String = js.native
  
  /**
    * set array of X.509v3 and CSR extesion information such as extension OID, criticality and value index. (DEPRECATED)<br/>
    * name parseExt
    * memberOf X509#
    *
    * @param hCSR - PEM string of certificate signing requrest(CSR) (OPTION)
    * @since jsrsasign 7.2.0 x509 1.1.14
    * @deprecated jsrsasign 9.1.1 x509 2.0.1
    *
    * @description
    * This method will set an array of X.509v3 extension information having
    * following parameters:
    * <ul>
    * <li>oid - extension OID (ex. 2.5.29.19)</li>
    * <li>critical - true or false</li>
    * <li>vidx - string index for extension value</li>
    * <br/>
    * When you want to parse extensionRequest of CSR,
    * argument 'hCSR' shall be specified.
    * <br/>
    * NOTE: CSR is supported from jsrsasign 8.0.20 x509 1.1.22.
    * <br/>
    * This method and X509.aExtInfo property
    * have been *deprecated* since jsrsasign 9.1.1.
    * All extension parser method such as X509.getExt* shall be
    * call with argument "hExtV" and "critical" explicitly.
    *
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    *
    * x.aExtInfo &rarr;
    * [ { oid: "2.5.29,19", critical: true, vidx: 2504 }, ... ]
    *
    * // to parse CSR
    * X = new X509()
    * x.parseExt("-----BEGIN CERTIFICATE REQUEST-----...");
    * x.aExtInfo &rarr;
    *
    * [ { oid: "2.5.29,19", critical: true, vidx: 2504 }, ... ]
    */
  def parseExt(hCSR: String): Unit = js.native
  
  /**
    * read a hexadecimal string of X.509 certificate<br/>
    * name readCertHex
    * memberOf X509#
    *
    * @param sCertHex hexadecimal string of X.509 certificate
    * @since jsrsasign 7.1.4 x509 1.1.13
    * @description
    * NOTE: {@link X509#parseExt} will called internally since jsrsasign 7.2.0.
    * @example
    * x = new X509();
    * x.readCertHex("3082..."); // read certificate
    */
  def readCertHex(sCertHex: String): Unit = js.native
  
  /**
    * read PEM formatted X.509 certificate from string.<br/>
    * name readCertPEM
    * memberOf X509#
    *
    * @param sCertPEM string for PEM formatted X.509 certificate
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // read certificate
    */
  def readCertPEM(sCertPEM: String): Unit = js.native
  
  /**
    * update authorityInfoAccess caIssuer in parameter<br/>
    * name updateAIACAIssuer
    * memberOf X509#
    *
    * @param aExt array of extension parameters
    * @param newURI string of new uri
    * @since jsrsasign 10.0.4 x509 2.0.8
    * @see X509#findExt
    * @see KJUR.asn1.x509.AuthorityInfoAccess
    *
    * @description
    * This method updates "caIssuer" accessMethod URI of
    * AuthorityInfoAccess extension
    * in the extension parameter array if it exists.
    *
    * @example
    * aExt = [
    *   {extname:"authorityKeyIdentifier",kid:{hex:"12ab..."}},
    *   {extname:"authoriyInfoAccess",
    *    array:[
    *      {ocsp: "http://ocsp1.example.com"},
    *      {caissuer: "http://example.com/a.crt"}
    *    ]}
    * ];
    * x = new X509();
    * x.updateAIACAIssuer(aExt, "http://example.net/b.crt");
    */
  def updateExtAIACAIssuer(aExt: js.Array[ExtensionParameter], newURI: String): Unit = js.native
  
  /**
    * update authorityInfoAccess ocsp in parameter<br/>
    * name updateAIAOCSP
    * memberOf X509#
    *
    * @param aExt array of extension parameters
    * @param newURI string of new uri
    * @since jsrsasign 10.0.4 x509 2.0.8
    * @see X509#findExt
    * @see KJUR.asn1.x509.AuthorityInfoAccess
    *
    * @description
    * This method updates "ocsp" accessMethod URI of
    * AuthorityInfoAccess extension
    * in the extension parameter array if it exists.
    *
    * @example
    * aExt = [
    *   {extname:"authorityKeyIdentifier",kid:{hex:"12ab..."}},
    *   {extname:"authoriyInfoAccess",
    *    array:[
    *      {ocsp: "http://ocsp1.example.com"},
    *      {caissuer: "http://example.com/a.crt"}
    *    ]}
    * ];
    * x = new X509();
    * x.updateAIAOCSP(aExt, "http://ocsp2.example.net");
    */
  def updateExtAIAOCSP(aExt: js.Array[ExtensionParameter], newURI: String): Unit = js.native
  
  /**
    * update CRLDistributionPoints Full URI in parameter<br/>
    * name updateCDPFullURI
    * memberOf X509#
    *
    * @param aExt array of extension parameters
    * @param newURI string of new uri
    * @since jsrsasign 10.0.4 x509 2.0.8
    * @see X509#findExt
    * @see KJUR.asn1.x509.CRLDistributionPoints
    *
    * @description
    * This method updates Full URI of CRLDistributionPoints extension
    * in the extension parameter array if it exists.
    *
    * @example
    * aExt = [
    *   {extname:"authorityKeyIdentifier",kid:{hex:"12ab..."}},
    *   {extname:"cRLDistributionPoints",
    *    array:[{dpname:{full:[{uri:"http://example.com/a.crl"}]}}]},
    * ];
    * x = new X509();
    * x.updateCDPFullURI(aExt, "http://crl2.example.new/b.crl");
    */
  def updateExtCDPFullURI(aExt: js.Array[ExtensionParameter], newURI: String): Unit = js.native
  
  /**
    * verifies signature value by public key<br/>
    * name verifySignature
    * memberOf X509#
    *
    * @param pubKey public key object
    * @return Boolean true if signature value is valid otherwise false
    * @since jsrsasign 7.2.0 x509 1.1.14
    *
    * @description
    * This method verifies signature value of hexadecimal string of
    * X.509 certificate by specified public key object.
    * The signature algorithm used to verify will refer
    * signatureAlgorithm field. (See {@link X509#getSignatureAlgorithmField})
    * RSA-PSS signature algorithms (SHA{,256,384,512}withRSAandMGF1)
    * are available.
    *
    * @example
    * pubKey = KEYUTIL.getKey(pemPublicKey); // or certificate
    * x = new X509();
    * x.readCertPEM(pemCert);
    * x.verifySignature(pubKey) &rarr; true, false or raising exception
    */
  def verifySignature(pubKey: String): Boolean = js.native
  def verifySignature(pubKey: ECCPrivateKey): Boolean = js.native
  def verifySignature(pubKey: DSA): Boolean = js.native
  def verifySignature(pubKey: ECDSA): Boolean = js.native
  def verifySignature(pubKey: RSAKey): Boolean = js.native
}
