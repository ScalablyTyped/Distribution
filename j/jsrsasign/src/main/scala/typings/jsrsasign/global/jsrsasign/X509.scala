package typings.jsrsasign.global.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.PublicKeyInfoPropOfCertPEMResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.X509")
@js.native
class X509 ()
  extends typings.jsrsasign.jsrsasign.X509

/* static members */
@JSGlobal("jsrsasign.X509")
@js.native
object X509 extends js.Object {
  val version: String = js.native
  /**
    * get RSA/DSA/ECDSA public key object from X.509 certificate hexadecimal string
    * @param h hexadecimal string of X.509 certificate for RSA/ECDSA/DSA public key
    * @return returns RSAKey/KJUR.crypto.{ECDSA,DSA} object of public key
    */
  def getPublicKeyFromCertHex(h: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  /**
    * get RSA/DSA/ECDSA public key object from PEM certificate string
    * @param sCertPEM PEM formatted RSA/ECDSA/DSA X.509 certificate
    * @return returns RSAKey/KJUR.crypto.{ECDSA,DSA} object of public key
    * @description
    * NOTE: DSA is also supported since x509 1.1.2.
    */
  def getPublicKeyFromCertPEM(sCertPEM: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  /**
    * get public key information from PEM certificate
    * @param sCertPEM string of PEM formatted certificate
    * @return hash of information for public key
    * @description
    * Resulted associative array has following properties:
    *
    * - algoid - hexadecimal string of OID of asymmetric key algorithm
    * - algparam - hexadecimal string of OID of ECC curve name or null
    * - keyhex - hexadecimal string of key in the certificate
    *
    * NOTE: X509v1 certificate is also supported since x509.js 1.1.9.
    */
  def getPublicKeyInfoPropOfCertPEM(sCertPEM: String): PublicKeyInfoPropOfCertPEMResult = js.native
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
  def hex2attrTypeValue(hex: String, idx: Double): String = js.native
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
  def hex2dn(hex: String, idx: Double): String = js.native
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
  def hex2rdn(hex: String, idx: Double): String = js.native
}

