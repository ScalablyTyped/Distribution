package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
type AdobeTimeStamp = Extension

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
type CRLNumber = ASN1Object

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
type CertificatePolicies = Extension

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
type OCSPNoCheck = Extension

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
type OCSPNonce = Extension

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
type cRLReason = ASN1Object
