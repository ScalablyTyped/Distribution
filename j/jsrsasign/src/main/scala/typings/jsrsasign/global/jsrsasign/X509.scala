package typings.jsrsasign.global.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.PublicKeyInfoPropOfCertPEMResult
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
@JSGlobal("jsrsasign.X509")
@js.native
open class X509 ()
  extends typings.jsrsasign.mod.X509 {
  def this(params: String) = this()
}
object X509 {
  
  @JSGlobal("jsrsasign.X509")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("jsrsasign.X509.KEYUSAGE_NAME")
  @js.native
  def KEYUSAGE_NAME: js.Array[String] = js.native
  inline def KEYUSAGE_NAME_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEYUSAGE_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * get RSA/DSA/ECDSA public key object from X.509 certificate hexadecimal string<br/>
    * name getPublicKeyFromCertHex
    * memberOf X509
    *
    * @param h hexadecimal string of X.509 certificate for RSA/ECDSA/DSA public key
    * @return returns RSAKey/KJUR.crypto.{ECDSA,DSA} object of public key
    * @since jsrasign 7.1.0 x509 1.1.11
    */
  /* static member */
  inline def getPublicKeyFromCertHex(h: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFromCertHex")(h.asInstanceOf[js.Any]).asInstanceOf[typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA]
  
  /**
    * get RSA/DSA/ECDSA public key object from PEM certificate string
    * name getPublicKeyFromCertPEM
    * memberOf X509
    *
    * @param sCertPEM PEM formatted RSA/ECDSA/DSA X.509 certificate
    * @return returns RSAKey/KJUR.crypto.{ECDSA,DSA} object of public key
    * @since x509 1.1.1
    * @description
    * NOTE: DSA is also supported since x509 1.1.2.
    */
  /* static member */
  inline def getPublicKeyFromCertPEM(sCertPEM: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyFromCertPEM")(sCertPEM.asInstanceOf[js.Any]).asInstanceOf[typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA]
  
  /**
    * get public key information from PEM certificate
    * name getPublicKeyInfoPropOfCertPEM
    * memberOf X509
    *
    * @param sCertPEM string of PEM formatted certificate
    * @return Hash hash of information for public key
    * @since x509 1.1.1
    * @description
    * Resulted associative array has following properties:<br/>
    * <ul>
    * <li>algoid - hexadecimal string of OID of asymmetric key algorithm</li>
    * <li>algparam - hexadecimal string of OID of ECC curve name or null</li>
    * <li>keyhex - hexadecimal string of key in the certificate</li>
    * </ul>
    * NOTE: X509v1 certificate is also supported since x509.js 1.1.9.
    */
  /* static member */
  inline def getPublicKeyInfoPropOfCertPEM(sCertPEM: String): PublicKeyInfoPropOfCertPEMResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyInfoPropOfCertPEM")(sCertPEM.asInstanceOf[js.Any]).asInstanceOf[PublicKeyInfoPropOfCertPEMResult]
  
  /**
    * get string from hexadecimal string of ASN.1 DER AttributeTypeAndValue
    * @param hex hexadecimal string of ASN.1 DER concludes AttributeTypeAndValue
    * @param idx index of hexadecimal string (DEFAULT=0)
    * @return string representation of AttributeTypeAndValue (ex. C=US)
    * @description
    * This static method converts from a hexadecimal string of AttributeTypeAndValue
    * specified by 'hex' and 'idx' to LDAP string representation (ex. C=US).
    * @example
    * X509.hex2attrTypeValue("3008060355040a0c0161") → O=a
    * X509.hex2attrTypeValue("300806035504060c0161") → C=a
    * X509.hex2attrTypeValue("...3008060355040a0c0161...", 128) → O=a
    */
  /* static member */
  inline def hex2attrTypeValue(hex: String, idx: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hex2attrTypeValue")(hex.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * get distinguished name string in OpenSSL online format from hexadecimal string of ASN.1 DER X.500 name
    * @param hex hexadecimal string of ASN.1 DER distinguished name
    * @param idx index of hexadecimal string (DEFAULT=0)
    * @return OpenSSL online format distinguished name
    * @description
    * This static method converts from a hexadecimal string of
    * distinguished name (DN)
    * specified by 'hex' and 'idx' to OpenSSL oneline string representation (ex. /C=US/O=a).
    * @example
    * X509.hex2dn("3031310b3...") → /C=US/O=a/CN=b2+OU=b1
    */
  /* static member */
  inline def hex2dn(hex: String, idx: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hex2dn")(hex.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * get relative distinguished name string in OpenSSL online format from hexadecimal string of ASN.1 DER RDN
    * @param hex hexadecimal string of ASN.1 DER concludes relative distinguished name
    * @param idx index of hexadecimal string (DEFAULT=0)
    * @return OpenSSL online format relative distinguished name
    * @description
    * This static method converts from a hexadecimal string of
    * relative distinguished name (RDN)
    * specified by 'hex' and 'idx' to LDAP string representation (ex. O=test+CN=test).
    * NOTE: Multi-valued RDN is supported since jsnrsasign 6.2.2 x509 1.1.10.
    * @example
    * X509.hex2rdn("310a3008060355040a0c0161") → O=a
    * X509.hex2rdn("31143008060355040a0c01613008060355040a0c0162") → O=a+O=b
    */
  /* static member */
  inline def hex2rdn(hex: String, idx: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hex2rdn")(hex.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * format version (1: X509v1, 3: X509v3, otherwise: unknown) since jsrsasign 7.1.4
    */
  /* static member */
  @JSGlobal("jsrsasign.X509.version")
  @js.native
  val version: Double = js.native
}
